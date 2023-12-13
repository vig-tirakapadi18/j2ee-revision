package com.demo5.thymeDemo.controllers;

import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.demo5.thymeDemo.entities.User;

@Controller
@RequestMapping("/api")
public class UserController {
        @GetMapping("/user")
        public String student(Model model) {
                model.addAttribute("name", "VIG");

                User user1 = new User(101, "VIS", 21);
                User user2 = new User(102, "VIG", 23);
                User user3 = new User(103, "Nobita", 15);
                User user4 = new User(104, "Doraemon", 14);

                model.addAttribute("user1", user1);

                List<User> userList = new ArrayList<User>();
                userList.add(user1);
                userList.add(user2);
                userList.add(user3);
                userList.add(user4);

                model.addAttribute("userList", userList);

                return "student";
        }
}
