package com.jspiders.spring.mythirdproject.entity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRun {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/mythirdproject/entity/config.xml");
		
		Run run1 = (Run) context.getBean("run");
		
	    Run	run2 = (Run) context.getBean("run");
		
		System.out.println("Address : run1 : "+run1.hashCode());
		System.out.println("Address : run2 : "+run2.hashCode());
		
		if(context!=null) {
			context.close();
		}
		
	}

}
