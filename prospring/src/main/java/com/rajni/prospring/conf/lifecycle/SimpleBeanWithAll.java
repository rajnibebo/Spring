package com.rajni.prospring.conf.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SimpleBeanWithAll implements InitializingBean,DisposableBean {
	private static final String DEFAULT_NAME = "Rajni Ubhi";
	private String name = null;
	
	@PostConstruct
	public void init() {
		System.out.println("Using PostConstruct INIT()");
		if(name == null) {
			this.name = DEFAULT_NAME;
		}
	}
	
	public void customInit() {
		System.out.println("Custom Init method::::::");
		if(!name.equals(DEFAULT_NAME)) {
			this.name = DEFAULT_NAME;
		}
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("SimpleBean with All destroy using annotation");
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("After Properties Set...........");
		if(name == DEFAULT_NAME) {
			this.name = "Lukewarm";
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "SimpleBeanWithAll[name :::"+name+"]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Simple Bean with all destroyed using Disposable Bean");
	}
	
	public void customDestroy() {
		System.out.println("Calling custom Destroy in Simple Bean with All");
	}
}
