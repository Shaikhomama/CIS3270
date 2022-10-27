package edu.gsu.cis3270.Chapter6;

import java.util.Scanner;

/*
 * (Sort three numbers) Write a method with the following header to display three
 * numbers in increasing order:
 * public static void displaySortedNumbers(double num1, double num2, double num3)
 * Write a test program that prompts the user to enter three numbers and invokes the
 * method to display them in increasing order
 */
public class Chap6_5 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		displaySortedNumbers(num1, num2, num3);
	}
	public static void displaySortedNumbers(double num1, double num2, double num3) {

		double temp = 0;
		double max = Math.max(Math.max(num1, num2), num3);
		double min = Math.min(Math.min(num1, num2), num3);
		
		if (num1 != max && num1 != min) {
			temp = num1;
			num1 = min;	
			num3 = max;
			num2 = temp;
		}
		else if (num2 != max && num2 != min) {
			temp = num2;
			num1 = min;	
			num3 = max;
			num2 = temp;
		}
		else if (num3 != max && num3 != min) {
			temp = num3;
			num1 = min;	
			num3 = max;
			num2 = temp;
		}
		
		
		System.out.println(min + ", " + num2 + ", "+ max);
	
	}

}
