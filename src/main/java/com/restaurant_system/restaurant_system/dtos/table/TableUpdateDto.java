package com.restaurant_system.restaurant_system.dtos.table;

import com.restaurant_system.restaurant_system.dtos.order.OrderPostDto;
import lombok.Data;

import java.util.List;

@Data

public class TableUpdateDto {
    private int num;
    private int dinerNum;
    private List<OrderPostDto> orders;

}
