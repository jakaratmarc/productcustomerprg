package com.jpa.customerproductprg.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.ast.Or;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy ="primaryKey.customer", cascade = CascadeType.ALL)
    Set<Order> orders = new HashSet<>();

    public void addProduct(Order order){

        this.orders.add(order);
    }

    public void addOrder(Order order){
        this.orders.add(order);
    }

}
