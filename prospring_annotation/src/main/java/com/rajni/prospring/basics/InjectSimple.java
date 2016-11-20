package com.rajni.prospring.basics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("injectSimple")
public class InjectSimple {
	@Value("Rajni")
	private String name;
	@Value("23")
	private int age;
	@Value("true")
	private boolean programmer;
	@Value("1.25f")
	private float height;
	@Value("12345678963")
	private long ageInSeconds;
	
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
	public long getAgeInSeconds() {
		return ageInSeconds;
	}
	public void setAgeInSeconds(long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}
	public String toString() {
		return "InjectSimple[Name:"+name+", Age::"+age+", Age In Seconds:::"
				+ageInSeconds+", Programmer:::"+programmer+",Height:::"+height+"]";
	}
}
