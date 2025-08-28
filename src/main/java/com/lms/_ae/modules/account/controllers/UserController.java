package com.lms._ae.modules.account.controllers;

import com.lms._ae.modules.account.dtos.UserDto;
import com.lms._ae.modules.account.entities.User;
import com.lms._ae.modules.account.mappers.UserMapper;
import com.lms._ae.modules.account.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor // Lombok tự sinh contructor
@RequestMapping("/api/users")
public class UserController {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @GetMapping
    public Iterable<UserDto> getAllUser(){
        return userRepository.findAll()
                .stream()
                .map(userMapper::toDto)
                .toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable Integer id){
        var user =  userRepository.findById(id).orElse(null);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userMapper.toDto(user));
    }

    // POST: Create a new user
    @PostMapping
    public User createUser(@RequestBody User user) {

        return userRepository.save(user);
    }
}
