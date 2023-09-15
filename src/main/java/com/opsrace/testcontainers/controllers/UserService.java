package com.opsrace.testcontainers.controllers;

import com.opsrace.testcontainers.User;
import com.opsrace.testcontainers.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User create(String name) {
        log.info("Ready to create user: {}", name);
        User u = new User();
        u.setFirstName(name);
        u.setLastName("Last-" + name);
        u.setEmail(name + "@yahoo.com");

        User user = userRepository.save(u);

        log.info("User Creation process is complete");
        return user;
    }

    public User save(User user) {
        log.info("Saving **************");
        return userRepository.save(user);
    }
}
