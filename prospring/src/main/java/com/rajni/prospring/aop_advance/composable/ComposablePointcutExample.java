package com.rajni.prospring.aop_advance.composable;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.ComposablePointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcher;

import com.rajni.prospring.aop_advance.cflow.SimpleBeforeAdvice;

public class ComposablePointcutExample {
	public static void main(String[] args) {
		SampleBean target = new SampleBean();
		ComposablePointcut pc = new ComposablePointcut(ClassFilter.TRUE, new GetterMethodMatcher());
		
		SampleBean proxy1 = getProxy(pc, target);
		testInvoke(proxy1);
		
		System.out.println();
		pc.union(new SetterMethodMatcher());
		proxy1 = getProxy(pc, target);
		testInvoke(proxy1);
		System.out.println();
		
		pc.intersection(new GetAgeMethodMatcher());
		proxy1 = getProxy(pc, target);
		testInvoke(proxy1);
	}
	
	private static SampleBean getProxy(ComposablePointcut pc, SampleBean target) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(target);
		pf.addAdvisor(new DefaultPointcutAdvisor(pc, new SimpleBeforeAdvice()));
		return (SampleBean) pf.getProxy();
	}
	
	private static void testInvoke(SampleBean bean) {
		System.out.println(bean.getName());
		System.out.println(bean.getAge());
		bean.setName("Rajni Ubhi");
	}
	private static class GetterMethodMatcher extends StaticMethodMatcher {

		public boolean matches(Method method, Class<?> cls) {
			// TODO Auto-generated method stub
			return method.getName().startsWith("get");
		}
		
	}
	
	private static class GetAgeMethodMatcher extends StaticMethodMatcher {

		public boolean matches(Method method, Class<?> cls) {
			// TODO Auto-generated method stub
			return method.getName().startsWith("getAge");
		}
		
	}
	
	private static class SetterMethodMatcher extends StaticMethodMatcher {

		public boolean matches(Method method, Class<?> cls) {
			// TODO Auto-generated method stub
			return method.getName().startsWith("set");
		}
		
	}
}
