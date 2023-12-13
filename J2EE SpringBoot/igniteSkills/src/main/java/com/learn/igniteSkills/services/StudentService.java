package com.learn.igniteSkills.services;

import java.util.List;

import com.learn.igniteSkills.entities.Course;
import com.learn.igniteSkills.entities.Lesson;

public interface StudentService {
        List<Course> fetchAllCourses();

        Course fetchCourse(int courseId);

        Lesson getLesson(int lessonId);
}
