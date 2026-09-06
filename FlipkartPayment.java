package com.core;

public class FlipkartPayment {
	
	    public static void processPayment(int amount) {

	        try {

	            int result = 1000 / amount;

	            System.out.println("Payment result: " + result);

	        } catch (ArithmeticException e) {

	            System.out.println("Cannot divide by zero");

	        } finally {

	            System.out.println("Payment attempt finished");
	        }
	    }

	    public static void main(String[] args) {

	        processPayment(0);
	    }
	}

