package com.restaurant_system.restaurant_system.services.internal_services;

import com.restaurant_system.restaurant_system.dtos.order.OrderPostDto;
import com.restaurant_system.restaurant_system.model.ItemEntity;
import com.restaurant_system.restaurant_system.model.OrderEntity;
import com.restaurant_system.restaurant_system.model.OrderStatus;
import com.restaurant_system.restaurant_system.model.TableEntity;

import java.util.List;

public interface IOrderService {
    void updateOrderStatus(long id, OrderStatus status);
    List<OrderEntity> getAllOrders();
    void generateOrders(List<ItemEntity> itemNames, TableEntity table);
}
