package com.rajni.prospring.aop.dynamicpc;

public class SampleBean {
	public void foo(int x) {
		System.out.println("Invoked foo with x ::::: "+x);
	}
	
	public void bar() {
		System.out.println("Invoked bar()");
	}
}
