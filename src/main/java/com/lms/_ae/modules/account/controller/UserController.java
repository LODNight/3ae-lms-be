package com.lms._ae.modules.account.controller;

import com.lms._ae.modules.account.entity.User;
import com.lms._ae.modules.account.repository.UserRepo;
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
