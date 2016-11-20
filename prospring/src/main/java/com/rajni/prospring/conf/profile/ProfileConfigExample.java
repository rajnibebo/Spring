package com.rajni.prospring.conf.profile;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ProfileConfigExample {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles("kindergarten");
		ctx.load("com/rajni/prospring/conf/profile/**/*-config.xml");
		ctx.refresh();
		
		FoodProviderService service = (FoodProviderService) ctx.getBean("foodService");
		System.out.println(service.provideLunchSet());
		
		ctx.close();
	}
}
