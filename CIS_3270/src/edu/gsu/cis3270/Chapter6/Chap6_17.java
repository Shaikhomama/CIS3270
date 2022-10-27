package edu.gsu.cis3270.Chapter6;

import java.util.Scanner;
/*
 * (Display matrix of 0s and 1s) Write a method that displays a n-by-n matrix using
 * the following header:
 * public static void printMatrix(int n)
 * Each element is 0 or 1, which is generated randomly. Write a test program that
 * prompts the user to enter n and displays an n-by-n matrix. 
 */
public class Chap6_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();

		printMatrix(n);
	}

	public static void printMatrix(int n) {
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < n; c ++) {
				// Prints random 1 or 0
				System.out.print(" " + (int)(Math.random() * 2));
			}
			System.out.println();
		}
	}

}
