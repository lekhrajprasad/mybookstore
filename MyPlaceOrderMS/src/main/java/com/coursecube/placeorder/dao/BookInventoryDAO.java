package com.coursecube.placeorder.dao;

import com.coursecube.placeorder.entity.BookInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookInventoryDAO extends JpaRepository<BookInventory, Integer> {
}
