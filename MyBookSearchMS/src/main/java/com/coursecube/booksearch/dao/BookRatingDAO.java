package com.coursecube.booksearch.dao;

import com.coursecube.booksearch.entity.BookRating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRatingDAO extends JpaRepository<BookRating, Integer> {
}
