package com.restaurant_system.restaurant_system.services.internal_services;

import com.restaurant_system.restaurant_system.model.ItemEntity;

import java.util.Optional;

public interface IItemService {
    Optional<ItemEntity> getItemByName(String name);
}
