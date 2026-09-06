package com.core;
import java.io.FileWriter;
import java.io.IOException;

public class PlayListex {
	public static void main(String[] args) {
		try {
            FileWriter fw = new FileWriter("my_playlist.txt");

            fw.write("Perfect - Ed Sheeran\n");
            fw.write("Shape of You - Ed Sheeran\n");
            fw.write("Believer - Imagine Dragons\n");
            fw.write("Love Me Like You Do - Ellie Goulding\n");
            fw.write("Closer - The Chainsmokers\n");

            fw.close();

            System.out.println("Songs written successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

		
	}


