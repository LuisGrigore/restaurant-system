package com.restaurant_system.restaurant_system.datasources.impl;

import com.restaurant_system.restaurant_system.datasources.IItemDatasource;
import com.restaurant_system.restaurant_system.model.ItemEntity;
import com.restaurant_system.restaurant_system.serializers.IItemSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ItemDatasource implements IItemDatasource {
    @Autowired
    private IItemSerializer itemSerializer;
    @Override
    public Optional<ItemEntity> getItemByName(String name) {
        itemSerializer.deserializeItem();
        return null;
    }
}
