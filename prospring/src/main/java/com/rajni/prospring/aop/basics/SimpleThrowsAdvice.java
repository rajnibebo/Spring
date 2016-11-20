package com.rajni.prospring.aop.basics;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class SimpleThrowsAdvice implements ThrowsAdvice {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new ErrorBean());
		pf.addAdvice(new SimpleThrowsAdvice());
		
		ErrorBean proxy = (ErrorBean) pf.getProxy();
		try {
			proxy.errorProneMethod();
		} catch(Exception e) {
			
		}
		
	}
	// if both methods return the same exception, preference is given to the following method
	public void afterThrowing(Exception e) throws Exception {
		System.out.println("**********************");
		System.out.println("Generic Exception caught");
	}
	public void afterThrowing(Method method,Object[] args,Object target, Exception e) throws Exception {
		System.out.println("**********************");
		System.out.println("Generic Exception caught!!!!!!!!!!!!!!");
	}
}
