package com.rajni.prospring.aop.annotationpc;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;

import com.rajni.prospring.aop.staticpc.SimpleAdvice;

public class AnnotationPointcutExample {
	public static void main(String[] args) {
		SampleAnnotationBean target = new SampleAnnotationBean();
		AnnotationMatchingPointcut pc = AnnotationMatchingPointcut.forMethodAnnotation(AdviceRequired.class);
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(target);
		pf.addAdvisor(new DefaultPointcutAdvisor(pc,new SimpleAdvice()));
	
		SampleAnnotationBean proxy = (SampleAnnotationBean) pf.getProxy();
		proxy.foo();
		proxy.bar();
	}
}
