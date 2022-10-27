package edu.gsu.cis3270.Chapter5;

public class Chap5_18_PatternC {
	public static void main (String [] args) {
		System.out.println("Pattern C");
		int i = 1;
		int j;
		
		for (i = 1; i <= 6; i++) {
			for( j = 6 - i; j >= 1; j--) { 
				System.out.print("  ");
			}
			for (int c = i; c >= 1; c--) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}

}
