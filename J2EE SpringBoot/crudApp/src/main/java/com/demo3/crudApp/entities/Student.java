package com.demo3.crudApp.entities;

public class Student {
        int id;
        String name;
        String batch;

        public Student() {
                super();
        }

        public Student(int id, String name, String batch) {
                super();
                this.id = id;
                this.name = name;
                this.batch = batch;
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

        public String getBatch() {
                return batch;
        }

        public void setBatch(String batch) {
                this.batch = batch;
        }

        @Override
        public String toString() {
                return "Student [id=" + id + ", name=" + name + ", batch=" + batch + "]";
        }
}
