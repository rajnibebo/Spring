package com.rajni.prospring.aop.security;

import org.springframework.aop.framework.ProxyFactory;

public class SecurityExample {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		SecureBean target = new SecureBean();
		SecurityManager mgr = new SecurityManager();
		SecurityAdvice advice = new SecurityAdvice();
		pf.setTarget(target);
		pf.addAdvice(advice);
		
		SecureBean proxy = (SecureBean) pf.getProxy();
		mgr.login("Rajni", "ubhi");
		proxy.writeSecureMessage();
		mgr.logout();
	}
}
