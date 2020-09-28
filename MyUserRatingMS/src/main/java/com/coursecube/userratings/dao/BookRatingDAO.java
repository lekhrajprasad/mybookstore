package com.coursecube.userratings.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursecube.userratings.entity.BookRating;

public interface BookRatingDAO extends JpaRepository<BookRating, Integer> {
    
}
