package com.rajni.prospring.aop.security;

public class UserInfo {
	private String username;
	private String password;
	
	public UserInfo(String username, String password) {
		// TODO Auto-generated constructor stub
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
