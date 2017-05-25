/**
 * 
 */
package com.rajni.spring.ioc.annotations;

import org.rajni.spring.ioc.annotations.IMessageProvider;
import org.rajni.spring.ioc.annotations.IMessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author rajni.ubhi
 *
 */
@Service("renderer")
public class ConsoleMessageRenderer implements IMessageRenderer {
	private IMessageProvider provider;
	
	/* (non-Javadoc)
	 * @see org.rajni.spring.ioc.annotations.IMessageRenderer#getMessageProvider()
	 */
	@Override
	public IMessageProvider getMessageProvider() {
		// TODO Auto-generated method stub
		return provider;
	}

	/* (non-Javadoc)
	 * @see org.rajni.spring.ioc.annotations.IMessageRenderer#setMessageProvider(org.rajni.spring.ioc.annotations.IMessageProvider)
	 */
	@Autowired
	@Qualifier("hello")
	@Override
	public void setMessageProvider(IMessageProvider provider) {
		// TODO Auto-generated method stub
		this.provider = provider;
	}

	/* (non-Javadoc)
	 * @see org.rajni.spring.ioc.annotations.IMessageRenderer#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(getMessageProvider().getMessage());
	}

}
