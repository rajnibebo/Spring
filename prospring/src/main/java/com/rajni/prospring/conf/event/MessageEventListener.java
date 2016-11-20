package com.rajni.prospring.conf.event;

import org.springframework.context.ApplicationListener;

public class MessageEventListener implements ApplicationListener<MessageEvent>{

	public void onApplicationEvent(MessageEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Received Event ::"+event.getMessage());
	}

}
