package com.jspiders.spring.autowiring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/autowiring/annotation/config.xml");
		
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		
		if(context!=null) {
			context.close();
		}
	}

}
