/**
 * 
 */
package com.rajni.spring.ioc.di2;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author rajni.ubhi
 *
 */
public class User_1 {
	private String name = "Rajni";
	private String email;
	@Autowired
	private Address_1 address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address_1 getAddress() {
		return address;
	}
	public void setAddress_1(Address_1 address) {
		this.address = address;
	}
	public String toString() {
		return "User :: "+name+" has an Address ::"+address;
	}
}
