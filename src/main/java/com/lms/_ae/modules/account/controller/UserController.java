package com.lms._ae.modules.account.controller;

import com.lms._ae.modules.account.entity.User;
import com.lms._ae.modules.account.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor // Lombok tự sinh contructor
@RequestMapping("/api/user")
public class UserController {
    private final UserRepository userRepository;

    @GetMapping("/users")
    public Iterable<User> getAllUser(){
        return userRepository.findAll();
    }

    // POST: Create a new user
    @PostMapping
    public User createUser(@RequestBody User user) {

        return userRepository.save(user);
    }
}
