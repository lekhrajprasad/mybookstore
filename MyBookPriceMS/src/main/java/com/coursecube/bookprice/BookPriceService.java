package com.coursecube.bookprice;

import java.awt.print.Book;

public interface BookPriceService {
    public BookPrice getBookPriceById(Integer bookId);
    public double getOfferedPriceById(Integer bookId);
}
