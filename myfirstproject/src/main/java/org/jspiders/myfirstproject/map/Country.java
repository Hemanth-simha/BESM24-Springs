package org.jspiders.myfirstproject.map;

import java.util.Map;

public class Country {
	
	private String name;
	private Map<String,String> states;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getStates() {
		return states;
	}
	public void setStates(Map<String, String> states) {
		this.states = states;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", states=" + states + "]";
	}
	
}
