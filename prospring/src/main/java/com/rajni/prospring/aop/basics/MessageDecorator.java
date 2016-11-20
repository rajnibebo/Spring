package com.rajni.prospring.aop.basics;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MessageDecorator implements MethodInterceptor {

	public Object invoke(MethodInvocation invoke) throws Throwable {
		// TODO Auto-generated method stub
		System.out.print("Hello ");
		Object obj = invoke.proceed();
		System.out.println("!!!!!");
		return obj;
	}

}
