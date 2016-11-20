package com.rajni.prospring.aop_advance.cflow;

import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.ControlFlowPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class ControlFlowExample {
	public static void main(String[] args) {
		ControlFlowExample exp = new ControlFlowExample();
		exp.run();
	
	}
	
	public void run() {
		TestBean target = new TestBean();
		Pointcut pc = new ControlFlowPointcut(ControlFlowExample.class, "test");
		Advisor advisor = new DefaultPointcutAdvisor(pc, new SimpleBeforeAdvice());
		
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(target);
		pf.addAdvisor(advisor);
		
		TestBean proxy = (TestBean) pf.getProxy();
		System.out.println("Trying noraml invoke");
		proxy.foo();
		test(proxy);
	}
	
	private void test(TestBean bean) {
		bean.foo();
	}
}
