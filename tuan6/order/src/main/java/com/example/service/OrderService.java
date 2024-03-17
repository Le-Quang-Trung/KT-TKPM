package com.example.service;

import com.example.entity.Order;

import java.util.List;

public interface OrderService {

    void addOrder(Order order);

    List<Order> getAllOrder();

    void updateOrder(String id, Order order);

    void deleteOrder(String id);
}
