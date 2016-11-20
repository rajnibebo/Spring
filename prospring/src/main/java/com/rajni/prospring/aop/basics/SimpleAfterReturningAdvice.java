package com.rajni.prospring.aop.basics;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class SimpleAfterReturningAdvice implements AfterReturningAdvice {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		MessageWriter target = new MessageWriter();
		pf.setTarget(target);
		pf.addAdvice(new SimpleAfterReturningAdvice());
		
		MessageWriter proxy = (MessageWriter) pf.getProxy();
		proxy.writeMessage();
	}
	public void afterReturning(Object returnValue, Method method, Object[] args,
			Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("After method :::: "+method.getName());
	}

}
