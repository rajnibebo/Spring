package com.rajni.prospring.aop.aspectjexppc;

import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.rajni.prospring.aop.staticpc.SimpleAdvice;

public class AspectjexpPointcutExample {
	public static void main(String[] args) {
		AspectjexpBean target = new AspectjexpBean();
		
		AspectJExpressionPointcut pc = new AspectJExpressionPointcut();
		pc.setExpression("execution(* foo*(..))");
		Advisor advisor = new DefaultPointcutAdvisor(pc, new SimpleAdvice());
		
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(target);
		pf.addAdvisors(advisor);
		
		AspectjexpBean proxy = (AspectjexpBean) pf.getProxy();
		proxy.bar();
		proxy.foo1();
		proxy.foo2();
	}
}
