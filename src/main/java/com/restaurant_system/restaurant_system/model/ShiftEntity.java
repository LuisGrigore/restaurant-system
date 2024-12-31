package com.restaurant_system.restaurant_system.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
public class ShiftEntity {
    @Id
    @GeneratedValue
    private long id;
    private Date open;
    private Date close;
    private float totalValue;
    private float realValue;
    private float difference;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<OrderEntity> orders = new ArrayList<>();
}
