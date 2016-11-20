package com.rajni.prospring.conf.interaction;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.rajni.prospring.conf.lifecycle.SimpleBeanWithAll;
import com.rajni.prospring.util.SpringUtil;

public class ShutdoownBeanExample {
	private static final String LOC_PATH = "com/rajni/prospring/conf/interaction/shutdown.xml";
	public static void main(String[] args) {
		testShutDownHook();
	}
	static void testShutDownHook() {
		GenericXmlApplicationContext ctx = SpringUtil.getContext(LOC_PATH);
		SimpleBeanWithAll bean = (SimpleBeanWithAll) ctx.getBean("simpleBean");
		System.out.println(bean);
	}
}
