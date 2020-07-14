package org.jspiders.myfirstproject.set;

import java.util.Set;

public class Customer {
	
	private int id;
	private String name;
	private double price;
	private Set<String> products;
	
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Set<String> getProducts() {
		return products;
	}
	public void setProducts(Set<String> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", price=" + price + ", products=" + products + "]";
	}
	
}
