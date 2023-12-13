package com.demo2.secApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetController {
        @GetMapping(value = "/greet-me")
        public String greetMe() {
                return "Good Morning!";
        }
}