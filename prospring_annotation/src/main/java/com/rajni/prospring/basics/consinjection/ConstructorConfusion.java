package com.rajni.prospring.basics.consinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service("consConfusion")
public class ConstructorConfusion {
	private String someValue;
	private int intVal;
	 
	public ConstructorConfusion(String someVal) {
		// TODO Auto-generated constructor stub
		this.someValue = someVal;
		System.out.println("This is Coming via String constructor:::::"+someVal);
	}
	
	@Autowired
	public ConstructorConfusion(@Value("24")int intVal) {
		this.intVal = intVal;
		System.out.println("This is Coming via intVal:::::"+intVal);
	}
	
	public String toString() {
		return "ConstructorConfusion[String Value::::"+someValue+", intValue:::::"+intVal+"]";
	}
}
