package com.rajni.prospring.aop.basics;

public class ErrorBean {
	public void errorProneMethod() throws Exception {
		throw new Exception("foo");
	}
	
	public void otherErrorProneMethod() throws IllegalArgumentException {
		throw new IllegalArgumentException("Bar");
	}
}
