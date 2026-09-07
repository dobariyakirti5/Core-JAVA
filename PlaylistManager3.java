package com.core;
import java.util.ArrayList;
import java.util.Scanner;

public class PlaylistManager3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Song> playlist = new ArrayList<Song>();

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

                System.out.print("Enter song title: ");
                String title = sc.nextLine();

                System.out.print("Enter artist name: ");
                String artist = sc.nextLine();

                Song song = new Song(title, artist);

                playlist.add(song);

                System.out.println("Song added successfully!");
                System.out.println("Playlist: " + playlist);

                break;

            case 2:

                System.out.println("Playlist: " + playlist);

                break;

            case 3:

                System.out.print("Enter song title to remove: ");
                String removeTitle = sc.nextLine();

                boolean found = false;

                for (Song s : playlist) {

                    if (s.title.equalsIgnoreCase(removeTitle)) {

                        playlist.remove(s);
                        found = true;

                        System.out.println("Song removed successfully!");

                        break;
                    }
                }

                if (!found) {

                    System.out.println("Song not found!");
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
