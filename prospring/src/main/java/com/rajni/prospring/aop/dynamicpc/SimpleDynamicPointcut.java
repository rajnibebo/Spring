package com.rajni.prospring.aop.dynamicpc;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class SimpleDynamicPointcut extends DynamicMethodMatcherPointcut {
	
	public boolean matches(Method method , Class<?> cls) {
		System.out.println("Static check for :::: "+method.getName());
		return method.getName().equals("foo");
	}

	public boolean matches(Method method, Class<?> cls, Object[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dynamic check for ::: "+method.getName());
		int x = ((Integer)args[0]).intValue();
		return x != 100;
	}

	public ClassFilter getClassFilter() {
		return new ClassFilter() {
			
			public boolean matches(Class<?> cls) {
				// TODO Auto-generated method stub
				return cls == SampleBean.class;
			}
		};
	}
}
