package edu.gsu.cis3270.Chapter5;

import java.util.Scanner;

/*
 * (Display pyramid) Write a program that prompts the user to enter an integer from
 * 1 to 15 and displays a pyramid
 */
 public class Chap5_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int numOfLines = input.nextInt();
		
		for (int rows = 1; rows <= numOfLines; rows++) {
			for (int spaces = numOfLines - rows; spaces >= 1; spaces--) {
				System.out.print("  ");
			}
			
			for (int i = rows; i >= 2; i--) {
				System.out.print(i + " ");
			}
			
			for (int j = 1; j <= rows; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();
		}

	}

}
