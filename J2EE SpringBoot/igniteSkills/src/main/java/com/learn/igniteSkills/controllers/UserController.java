package com.learn.igniteSkills.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.learn.igniteSkills.entities.User;
import com.learn.igniteSkills.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
        @Autowired
        UserService uService;

        @PostMapping("/register")
        public String login(@ModelAttribute User user, @RequestParam("email") String email) {
                User userObj = uService.findUserByEmail(email);

                if (userObj == null) {
                        uService.addUser(user);
                        return "login";
                }

                if (userObj.getEmail().equals(user.getEmail())) {
                        return "register";
                }

                return "register";
        }

        @PostMapping("/login")
        public String register(@RequestParam("email") String email, @RequestParam("password") String password,
                        HttpSession session) {
                User user = uService.findUserByEmail(email);

                if (user == null || user == null) {
                        return "login";
                }

                if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                        session.setAttribute("loggedInUser", user);

                        if (user.getRole().equals("student")) {
                                return "studentHome";
                        } else {
                                return "trainerHome";
                        }
                }

                return "login";
        }
}
