package com.core;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;


public class IPLHighScore {
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("ipl_scores.txt");
		BufferedReader br = new BufferedReader(fr);

		FileWriter fw = new FileWriter("high_scores.txt");

		String s;

		while ((s = br.readLine()) != null) {

			String[] data = s.split(" ");

			int score = Integer.parseInt(data[data.length - 1]);

			if (score > 180) {
				fw.write(s + "\n");
			}
		}

		fw.flush();
		fw.close();
		br.close();
		fr.close();

		System.out.println("High scores written successfully");
	}
}