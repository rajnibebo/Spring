package com.rajni.prospring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {
	@Autowired
	private MessageProvider messageProvider;
	public void render() {
		// TODO Auto-generated method stub
		if(messageProvider == null) {
			throw new IllegalArgumentException("MessageProvider can not be null");
		}
		System.out.println(messageProvider.getMessage());
	}
	@Autowired
	public void setMessageProvider(MessageProvider provider) {
		// TODO Auto-generated method stub
		this.messageProvider = provider;
	}

	public MessageProvider getMessageProvider() {
		// TODO Auto-generated method stub
		return messageProvider;
	}

}
