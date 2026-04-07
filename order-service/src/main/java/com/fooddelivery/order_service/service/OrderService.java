package com.fooddelivery.order_service.service;

import org.springframework.stereotype.Service;

import com.fooddelivery.order_service.kafka.event.OrderEvent;
import com.fooddelivery.order_service.kafka.producer.OrderProducer;

@Service
public class OrderService {
   private final OrderProducer orderProducer;
 
    public OrderService(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }
 
    public void createOrder(Long orderId, Long userId, Long restaurantId) {
 
        System.out.println("Order saved in DB");
 
        OrderEvent event = new OrderEvent(
                orderId,
                userId,
                restaurantId,
                "CREATED"
        );
 
        orderProducer.sendOrderEvent(event);
    }

    
}
