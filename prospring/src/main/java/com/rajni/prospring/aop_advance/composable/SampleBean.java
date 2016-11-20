package com.rajni.prospring.aop_advance.composable;

public class SampleBean {
	public String getName() {
		return "Rajni";
	}
	
	public void setName(String name) {
		System.out.println("Setting name :::"+name);
	}
	public int getAge() {
		return 23;
	}
}
