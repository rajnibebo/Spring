package com.rajni.prospring.aop_advance.pfb;

public class MyBean {
	private MyDependency myDependency;

	public void setMyDependency(MyDependency myDependency) {
		this.myDependency = myDependency;
	}
	
	public void execute() {
		System.out.println("Executing ::::::::::");
		myDependency.foo();
		myDependency.bar();
	}
	
}
