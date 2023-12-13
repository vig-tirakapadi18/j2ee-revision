package com.demo1.firstApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
        @GetMapping(value = "/hello")
        public String hello() {
                return "Hello world!";
        }
}
