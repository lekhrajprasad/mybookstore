package com.coursecube.bookprice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class BookPriceController {
    static Logger log = LoggerFactory.getLogger(BookPriceController.class);
    @Autowired
    BookPriceService bookPriceService;

    @GetMapping(value = "/bookPrice/{bookId}")
    public BookPrice getBookPrice(@PathVariable("bookId") Integer bookId) {
        log.info("--BookPriceController--getBookPrice()--");
        BookPrice bookPrice = bookPriceService.getBookPriceById(bookId);
        return bookPrice;
    }

    @GetMapping(value = "/offeredPrice/{bookId}")
    public double getOfferedPrice(@PathVariable("bookId") Integer bookId) {
        log.info("--BookPriceController--getOfferedPrice()--");
        double offeredPrice = bookPriceService.getOfferedPriceById(bookId);
        return offeredPrice;
    }

}
