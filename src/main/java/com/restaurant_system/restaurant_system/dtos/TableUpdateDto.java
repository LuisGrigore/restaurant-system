package com.restaurant_system.restaurant_system.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data

public class TableUpdateDto {
    private int num;
    private int dinerNum;
    private List<OrderPostDto> orders;

}
