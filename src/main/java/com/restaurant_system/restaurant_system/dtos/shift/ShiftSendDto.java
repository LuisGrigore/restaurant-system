package com.restaurant_system.restaurant_system.dtos.shift;

import com.restaurant_system.restaurant_system.model.OrderEntity;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Builder
public class ShiftSendDto {
    private Date open;
    private Date close;
    private float totalValue;
    private float realValue;
    private float difference;
    private List<OrderEntity> orders = new ArrayList<>();
}
