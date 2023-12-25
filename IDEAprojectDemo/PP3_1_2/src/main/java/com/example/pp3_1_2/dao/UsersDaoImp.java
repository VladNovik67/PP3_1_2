package com.example.pp3_1_2.dao;

import com.example.pp3_1_2.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsersDaoImp implements UsersDao {


    @PersistenceContext
    private EntityManager entityManager;


    public List<User> getAllUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }


    public User saveUser(User user) {
        entityManager.persist(user);
        entityManager.flush();
        return user;
    }


    public User updateUser(User user) {
        entityManager.merge(user);
        entityManager.flush();
        return user;
    }


    public User deleteUser(User user) {
        if (entityManager.contains(user)) {
            entityManager.remove(user);
        } else {
            entityManager.remove(entityManager.merge(user));
        }
        return user;
    }


    public User getUser(int count) {
        User response = (User) entityManager.find(User.class, (long) count);
        return response;
    }


}
