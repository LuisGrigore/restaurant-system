package com.restaurant_system.restaurant_system.model;

import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class TableEntity {
    private long id;
    private int num;
    private int dinerNum;
    private List<OrderEntity> orders;
    private float totalPrice;
}
