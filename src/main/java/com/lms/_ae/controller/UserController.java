package com.lms._ae.controller;

import com.lms._ae.models.User;
import com.lms._ae.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {


    @Autowired
    private UserRepo userRepo;

    // POST: Create a new user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepo.save(user);
    }
}
