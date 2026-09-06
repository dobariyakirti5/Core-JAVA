package com.core;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ZomatoOrderLog {
	public static void addOrder(String orderDetails) throws IOException {

		FileWriter fw = new FileWriter("zomato_orders.log", true);

		LocalDateTime now = LocalDateTime.now();

		DateTimeFormatter format =
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		String dateTime = now.format(format);

		String order = dateTime + " - Ordered: " + orderDetails;

		fw.write(order + "\n");
		fw.close();

		System.out.println(order);
	}

	public static void main(String[] args) throws IOException {

		addOrder("Paneer Tikka");
		addOrder("Masala Dosa");
		addOrder("Veg Biryani");
	}
}


