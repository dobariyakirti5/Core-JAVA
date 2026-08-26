package com.core;

public class WhatsappMessages {
	public static void main(String[] args) {
		String unreadMessage="12";
		int messageCount=Integer.parseInt(unreadMessage);
		
		messageCount=messageCount+5;
		String updatedCount=String.valueOf(messageCount);
		System.out.println("Updated unread message:"+updatedCount);
	}

}
