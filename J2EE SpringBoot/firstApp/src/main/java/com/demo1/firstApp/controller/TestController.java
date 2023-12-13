package com.demo1.firstApp.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {
        @GetMapping(value = "/test")
        public String test() {
                return "test";
        }
}
