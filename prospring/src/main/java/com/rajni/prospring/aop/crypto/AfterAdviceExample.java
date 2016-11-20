package com.rajni.prospring.aop.crypto;

import org.springframework.aop.framework.ProxyFactory;

public class AfterAdviceExample {
	public static void main(String[] args) {
		KeyGenerator keyGen = getKeyGenerator();
		for(int x = 0 ; x < 10; x++) {
			try {
				long key = keyGen.getKey();
				System.out.println("Key ::: "+key);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	private static KeyGenerator getKeyGenerator() {
		KeyGenerator target = new KeyGenerator();
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(target);
		pf.addAdvice(new WeakKeyCheckAdvice());
		
		KeyGenerator proxy = (KeyGenerator) pf.getProxy();
		return proxy;
	}
}
