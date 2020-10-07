package com.coursecube.userratings.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "mybookratings")
public class BookRating {
	
    public BookRating() {
		super();
	}

	public BookRating(double avgRating, int numberOfSearches) {
		super();
		this.avgRating = avgRating;
		this.numberOfSearches = numberOfSearches;
	}

	@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookrating_id_generator")
    //@SequenceGenerator(name = "bookrating_id_generator", sequenceName = "bookrating_id_gen", initialValue = 110, allocationSize = 1)
    @Column(name = "book_id")
    private Integer bookId;

    @Column(name = "avg_rating")
    private double avgRating;

    @Column(name = "number_of_searches")
    private int numberOfSearches;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public double getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(double avgRating) {
		this.avgRating = avgRating;
	}

	public int getNumberOfSearches() {
		return numberOfSearches;
	}

	public void setNumberOfSearches(int numberOfSearches) {
		this.numberOfSearches = numberOfSearches;
	}

	@Override
	public String toString() {
		return "BookRating [bookId=" + bookId + ", avgRating=" + avgRating + ", numberOfSearches=" + numberOfSearches
				+ "]";
	}

    
}
