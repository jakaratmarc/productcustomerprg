package com.jpa.customerproductprg.controller;

import com.jpa.customerproductprg.model.Product;
import com.jpa.customerproductprg.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping(value="/saveprod")
    public String saveProduct(@RequestBody Product product){
        productRepository.save(product);
        return "Product saved";
    }
}
