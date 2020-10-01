package com.jpa.customerproductprg.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.source.doctree.SerialDataTree;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter

@AssociationOverrides({
        @AssociationOverride(name = "primaryKey.customer",
                joinColumns = @JoinColumn(name = "CUSTOMER_ID")),
        @AssociationOverride(name = "primaryKey.product",
                joinColumns = @JoinColumn(name = "PRODUCT_ID")) })

public class Order implements Serializable {

    private Double totalCost;

    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @EmbeddedId
    private OrderId orderIdKey;
}
