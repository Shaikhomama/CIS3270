package edu.gsu.cis3270.Chapter3;

import java.util.Scanner;

/*
 * (Palindrome number) Write a program that prompts the user to enter a three-digit
 * integer and determines whether it is a palindrome number. A number is palin-
 * drome if it reads the same from right to left and from left to right.
 */

public class Ch3_12 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three digit integer: ");
		int num = input.nextInt();
		
		int first = num / 100;
		int second = (num % 100) / 10;
		int third = num % 10;
		
		if (first == third) {
			System.out.println(num + " is a palindrome");
		}
		else {
			System.out.println(num + " is not a palindrome");
		}
		
	}

}
