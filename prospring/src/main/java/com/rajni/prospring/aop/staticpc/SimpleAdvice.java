package com.rajni.prospring.aop.staticpc;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class SimpleAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation invoke) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(">>> Invoking "+invoke.getMethod().getName());
		Object returnVal = invoke.proceed();
		return returnVal;
	}

}
