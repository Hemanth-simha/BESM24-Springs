package com.jspiders.spring.mythirdproject.reference;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/mythirdproject/reference/referenceconfig.xml");
		
		Person person =  (Person) context.getBean("person");
		
		System.out.println(person);
		
		if(context!=null) {
			context.close();
		}
		
	}

}
