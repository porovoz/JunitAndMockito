package com.bestapp.junitandmockito.DAO.impl;

import com.bestapp.junitandmockito.DAO.UserDao;
import com.bestapp.junitandmockito.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDaoImpl implements UserDao {
    private final List<User> userList;

    public UserDaoImpl() {
        this.userList = List.of(new User("Sergey", 31), new User("Ivan", 18),
                new User("Ekaterina", 24), new User("Elena", 35),
                new User("Elizaveta", 27));
    }

    @Override
    public User getUserByName(String userName) {
        return userList.stream()
                .filter(user -> userName.equals(user.getName()))
                .findAny()
                .orElse(null);
    }

    @Override
    public List<User> findAllUsers() {
        return userList;
    }

    @Override
    public boolean checkUserExist(User user) {
        return userList.contains(user);
    }
}
