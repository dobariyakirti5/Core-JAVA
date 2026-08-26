package com.core;

public class MytraDiscount {
	public static void main(String[] args) {
		
		double cartvalue=1800.50;
		boolean isloggedIn=true;
		boolean isFirstOrder=true;
		
		boolean eligible=cartvalue>=1500
				&& isloggedIn==true
				&& isFirstOrder==true;
	
	System.out.println("Discount Eligible:"+eligible);
	}
}
