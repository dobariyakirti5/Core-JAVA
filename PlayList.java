package com.core;

public class PlayList {
	String playlistName;
	int totalSongs;
	public PlayList(String playlistname, int totalSongs) {
	
		this.playlistName = playlistname;
		this.totalSongs = totalSongs;
	}
	public static void main(String[] args) {
		
		PlayList p=new PlayList("My Favorites",25);
		System.out.println("Playlist name:"+p.playlistName);
		System.out.println("Total Songs:"+p.totalSongs);
	}
	
	

}
