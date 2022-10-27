package edu.gsu.cis3270.Chapter5;

public class Chap5_18_PatternA {
	public static void main(String[] args) {
		System.out.println("Pattern A");
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
