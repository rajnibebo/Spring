package com.rajni.prospring.basics;

public class InjectSimple {
	private String name;
	private int age;
	private boolean programmer;
	private float height;
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
