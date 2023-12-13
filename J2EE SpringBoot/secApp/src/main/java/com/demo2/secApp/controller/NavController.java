package com.demo2.secApp.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class NavController {
        @GetMapping(value = "/test")
        public String test() {
                return "test";
        }
}
