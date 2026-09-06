package com.core;
import java.util.ArrayList;


public class ZomatoCuisine {
	 public static void main(String[] args) {

	        
	        ArrayList<String> expected = new ArrayList<>();

	        expected.add("Indian");
	        expected.add("Chinese");
	        expected.add("Italian");
	        expected.add("Mexican");


	        
	        ArrayList<String> actual = new ArrayList<>();

	        actual.add("Indian");
	        actual.add("Chinese");
	        actual.add("Italian");
	        actual.add("Thai");


	        
	        if (actual.containsAll(expected)) {

	            System.out.println("All expected options are available.");

	        } else {

	            
	            ArrayList<String> missing = new ArrayList<>(expected);
	            missing.removeAll(actual);

	            System.out.println("Missing options: " + missing);
	        }


	        
	        ArrayList<String> extra = new ArrayList<>(actual);
	        extra.removeAll(expected);

	        System.out.println("Extra options: " + extra);
	    }
	}
	

