package com.restaurant_system.restaurant_system.dtos.table;

import lombok.Data;

import java.util.List;

@Data

public class TableLayoutDto {
    private List<TablePostDto> tables;
}
