package com.rajni.prospring.aop.dynamicpc;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.rajni.prospring.aop.basics.SimpleBeforeAdvice;

public class DynamicPointcutExample {
	public static void main(String[] args) {
		SampleBean target = new SampleBean();
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(target);
		pf.addAdvisor(new DefaultPointcutAdvisor(new SimpleDynamicPointcut(), new SimpleBeforeAdvice()));
		
		SampleBean proxy = (SampleBean) pf.getProxy();
		proxy.bar();
		proxy.foo(10);
		proxy.foo(1000);
		proxy.foo(100);
	}
}
