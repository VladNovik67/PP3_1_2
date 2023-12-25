package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    User getUser(int count);

    Object deleteUser(User user);

    Object updateUser(User user);

    Object saveUser(User user);

    List<User> getAllUsers();

}
