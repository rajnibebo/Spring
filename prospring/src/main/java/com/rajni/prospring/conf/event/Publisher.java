package com.rajni.prospring.conf.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Publisher implements ApplicationContextAware {
	private ApplicationContext applicationContext;
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext = applicationContext;
	}

	public void publish(String message) {
		applicationContext.publishEvent(new MessageEvent(this, message));
	}
}
