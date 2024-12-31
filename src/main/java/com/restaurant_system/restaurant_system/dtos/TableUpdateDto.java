package com.restaurant_system.restaurant_system.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TableUpdateDto {
    private int num;
    private int dinerNum;
    private List<OrderPostDto> orders;

    public void setDinerNum(int dinerNum) {
        this.dinerNum = dinerNum;
    }
}
