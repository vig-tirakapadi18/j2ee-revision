package com.demo2.secApp.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {
        @GetMapping(value = "/test1")
        public String test1() {
                return "test1";
        }

        @GetMapping(value = "/test2")
        public String test2() {
                return "test2";
        }

        @GetMapping("/login")
        public String login() {
                return "login";
        }

        @GetMapping("/register")
        public String register() {
                return "register";
        }
}
