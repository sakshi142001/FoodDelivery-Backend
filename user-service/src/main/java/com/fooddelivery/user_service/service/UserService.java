package com.fooddelivery.user_service.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fooddelivery.user_service.dto.LoginRequest;
import com.fooddelivery.user_service.dto.UserDTO;
import com.fooddelivery.user_service.entity.User;
import com.fooddelivery.user_service.repository.UserRepository;
import com.fooddelivery.user_service.security.JWTUtil;

@Service
public class UserService {
   @Autowired
    private UserRepository repo;

    @Autowired
    private JWTUtil jwtUtil;

    // 🔹 Register User
    public User register(UserDTO dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setRole(dto.getRole());

        return repo.save(user);
    }

    // 🔹 Login + Generate Token
    public String login(LoginRequest request) {

        User user = repo.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!user.getPassword().equals(request.getPassword())) {
            throw new RuntimeException("Invalid Password");
        }

        return jwtUtil.generateToken(user.getEmail());
    }
    
}
