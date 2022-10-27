package edu.gsu.cis3270.Chapter4;

import java.util.Scanner;

/*
 * (Phone key pads) The international standard letter/number mapping.
 * Write a program that prompts the user to enter a letter and displays its 
 * corresponding number.
 */
public class Chap4_15 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String letter = input.nextLine();
		char ch = letter.charAt(0);
		ch = Character.toUpperCase(ch);
		
		if (ch == 'A' || ch == 'B' || ch == 'C') {
			System.out.println("The corresponding number is 2");
		}
		else if (ch == 'D' || ch == 'E' || ch == 'F') {
			System.out.println("The corresponding number is 3");
		}
		else if (ch == 'G' || ch == 'H' || ch == 'I') {
			System.out.println("The corresponding number is 4");
		}
		else if (ch == 'J' || ch == 'K' || ch == 'L') {
			System.out.println("The corresponding number is 5");
		}
		else if (ch == 'M' || ch == 'N' || ch == 'O') {
			System.out.println("The corresponding number is 6");
		}
		else if (ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S') {
			System.out.println("The corresponding number is 7");
		}
		else if (ch == 'T' || ch == 'U' || ch == 'V') {
			System.out.println("The corresponding number is 8");
		}
		else if (ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z') {
			System.out.println("The corresponding number is 9");
		}
		else {
			System.out.println(letter + " is an invalid input");
		}
	}

}
