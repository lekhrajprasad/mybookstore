package com.coursecube.userratings.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "myuserratings")
public class UserRating {
	
    public UserRating() {
		super();
	}

	public UserRating(String userId, double rating, String review, Integer bookId) {
		super();
		this.userId = userId;
		this.rating = rating;
		this.review = review;
		this.bookId = bookId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rating_item_id_generator")
    //@SequenceGenerator(name = "rating_item_id_generator", sequenceName = "myrating_item_id_gen", initialValue = 1, allocationSize = 1)
    @Column(name = "rating_id")
    private Integer ratingId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "rating")
    private double rating;

    @Column(name = "review")
    private String review;

    @Column(name = "book_id")
	private Integer bookId;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Integer getRatingId() {
		return ratingId;
	}

	public void setRatingId(Integer ratingId) {
		this.ratingId = ratingId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "UserRating{" +
				"ratingId=" + ratingId +
				", userId='" + userId + '\'' +
				", rating=" + rating +
				", review='" + review + '\'' +
				", bookId=" + bookId +
				'}';
	}
}
