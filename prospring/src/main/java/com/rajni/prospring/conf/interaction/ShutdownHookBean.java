package com.rajni.prospring.conf.interaction;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ShutdownHookBean implements ApplicationContextAware {
	private ApplicationContext ctx;
	
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Setting application context::::::");
		this.ctx = applicationContext;
		if(ctx instanceof GenericXmlApplicationContext) {
			((GenericXmlApplicationContext) ctx).registerShutdownHook();
		}
	}

}
