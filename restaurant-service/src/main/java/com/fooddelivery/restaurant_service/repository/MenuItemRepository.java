package com.fooddelivery.restaurant_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fooddelivery.restaurant_service.entity.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long>{

    List<MenuItem> findByRestaurantId(Long restaurantId);
    
}
