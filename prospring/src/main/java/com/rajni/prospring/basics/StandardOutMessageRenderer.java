package com.rajni.prospring.basics;

public class StandardOutMessageRenderer implements MessageRenderer {
	private MessageProvider messageProvider = null;
	
	public void render() {
		// TODO Auto-generated method stub
		if(messageProvider == null) {
			throw new IllegalArgumentException("MessageProvider can not be null::::");
		}
		System.out.println(messageProvider.getMessage());
	}

	public void setMessageProvdider(MessageProvider messageProvider) {
		// TODO Auto-generated method stub
		this.messageProvider = messageProvider;
	}

	public MessageProvider getMessageProvider() {
		// TODO Auto-generated method stub
		return messageProvider;
	}

}
