package com.learn.igniteSkills.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.igniteSkills.entities.User;
import com.learn.igniteSkills.repositories.UserRepository;

@Service
public class UserServiceImplementation implements UserService {
        @Autowired
        UserRepository uRepo;

        public String addUser(User user) {
                uRepo.save(user);
                return "User added successfully!";
        }

        public User findUserByEmail(String email) {
                return uRepo.findByEmail(email);
        }

        public String saveUser(User user) {
                uRepo.save(user);
                return "User saved successfully!";
        }
}
