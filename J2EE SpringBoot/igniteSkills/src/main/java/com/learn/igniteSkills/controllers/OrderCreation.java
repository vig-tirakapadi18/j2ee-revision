package com.learn.igniteSkills.controllers;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learn.igniteSkills.entities.Course;
import com.learn.igniteSkills.entities.User;
import com.learn.igniteSkills.services.StudentService;
import com.learn.igniteSkills.services.TrainerService;
import com.learn.igniteSkills.services.UserService;
import com.razorpay.*;

@Controller
public class OrderCreation {
        @Autowired
        UserService uService;
        @Autowired
        StudentService sService;
        @Autowired
        TrainerService tService;

        @PostMapping("/takeOrder")
        public String takeOrder(@RequestParam int amount, @RequestParam String email, @RequestParam int courseId) {
                mapUserAndCourse(email, courseId);

                Order order = null;

                try {
                        RazorpayClient razorpay = new RazorpayClient("rzp_test_njr8Ky4wj5qFF4",
                                        "mDPjONiHKqrVrjRAnwsmNoLj");
                        JSONObject orderRequest = new JSONObject();
                        orderRequest.put("amount", amount * 100);
                        orderRequest.put("currency", "INR");
                        orderRequest.put("receipt", "receipt#1");

                        order = razorpay.orders.create(orderRequest);
                } catch (RazorpayException e) {
                        System.out.println(e.getMessage());
                }

                return order.toString();
        }

        public void mapUserAndCourse(String email, int courseId) {
                User user = uService.findUserByEmail(email);
                Course course = sService.fetchCourse(courseId);

                user.getCourseList().add(course);
                course.getUserList().add(user);

                tService.saveCourse(course);
                uService.saveUser(user);
        }
}
