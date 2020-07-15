package com.jspiders.spring.mysecondproject;

public class Entity {
	
	private int id;
	private String name;
	
	public void hii()
	{
		System.out.println("Initialising");
	}
	public void bye()
	{
		System.out.println("Destroying");
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
	@Override
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + "]";
	}
}
