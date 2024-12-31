package com.restaurant_system.restaurant_system.model;

import jakarta.persistence.Entity;

import java.util.Date;
import java.util.List;

@Entity
public class ShiftEntity {
    private long id;
    private Date date;
    private List<OrderEntity> orders;
}
