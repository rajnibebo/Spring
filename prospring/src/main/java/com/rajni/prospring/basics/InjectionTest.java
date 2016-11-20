package com.rajni.prospring.basics;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.rajni.prospring.util.SpringUtil;

public class InjectionTest {
	private static final String CONFIG_LOC = "com/rajni/prospring/basics/app-ctx-injection.xml";
	public static void main(String[] args) {
		testInjectedSimpleValues();
		System.out.println("\nInject using Spel Expression:::::\n");
		testInjectedSpelValues();
		SpringUtil.closeContext();
	}
	
	static void testInjectedSimpleValues() {
		GenericXmlApplicationContext ctx = SpringUtil.getContext(CONFIG_LOC);
		InjectSimple injectSimple = (InjectSimple) ctx.getBean("injectSimple");
		System.out.println(injectSimple);
	}
	
	static void testInjectedSpelValues() {
		GenericXmlApplicationContext ctx = SpringUtil.getContext(CONFIG_LOC);
		InjectSimpleSpel injectSimpleSpel = (InjectSimpleSpel) ctx.getBean("injectSimpleSpel");
		System.out.println(injectSimpleSpel);
	}
}
