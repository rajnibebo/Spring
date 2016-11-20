package com.rajni.prospring.basics;

import com.rajni.prospring.basics.consinjection.ConstructorConfusion;
import com.rajni.prospring.util.SpringUtil;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageRenderingTest {
	public static void main(String[] args) {
		System.out.println("Testing Basic Xml:::::::::::::");
		testXmlBasic();
		
		System.out.println("Testing Constructor Injection::::::::::::::");
		testConstructorInjection();
		
		System.out.println("Testing Constructor Confusion::::::::::::::");
		testConstructorConfusion();
		
		SpringUtil.closeContext();
	}
	
	static void testXmlBasic() {
		GenericXmlApplicationContext context = SpringUtil.getContext("com/rajni/prospring/basics/app-ctx-msg-render.xml");
		MessageRenderer renderer = (MessageRenderer) context.getBean("renderer");
		renderer.render();
		//context.close();
	}
	
	static void testConstructorInjection() {
		GenericXmlApplicationContext context = SpringUtil.getContext("com/rajni/prospring/basics/app-ctx-msg-render.xml");
		MessageRenderer renderer = (MessageRenderer) context.getBean("rendererCons");
		renderer.render();
	}
	static void testConstructorConfusion() {
		GenericXmlApplicationContext context = SpringUtil.getContext("com/rajni/prospring/basics/app-ctx-msg-render.xml");
		ConstructorConfusion confusion = (ConstructorConfusion) context.getBean("consConfusion");
		System.out.println(confusion);
	}
}
