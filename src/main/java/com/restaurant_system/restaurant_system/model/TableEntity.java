package com.restaurant_system.restaurant_system.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class TableEntity {
    @Id
    @GeneratedValue
    private long id;
    private int num;
    private int dinerNum;
    @OneToMany(mappedBy = "table", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderEntity> orders = new ArrayList<>();
    private float totalPrice;
}
