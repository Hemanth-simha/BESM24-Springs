package com.jspiders.spring.autowiring.collections;

import java.util.List;

public class Product {
	
	private int id;
	private List<String> name;
	private double totalCost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", totalCost=" + totalCost + "]";
	}
}
