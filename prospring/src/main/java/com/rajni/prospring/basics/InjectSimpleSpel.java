package com.rajni.prospring.basics;

public class InjectSimpleSpel {
	private String name;
	private int age;
	private long ageInSeconds;
	private float height;
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
	public String toString() {
		return "InjectSimpleSpel[Name:"+name+", Age::"+age+", Age In Seconds:::"
				+ageInSeconds+", Programmer:::"+programmer+",Height:::"+height+"]";
	}
}
