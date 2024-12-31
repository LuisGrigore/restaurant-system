package com.restaurant_system.restaurant_system.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class TableEntity {
    private long id;
    private int num;
    private int dinerNum;
    private List<OrderEntity> orders;
    private float totalPrice;
}
