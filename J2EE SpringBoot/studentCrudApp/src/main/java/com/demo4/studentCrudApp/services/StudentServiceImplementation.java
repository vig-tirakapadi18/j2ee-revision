package com.demo4.studentCrudApp.services;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.demo4.studentCrudApp.entities.Student;
import com.demo4.studentCrudApp.repositories.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService {
        @Autowired
        StudentRepository sRepo;

        public String addStudent(Student st) {
                sRepo.save(st);
                return "Student created successfully!";
        }

        public Student fetchStudent(int kodId) {
                return sRepo.findByKodId(kodId);
        }

        public String updateStudent(Student st) {
                sRepo.save(st);
                return "Student updated successfully!";
        }

        public String deleteStudent(int kodId) {
                sRepo.deleteById(kodId);
                return "Student deleted successfully!";
        }
}
