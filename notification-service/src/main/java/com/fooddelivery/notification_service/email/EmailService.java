package com.fooddelivery.notification_service.email;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public void sendEmail(String to, String message) {

        // Simulated email sending
        System.out.println("Email sent to: " + to);
        System.out.println("Message: " + message);
    }

    
}
