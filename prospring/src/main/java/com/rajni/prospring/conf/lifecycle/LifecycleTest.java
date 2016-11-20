package com.rajni.prospring.conf.lifecycle;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.rajni.prospring.util.SpringUtil;

public class LifecycleTest {
	private static final String CONFIG_LOC = "com/rajni/prospring/conf/lifecycle/lifecycle.xml";
	public static void main(String[] args) {
		testSimpleLifecycleTest();
		
		System.out.println("\nTest using spring interface:::::::::::::");
		testSimpleInfLifecycleTest();
		
		System.out.println("\nTest using JSR250 Annotations");
		testSimpleJSR250LifecycleTest();
		
		System.out.println("\nTest using all approaches::::::::::::");
		testSimpleLifecycleAllTest();
		
		SpringUtil.closeContext();
	}
	
	static void testSimpleLifecycleTest() {
		GenericXmlApplicationContext ctx = SpringUtil.getContext(CONFIG_LOC);
		SimpleBean simpleBean = (SimpleBean) ctx.getBean("simpleBean1");
		System.out.println(simpleBean);
		SimpleBean simpleBean2 = (SimpleBean) ctx.getBean("simpleBean2");
		System.out.println(simpleBean2);
		try {
			SimpleBean simpleBean3 = (SimpleBean) ctx.getBean("simpleBean3");
			System.out.println(simpleBean3);
		} catch(Exception e) {
			System.out.println("Exception Occurred:::"+e);
		}
		
	}
	
	static void testSimpleLifecycleAllTest() {
		GenericXmlApplicationContext ctx = SpringUtil.getContext(CONFIG_LOC);
		SimpleBeanWithAll simpleBean = (SimpleBeanWithAll) ctx.getBean("simpleBeanWithAll");
		System.out.println(simpleBean);
		
	}
	
	static void testSimpleInfLifecycleTest() {
		GenericXmlApplicationContext ctx = SpringUtil.getContext(CONFIG_LOC);
		SimpleBeanWithInterface simpleBean = (SimpleBeanWithInterface) ctx.getBean("simpleBeanIntf1");
		System.out.println(simpleBean);
		SimpleBeanWithInterface simpleBean2 = (SimpleBeanWithInterface) ctx.getBean("simpleBeanIntf2");
		System.out.println(simpleBean2);
		try {
			SimpleBeanWithInterface simpleBean3 = (SimpleBeanWithInterface) ctx.getBean("simpleBeanIntf3");
			System.out.println(simpleBean3);
		} catch(Exception e) {
			System.out.println("Exception Occurred:::"+e);
		}
		
	}
	
	static void testSimpleJSR250LifecycleTest() {
		GenericXmlApplicationContext ctx = SpringUtil.getContext(CONFIG_LOC);
		SimpleBeanWithJSR250 simpleBean = (SimpleBeanWithJSR250) ctx.getBean("simpleBeanJSR1");
		System.out.println(simpleBean);
		SimpleBeanWithJSR250 simpleBean2 = (SimpleBeanWithJSR250) ctx.getBean("simpleBeanJSR2");
		System.out.println(simpleBean2);
		try {
			SimpleBeanWithJSR250 simpleBean3 = (SimpleBeanWithJSR250) ctx.getBean("simpleBeanJSR3");
			System.out.println(simpleBean3);
		} catch(Exception e) {
			System.out.println("Exception Occurred:::"+e);
		}
	}
}
