package com.coursecube.placeorder.service;

import com.coursecube.placeorder.dto.OrderInfoDTO;
import com.coursecube.placeorder.entity.Order;

import java.util.List;

public interface OrderService {
    public void placeOrder(OrderInfoDTO orderInfo);
    public List<Order> getOrderByUserId(String userId);
    public Order getOrderByOrderId(Integer orderId);
}
