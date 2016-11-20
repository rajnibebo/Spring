package com.rajni.prospring.aop_advance.introductions;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;

public class IntroductionExample {
	public static void main(String[] args) {
		TargetBean target = new TargetBean();
		target.setName("Rajni");
		
		Advisor advisor = new IsModifiedAdvisor();
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(target);
		pf.addAdvisor(advisor);
		pf.setOptimize(true);  // if not set class cast exception is thrown
		
		TargetBean bean = (TargetBean) pf.getProxy();
		IsModified proxy = (IsModified) bean;
		
		System.out.println("Has been modified ?? "+proxy.isModified());
	}
}
