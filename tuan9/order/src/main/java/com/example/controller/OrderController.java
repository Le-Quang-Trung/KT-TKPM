package com.example.controller;

import com.example.config.RestTemplateConfig;
import com.example.entity.Order;
import com.example.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    @Autowired
    OrderService orderService;

    @Autowired
    RestTemplateConfig restTemplate;

    @Autowired
    RetryTemplate retryTemplate;

//    @Autowired
//    Bucket  bucket;

    @PostMapping("/add")
    public String createOrder(@RequestBody Order order){
        orderService.addOrder(order);
        return "them Order thanh cong";
    }

    @GetMapping
    public List<Order> getOrder() {
        return orderService.getAllOrder();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateOrder(@PathVariable String id, @RequestBody Order order){
        orderService.updateOrder(id, order);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable String id){
        orderService.deleteOrder(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/customer")
    public Object getForObject(){
        String url = "http://localhost:8084/customer";
        return retryTemplate.execute(context -> restTemplate.getForObject(url, Object.class));
    }
}
