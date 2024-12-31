package com.restaurant_system.restaurant_system.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data

public class TableLayoutDto {
    private List<TablePostDto> tables;
}
