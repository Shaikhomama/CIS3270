package edu.gsu.cis3270.Chapter6;

import java.util.Scanner;

/*
 * (Occurrences of a specified character) Write a method that finds the number of
 * occurrences of a specified character in a string using the following header:
 * public static int count(String str, char a)
 */

public class Chap6_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		System.out.println("Enter a character: ");
		char a = input.next().charAt(0);
		
		System.out.print("The number of occurences is " + count(str, a));
	}
	
	public static int count(String str, char a) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) 
				count++;
		}
		return count;
	}

}
