/**
 * 
 */
package com.rajni.spring.ioc.annotations;

import org.rajni.spring.ioc.annotations.IMessageProvider;
import org.springframework.stereotype.Service;

/**
 * @author rajni.ubhi
 *
 */
@Service("hello")
public class HelloWorldMessageProvider implements IMessageProvider {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello World";
	}

}
