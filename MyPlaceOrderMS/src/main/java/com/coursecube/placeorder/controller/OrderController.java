package com.coursecube.placeorder.controller;

import com.coursecube.placeorder.dto.OrderInfo;
import com.coursecube.placeorder.entity.Order;
import com.coursecube.placeorder.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class OrderController {
    static Logger log = LoggerFactory.getLogger(OrderController.class);
    
    @Autowired
    OrderService orderService;

    @PutMapping(value = "/placeOrder")
    public void placeOrder(@RequestBody OrderInfo orderInfo){
        orderService.placeOrder(orderInfo);
    }
    
    @GetMapping(value = "/myorders/{userId}")
    public List<Order> getOrderByUserId(@PathVariable String userId){
        List<Order> orderList = orderService.getOrderByUserId(userId);
        return orderList;
    }

    @GetMapping(value = "/myorder/{orderId}")
    public Order getOrderByUserId(@PathVariable Integer orderId){
        Order order = orderService.getOrderByOrderId(orderId);
        return order;
    }
}
