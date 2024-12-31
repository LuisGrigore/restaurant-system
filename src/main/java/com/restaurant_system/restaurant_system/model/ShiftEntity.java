package com.restaurant_system.restaurant_system.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class ShiftEntity {
    private long id;
    private Date date;
    private List<OrderEntity> orders;
}
