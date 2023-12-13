package com.demo4.studentCrudApp.repositories;

import org.springframework.data.jpa.repository.*;
import com.demo4.studentCrudApp.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
        Student findByKodId(int kodId);
}
