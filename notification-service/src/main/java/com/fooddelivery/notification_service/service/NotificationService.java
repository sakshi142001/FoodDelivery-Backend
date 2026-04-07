package com.fooddelivery.notification_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fooddelivery.notification_service.email.EmailService;

@Service
public class NotificationService {
    
    @Autowired
    private EmailService emailService;

    public void sendNotification(String message) {

        System.out.println("Notification: " + message);

        // Send email (simulation)
        emailService.sendEmail("user@gmail.com", message);
    }

    
}
