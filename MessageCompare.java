package com.core;

public class MessageCompare {
	public static void main(String[] args) {
		
		String expectedMessage="payment Successful";
		String actualMessage="payment Successful";
		
		if(expectedMessage.equalsIgnoreCase(actualMessage)){
		 System.out.println("Message Match");	
		}else {
			System.out.println("Messages Do Not Match");
		}
	}

}
