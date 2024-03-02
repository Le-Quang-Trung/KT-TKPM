package com.example.service;

import com.example.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    public List<Order> getAllOrder();
}
