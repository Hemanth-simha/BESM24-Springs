package com.jspiders.spring.mysecondproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEntity {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/mysecondproject/config.xml");
		
		Entity entity = (Entity) context.getBean("entity");
		System.out.println(entity);
		
		if(context!=null) {
			context.close();
		}
	}

}
