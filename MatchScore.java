package com.core;

public class MatchScore {
	public static void main(String[] args) {
		int MatchScore[][]= {
				{120,130,140,150},
				{230,240,250,260},
				{330,340,350,360}};
		 for(int i=0;i<MatchScore.length;i++) {
			 int total=0;
			 
			 for(int j=0;j<MatchScore[i].length;j++) {
		 total=total+MatchScore[i][j];		
		 }	 
		
		 System.out.println("Team"+(i+1)+"Total Runs:"+total);
	}
	}
}

