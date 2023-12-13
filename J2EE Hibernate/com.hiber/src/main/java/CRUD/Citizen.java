package CRUD;

import javax.persistence.*;

@Entity
public class Citizen {
        @Id
        int id;
        String name;
        int age;

        public Citizen() {
                super();
        }

        public Citizen(int id, String name, int age) {
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
                return "Citizen [id=" + id + ", name=" + name + ", age=" + age + "]";
        }
}
