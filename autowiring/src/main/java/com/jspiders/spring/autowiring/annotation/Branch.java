package com.jspiders.spring.autowiring.annotation;

public class Branch {

	private int id;
	private String name;
	private int sections;
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
	public int getSections() {
		return sections;
	}
	public void setSections(int sections) {
		this.sections = sections;
	}
	
	@Override
	public String toString() {
		return "Branch [id=" + id + ", name=" + name + ", sections=" + sections + "]";
	}
}
