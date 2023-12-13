package com.learn.igniteSkills.entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Course {
        @Id
        int courseId;
        String courseName;
        int coursePrice;

        @OneToMany
        List<Lesson> lessonList;

        @ManyToMany
        List<User> userList;

        public Course() {
                super();
        }

        public Course(int courseId, String courseName, int coursePrice, List<Lesson> lessonList, List<User> userList) {
                super();
                this.courseId = courseId;
                this.courseName = courseName;
                this.coursePrice = coursePrice;
                this.lessonList = lessonList;
                this.userList = userList;
        }

        public int getCourseId() {
                return courseId;
        }

        public void setCourseId(int courseId) {
                this.courseId = courseId;
        }

        public String getCourseName() {
                return courseName;
        }

        public void setCourseName(String courseName) {
                this.courseName = courseName;
        }

        public int getCoursePrice() {
                return coursePrice;
        }

        public void setCoursePrice(int coursePrice) {
                this.coursePrice = coursePrice;
        }

        public List<Lesson> getLessonList() {
                return lessonList;
        }

        public void setLessonList(List<Lesson> lessonList) {
                this.lessonList = lessonList;
        }

        public List<User> getUserList() {
                return userList;
        }

        public void setUserList(List<User> userList) {
                this.userList = userList;
        }

        @Override
        public String toString() {
                return "Course [courseId=" + courseId + ", courseName=" + courseName + ", coursePrice=" + coursePrice
                                + ", lessonList=" + (lessonList == null ? "null" : lessonList.size()) + ", userList="
                                + (userList == null ? "null" : userList.size()) + "]";
        }
}
