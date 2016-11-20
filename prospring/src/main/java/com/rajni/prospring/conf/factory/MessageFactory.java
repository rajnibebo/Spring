package com.rajni.prospring.conf.factory;

public class MessageFactory {
	private Message message1 = null;
	
	public Message createInstance() {
		message1 = Message.getInstance();
		return message1;
	}
}
