package com.core;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader; 
import java.io.IOException;

public class TestResultLogger {
	
	public static void recordTest(String testName, String status) throws IOException { 
		FileWriter fw = new FileWriter("test_results.txt", true); 
		fw.write(testName + " - " + status + "\n"); fw.flush(); fw.close();
		} 
	
	public static void main(String[] args) throws IOException { 
		recordTest("Login Test", "PASS"); recordTest("Search Test", "PASS"); recordTest("Payment Test", "FAIL");
		System.out.println("Test results saved successfully"); FileReader fr = new FileReader("test_results.txt");
		BufferedReader br = new BufferedReader(fr); String s; System.out.println("\nSaved Test Results:");
		while ((s = br.readLine()) != null) { System.out.println(s);
		}
		br.close();
		fr.close();
		}
	}

