package com.jdbc.insertObjects;

public class StudentApp {
	public static void main(String[] args) {
		Student st1 = new Student(101, "Vig", "AE");
		Student st2 = new Student(102, "Vis", "EC");
		
		StudentDBApp.insertObj(st1);
		StudentDBApp.insertObj(st2);
	}
}
