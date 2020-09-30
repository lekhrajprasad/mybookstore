package com.coursecube.userratings.service;

import java.util.List;

import com.coursecube.userratings.dao.BookRatingDAO;
import com.coursecube.userratings.dao.UserRatingDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coursecube.userratings.entity.BookRating;
import com.coursecube.userratings.entity.UserRating;
import org.springframework.web.client.RestTemplate;

@Service
@Transactional
public class RatingServiceImpl implements RatingService{

	@Autowired
	BookRatingDAO bookRatingDAO;

	@Autowired
	UserRatingDAO userRatingDAO;

	@Override
	public void addUserRating(UserRating userRating) {
		//1. Add the user rating
		userRatingDAO.save(userRating);

		//2. calculate the avg rating for book
		int bookId = userRating.getBookId();
		List<UserRating> userRatings = userRatingDAO.getUserRatingByBookId(bookId);
		double sumRating=0.0;
		for(UserRating ur: userRatings){
			sumRating = sumRating + ur.getRating();
		}
		double avgRating = sumRating/userRatings.size();

		//3. Update BookRating in UserRatingMS(Local)
		BookRating bookRating = bookRatingDAO.findById(bookId).get();
		bookRating.setAvgRating(avgRating);
		bookRatingDAO.save(bookRating);

		//4. Update book rating in book search ms
		RestTemplate bookSearchRestTemplate = new RestTemplate();
		String endpoint = "http://localhost:8000/updateBookRating";
		bookSearchRestTemplate.put(endpoint, bookRating);
		
	}

	@Override
	public List<UserRating> getUserRatingByUserId(String userId) {
		return userRatingDAO.getUserRatingByUserId(userId);
	}

	@Override
	public void updateBookRating(BookRating bookRating) {
		bookRatingDAO.save(bookRating);
	}

	@Override
	public BookRating getBookRatingByBookId(Integer bookId) {
		return bookRatingDAO.findById(bookId).get();
	}

    
}
