package com.jpa.customerproductprg.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter

@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "name")})
public class Product  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "primaryKey.product")
    Set<Order> orders = new HashSet<>();

    @Column(unique = true)
    private String name;

    private Double price;

    public void addOrder(Order order){
        this.orders.add(order);
    }


}
