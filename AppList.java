package com.core;

public class AppList {
	public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("WhatsApp");
        sb.append(", ");
        sb.append("Instagram");
        sb.append(", ");
        sb.append("Zomato");
        sb.append(", ");
        sb.append("Flipkart");

        System.out.println("Original List: " + sb.toString());

        sb.replace(28, 36, "Spotify");

        System.out.println("Updated List: " + sb.toString());
    }

}
