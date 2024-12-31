package com.restaurant_system.restaurant_system.dtos;

import lombok.Data;

import java.util.List;

@Data
public class AddItemsToTableDto {
    private List<String> itemNames;
    private int table;
}
