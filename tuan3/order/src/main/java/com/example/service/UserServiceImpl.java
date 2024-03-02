package com.example.service;

import com.example.entity.Order;
import com.example.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Override
    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }
}
