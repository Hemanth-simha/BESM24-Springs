package org.jspiders.myfirstproject.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCountry {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("org/jspiders/myfirstproject/map/mapconfig.xml");
		
		Country country = (Country) context.getBean("country");
		System.out.println(country);
		System.out.println(country.getStates().getClass());
		if(context!=null) {
			context.close();
		}
	}

}
