package com.demo6.userCrudApp.services;

import java.util.List;

import com.demo6.userCrudApp.entities.User;

public interface UserService {
        String addUser(User user);

        User fetchUser(String kodId);

        String updateUser(User user);

        String deleteUser(String kodId);

        List<User> fetchAllUsers();
}
