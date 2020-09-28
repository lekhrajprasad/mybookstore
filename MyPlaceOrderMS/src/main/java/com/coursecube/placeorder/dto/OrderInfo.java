package com.coursecube.placeorder.dto;

import com.coursecube.placeorder.entity.Order;
import com.coursecube.placeorder.entity.OrderItem;

import java.util.List;

public class OrderInfo {
    private Order order;
    private List<OrderItem>  itemList;

    public OrderInfo() {
    }

    public OrderInfo(Order order, List<OrderItem> itemList) {
        this.order = order;
        this.itemList = itemList;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<OrderItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<OrderItem> itemList) {
        this.itemList = itemList;
    }

}
