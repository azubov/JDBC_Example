package org.example.dao;

import org.example.entity.User;

import java.util.List;

public interface UserDao {

    void save(User user);
    User getById(int id);
    void update(User user);
    void delete(int id);


    List<User> findAll();
    List<User> findByName(String name);

}
