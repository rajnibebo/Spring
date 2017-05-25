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
@Service("welcome")
public class WelcomeMessageProvider implements IMessageProvider {

	/* (non-Javadoc)
	 * @see org.rajni.spring.ioc.annotations.IMessageProvider#getMessage()
	 */
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Welocme !!!!!!!!!";
	}

}
