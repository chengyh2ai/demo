package com.sinobridge.demo.service;

import com.sinobridge.demo.client.UserClient;
import com.sinobridge.demo.config.IdGenerator;
import com.sinobridge.demo.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //@Service：把 OrderService 交给 Spring 管理，Spring 会自动创建 OrderService 的实例，并注入它依赖的 Bean。
public class OrderService {

    @Autowired //从 Spring 容器里拿 UserClient 
    private UserClient userClient;

    @Autowired //从 Spring 容器里拿 IdGenerator
    private IdGenerator idGenerator;

    public String createOrder(Long userId) {
        UserDTO user = userClient.getUserById(userId);
        String orderId = idGenerator.nextId();

        return "created " + orderId + " for user " + user.getName();
    }
}
