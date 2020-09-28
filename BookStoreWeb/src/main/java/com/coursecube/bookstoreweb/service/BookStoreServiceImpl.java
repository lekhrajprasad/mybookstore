package com.coursecube.bookstoreweb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookStoreServiceImpl implements BookStoreService {

	@Override
	public List<String> getCategoryList() {
		List<String> authors = new ArrayList<>();
		authors.add("All Authors");
		authors.add("Srinivas");
		authors.add("Sri");
		authors.add("Vas");
		authors.add("Lekhraj");
		return authors;
	}

	@Override
	public List<String> getAuthorsList() {
		List<String> catList = new ArrayList<>();
		catList.add("All Categories");
		catList.add("Web");
		catList.add("Spring");
		catList.add("Microservices");
		return catList;
	}

}
