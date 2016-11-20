package com.rajni.prospring.basics;

public interface MessageRenderer {
	public void render();
	
	public void setMessageProvdider(MessageProvider messageProvider) ;
	
	public MessageProvider getMessageProvider();
}
