package com.rajni.prospring.conf.factory;

public class SingletonHolder {
	private Singleton instance1 = null;
	private Singleton instance2 = null;
	
	public Singleton getInstance1() {
		return instance1;
	}
	public void setInstance1(Singleton instance1) {
		this.instance1 = instance1;
	}
	public Singleton getInstance2() {
		return instance2;
	}
	public void setInstance2(Singleton instance2) {
		this.instance2 = instance2;
	}	
	
	public String toString() {
		return "instance1::"+instance1+",instance2::"+instance2;
	}
}
