package com.core;
import java.util.HashSet;
public class InstagramLikes {
	public static void main(String[] args) {

        HashSet<String> usernames = new HashSet<>();

        usernames.add("kirti");
        usernames.add("kiva");
        usernames.add("priya");
        usernames.add("kirti");    
        usernames.add("vani");
        usernames.add("kiva");  

        System.out.println("Unique usernames who liked the post:");

        for (String username : usernames) {
            System.out.println(username);
        }
    }
}


