package com.restaurant_system.restaurant_system.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class ShiftEntity {
    @Id
    @GeneratedValue
    private long id;
    private Date date;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<OrderEntity> orders = new ArrayList<>();
}
