package com.rajni.prospring.conf.factory;

public class Message {
	private static Message instance = null;
	
	private Message() {
		System.out.println("Instance for message Created::::");
	}
	public static Message getInstance() {
		if(instance == null) {
			synchronized (Message.class) {
				if(instance == null) {
					instance = new Message();
				}
			}
		}
		return instance;
	}
	
	public String toString() {
		return "Message";
	}
}
