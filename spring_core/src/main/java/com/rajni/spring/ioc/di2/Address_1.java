/**
 * 
 */
package com.rajni.spring.ioc.di2;

/**
 * @author rajni.ubhi
 *
 */
public class Address_1 {
	private String state;
	private String city;
	private String country;
	
	public Address_1() {
		// TODO Auto-generated constructor stub
		this.state = "Punjab";
		this.city = "Chandigarh";
		this.country = "India";
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String toString() {
		return "State :: "+state+", City :: "+city+", country ::"+country;
	}
}
