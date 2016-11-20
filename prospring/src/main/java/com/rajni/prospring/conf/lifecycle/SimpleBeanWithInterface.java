package com.rajni.prospring.conf.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SimpleBeanWithInterface implements InitializingBean, DisposableBean {
	private static final String DEFAULT_NAME = "Rajni Ubhi";
	private String name;
	private int age = Integer.MIN_VALUE;

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

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		if(name == null) {
			this.name = DEFAULT_NAME;
		}
		if(age == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("Age must be set properly");
		}
	}
	public String toString() {
		return "SimpleBeanWithInterface[name ::"+name+", Age:::"+age+"]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("::::::::::::: Simple Bean with Interface getting destroyed:::::::::::::::");
	}
}
