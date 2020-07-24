package com.jspiders.spring.mythirdproject.dependency;

import org.springframework.beans.factory.annotation.Required;

public class Person {
	
	private int id;
	private String name;
	private Address address;
	
	public int getId() {
		return id;
	}
	
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
