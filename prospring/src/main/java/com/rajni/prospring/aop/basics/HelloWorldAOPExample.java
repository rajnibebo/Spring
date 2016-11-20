package com.rajni.prospring.aop.basics;

import org.springframework.aop.framework.ProxyFactory;

public class HelloWorldAOPExample {
	public static void main(String[] args) {
		MessageWriter target = new MessageWriter();
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new MessageDecorator());
		pf.setTarget(target);
		
		MessageWriter proxy = (MessageWriter) pf.getProxy();
		proxy.writeMessage();
	}
}
