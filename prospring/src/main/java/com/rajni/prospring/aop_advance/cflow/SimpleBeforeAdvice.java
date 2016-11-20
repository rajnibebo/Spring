package com.rajni.prospring.aop_advance.cflow;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class SimpleBeforeAdvice implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object obj)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before :::"+method.getName());
	}

}
