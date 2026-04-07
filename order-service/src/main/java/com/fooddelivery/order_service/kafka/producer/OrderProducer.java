package com.fooddelivery.order_service.kafka.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fooddelivery.order_service.kafka.event.OrderEvent;


@Service
public class OrderProducer {
    
    private final KafkaTemplate<String, OrderEvent> kafkaTemplate;
 
    public OrderProducer(KafkaTemplate<String, OrderEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
 
    public void sendOrderEvent(OrderEvent event) {
 
        kafkaTemplate.send("order_created", event);
 
        System.out.println("Order Event Sent to Kafka: " + event.getOrderId());
    }

    
}
