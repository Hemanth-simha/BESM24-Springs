package com.jspiders.spring.mythirdproject.properties;

public class DatabaseConfiguration {
	
	private String databaseName;
	private int portNumber;
	private String username;
	private String password;
	
	public String getDatabaseName() {
		return databaseName;
	}
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	public int getPortNumber() {
		return portNumber;
	}
	public void setPortNumber(int portNumber) {
		this.portNumber = portNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "DatabaseConfiguration [databaseName=" + databaseName + ", portNumber=" + portNumber + ", username="
				+ username + ", password=" + password + "]";
	}
}
