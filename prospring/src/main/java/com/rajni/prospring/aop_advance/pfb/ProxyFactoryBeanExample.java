package com.rajni.prospring.aop_advance.pfb;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.rajni.prospring.util.SpringUtil;

public class ProxyFactoryBeanExample {
	public static void main(String[] args) {
		String location = "com/rajni/prospring/aop_advance/pfb/pfb.xml";
		
		GenericXmlApplicationContext ctx = SpringUtil.getContext(location);
		MyBean bean1 = (MyBean) ctx.getBean("myBean1");
		bean1.execute();
		
		MyBean bean2 = (MyBean) ctx.getBean("myBean2");
		bean2.execute();
		SpringUtil.closeContext();
	}
}
