package com.core;

public class ValidationUtils {
    public static boolean isValidUsername(String username) {

        if (username.length() >= 6) {
            return true;
        } else {
            return false;
        }
    }

}
