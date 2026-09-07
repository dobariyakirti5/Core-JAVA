package com.core;

public class LoginTest {
	public static void main(String[] args) {

        String username = "testuser";

        if (ValidationUtils.isValidUsername(username)) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }
    }

}
