package com.jspiders.spring.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personDetails")
public class Person {
	
	@Value("101")
	private int id;
	
	@Value("King")
	private String name;
	
	@Value("Developer")
	private String job;
	
	@Value("#{contact_list}")
	private List<Long> contact;
	
	@Autowired
	private Address address;
	
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public List<Long> getContact() {
		return contact;
	}
	public void setContact(List<Long> contact) {
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
		return "Person [id=" + id + ", name=" + name + ", job=" + job + ", contact=" + contact + ", address=" + address
				+ "]";
	}
}
