package com.jspiders.spring.mythirdproject;

public class Person {
	
	private int id;
	private String name;
	private int age;
	private long contact;
	
	public Person(int id, String name, int age, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", contact=" + contact + "]";
	}
	
}
