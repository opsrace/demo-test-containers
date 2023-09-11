package com.opsrace.testcontainers.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class WelcomeController {

    @GetMapping
    public String hello() {
        return "hello world" + new Date();
    }
}
