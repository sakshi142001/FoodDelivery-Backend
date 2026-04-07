package com.fooddelivery.user_service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fooddelivery.user_service.dto.AuthResponse;
import com.fooddelivery.user_service.dto.LoginRequest;
import com.fooddelivery.user_service.dto.UserDTO;
import com.fooddelivery.user_service.entity.User;
import com.fooddelivery.user_service.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService service;

    // 🔹 Register
    @PostMapping("/register")
    public User register(@RequestBody UserDTO dto) {
        return service.register(dto);
    }

    // 🔹 Login
    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest request) {

        String token = service.login(request);
        return new AuthResponse(token);
    }
    
}
