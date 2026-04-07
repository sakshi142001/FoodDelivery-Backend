package com.fooddelivery.delivery_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fooddelivery.delivery_service.entity.Delivery;
import com.fooddelivery.delivery_service.repository.DeliveryRepository;

@Service
public class DeliveryService {
    @Autowired
    private DeliveryRepository repo;

    // 🔹 Assign Delivery Partner
    public Delivery assignDelivery(Long orderId) {

        Delivery delivery = new Delivery();
        delivery.setOrderId(orderId);
        delivery.setDeliveryPartner("Partner-1");
        delivery.setStatus("ASSIGNED");

        return repo.save(delivery);
    }
    
}
