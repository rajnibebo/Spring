package com.rajni.prospring.aop.namepc;

public class NameBean {
	public void foo() {
		System.out.println("NameBean.foo()");
	}
	public void foo(int x) {
		System.out.println("NameBean.foo(x) x::"+x);
	}
	public void bar() {
		System.out.println("NameBean.bar()");
	}
	public void yup() {
		System.out.println("NameBean.yup()");
	}
}
