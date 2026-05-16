package com.sinobridge.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


//做一个“订单服务”，它接收用户请求，然后调用远程“用户服务”查询用户信息。
/*
http://localhost:8080/orders/create?userId=100
浏览器/调用方
-> OrderController.createOrder(userId)
-> OrderService.createOrder(userId)
-> UserClient.getUserById(userId)
-> 远程调用 demo-user-service
-> 返回 UserDTO
-> 生成订单号
-> 返回字符串

 */
@SpringBootApplication //启动 Spring Boot，自动扫描 Bean。
@EnableFeignClients //开启 @FeignClient 扫描
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}