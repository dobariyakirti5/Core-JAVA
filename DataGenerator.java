package com.core;

import java.util.Random;

public class DataGenerator {
	public static String generateUsername() {

        Random r = new Random();

        int number = r.nextInt(10000);

        return "user" + number + "@gmail.com";
    }

    public static String generatePassword() {

        Random r = new Random();

        int number = r.nextInt(10000);

        return "Flip@" + number;
    }
}


