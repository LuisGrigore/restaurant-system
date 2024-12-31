package com.restaurant_system.restaurant_system.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
public class OrderEntity {
    @Id
    @GeneratedValue
    private long id;
    private Date date;
    private OrderStatus status;
    private Type type;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id")
    private List<ItemEntity> items = new ArrayList<>();
    private float price;
    @ManyToOne
    @JoinColumn(name = "table_id", nullable = false)
    private TableEntity table;

}
