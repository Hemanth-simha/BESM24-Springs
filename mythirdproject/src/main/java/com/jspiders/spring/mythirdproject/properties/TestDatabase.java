package com.jspiders.spring.mythirdproject.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDatabase {

	public static void main(String[] args) {
			
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/mythirdproject/properties/dbconfig.xml");
		
		DatabaseConfiguration db = (DatabaseConfiguration) context.getBean("dbconfig");
		
		System.out.println(db);
		
		if(context!=null) {
			context.close();
		}
		
		
	}

}
