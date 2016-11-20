package com.rajni.prospring.aop.annotationpc;

public class SampleAnnotationBean {
	@AdviceRequired
	public void foo() {
		System.out.println("SmapleAnnotationBean.foo()");
	}
	
	public void bar() {
		System.out.println("SampleAnnotationBean.bar()");
	}
}
