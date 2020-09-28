package com.coursecube.booksearch.service;

import com.coursecube.booksearch.entity.Book;
import com.coursecube.booksearch.dto.BookInfo;
import com.coursecube.booksearch.entity.BookInventory;
import com.coursecube.booksearch.dto.BookPriceInfo;
import com.coursecube.booksearch.entity.BookRating;
import com.coursecube.booksearch.dao.BookDAO;
import com.coursecube.booksearch.dao.BookInventoryDAO;
import com.coursecube.booksearch.dao.BookRatingDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    static Logger log = LoggerFactory.getLogger(BookServiceImpl.class);

    @Autowired
    BookDAO bookDAO;

    @Autowired
    BookRatingDAO ratingDAO;

    @Autowired
    BookInventoryDAO inventoryDAO;

    @Override
    public List<Book> getBooks(String author, String category) {
        List<Book> myBooks = new ArrayList<>();
        if("All Authors".equals(author) && "All Categories".equals(category)){
            myBooks = bookDAO.findAll();
        }else if(!"All Authors".equals(author) && "All Categories".equals(category)){
            myBooks = bookDAO.getBookByCategory(category);
        }else if("All Authors".equals(author) && !"All Categories".equals(category)){
            myBooks = bookDAO.getBookByAuthor(author);
        }else {
            myBooks = bookDAO.getBooksByAuthorAndCategory(author, category);
        }
        return myBooks;
    }

    @Override
    public BookInfo getBookInfo(Integer bookId) {
        BookInfo bookInfo = new BookInfo();
        //1. getBookDetails
        Book book = bookDAO.findById(bookId).get();
        bookInfo.setBookId(book.getBookId());
        bookInfo.setBookName(book.getBookName());
        bookInfo.setAuthor(book.getAuthor());
        bookInfo.setPublications(book.getPublications());
        bookInfo.setCategory(book.getCategory());
        //2. get book ratiing details
        BookRating bookRating = ratingDAO.findById(bookId).get();
        bookInfo.setAvgRating(bookRating.getAvgRating());
        bookInfo.setNumberOfsearches(bookRating.getNumberOfSearches());
        //3. get book inventry details
        BookInventory bookInventory = inventoryDAO.findById(bookId).get();
        bookInfo.setBooksAvailable(bookInventory.getBooksAvailable());
        //4. get boo price details
        RestTemplate restTemplate = new RestTemplate();
        String endpoint = "http://localhost:9000/bookPrice/"+bookId;
        BookPriceInfo bookPriceInfo = restTemplate.getForObject(endpoint, BookPriceInfo.class);
        bookInfo.setPrice(bookPriceInfo.getPrice());
        bookInfo.setOffer(bookPriceInfo.getOffer());

        return bookInfo;
    }

    @Override
    public void updateBookRating(BookRating bookRating) {
        ratingDAO.save(bookRating);
    }

    @Override
    public void updateBookInventory(BookInventory bookInventory) {
        inventoryDAO.save(bookInventory);
    }
}
