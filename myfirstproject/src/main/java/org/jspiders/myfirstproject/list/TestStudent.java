package org.jspiders.myfirstproject.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("org/jspiders/myfirstproject/list/listconfig.xml");
		
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		System.out.println(student.getSubjects().getClass());
		if(context!=null) {
			context.close();
		}
	}

}
