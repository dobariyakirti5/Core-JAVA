package com.core;

public class PriceFilter {
	public static void main(String[] args) {
		int price[]= {500,1200,800,1500,999,2000};
		int i=0;
		while(i<price.length) {
			if(price[i]<=1000) {
				System.out.println(price[i]);
			}
			i++;
	}
	}
}
