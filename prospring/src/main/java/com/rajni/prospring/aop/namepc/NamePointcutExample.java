package com.rajni.prospring.aop.namepc;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

import com.rajni.prospring.aop.staticpc.SimpleAdvice;

public class NamePointcutExample {
	public static void main(String[] args) {
		NameBean target = new NameBean();
		NameMatchMethodPointcut pc = new NameMatchMethodPointcut();
		pc.addMethodName("foo");
		pc.addMethodName("bar");
		
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(target);
		pf.addAdvisor(new DefaultPointcutAdvisor(pc, new SimpleAdvice()));
		
		NameBean proxy = (NameBean) pf.getProxy();
		proxy.foo();
		proxy.foo(100);
		proxy.bar();
		proxy.yup();
	}
}
