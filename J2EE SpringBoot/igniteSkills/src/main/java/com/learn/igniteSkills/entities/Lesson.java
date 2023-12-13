package com.learn.igniteSkills.entities;

import jakarta.persistence.*;

@Entity
public class Lesson {
        @Id
        int lessonId;
        String lessonTopics;
        String lessonName;
        String lessonLink;

        @ManyToOne
        Course course;

        public Lesson() {
                super();
        }

        public Lesson(int lessonId, String lessonTopics, String lessonName, String lessonLink, Course course) {
                super();
                this.lessonId = lessonId;
                this.lessonTopics = lessonTopics;
                this.lessonName = lessonName;
                this.lessonLink = lessonLink;
                this.course = course;
        }

        public int getLessonId() {
                return lessonId;
        }

        public void setLessonId(int lessonId) {
                this.lessonId = lessonId;
        }

        public String getLessonTopics() {
                return lessonTopics;
        }

        public void setLessonTopics(String lessonTopics) {
                this.lessonTopics = lessonTopics;
        }

        public String getLessonName() {
                return lessonName;
        }

        public void setLessonName(String lessonName) {
                this.lessonName = lessonName;
        }

        public String getLessonLink() {
                return lessonLink;
        }

        public void setLessonLink(String lessonLink) {
                this.lessonLink = lessonLink;
        }

        public Course getCourse() {
                return course;
        }

        public void setCourse(Course course) {
                this.course = course;
        }

        @Override
        public String toString() {
                return "Lesson [lessonId=" + lessonId + ", lessonTopics=" + lessonTopics + ", lessonName=" + lessonName
                                + ", lessonLink=" + lessonLink + ", course=" + course + "]";
        }
}
