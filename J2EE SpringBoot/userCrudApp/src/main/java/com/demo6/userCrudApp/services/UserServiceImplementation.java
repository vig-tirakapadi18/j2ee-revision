package com.demo6.userCrudApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.demo6.userCrudApp.entities.User;
import com.demo6.userCrudApp.repositories.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

        @Autowired
        UserRepository uRepo;

        public String addUser(User user) {
                uRepo.save(user);
                return "User created successfully!";
        }

        public User fetchUser(String kodId) {
                return uRepo.findByKodId(kodId);
        }

        public String updateUser(User user) {
                uRepo.save(user);
                return "User updated successfully!";
        }

        public String deleteUser(String kodId) {
                uRepo.deleteById(kodId);
                return "User deleted successfully!";
        }

        public List<User> fetchAllUsers() {
                return uRepo.findAll();
        }

}
