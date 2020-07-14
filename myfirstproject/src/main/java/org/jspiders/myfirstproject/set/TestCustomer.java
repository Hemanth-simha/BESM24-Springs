package org.jspiders.myfirstproject.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("org/jspiders/myfirstproject/set/setconfig.xml");
		
		Customer customer= (Customer) context.getBean("customer");
		System.out.println(customer);
		System.out.println(customer.getProducts().getClass());
		if(context!=null) {
			context.close();
		}
	}

}
