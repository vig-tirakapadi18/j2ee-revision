package com.demo5.thymeDemo.entities;

import jakarta.persistence.*;

@Entity
public class User {
        @Id
        int id;
        String name;
        int age;

        public User() {
                super();
        }

        public User(int id, String name, int age) {
                super();
                this.id = id;
                this.name = name;
                this.age = age;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
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
                return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
        }
}
