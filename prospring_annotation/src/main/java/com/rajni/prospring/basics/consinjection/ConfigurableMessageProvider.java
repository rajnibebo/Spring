package com.rajni.prospring.basics.consinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.rajni.prospring.basics.MessageProvider;
@Service("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider {
	private String message;
	
	@Autowired
	public ConfigurableMessageProvider(@Value("This is configurable message coming from annotations")String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
