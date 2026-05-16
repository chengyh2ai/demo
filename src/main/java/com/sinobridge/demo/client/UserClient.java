package com.sinobridge.demo.client;

import com.sinobridge.demo.model.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "${remote.user-service.name}",
        url = "${remote.user-service.url}",
        path = "${remote.user-service.path}"
)
public interface UserClient {

    @GetMapping("/users/get")
    UserDTO getUserById(@RequestParam("id") Long id);
}
