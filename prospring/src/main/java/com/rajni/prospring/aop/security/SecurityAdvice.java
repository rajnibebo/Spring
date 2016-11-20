package com.rajni.prospring.aop.security;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class SecurityAdvice implements MethodBeforeAdvice {
	private SecurityManager securityManager;
	public SecurityAdvice() {
		// TODO Auto-generated constructor stub
		this.securityManager = new SecurityManager();
	}
	public void before(Method method, Object[] args, Object obj)
			throws Throwable {
		// TODO Auto-generated method stub
		UserInfo user = securityManager.getLoggedOnUser();
		if(user == null) {
			throw new SecurityException("User must be logged on::::");
		} else if(user.getUsername().equals("Rajni")) {
			System.out.println("Logged in user is Valid");
		} else {
			System.out.println("Invalid credentials");
			throw new SecurityException("Either username or password is incorrect");
		}
	}

}
