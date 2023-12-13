package com.learn.igniteSkills.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.igniteSkills.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {
        Lesson findByLessonId(int lessonId);
}
