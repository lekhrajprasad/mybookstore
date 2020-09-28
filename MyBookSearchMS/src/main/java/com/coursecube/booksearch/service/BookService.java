package com.coursecube.booksearch.service;

import com.coursecube.booksearch.entity.Book;
import com.coursecube.booksearch.dto.BookInfo;
import com.coursecube.booksearch.entity.BookInventory;
import com.coursecube.booksearch.entity.BookRating;

import java.util.List;

public interface BookService {
    public List<Book> getBooks(String author, String category);
    public BookInfo getBookInfo(Integer bookId);
    public void updateBookRating(BookRating bookRating);
    public void updateBookInventory(BookInventory bookInventory);
}
