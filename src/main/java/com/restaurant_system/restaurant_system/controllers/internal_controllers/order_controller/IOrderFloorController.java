package com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller;

import java.util.List;

public interface IOrderFloorController {
    void generateOrders(List<String> itemNames, int tableNum);
}
