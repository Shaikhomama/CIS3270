package edu.gsu.cis3270.Chapter5;

public class Chap5_18_PatternB {
	public static void main (String [] args) {
		System.out.println("Pattern B");
		
		for (int i = 6; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
