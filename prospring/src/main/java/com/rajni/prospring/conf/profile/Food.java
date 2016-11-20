package com.rajni.prospring.conf.profile;

public class Food {
	private String name;

	public Food() {
		// TODO Auto-generated constructor stub
	}
	
	public Food(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public String toString() {
		return "Food:"+name;
	}
}
