package com.demo6.userCrudApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo6.userCrudApp.entities.User;

public interface UserRepository extends JpaRepository<User, String> {
        User findByKodId(String kodId);
}
