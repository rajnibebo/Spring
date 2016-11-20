package com.rajni.prospring.conf.factory;

public class Singleton {
	private static Singleton instance = null;
	private final int id ;
	private static int count = 0;
	private Singleton() {
		id = ++count;
		System.out.println("Singleton object Created:::::::");
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	public String toString() {
		return "ID::"+id;
	}
}
