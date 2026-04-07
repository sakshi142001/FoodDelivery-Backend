package com.fooddelivery.restaurant_service.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fooddelivery.restaurant_service.kafka.event.OrderEvent;


@Component
public class RestaurantConsumer {
    @KafkaListener(topics = "order_created", groupId = "restaurant-group")
    public void consume(OrderEvent event) {
 
        System.out.println("Restaurant received order: " + event.getOrderId());
 
        // Simulate confirmation
        System.out.println("Order Confirmed by Restaurant");
    }

    
}
