package com.rajni.prospring.conf.factory;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.rajni.prospring.util.SpringUtil;

public class FactoryTest {
	private static final String LOC_PATH = "com/rajni/prospring/basics/factory/factory.xml";
	public static void main(String[] args) {
		testFactoryBean();
		System.out.println("\n");
		testCustomFactoryBean();
		SpringUtil.closeContext();
	}
	static void testFactoryBean(){
		GenericXmlApplicationContext ctx = SpringUtil.getContext(LOC_PATH);
		SingletonHolder holder = (SingletonHolder) ctx.getBean("holder");
		System.out.println(holder);
		SingletonFactory factory = (SingletonFactory) ctx.getBean("&factory");
		System.out.println(factory);
	}
	
	static void testCustomFactoryBean() {
		GenericXmlApplicationContext ctx = SpringUtil.getContext(LOC_PATH);
		Message message = (Message) ctx.getBean("message");
		System.out.println(message);
	}
}	
