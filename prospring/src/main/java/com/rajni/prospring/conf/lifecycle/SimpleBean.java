package com.rajni.prospring.conf.lifecycle;

public class SimpleBean {
	private static final String DEFAULT_NAME = "Rajni Ubhi";
	private String name;
	private int age = Integer.MIN_VALUE;
	
	public void init() {
		if(name == null) {
			this.name = DEFAULT_NAME;
		}
		if(age == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("Age must be set properly!!!");
		}
	}
	
	public void destroy() {
		System.out.println(":::::::::::Simple Bean getting Destroyed::::::::::");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "SimpleBean[name ::"+name+", Age:::"+age+"]";
	}
}
