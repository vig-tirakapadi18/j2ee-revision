package com.demo3.crudApp.controller;

import org.springframework.web.bind.annotation.*;

import com.demo3.crudApp.entities.Student;

@RestController
@RequestMapping("/crud")
public class CrudController {
        @PostMapping("/create")
        public String create(@RequestBody Student st) {
                System.out.println(st);
                return "Create!";
        }

        @GetMapping("/read/{kodId}")
        public Student read(@PathVariable int kodId) {
                Student st1 = new Student(101, "VIG", "FEB");
                Student st2 = new Student(102, "VIS", "JUN");
                if (kodId == 101)
                        return st1;
                else if (kodId == 102)
                        return st2;

                return null;
        }

        @PutMapping("/update")
        public String update() {
                return "Update!";
        }

        @DeleteMapping("/delete")
        public String delete() {
                return "Delete!";
        }
}
