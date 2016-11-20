package com.rajni.prospring.aop.staticpc;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class StaticPointcutExample {
	public static void main(String[] args) {
		BeanOne targetOne = new BeanOne();
		BeanTwo targetTwo = new BeanTwo();
		
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(targetOne);
		pf.addAdvisor(new DefaultPointcutAdvisor(new SimpleStaticPointcut(), new SimpleAdvice()));
		
		BeanOne proxyOne = (BeanOne) pf.getProxy();
		proxyOne.foo();
		proxyOne.bar();
		
		pf.setTarget(targetTwo);
		BeanTwo proxyTwo = (BeanTwo) pf.getProxy();
		proxyTwo.foo();
		proxyTwo.bar();
	}
}
