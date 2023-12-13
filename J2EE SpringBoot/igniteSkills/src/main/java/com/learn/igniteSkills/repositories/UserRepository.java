package com.learn.igniteSkills.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.igniteSkills.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
        User findByEmail(String email);
}
