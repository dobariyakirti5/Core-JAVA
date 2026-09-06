package com.core;
 class PaymentMethodEx {
	public void pay() {
		System.out.println("payment processing...");
	}
}
class UpiPayment extends PaymentMethodEx{
	public void pay() {
		System.out.println("payment successful using UPI");
	}
}

class CardPayment extends PaymentMethodEx{
	public void pay() {
		System.out.println("Payment Successful using Card");
	}
public class PaymentMethodtest{
	public static void main(String[] args) {
		PaymentMethodEx p1=new UpiPayment();
		p1.pay();
		
		PaymentMethodEx p2=new CardPayment();
		p2.pay();
	}
}
}



