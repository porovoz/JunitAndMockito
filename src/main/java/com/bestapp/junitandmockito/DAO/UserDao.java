package com.bestapp.junitandmockito.DAO;

import com.bestapp.junitandmockito.model.User;

import java.util.List;

public interface UserDao {
    User getUserByName(String userName);

    List<User> findAllUsers();

    boolean checkUserExist(User user);
}
