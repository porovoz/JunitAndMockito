package com.bestapp.junitandmockito.services;

import com.bestapp.junitandmockito.DAO.UserDao;
import com.bestapp.junitandmockito.model.User;
import com.bestapp.junitandmockito.services.impl.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
//@MockitoSettings(strictness = Strictness.LENIENT)
class UserServiceTest {

    User ivan = new User("Ivan", 18);
    User alexey = new User("Alexey", 43);

    @Mock
    private UserDao userDaoMock;

    @InjectMocks
    private UserServiceImpl userServiceImpl;

    @Test
    @DisplayName("Check if user exists in the list")
    public void shouldCheckIfUserExist() {
        when(userDaoMock.checkUserExist(ivan)).thenReturn(true);
        Assertions.assertTrue(userServiceImpl.checkUserExist(ivan));
    }

    @Test
    @DisplayName("Check if user not exists in the list")
    public void shouldCheckIfUserNotExist() {
        when(userDaoMock.checkUserExist(alexey)).thenReturn(false);
        Assertions.assertFalse(userServiceImpl.checkUserExist(alexey));
    }
}