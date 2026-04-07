package com.fooddelivery.delivery_service.kafka.event;


public class OrderEvent {

    private Long orderId;
    private Long userId;
    private Long restaurantId; 
    private String status;

    public OrderEvent() {
    }
    public OrderEvent(Long orderId, Long userId, Long restaurantId, String status) {
        this.orderId = orderId;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.status = status;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public String getStatus() {
        return status;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

