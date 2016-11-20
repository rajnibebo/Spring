package com.rajni.prospring.basics.consinjection;

import com.rajni.prospring.basics.MessageProvider;

public class ConfigurableMessageProvider implements MessageProvider {
	private String message;
	
	public ConfigurableMessageProvider(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	
}
