package com.jspiders.spring.mythirdproject.list;

import java.util.List;

public class Student {
	
	private int id;
	private String name;
	private String branch;
	private List<String> subjects;
	
	public Student(int id, String name, String branch, List<String> subjects) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", subjects=" + subjects + "]";
	}
}
