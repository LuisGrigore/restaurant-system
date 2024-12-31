package com.restaurant_system.restaurant_system.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TableLayoutDto {
    private List<TablePostDto> tables;
}
