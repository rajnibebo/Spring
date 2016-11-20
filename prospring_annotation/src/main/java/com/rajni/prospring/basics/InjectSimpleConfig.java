package com.rajni.prospring.basics;

import org.springframework.stereotype.Component;

@Component("injectSimpleConfig")
public class InjectSimpleConfig {
	private String name = "Rajni Ubhi";
	private int age = 23;
	private long ageInSeconds = 123456789l;
	private boolean programmer = true;
	private float height = 1.25f;
	
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
	public long getAgeInSeconds() {
		return ageInSeconds;
	}
	public void setAgeInSeconds(long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}
	public boolean isProgrammer() {
		return programmer;
	}
	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	
}
