package com.core;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;


public class FavMovies {
	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("fav_movies.txt");

		String s = "3 Idiots\nDangal\nKGF\nPushpa\nRRR";

		fw.write(s);
		fw.flush();
		fw.close();

		System.out.println("File Written Successfully");

		FileReader fr = new FileReader("fav_movies.txt");

		int i;

		while ((i = fr.read()) != -1) {
			System.out.print((char)i);
		}

		fr.close();
	}
}
