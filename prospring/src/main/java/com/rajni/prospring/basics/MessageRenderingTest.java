package com.rajni.prospring.basics;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.rajni.prospring.basics.consinjection.ConstructorConfusion;
import com.rajni.prospring.util.SpringUtil;

public class MessageRenderingTest {
	public static void main(String[] args) {
		System.out.println("Testing Basic Xml:::::::::::::");
		testXmlBasic();
		
		System.out.println("Testing Constructor Injection::::::::::::::");
		testConstructorInjection();
		
		System.out.println("Testing Constructor Confusion:::::::::::::::");
		testConstructorConfusion();
		SpringUtil.closeContext();
	}
	
	static void testXmlBasic() {
		GenericXmlApplicationContext context = SpringUtil.getContext("com/rajni/prospring/basics/app-context-msg-render.xml");
		MessageRenderer renderer = (MessageRenderer) context.getBean("renderer");
		renderer.render();
	}
	
	static void testConstructorInjection() {
		GenericXmlApplicationContext context = SpringUtil.getContext("com/rajni/prospring/basics/app-context-msg-render.xml");
		MessageRenderer renderer = (MessageRenderer) context.getBean("rendererCons");
		renderer.render();
	}
	
	static void testConstructorConfusion() {
		GenericXmlApplicationContext ctx = SpringUtil.getContext("com/rajni/prospring/basics/app-context-msg-render.xml");
		ConstructorConfusion confusion = (ConstructorConfusion) ctx.getBean("constructorConfusion");
		System.out.println(confusion);
	}

}
