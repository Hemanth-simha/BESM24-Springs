package com.jspiders.spring.autowiring.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProduct {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/autowiring/collections/config.xml");
		
		Product product = (Product) context.getBean("product");
		System.out.println(product);
		System.out.println(product.getName().getClass());
		if(context!=null) {
			context.close();
		}
		
	}

}
