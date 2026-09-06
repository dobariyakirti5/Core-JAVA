package com.core;

public class UserAge {
	public static void getUserAge(String intput) {
		
		try {
			int age=Integer.parseInt(intput);
			System.out.println("User age:"+age);
			
		}catch(NumberFormatException e){
			System.out.println("Invalid Age Entered");
			
		}
	}
	public static void main(String[] args) {
		getUserAge("25");
		getUserAge("abc");
	}

}
