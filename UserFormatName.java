package com.core;

public class UserFormatName {
	public static String formatUserName(String name) {

        return name.toUpperCase() + " (" + name.length() + ")";
    }

    public static void main(String[] args) {

        String result = formatUserName("Virat");

        System.out.println(result);
    }


}
