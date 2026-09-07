package com.core;
import java.util.Scanner;

public class UserLogin {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Username: ");
	        String username = sc.nextLine();

	        System.out.print("Enter Password: ");
	        String password = sc.nextLine();

	        if (username.isEmpty() || password.isEmpty()) {
	            System.out.println("Error: Username and Password cannot be empty");
	        } else {
	            System.out.println("Login successful");
	        }

	        sc.close();
	    }

}
