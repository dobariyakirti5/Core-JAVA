package com.core;

public class InputValidator {
 public  boolean validateInput(String username) {
	return username.length()>=4;	 
 }
 public boolean validateInput(int age) {
	return age>=18;
	 
 }

 public static void main(String[] args) {
	InputValidator obj=new InputValidator();
	
	System.out.println("Username valid:"+obj.validateInput("kirti"));
	System.out.println("Age valid:"+obj.validateInput(20));
}
 }

