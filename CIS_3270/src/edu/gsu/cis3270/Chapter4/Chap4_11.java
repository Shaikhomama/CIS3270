package edu.gsu.cis3270.Chapter4;

import java.util.Scanner;

/*
 * (Decimal to hex) Write a program that prompts the user to enter an integer between
 * 0 and 15 and displays its corresponding hex number. 
 */
public class Chap4_11 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal value (0 to 15):\n");
		int value = input.nextInt();
		
		if (value >= 1 && value <= 15) {
			System.out.println("The hexadecimal of " + value + " is " + Integer.toHexString(value).toUpperCase());
		}
		else {
		System.out.println("The input is invalid.");
		}
	}

}
