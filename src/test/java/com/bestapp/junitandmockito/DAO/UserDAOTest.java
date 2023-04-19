package com.bestapp.junitandmockito.DAO;

import com.bestapp.junitandmockito.DAO.impl.UserDaoImpl;
import com.bestapp.junitandmockito.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserDAOTest {
    private final UserDaoImpl userDaoImpl = new UserDaoImpl();

    @Test
    @DisplayName("Return user by name")
    public void shouldReturnUserByName() {
        Assertions.assertEquals(new User("Ekaterina", 24), userDaoImpl.getUserByName("Ekaterina"),
                "Username must exists in the list");
    }

    @Test
    @DisplayName("Return not null if user name exist in the list")
    public void shouldReturnNotNullWhenUserNameExist() {
        Assertions.assertNotNull(userDaoImpl.getUserByName("Sergey"),
                "User name must exists in the list");
    }
}