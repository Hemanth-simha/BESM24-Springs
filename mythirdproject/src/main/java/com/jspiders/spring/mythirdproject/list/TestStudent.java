package com.jspiders.spring.mythirdproject.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/mythirdproject/list/listconfig.xml");
		
		Student student =  (Student) context.getBean("student");
		
		System.out.println(student);
		
		if(context!=null) {
			context.close();
		}
		
	}

}
