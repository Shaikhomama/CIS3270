package edu.gsu.cis3270.Chapter5;

import java.util.Scanner;
/*
 * (Longest common prefix) Write a program that prompts the user to enter two
 * strings and displays the largest common prefix of the two strings.
 */
public class Chap5_51 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String first = input.nextLine();
		System.out.println("Enter the second string: ");
		String second = input.nextLine();
						
		String prefix = "";	
		int index = 0;

		
		while (first.charAt(index) == second.charAt(index)) {
			prefix += first.charAt(index);
			index++;
		}

		
		if (prefix.length() > 0)
			System.out.println("The commmon prefix is \"" + prefix + "\".");
		else
			System.out.println(first + " and " + second +
				" have no commmon prefix.");

	}

}
