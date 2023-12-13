package com.learn.igniteSkills.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.igniteSkills.entities.Course;
import com.learn.igniteSkills.entities.Lesson;
import com.learn.igniteSkills.repositories.CourseRepository;
import com.learn.igniteSkills.repositories.LessonRepository;

@Service
public class TrainerServiceImplementation implements TrainerService {
        @Autowired
        CourseRepository cRepo;

        @Autowired
        LessonRepository lRepo;

        public String addCourse(Course course) {
                cRepo.save(course);
                return "Course added successfully!";
        }

        public List<Course> fetchAllCourses() {
                return cRepo.findAll();
        }

        public String addLesson(Lesson lesson) {
                lRepo.save(lesson);
                return "Lesson added successfully!";
        }

        public String saveCourse(Course course) {
                cRepo.save(course);
                return "Course saved successfully!";
        }

        public Course fetchCourseById(int courseId) {
                return cRepo.findByCourseId(courseId);
        }

}
