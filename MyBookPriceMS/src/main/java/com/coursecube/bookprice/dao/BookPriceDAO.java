package com.coursecube.bookprice.dao;


import com.coursecube.bookprice.entity.BookPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookPriceDAO extends JpaRepository<BookPrice, Integer> {
}
