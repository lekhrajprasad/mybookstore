package com.coursecube.bookstoreweb.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import com.coursecube.bookstoreweb.service.BookStoreService;

@CrossOrigin
@Controller
public class BookStoreController {
	static Logger log = LoggerFactory.getLogger(BookStoreController.class);
	@Autowired
	BookStoreService bookStoreService;

	@GetMapping("/")
	public String showIndexPage(Model model, HttpSession session) {
		List<String> authorList = bookStoreService.getAuthorsList();
		List<String> catList = bookStoreService.getCategoryList();
		session.setAttribute("MyAuthorList", authorList);
		session.setAttribute("MyCatList", catList);
		return "index";
	}

}
