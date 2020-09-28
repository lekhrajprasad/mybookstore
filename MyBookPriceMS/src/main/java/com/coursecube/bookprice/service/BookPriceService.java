package com.coursecube.bookprice.service;

import com.coursecube.bookprice.entity.BookPrice;

public interface BookPriceService {
    public BookPrice getBookPriceById(Integer bookId);
    public double getOfferedPriceById(Integer bookId);
}
