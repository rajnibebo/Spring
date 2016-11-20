package com.rajni.prospring.conf.event;

import org.springframework.context.ApplicationEvent;

public class MessageEvent extends ApplicationEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7910676180231862544L;
	
	private String msg;
	public MessageEvent(Object source,String msg) {
		super(source);
		// TODO Auto-generated constructor stub
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}

}
