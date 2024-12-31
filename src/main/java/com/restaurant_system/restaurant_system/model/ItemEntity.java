package com.restaurant_system.restaurant_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class ItemEntity {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private float price;
    private Type type;
}
