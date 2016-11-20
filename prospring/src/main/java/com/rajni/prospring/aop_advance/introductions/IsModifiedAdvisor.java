package com.rajni.prospring.aop_advance.introductions;

import org.springframework.aop.support.DefaultIntroductionAdvisor;

public class IsModifiedAdvisor extends DefaultIntroductionAdvisor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8495379275116899799L;

	public IsModifiedAdvisor() {
		super(new IsModifiedMixin());
		// TODO Auto-generated constructor stub
	}

}
