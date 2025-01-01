package com.restaurant_system.restaurant_system.datasources;

import com.restaurant_system.restaurant_system.model.ItemEntity;

import java.util.Optional;

public interface IItemDatasource {
    Optional<ItemEntity> getItemByName(String name);
}