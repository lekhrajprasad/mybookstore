package com.coursecube.userratings.service;

import java.util.List;

import com.coursecube.userratings.entity.BookRating;
import com.coursecube.userratings.entity.UserRating;

public interface RatingService {
	public void addUserRating(UserRating userRating);

	public List<UserRating> getUserRatingByUserId(String userId);

	public void updateBookRating(BookRating bookRating);

	public BookRating getBookRatingByBookId(Integer bookId);
}
