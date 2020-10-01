package com.jpa.customerproductprg.repository;

import com.jpa.customerproductprg.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
