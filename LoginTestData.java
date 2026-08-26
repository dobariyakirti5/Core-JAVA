package com.core;

public class LoginTestData {
	public static void main(String[] args) {
		String name="testuser@gmail.com";
		String password="Test@123";
		boolean isRememberMeChecked=true;
		int loginAttempts=3;
		
		System.out.println("Username:"+name);
		System.out.println("password:"+password);
		System.out.println("Remember Me Checked"+isRememberMeChecked);
		System.out.println("login Attempts:"+loginAttempts);
		
	}

}
