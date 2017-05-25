/**
 * 
 */
package org.rajni.spring.ioc.annotations;

/**
 * @author rajni.ubhi
 *
 */
public interface IMessageRenderer {
	public IMessageProvider getMessageProvider();
	
	public void setMessageProvider(IMessageProvider provider) ;
	
	public default void display() {
		System.out.print(getMessageProvider().getMessage());
	}
}
