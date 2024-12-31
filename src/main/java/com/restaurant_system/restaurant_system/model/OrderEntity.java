package com.restaurant_system.restaurant_system.model;

import jakarta.persistence.Entity;

import java.util.Date;
import java.util.List;

@Entity
public class OrderEntity {
    private long id;
    private Date date;
    private OrderStatus status;
    private Type type;
    private List<ItemEntity> items;
    private float price;
}
