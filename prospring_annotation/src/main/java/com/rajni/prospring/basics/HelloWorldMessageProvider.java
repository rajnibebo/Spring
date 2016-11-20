package com.rajni.prospring.basics;

import org.springframework.stereotype.Service;

@Service("provider")
public class HelloWorldMessageProvider implements MessageProvider {

	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello World From Pro Spring 3.2 Annotations";
	}

}
