package com.fooddelivery.order_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderRequestDTO {
    private Long userId;
    private Long orderId;
    private Long restaurantId;
    private Double totalAmount;
    
}
