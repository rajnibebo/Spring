package com.rajni.prospring.util;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringUtil {
	private static GenericXmlApplicationContext context = null;
	
	public static GenericXmlApplicationContext getContext(String path) {
		if(context == null) {
			synchronized (SpringUtil.class) {
				if(context == null) {
					context = new GenericXmlApplicationContext();
					context.load(path);
					context.refresh();
				}
			}
		}
		return context;
	}
	
	public static void closeContext() {
		if(context != null) {
			context.close();
		}	
	}
}
