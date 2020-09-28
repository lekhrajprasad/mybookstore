package com.coursecube.bookprice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookPriceDAO extends JpaRepository<BookPrice, Integer> {
}
