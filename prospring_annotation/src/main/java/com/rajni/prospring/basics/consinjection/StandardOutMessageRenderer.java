package com.rajni.prospring.basics.consinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajni.prospring.basics.MessageProvider;
import com.rajni.prospring.basics.MessageRenderer;

@Service("rendererCons")
public class StandardOutMessageRenderer implements MessageRenderer{
	@Autowired
	private MessageProvider messageProvider;
	public void render() {
		// TODO Auto-generated method stub
		if(messageProvider == null) {
			throw new IllegalArgumentException("MessageProvider can not be null");
		}
		System.out.println(messageProvider.getMessage());
	}

	public void setMessageProvider(MessageProvider provider) {
		// TODO Auto-generated method stub
		this.messageProvider = provider;
	}

	public MessageProvider getMessageProvider() {
		// TODO Auto-generated method stub
		return messageProvider;
	}

}
