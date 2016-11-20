package com.rajni.prospring.aop.crypto;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class WeakKeyCheckAdvice implements AfterReturningAdvice {

	public void afterReturning(Object returnVal, Method method, Object[] args,
			Object target) throws Throwable {
		// TODO Auto-generated method stub
		if((target instanceof KeyGenerator) && (method.getName().equals("getKey"))) {
			long key = ((Long)returnVal).longValue();
			if(key == KeyGenerator.WEAK_KEY) {
				throw new SecurityException("Weak key generated !!! Please try again");
			}
		}
	}

}
