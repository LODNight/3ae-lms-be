package com.lms._ae.modules.account.service;

import com.lms._ae.modules.account.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserById(Integer id);
    User createUser(User user);
    User updateUser(Integer id, User user);
    String deleteUser(Integer id);

}
