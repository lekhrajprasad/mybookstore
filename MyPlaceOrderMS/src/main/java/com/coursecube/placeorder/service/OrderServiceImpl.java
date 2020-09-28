package com.coursecube.placeorder.service;

import com.coursecube.placeorder.dao.BookInventoryDAO;
import com.coursecube.placeorder.dao.OrderDAO;
import com.coursecube.placeorder.dao.OrderItemDAO;
import com.coursecube.placeorder.dto.OrderInfo;
import com.coursecube.placeorder.entity.BookInventory;
import com.coursecube.placeorder.entity.Order;
import com.coursecube.placeorder.entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderDAO orderDAO;

    @Autowired
    OrderItemDAO orderItemDAO;

    @Autowired
    BookInventoryDAO bookInventoryDAO;

    @Override
    public void placeOrder(OrderInfo orderInfo) {
        //4 task to do when you place the order
        //1. Insert Order - 1
        Order order = orderInfo.getOrder();
        order = orderDAO.save(order);//1002
        int orderId = order.getOrderId();
        //2. Insert order items - N
        //Need to improve for performance
        List<OrderItem> itemList = orderInfo.getItemList();
        for(OrderItem orderItem: itemList){
            orderItem.setOrderId(orderId);
            orderItemDAO.save(orderItem);
        }
        //3. update local BookInventry -N
        //4. Update BookSearchMS BookInventry-N
        //TODO: Need to improve this
        RestTemplate bootserachRest = new RestTemplate();
        String endPoint = "http://localhost:8000/updateBookInventry";
        for(OrderItem orderItem:itemList){
            Integer bookId = orderItem.getBookId();
            BookInventory bookInventory = bookInventoryDAO.findById(bookId).get();
            Integer currentStock = bookInventory.getBooksAvailable();
            currentStock = currentStock - orderItem.getQty();
            //updating
            bookInventory.setBooksAvailable(currentStock);

            //Local Invenrty
            bookInventoryDAO.save(bookInventory);
            //Invenrty of BooksearchMS
            bootserachRest.put(endPoint, bookInventory);
        }
    }

    @Override
    public List<Order> getOrderByUserId(String userId) {
        List<Order> orderList = orderDAO.findOrderByUserId(userId);
        return orderList;
    }

    @Override
    public Order getOrderByOrderId(Integer orderId) {
        Order order = orderDAO.findById(orderId).get();
        return order;
    }
}
