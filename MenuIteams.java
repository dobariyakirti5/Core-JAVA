package com.core;
import java.util.ArrayList;

public class MenuIteams {

	 public static void main(String[] args) {

	        ArrayList<String> menuItems = new ArrayList<>();

	        menuItems.add("Pizza");
	        menuItems.add("Burger");
	        menuItems.add("French Fries");
	        menuItems.add("Pasta");
	        menuItems.add("Cold Coffee");

	        for (String item : menuItems) {

	            System.out.println(item);
	        }
}
}
