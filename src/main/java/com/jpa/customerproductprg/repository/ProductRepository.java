package com.jpa.customerproductprg.repository;

import com.jpa.customerproductprg.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
