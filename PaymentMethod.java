package com.core;

import java.util.Scanner;

public class PaymentMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter Payment Method:");
		String payment=sc.nextLine();
		
		switch(payment) {
		
		case "Paytm":
			System.out.println("payment selected through paytm");
			break;
			
		case "Phonepe":
			System.out.println("Payment selected through Phonepe");
			break;
			
		case "UPI":
			System.out.println("Payment selected through UPI");
			break;
	   
		case "CreaditCard":
			System.out.println("Payment Selected through Creadit Card");
			break;
			
		default:
			System.out.println("Invalid payment method");
		}
		sc.close();
	}

}
