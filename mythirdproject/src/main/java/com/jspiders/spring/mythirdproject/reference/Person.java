package com.jspiders.spring.mythirdproject.reference;

public class Person {

	private int id;
	private String name;
	private Address address;
	public Person(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
