/**
 * 
 */
package com.rajni.spring.ioc.di;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class TestDI {
	public static void main(String[] args) {
		GenericXmlApplicationContext appContext = new GenericXmlApplicationContext("com/rajni/spring/ioc/di/spring-ctx.xml");
		/*appContext.load("com/rajni/spring/ioc/di/spring-ctx.xml");
		appContext.refresh();*/
		User user = appContext.getBean(User.class);
		System.out.println(user);
		appContext.close();
	}
	
}
