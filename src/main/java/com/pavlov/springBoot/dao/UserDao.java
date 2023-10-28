package com.pavlov.springBoot.dao;

import com.pavlov.springBoot.model.User;

import java.util.List;
public interface UserDao {
    List<User> index();
    User show(Integer id);
    void save(User user);
    void update(User updateUser);
    void deleteById(Integer id);
}