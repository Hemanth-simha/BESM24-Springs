package com.jspiders.spring.stereotype.interfacedepenency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProduct {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/stereotype/interfacedepenency/config.xml");
		
		ProductServiceImpl productServiceImpl = (ProductServiceImpl) context.getBean("productServiceImpl");
		productServiceImpl.displayProducts();

		if(context!=null) {
			context.close();
		}
		
		
	}

}
