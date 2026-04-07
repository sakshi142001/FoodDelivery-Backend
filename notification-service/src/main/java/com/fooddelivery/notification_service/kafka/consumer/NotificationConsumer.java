package com.fooddelivery.notification_service.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fooddelivery.notification_service.kafka.event.OrderEvent;


@Component
public class NotificationConsumer {
    @KafkaListener(topics = "order_created", groupId = "notification-group")
    public void consume(OrderEvent event) {
 
        System.out.println("Sending notification for order: " + event.getOrderId());
 
        // Simulate notification
        System.out.println("Notification Sent to User");
    }


    
}
