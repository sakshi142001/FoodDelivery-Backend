package com.fooddelivery.order_service.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fooddelivery.order_service.dto.OrderRequestDTO;
import com.fooddelivery.order_service.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public String createOrder(@RequestBody OrderRequestDTO request) {

        orderService.createOrder(
                request.getOrderId(),
                request.getUserId(),
                request.getRestaurantId());
    return "Order created successfully!";
    }
}
