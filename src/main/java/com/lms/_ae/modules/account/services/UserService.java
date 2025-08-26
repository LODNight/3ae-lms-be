package com.lms._ae.modules.account.services;

import com.lms._ae.modules.account.entities.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserById(Integer id);
    User createUser(User user);
    User updateUser(Integer id, User user);
    String deleteUser(Integer id);

}
