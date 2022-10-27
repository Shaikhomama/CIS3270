package edu.gsu.cis3270.Chapter2;

import java.util.Scanner;
/* (Financial application: calculate tips ) Write a program that reads the subtotal
 * and the gratuity rate, then computes the gratuity and total. For example, if the
 * user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
 * as gratuity and $11.5 as total.
 */

public class Chap2_5 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal:");
		double subtotal = input.nextDouble();
		System.out.println("Enter the gratuity rate:");
		double gratuityRate = input.nextDouble();
		
		// calculate gratuity and total.
		double gratuity = subtotal *( gratuityRate / 100);
		double total = subtotal + gratuity;
		
		System.out.println("The gratuity is $" + gratuity + " and the total is $"+ total);
		

	}
}
