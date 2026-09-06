package com.core;

public class MovieTicket {
	private String moviename;
	private int seatnumber;
	
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public int getSeatnumber() {
		return seatnumber;
	}
	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}
	
	public static void main(String[] args) {
		MovieTicket t=new MovieTicket();
		
		t.setMoviename("Avengers");
		t.setSeatnumber(25);
		
		System.out.println("Movie Name:"+t.getMoviename());
	   System.out.println("Seat Number:"+t.getSeatnumber());
	}
	
	
}
		
	

