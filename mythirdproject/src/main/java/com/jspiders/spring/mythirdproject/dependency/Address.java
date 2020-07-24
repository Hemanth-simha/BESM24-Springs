package com.jspiders.spring.mythirdproject.dependency;

public class Address {
	
	private int pincode;
	private String city;
	private String street;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", street=" + street + "]";
	}
	
}
