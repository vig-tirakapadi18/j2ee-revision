package com.demo4.studentCrudApp.services;

import com.demo4.studentCrudApp.entities.Student;

public interface StudentService {
        String addStudent(Student st);

        Student fetchStudent(int kodId);

        String updateStudent(Student st);

        String deleteStudent(int kodId);
}
