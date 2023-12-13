package com.jdbc.insertObjects;

public class Student {
	int id;
	String name;
	String branch;
	
	public Student(int id, String name, String branch) {
		this.id = id;
		this.name = name;
		this.branch = branch;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBranch() {
		return branch;
	}
}
