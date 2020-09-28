package com.coursecube.booksearch.dao;

import com.coursecube.booksearch.entity.BookInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookInventoryDAO extends JpaRepository<BookInventory, Integer> {
}
