package com.sinobridge.demo.controller;

import com.sinobridge.demo.model.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockUserController {

    @GetMapping("/api/users/get")
    public UserDTO getUserById(@RequestParam("id") Long id) {
        UserDTO user = new UserDTO();
        user.setId(id);
        user.setName("user-" + id);
        return user;
    }
}
