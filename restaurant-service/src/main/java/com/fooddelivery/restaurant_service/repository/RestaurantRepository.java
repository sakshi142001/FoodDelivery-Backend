package com.fooddelivery.restaurant_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fooddelivery.restaurant_service.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{

}
