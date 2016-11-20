package com.rajni.prospring.conf.context;

import java.util.Locale;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.rajni.prospring.util.SpringUtil;

public class MessageSourceDemo {
	private static final String LOC_PATH = "com/rajni/prospring/conf/context/messageSource.xml";
	public static void main(String[] args) {
		testMessages();
		
		SpringUtil.closeContext();
	}
	
	static void testMessages() {
		GenericXmlApplicationContext ctx = SpringUtil.getContext(LOC_PATH);
		Locale locale = new Locale("cs", "CZ");
		System.out.println(ctx.getMessage("name", null, locale));
		
		Locale locale2 = new Locale("gb","GB");
		System.out.println(ctx.getMessage("name",null, locale2));
	}
}
