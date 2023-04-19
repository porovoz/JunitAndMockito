package com.bestapp.junitandmockito.services.impl;

import com.bestapp.junitandmockito.DAO.UserDao;
import com.bestapp.junitandmockito.model.User;
import com.bestapp.junitandmockito.services.UserService;

public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(User user) {
        return userDao.checkUserExist(user);
    }
}
