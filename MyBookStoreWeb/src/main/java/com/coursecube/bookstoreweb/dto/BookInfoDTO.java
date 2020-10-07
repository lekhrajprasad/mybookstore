package com.coursecube.bookstoreweb.dto;

public class BookInfoDTO {
	private Integer bookId;
	private String bookName;
	private String author;
	private String publications;
	private String category;
	private double price;
	private int offer;
	private double avgRating;
	private int numberOfsearched;
	public BookInfoDTO() {
		super();
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublications() {
		return publications;
	}
	public void setPublications(String publications) {
		this.publications = publications;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getOffer() {
		return offer;
	}
	public void setOffer(int offer) {
		this.offer = offer;
	}
	public double getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(double avgRating) {
		this.avgRating = avgRating;
	}
	public int getNumberOfsearched() {
		return numberOfsearched;
	}
	public void setNumberOfsearched(int numberOfsearched) {
		this.numberOfsearched = numberOfsearched;
	}
	@Override
	public String toString() {
		return "BookInfoDTO [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", publications="
				+ publications + ", category=" + category + ", price=" + price + ", offer=" + offer + ", avgRating="
				+ avgRating + ", numberOfsearched=" + numberOfsearched + "]";
	}
	

}
