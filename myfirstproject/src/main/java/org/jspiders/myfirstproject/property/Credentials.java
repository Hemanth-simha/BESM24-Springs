package org.jspiders.myfirstproject.property;

import java.util.Properties;

public class Credentials {
	
	private int id;
	private Properties username;
	private Properties password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Properties getUsername() {
		return username;
	}
	public void setUsername(Properties username) {
		this.username = username;
	}
	public Properties getPassword() {
		return password;
	}
	public void setPassword(Properties password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Credentials [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
}
