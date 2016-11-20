package com.rajni.prospring.basics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("injectSimpleSpel")
public class InjectSimpleSpel {
	@Value("#{injectSimpleConfig.name}")
	private String name;
	@Value("#{injectSimpleConfig.age}")
	private int age;
	@Value("#{injectSimpleConfig.ageInSeconds}")
	private long ageInSeconds;
	@Value("#{injectSimpleConfig.height}")
	private float height;
	@Value("#{injectSimpleConfig.programmer}")
	private boolean programmer;
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
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public boolean isProgrammer() {
		return programmer;
	}
	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}
	
}
