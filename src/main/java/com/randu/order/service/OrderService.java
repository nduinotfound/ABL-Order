package com.randu.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.randu.order.model.Order;
import com.randu.order.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> gettAllProducts(){
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id){
        return orderRepository.findById(id).orElse(null);
    }

    public Order createOrder(Order order){
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id){
        orderRepository.deleteById(id);
    }
}
