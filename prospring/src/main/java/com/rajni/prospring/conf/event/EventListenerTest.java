package com.rajni.prospring.conf.event;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.rajni.prospring.util.SpringUtil;

public class EventListenerTest {
	private static final String LOC_PATH = "com/rajni/prospring/conf/event/events.xml";
	public static void main(String[] args) {
		eventTest();
		SpringUtil.closeContext();
	}
	static void eventTest() {
		GenericXmlApplicationContext ctx = SpringUtil.getContext(LOC_PATH);
		Publisher publisher = (Publisher) ctx.getBean("publisher");
		publisher.publish("hey My name is Rajni");
		publisher.publish("I love java Programming");
		
	}
}
