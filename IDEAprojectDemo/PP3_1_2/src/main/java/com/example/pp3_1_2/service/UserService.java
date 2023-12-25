package com.example.pp3_1_2.service;



import com.example.pp3_1_2.model.User;

import java.util.List;

public interface UserService {
    User getUser(int count);

    Object deleteUser(User user);

    Object updateUser(User user);

    Object saveUser(User user);

    List<User> getAllUsers();

}
