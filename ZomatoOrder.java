package com.core;

public class ZomatoOrder {
	public static void placeorder(String restaurant,int amount) {
		
		if(amount<1) {
			throw new IllegalArgumentException("Order amount must be greater than 0");
			
		}
		System.out.println("Order Placed successfully from: "+restaurant);
	  System.out.println("Amount:"+amount);
	}
 public static void main(String[] args) {
	try {
		placeorder("Dominos",40);
		
	}catch(IllegalArgumentException e) {
		System.out.println("Error:Invalid order amount");
	}
}
}
