package com.fooddelivery.restaurant_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fooddelivery.restaurant_service.entity.MenuItem;
import com.fooddelivery.restaurant_service.entity.Restaurant;
import com.fooddelivery.restaurant_service.repository.MenuItemRepository;
import com.fooddelivery.restaurant_service.repository.RestaurantRepository;

@Service
public class RestaurantService {
    
    @Autowired
    private RestaurantRepository restaurantRepo;

    @Autowired
    private MenuItemRepository menuRepo;

    // Add Restaurant
    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepo.save(restaurant);
    }

    // Get all restaurants
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepo.findAll();
    }

    // Add Menu Item
    public MenuItem addMenuItem(MenuItem item) {
        return menuRepo.save(item);
    }

    //  Get menu by restaurant
    public List<MenuItem> getMenuByRestaurant(Long restaurantId) {
        return menuRepo.findByRestaurantId(restaurantId);
    }
    
}
