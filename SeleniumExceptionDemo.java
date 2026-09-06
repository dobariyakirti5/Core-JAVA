package com.core;

public class SeleniumExceptionDemo {
	 public static void simulateElementClick(boolean isElementPresent) {

	        if (!isElementPresent) {
	            throw new RuntimeException("Element not found");
	        }

	        System.out.println("Element clicked successfully");
	    }

	    public static void main(String[] args) {

	        try {

	            simulateElementClick(false);

	        } catch (RuntimeException e) {

	            System.out.println("Element not found, automation failed.");
	        }
}
}
