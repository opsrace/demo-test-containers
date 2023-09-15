package com.opsrace.testcontainers.controllers;

import com.opsrace.testcontainers.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return service.save(user);
    }

    @GetMapping("/create")
    public User createUser2(@RequestParam("name") String name) {

        log.info("User creation request received...");

        return service.create(name);

    }

}