package com.rajni.prospring.aop_advance.introductions;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class IsModifiedMixin extends DelegatingIntroductionInterceptor implements IsModified{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7547747496323040890L;
	private boolean isModified = false;
	private Map<Method, Method> map = new HashMap<Method, Method>();

	public boolean isModified() {
		// TODO Auto-generated method stub
		return isModified;
	}
	
	public Object invoke(MethodInvocation invocation) throws Throwable {
		if(!isModified) {
			if(invocation.getMethod().getName().startsWith("set") && invocation.getArguments().length == 1) {
				Method getter = getGetter(invocation.getMethod());
				if(getter != null) {
					Object newVal = invocation.getArguments()[0];
					Object oldVal = getter.invoke(invocation.getThis());
					if(newVal == null && oldVal == null) {
						isModified = false;
					} else if(newVal == null && oldVal != null) {
						isModified = true;
					} else if(oldVal == null && newVal != null) {
						isModified = true;
					} else {
						isModified = !(oldVal.equals(newVal));
					}
				}
			}
		}
		return super.invoke(invocation);
	}
	
	private Method getGetter(Method setter) {
		Method getter = null;
		getter = map.get(setter);
		if(getter != null) {
			return getter;
		}
		String getterName = setter.getName().replaceFirst("set", "get");
		try {
			getter = setter.getDeclaringClass().getMethod(getterName);
			synchronized (map) {
				map.put(setter, getter);
			}
		} catch(NoSuchMethodException e) {
			e.printStackTrace();
		}
		return getter;
	}

}
