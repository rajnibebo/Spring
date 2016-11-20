package com.rajni.prospring.basics.consinjection;

public class ConstructorConfusion {
	private String someValue;
	private int intVal;
	public ConstructorConfusion(String someValue) {
		// TODO Auto-generated constructor stub
		this.someValue = someValue;
		System.out.println("Constructor string(somevalue) is called::::::"+this.someValue);
	}
	public ConstructorConfusion(int someValue) {
		// TODO Auto-generated constructor stub
		this.intVal = someValue;
		System.out.println("Constructor int(intVal) is called::::::"+intVal);
	}
	
	public String toString() {
		return "ConstructorConfusion::::SomeValue:::"+someValue +":::: intValue:::"+intVal;
	}
}
