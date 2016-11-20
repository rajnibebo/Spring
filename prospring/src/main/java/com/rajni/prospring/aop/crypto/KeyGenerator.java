package com.rajni.prospring.aop.crypto;

import java.util.Random;

public class KeyGenerator {
	public static final long WEAK_KEY = 0xFFFFFFF0000000l;
	public static final long STRONG_KEY = 0xACDF03F590AE56l;
	private Random random = new Random();
	public long getKey() {
		int num = random.nextInt(3);
		if(num == 1) {
			return WEAK_KEY;
		} else {
			return STRONG_KEY;
		}
	}
}
