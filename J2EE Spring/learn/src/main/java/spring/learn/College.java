package spring.learn;

import java.util.*;

public class College {
        List<String> students;
        Set<String> subjects;
        Map<String, String> trainers;

        public College() {
                super();
        }

        public College(List<String> students, Set<String> subjects, Map<String, String> trainers) {
                super();
                this.students = students;
                this.subjects = subjects;
                this.trainers = trainers;
        }

        public List<String> getStudents() {
                return students;
        }

        public void setStudents(List<String> students) {
                this.students = students;
        }

        public Set<String> getSubjects() {
                return subjects;
        }

        public void setSubjects(Set<String> subjects) {
                this.subjects = subjects;
        }

        public Map<String, String> getTrainers() {
                return trainers;
        }

        public void setTrainers(Map<String, String> trainers) {
                this.trainers = trainers;
        }

        @Override
        public String toString() {
                return "College [students=" + students + ", subjects=" + subjects + ", trainers=" + trainers + "]";
        }
}
