package com.learn.igniteSkills.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.learn.igniteSkills.entities.Course;
import com.learn.igniteSkills.entities.Lesson;
import com.learn.igniteSkills.services.TrainerService;

@Controller
public class TrainerController {
        @Autowired
        TrainerService tService;

        @PostMapping("/addCourse")
        public String addCourse(@ModelAttribute Course course) {
                tService.addCourse(course);
                return "trainerHome";
        }

        @GetMapping("/viewCourses")
        public String viewCourses(Model model) {
                List<Course> courseList = tService.fetchAllCourses();
                model.addAttribute("courseList", courseList);
                return "viewCourses";
        }

        @PostMapping("/addLesson")
        public String addLesson(
                        @ModelAttribute Lesson lesson,
                        @RequestParam("courseId") int courseId) {
                tService.addLesson(lesson);
                Course course = tService.fetchCourseById(courseId);
                course.getLessonList().add(lesson);
                tService.saveCourse(course);
                return "trainerHome";
        }
}
