package com.core;

import java.util.ArrayList;
import java.util.Scanner;

public class PlaylistManager1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> playlist = new ArrayList<String>();

        int choice;

        do {

            System.out.println("\n1. Add Song");
            System.out.println("2. View Playlist");
            System.out.println("3. Remove Song");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:

                System.out.print("Enter song name: ");
                String song = sc.nextLine();

                playlist.add(song);

                System.out.println("Song added successfully!");
                System.out.println("Playlist: " + playlist);

                break;

            case 2:

                System.out.println("Playlist: " + playlist);

                break;

            case 3:

                System.out.print("Enter song name to remove: ");
                String removeSong = sc.nextLine();

                try {

                    if (!playlist.contains(removeSong)) {

                        throw new Exception("Song not found");

                    }

                    playlist.remove(removeSong);

                    System.out.println("Song removed successfully!");

                } catch (Exception e) {

                    System.out.println("Error logged: " + e.getMessage());

                }

                System.out.println("Playlist: " + playlist);

                break;

            case 4:

                System.out.println("Exiting Playlist Manager...");

                break;

            default:

                System.out.println("Invalid choice!");

            }

        } while (choice != 4);

        sc.close();
    }


}
