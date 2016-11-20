package com.rajni.prospring.conf.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SimpleBeanWithJSR250 {
	private static final String DEFAULT_NAME = "Rajni Ubhi";
	private String name;
	private int age = Integer.MIN_VALUE;
	
	@PostConstruct
	public void init() {
		if(name == null) {
			this.name = DEFAULT_NAME;
		}
		if(age == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("Age must be set properly!!!");
		}
	}
	@PreDestroy
	public void destroy() {
		System.out.println(":::::::::Simple Bean JSR250 getting destroyed::::::::::::::::");
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
		return "SimpleBeanWithJSR250[name ::"+name+", Age:::"+age+"]";
	}
}
