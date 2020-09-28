package com.coursecube.placeorder.dao;

import com.coursecube.placeorder.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDAO extends JpaRepository<Order, Integer> {
    public List<Order> findOrderByUserId(String userId);
}
