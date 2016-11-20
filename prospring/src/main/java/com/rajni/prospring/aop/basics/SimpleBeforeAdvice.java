package com.rajni.prospring.aop.basics;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class SimpleBeforeAdvice implements MethodBeforeAdvice {
	
	public static void main(String[] args) {
		MessageWriter target = new MessageWriter();
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new SimpleBeforeAdvice());
		pf.setTarget(target);
		
		MessageWriter proxy = (MessageWriter) pf.getProxy();
		proxy.writeMessage();
	}

	public void before(Method method, Object[] args, Object arg)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before method :::::::"+method.getName());
	}

}
