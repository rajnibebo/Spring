/**
 * 
 */
package com.rajni.spring.ioc.annotations;

import org.rajni.spring.ioc.annotations.IMessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author rajni.ubhi
 *
 */
public class Test {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("com/rajni/spring/ioc/annotations/spring-ctx.xml");
		IMessageRenderer renderer = (IMessageRenderer) ctx.getBean("renderer");
		renderer.display();
		ctx.close();
	}
}
