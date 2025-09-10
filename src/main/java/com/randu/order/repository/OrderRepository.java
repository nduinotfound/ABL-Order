package com.randu.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.randu.order.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
