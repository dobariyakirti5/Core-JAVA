package com.core;

import java.util.Scanner;

public class InstagramLogin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String expectedUsername="instagram";
		String expectedPassword="12345";
		
		System.out.print("Enter Username: ");
		String username=sc.nextLine();
		
		System.out.print("Enter Password: ");
		String password=sc.nextLine();
		
		if(username.equals(expectedUsername)&&password.equals(expectedPassword)) {
		System.out.println("login Successful");
			
		}else {
			System.out.println("Invalid Credentials");
		}
		sc.close();
	}

}
