package com.core;

class LyricsNotFoundException extends Exception{
	
public LyricsNotFoundException(String message) {	
	super(message);
		
	}
}

public class SongLyrics {
	public static void fetchSongLyrics(String songName)
		throws LyricsNotFoundException{
			throw new LyricsNotFoundException("Lyrics not available");
		}
public static void main(String[] args) {
	
	try {
		fetchSongLyrics("Perfect");
		
      }catch(LyricsNotFoundException e) {
    	  System.out.println("Lyric not found for this song");
      }
	}

}
