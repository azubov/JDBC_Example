package org.example.service;

import org.example.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    List<User> findByName(String name);

    void save(User user);
    User getById(int id);
    void update(User user);
    void delete(int id);
}
