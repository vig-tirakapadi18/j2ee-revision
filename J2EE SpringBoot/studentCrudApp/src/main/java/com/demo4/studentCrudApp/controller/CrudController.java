package com.demo4.studentCrudApp.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.demo4.studentCrudApp.entities.Student;
import com.demo4.studentCrudApp.services.StudentService;

@RestController
@RequestMapping("/crud")
public class CrudController {
        @Autowired
        StudentService sService;

        @PostMapping("/addStudent")
        public String addStudent(@RequestBody Student st) {
                return sService.addStudent(st);
        }

        @GetMapping("/fetchStudent/{kodId}")
        public Student fetchStudent(@PathVariable int kodId) {
                return sService.fetchStudent(kodId);
        }

        @PutMapping("/updateStudent")
        public String updateStudent(@RequestBody Student st) {
                return sService.updateStudent(st);
        }

        @DeleteMapping("/deleteStudent/{kodId}")
        public String deleteStudent(@PathVariable int kodId) {
                return sService.deleteStudent(kodId);
        }
}
