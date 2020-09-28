package com.coursecube.booksearch.dao;

import com.coursecube.booksearch.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookDAO extends JpaRepository<Book, Integer> {
    public List<Book> getBooksByAuthorAndCategory(String author, String category);
    public List<Book> getBookByAuthor(String author);
    public List<Book> getBookByCategory(String category);
}
