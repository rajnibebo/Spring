package com.rajni.prospring.conf.pe;

public class Name {
	private String firstName;
	private String lastName;
	
	public Name(String firstName,String lastName) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Name() {
		// TODO Auto-generated constructor stub
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String toString() {
		return "FirstName:"+firstName+",lastName:"+lastName;
	}
}
