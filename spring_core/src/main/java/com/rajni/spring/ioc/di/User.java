/**
 * 
 */
package com.rajni.spring.ioc.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rajni.ubhi
 *
 */
//@Service
public class User {
	private String name = "Rajni";
	private String email;
	@Autowired
	private Address address;
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String toString() {
		return "User :: "+name+" has an Address ::"+address;
	}
}
