package com.jspiders.spring.autowiring;

public class Person {
	
	private int id;
	private String name;
	private long contact;
	private Address address;
	
	public Person(int id, String name, long contact, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
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
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + "]";
	}
	
}
