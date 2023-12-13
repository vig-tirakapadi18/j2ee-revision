package com.learn.igniteSkills.services;

import com.learn.igniteSkills.entities.User;

public interface UserService {
        String addUser(User user);

        User findUserByEmail(String email);

        String saveUser(User user);
}
