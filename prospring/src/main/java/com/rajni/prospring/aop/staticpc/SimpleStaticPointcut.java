package com.rajni.prospring.aop.staticpc;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class SimpleStaticPointcut extends StaticMethodMatcherPointcut {

	public boolean matches(Method method, Class<?> cls) {
		// TODO Auto-generated method stub
		return method.getName().equals("foo");
	}
	
	public ClassFilter getClassFilter() {
		return new ClassFilter() {
			
			public boolean matches(Class<?> cls) {
				// TODO Auto-generated method stub
				return cls == BeanOne.class;
			}
		};
	}

}
