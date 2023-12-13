package com.learn.igniteSkills.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.igniteSkills.entities.Course;
import com.learn.igniteSkills.entities.Lesson;
import com.learn.igniteSkills.repositories.CourseRepository;
import com.learn.igniteSkills.repositories.LessonRepository;

@Service
public class StudentServiceImplementation implements StudentService {
        @Autowired
        CourseRepository cRepo;
        @Autowired
        LessonRepository lRepo;

        public List<Course> fetchAllCourses() {
                return cRepo.findAll();
        }

        public Course fetchCourse(int courseId) {
                return cRepo.findByCourseId(courseId);
        }

        public Lesson getLesson(int lessonId) {
                return lRepo.findByLessonId(lessonId);
        }

}
