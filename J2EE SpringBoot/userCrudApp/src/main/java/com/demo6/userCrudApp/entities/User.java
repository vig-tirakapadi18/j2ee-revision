package com.demo6.userCrudApp.entities;

import jakarta.persistence.*;

@Entity
public class User {
        @Id
        String kodId;
        String name;
        int age;

        public User() {
                super();
        }

        public User(String kodId, String name, int age) {
                super();
                this.kodId = kodId;
                this.name = name;
                this.age = age;
        }

        public String getKodId() {
                return kodId;
        }

        public void setKodId(String kodId) {
                this.kodId = kodId;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        @Override
        public String toString() {
                return "User [kodId=" + kodId + ", name=" + name + ", age=" + age + "]";
        }
}
