package com.core;

public class SpecialOffer {
	public static void main(String[] args) {
		String membershipType="Prime";
		int loyaltyPoints=600;
		
		if(membershipType.equals("Prime")) {
			
			if(loyaltyPoints>500) {
				System.out.println("Eligible for offer");
				
			}else {
				System.out.println("Not Eligible");
			}
		}else {
			System.out.println("Not Eligible");
		}
	}

}
