package com.example.pp3_1_2.dao;



import com.example.pp3_1_2.model.User;

import java.util.List;

public interface UsersDao {

    List<User> getAllUsers();

    User saveUser(User user);

    User updateUser(User user);

    User deleteUser(User user);

    User getUser(int count);


}
