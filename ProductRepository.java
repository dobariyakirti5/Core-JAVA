package com.core;

public class ProductRepository {
	String products[][] = {
			{"Laptop", "50000"},
			{"Mobile", "25000"},
			{"Headphones", "3000"},
			{"Keyboard", "1500"},
			{"Mouse", "800"}
	};

	public double getProductByName(String name) {

		for (int i = 0; i < products.length; i++) {

			if (products[i][0].equalsIgnoreCase(name)) {
				return Double.parseDouble(products[i][1]);
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		ProductRepository pr = new ProductRepository();

		double price = pr.getProductByName("Mobile");

		System.out.println("Product Price = " + price);
	}
}