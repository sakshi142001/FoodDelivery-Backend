package com.fooddelivery.user_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
    
    @Id
    @GeneratedValue
    private Long userId;

    private String name;
    private String email;
    private String password;
    private String role;

}
