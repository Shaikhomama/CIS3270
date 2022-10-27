package edu.gsu.cis3270.Chapter6;

import java.util.Scanner;

/*
 * (Palindrome integer) Write the methods with the following headers
 * // Return the reversal of an integer, i.e., reverse(456) returns 654
 * 		public static int reverse(int number)
 * // Return true if number is a palindrome
 * 		public static boolean isPalindrome(int number)
 * Use the reverse method to implement isPalindrome. A number is a palin-
 * drome if its reversal is the same as itself. Write a test program that prompts the
 * user to enter an integer and reports whether the integer is a palindrome.
 */
public class Chap6_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
			"a palindrome.");

	}
	public static int reverse(int number) {
		String reverseNumber = ""; 
		String n = number + ""; 
		
		for (int i = n.length() - 1; i >= 0; i--) {
			reverseNumber += n.charAt(i);
		}
		return Integer.parseInt(reverseNumber); 
	}

	public static boolean isPalindrome(int number) {
		return number == reverse(number) ? true : false;
	}
}
