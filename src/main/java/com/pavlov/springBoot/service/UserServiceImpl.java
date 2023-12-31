package com.pavlov.springBoot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pavlov.springBoot.dao.UserDao;
import com.pavlov.springBoot.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public List<User> index() {
        return userDao.index();
    }

    @Transactional
    @Override
    public User show(int id) {
        return userDao.show(id);
    }

    @Transactional
    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Transactional
    @Override
    public void update(User updatedUser) {
        userDao.update(updatedUser);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        userDao.deleteById(id);
    }
}