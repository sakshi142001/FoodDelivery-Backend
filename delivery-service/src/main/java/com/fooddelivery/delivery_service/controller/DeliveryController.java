package com.fooddelivery.delivery_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fooddelivery.delivery_service.entity.Delivery;
import com.fooddelivery.delivery_service.service.DeliveryService;

@RestController
@RequestMapping("/api/delivery")

public class DeliveryController {
    @Autowired
    private DeliveryService service;

    // 🔹 Manual Test API
    @PostMapping("/{orderId}")
    public Delivery assign(@PathVariable Long orderId) {
        return service.assignDelivery(orderId);
    }

    
}
