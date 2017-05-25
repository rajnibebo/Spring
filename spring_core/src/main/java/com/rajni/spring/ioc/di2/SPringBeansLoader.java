/**
 * 
 */
package com.rajni.spring.ioc.di2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author rajni.ubhi
 *
 */
@Component
public class SPringBeansLoader {
	@Bean
	public Address_1 address() {
		Address_1 address_1 = new Address_1();
		address_1.setCity("jsfhkjdfh");
		address_1.setCountry("kdfjksd");
		address_1.setState("dfhdks");
		return address_1;
	}
	@Bean
	public User_1 user() {
		User_1 user_1 = new User_1();
		user_1.setName("Sumati");
		user_1.setEmail("sumati@gmail.com");
		//user_1.setAddress_1(address());
		return user_1;
	}
	
	@Bean
	public User_1 user1() {
		User_1 user_1 = new User_1();
		user_1.setName("Neha");
		user_1.setEmail("neha@gmail.com");
		//user_1.setAddress_1(address());
		return user_1;
	}
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("com/rajni/spring/ioc/di2/spring-ctx.xml");
		User_1 user = (User_1) ctx.getBean("user1");
		System.out.println(user);
		
		User_1 user2 = (User_1) ctx.getBean("user");
		System.out.println(user2);
		ctx.close();
	}
}
