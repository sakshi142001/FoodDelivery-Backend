package com.fooddelivery.api_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRoutes(RouteLocatorBuilder builder) {

        return builder.routes()

                // USER SERVICE
                .route("user-service", r -> r
                        .path("/users/**")
                        .uri("lb://USER-SERVICE"))

                // ORDER SERVICE
                .route("order-service", r -> r
                        .path("/orders/**")
                        .uri("lb://ORDER-SERVICE"))
                        // RESTAURANT SERVICE
                .route("restaurant-service", r -> r
                        .path("/restaurants/**")
                        .uri("lb://RESTAURANT-SERVICE"))

                // DELIVERY SERVICE
                .route("delivery-service", r -> r
                        .path("/delivery/**")
                        .uri("lb://DELIVERY-SERVICE"))

                // NOTIFICATION SERVICE
                .route("notification-service", r -> r
                        .path("/notifications/**")
                        .uri("lb://NOTIFICATION-SERVICE"))
                        .build();
    }
}
