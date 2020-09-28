package com.coursecube.placeorder.service;

import com.coursecube.placeorder.dto.OrderInfo;
import com.coursecube.placeorder.entity.Order;

import java.util.List;

public interface OrderService {
    public void placeOrder(OrderInfo orderInfo);
    public List<Order> getOrderByUserId(String userId);
    public Order getOrderByOrderId(Integer orderId);
}
