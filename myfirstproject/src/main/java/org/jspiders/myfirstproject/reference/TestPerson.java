package org.jspiders.myfirstproject.reference;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("org/jspiders/myfirstproject/reference/referenceconfig.xml");
		
		Person person = (Person) context.getBean("person");
		System.out.println(person);
		
		if(context!=null) {
			context.close();
		}
		
	}

}
