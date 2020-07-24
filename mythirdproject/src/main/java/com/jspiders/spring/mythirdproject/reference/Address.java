package com.jspiders.spring.mythirdproject.reference;

public class Address {
	
	private int pincode;
	private String city;
	private String street;
	public Address(int pincode, String city, String street) {
		super();
		this.pincode = pincode;
		this.city = city;
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", street=" + street + "]";
	}
}
