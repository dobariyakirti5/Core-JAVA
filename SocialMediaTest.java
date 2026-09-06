package com.core;
 
abstract class SocialMediaPost{
	abstract void share();
	
}
class InstagramPost extends SocialMediaPost{
	public void share() {
		System.out.println("Post Shared On Instagram");
	}
	
}
class TwitterPost extends SocialMediaPost{
	 public void share() {
		 System.out.println("Post share On Twitter");
	 }
}
public class SocialMediaTest {
	public static void main(String[] args) {
		SocialMediaPost p1=new InstagramPost();
		p1.share();
		
		SocialMediaPost p2=new TwitterPost();
		p2.share();
	}

}
