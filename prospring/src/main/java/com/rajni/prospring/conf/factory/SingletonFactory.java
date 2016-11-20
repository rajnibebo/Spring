package com.rajni.prospring.conf.factory;

import org.springframework.beans.factory.FactoryBean;

public class SingletonFactory implements FactoryBean<Singleton>{

	public Singleton getObject() throws Exception {
		// TODO Auto-generated method stub
		//return new Singleton();
		return Singleton.getInstance();
	}

	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Singleton.class;
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;  // if false then follows prototype pattern
	}
	public String toString() {
		return "SingletonFactory accessed directly";
	}
}
