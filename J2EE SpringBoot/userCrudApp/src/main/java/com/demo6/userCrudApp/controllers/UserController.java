package com.demo6.userCrudApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.demo6.userCrudApp.entities.User;
import com.demo6.userCrudApp.services.UserService;

@Controller
@RequestMapping("/crud")
public class UserController {
        @Autowired
        UserService uService;

        @PostMapping("/create")
        // public String create(
        // @RequestParam("kodId") String kodId,
        // @RequestParam("name") String name,
        // @RequestParam("age") int age) { }
        public String create(@ModelAttribute User user) {

                uService.addUser(user);
                return "index";
        }

        @GetMapping("/read")
        public String read(@RequestParam("kodId") String kodId, Model model) {
                User user = uService.fetchUser(kodId);
                model.addAttribute("user", user);
                return "showUser";
        }

        @PutMapping("/update")
        // public String update(
        // @RequestParam("kodId") String kodId,
        // @RequestParam("name") String name,
        // @RequestParam("age") int age) { }
        public String update(@ModelAttribute User user, Model model) {
                uService.updateUser(user);
                model.addAttribute("user", user);
                return "showUser";
        }

        @DeleteMapping("/delete")
        public String delete(@RequestParam("kodId") String kodId) {
                uService.deleteUser(kodId);
                return "index";
        }

        @GetMapping("/read-all")
        public String readAll(Model model) {
                List<User> userList = uService.fetchAllUsers();
                model.addAttribute("userList", userList);
                return "showAllUsers";
        }
}
