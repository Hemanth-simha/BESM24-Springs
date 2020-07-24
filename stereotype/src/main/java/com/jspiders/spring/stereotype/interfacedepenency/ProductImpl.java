package com.jspiders.spring.stereotype.interfacedepenency;

import org.springframework.stereotype.Component;

@Component
public class ProductImpl implements Product {
	
	@Override
	public int getProducts() {
		System.out.println("Retreving all products from database");
		return 50;
	}

}
