package com.coursecube.bookstoreweb.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.coursecube.bookstoreweb.dto.BookDTO;
import com.coursecube.bookstoreweb.dto.BookInfoDTO;
import com.coursecube.bookstoreweb.dto.OrderDTO;
import com.coursecube.bookstoreweb.dto.OrderInfoDTO;
import com.coursecube.bookstoreweb.dto.OrderItemDTO;
import com.coursecube.bookstoreweb.dto.UserRatingDTO;

@Service
public class BookStoreServiceImpl implements BookStoreService {
	Map<Integer, BookDTO> booksMap = new LinkedHashMap<>();

	@Override
	public List<String> getCategoryList() {
		List<String> catList = new ArrayList<>();
		catList.add("All Categories");
		catList.add("Web");
		catList.add("Spring");
		catList.add("Microservices");
		return catList;
	}

	@Override
	public List<String> getAuthorsList() {
		List<String> authors = new ArrayList<>();
		authors.add("All Authors");
		authors.add("Srinivas");
		authors.add("Sri");
		authors.add("Vas");
		authors.add("Lekhraj");
		return authors;
	}

	@Override
	public List<BookDTO> getMyBooks(String author, String category) {
		if (author == null || author.length() == 0) {
			author = "All Authors";
		}
		if (category == null || category.length() == 0) {
			category = "All Categories";
		}
		// Invoke Book SearchMS
		RestTemplate restTemplate = new RestTemplate();
		String endpoint = "http://localhost:8000/mybooks/" + author + "/" + category;
		List<Map> list = restTemplate.getForObject(endpoint, List.class);
		List<BookDTO> booksList = new ArrayList<>();
		for (Map mymap : list) {
			BookDTO myBook = convertMapToBook(mymap);
			booksList.add(myBook);
			booksMap.put(myBook.getBookId(), myBook);
		}

		return booksList;
	}

	private BookDTO convertMapToBook(Map map) {
		BookDTO mybook = new BookDTO();
		mybook.setBookId(Integer.parseInt(map.get("bookId").toString()));
		mybook.setBookName((map.get("bookName").toString()));
		mybook.setAuthor((map.get("author").toString()));
		mybook.setPublications(map.get("publications").toString());
		mybook.setCategory(map.get("category").toString());
		return mybook;
	}

	@Override
	public BookInfoDTO getBookInfoByBookId(Integer bookId) {
		RestTemplate restTemplate = new RestTemplate();
		//Calling Book Search MS
		String endpoint = "http://localhost:8000/mybook/" + bookId;
		return restTemplate.getForObject(endpoint, BookInfoDTO.class);
	}

	@Override
	public BookDTO getBookByBookId(Integer bookId) {
		return booksMap.get(bookId);
	}

	@Override
	public void placeOrder(Map<Integer, BookDTO> mycartMap) {
		List<OrderItemDTO> itemList = new ArrayList<>();
		double totalPrice=0.0;
		int totalQuantity=0;
		for(BookDTO mybook: mycartMap.values()) {
			Integer bookId = mybook.getBookId();
			//Invoke BookPrice Controller
			RestTemplate bookPriceRestTemp = new RestTemplate();
			String endpoint = "http://localhost:9000/offeredPrice/"+bookId;
			double offeredPrice = bookPriceRestTemp.getForObject(endpoint, Double.class);
			OrderItemDTO item = new OrderItemDTO(0, bookId, 1, offeredPrice);
			itemList.add(item);
			totalPrice = totalPrice + offeredPrice;
			totalQuantity = totalQuantity +1;
		}
		Date today = Calendar.getInstance().getTime();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm");
		String orderDate = format.format(today);
		OrderDTO order = new OrderDTO(orderDate, "U-111", totalQuantity, totalPrice, "New");
		
		OrderInfoDTO orderInfo = new OrderInfoDTO();
		orderInfo.setOrder(order);
		orderInfo.setItemList(itemList);
		
		//Invoke Place Order MS
		String orderEndPoint = "http://localhost:7000/placeOrder";
		RestTemplate orderRestTemp = new RestTemplate();
		orderRestTemp.put(orderEndPoint, orderInfo);
	}

	@Override
	public void addUserRating(UserRatingDTO userRating) {
		//Invoke User Rating MS
		String ratingEndpoint = "http://localhost:6500/addUserRating";
		RestTemplate ratingRestTemplate = new RestTemplate();
		ratingRestTemplate.put(ratingEndpoint, userRating);
	}

	@Override
	public List<UserRatingDTO> getMyRatings(String userId) {
		//Invking Book Rating MS
		List<UserRatingDTO> ratingsList = new ArrayList<>();
		String ratingEndpoint = "http://localhost:6500/userRatings/"+userId;
		RestTemplate restTemp = new RestTemplate();
		List<Map> mymap = restTemp.getForObject(ratingEndpoint, List.class);
		for(Map map:mymap) {
			UserRatingDTO usrRating = convertMapToUserRating(map);
			ratingsList.add(usrRating);
		}
		
		return ratingsList;
		
	}
	private UserRatingDTO convertMapToUserRating(Map map) {
		UserRatingDTO rating=new UserRatingDTO();
		rating.setRatingId(Integer.parseInt(map.get("ratingId").toString()));
		rating.setUserId(map.get("userId").toString());
		rating.setBookId(Integer.parseInt(map.get("bookId").toString()));
		rating.setRating(Double.parseDouble(map.get("rating").toString()));
		rating.setReview(map.get("review").toString());
		return rating;
		}
}
