package com.learn.igniteSkills.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learn.igniteSkills.entities.Course;
import com.learn.igniteSkills.entities.Lesson;
import com.learn.igniteSkills.entities.User;
import com.learn.igniteSkills.services.StudentService;
import com.learn.igniteSkills.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController {
        @Autowired
        StudentService sService;
        @Autowired
        UserService uService;

        @GetMapping("/purchaseCourse")
        public String purchaseCourse(Model model) {
                List<Course> courseList = sService.fetchAllCourses();
                model.addAttribute("courseList", courseList);
                return "purchaseCourse";
        }

        @GetMapping("/myCourses")
        public String myCourses(Model model, HttpSession session) {
                User loggedUser = (User) session.getAttribute("loggedInUser");
                String email = loggedUser.getEmail();
                User user = uService.findUserByEmail(email);

                List<Course> courseList = user.getCourseList();
                model.addAttribute("courseList", courseList);
                return "myCourses";
        }

        @GetMapping("/viewLesson")
        public String viewLesson(@RequestParam("lessonId") int lessonId, Model model, HttpSession session) {
                Lesson lesson = sService.getLesson(lessonId);
                String ytUrl = lesson.getLessonLink();

                String videoId = ytUrl.substring(ytUrl.indexOf("=") + 1);
                lesson.setLessonLink(videoId);

                model.addAttribute("lesson", lesson);
                return "myLesson";
        }
}
