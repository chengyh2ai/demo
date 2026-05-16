package com.sinobridge.demo.controller;

import com.sinobridge.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Value("${app.welcome-message}")
    private String welcomeMessage;

    @GetMapping("/orders/create") //http://localhost:8080/orders/create?userId=100
    public String createOrder(@RequestParam("userId") Long userId) {
        String result = orderService.createOrder(userId);
        return welcomeMessage + ", " + result;
    }
}
