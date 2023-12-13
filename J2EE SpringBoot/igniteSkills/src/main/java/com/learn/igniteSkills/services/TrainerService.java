package com.learn.igniteSkills.services;

import java.util.List;

import com.learn.igniteSkills.entities.Course;
import com.learn.igniteSkills.entities.Lesson;

public interface TrainerService {
        String addCourse(Course course);

        List<Course> fetchAllCourses();

        String addLesson(Lesson lesson);

        String saveCourse(Course course);

        Course fetchCourseById(int courseId);
}
