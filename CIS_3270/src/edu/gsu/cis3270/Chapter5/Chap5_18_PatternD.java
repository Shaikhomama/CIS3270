package edu.gsu.cis3270.Chapter5;

public class Chap5_18_PatternD {
	public static void main (String [] args) {
		System.out.println("Pattern D");
		int i = 1;
		int j;
		
		for ( i = 0; i < 6; i++) {
			for(j= 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int c = 0; c  < 6 - i; c++) {
				System.out.print((c+1) + " ");
			}
			System.out.println();
		}
	}
}
