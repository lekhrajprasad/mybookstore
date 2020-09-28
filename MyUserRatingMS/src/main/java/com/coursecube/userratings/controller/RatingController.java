package com.coursecube.userratings.controller;


import com.coursecube.userratings.entity.BookRating;
import com.coursecube.userratings.entity.UserRating;
import com.coursecube.userratings.service.RatingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class RatingController {
    static Logger log = LoggerFactory.getLogger(RatingController.class);
    
    @Autowired
    RatingService ratingService;
    
    @PutMapping("/addUserRating")
    public void addUserRating(@RequestBody UserRating userRating){
        ratingService.addUserRating(userRating);
    }
    
    @GetMapping("/userRatings/{userId}")
    public List<UserRating> getUserRatingByUserId(@PathVariable String userId){ 
        return ratingService.getUserRatingByUserId(userId);
    }
    @GetMapping("/bookRatings/{bookId}")
    public BookRating getBookRatingByBookId(@PathVariable int bookId){
        return ratingService.getBookRatingByBookId(bookId);
    }
    
}
