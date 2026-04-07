package com.fooddelivery.delivery_service.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fooddelivery.delivery_service.kafka.event.OrderEvent;

@Component
public class DeliveryConsumer {
    @KafkaListener(topics = "order_created", groupId = "delivery-group")
    public void consume(OrderEvent event) {
 
        System.out.println("Assigning delivery for order: " + event.getOrderId());
 
        // Simulate delivery assignment
        System.out.println("Delivery Partner Assigned");
    }

}
