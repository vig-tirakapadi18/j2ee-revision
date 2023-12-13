package com.demo6.userCrudApp.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
        @GetMapping("/addUser")
        public String addUser() {
                return "addUser";
        }

        @GetMapping("/fetchUser")
        public String fetchUser() {
                return "fetchUser";
        }

        @GetMapping("/updateUser")
        public String updateUser() {
                return "updateUser";
        }

        @GetMapping("/deleteUser")
        public String deleteUser() {
                return "deleteUser";
        }

        @GetMapping("/showAllUsers")
        public String showAllUsers() {
                return "showAllUsers";
        }
}
