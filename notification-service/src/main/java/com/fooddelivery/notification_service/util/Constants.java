package com.fooddelivery.notification_service.util;

public class Constants {

    // ===============================
    // KAFKA TOPICS
    // ===============================
    public static final String ORDER_CREATED_TOPIC = "order_created";
    public static final String ORDER_CONFIRMED_TOPIC = "order_confirmed";
    public static final String ORDER_OUT_FOR_DELIVERY_TOPIC = "order_out_for_delivery";
 
    // ===============================
    // KAFKA GROUP IDS
 
    public static final String RESTAURANT_GROUP = "restaurant-group";
    public static final String DELIVERY_GROUP = "delivery-group";
    public static final String NOTIFICATION_GROUP = "notification-group";
 
    public static final String ORDER_CREATED = "CREATED";
    public static final String ORDER_CONFIRMED = "CONFIRMED";
    public static final String ORDER_OUT_FOR_DELIVERY = "OUT_FOR_DELIVERY";
    public static final String ORDER_DELIVERED = "DELIVERED";
    public static final String ORDER_CANCELLED = "CANCELLED";
 
    public static final String ROLE_USER = "USER";
    public static final String ROLE_ADMIN = "ADMIN";
    public static final String ROLE_DELIVERY_PARTNER = "DELIVERY_PARTNER";
 
    
    public static final String API_USERS = "/api/users";
    public static final String API_ORDERS = "/api/orders";
    public static final String API_RESTAURANTS = "/api/restaurants";
    public static final String API_DELIVERY = "/api/delivery";
 
    
   
    public static final String JWT_SECRET = "mySecretKey";
    public static final long JWT_EXPIRATION = 86400000; // 1 day in milliseconds
 
    
    public static final String ORDER_SUCCESS = "Order placed successfully";
    public static final String ORDER_FAILED = "Order failed";
    public static final String USER_NOT_FOUND = "User not found";
 
 
    // PRIVATE CONST
    private Constants() {
        
    }

    
    
}
