package com.fooddelivery.delivery_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fooddelivery.delivery_service.entity.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Long>{
    
}
