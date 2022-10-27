package edu.gsu.cis3270.Chapter6;

import java.util.Scanner;
/*
 * (Sum the digits in an integer) Write a method that computes the sum of the digits
 * in an integer. Use the following method header:
 * 		public static int sumDigits(long n)
 * For example, sumDigits(234) returns 9 (2 + 3 + 4).(Hint: Use the% operator to 
 * extract digits, and the / operator to remove the extracted digit. For instance,
 * to extract 4 from 234, use234 % 10( = 4). To remove 4 from 234, use234 / 10
 * (= 23). Use a loop to repeatedly extract and remove the digit until all the digits
 * are extracted. Write a test program that prompts the user to enter an integer and
 * displays the sum of all its digits.
 */
public class Chap6_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		long num = input.nextLong();
		System.out.println("The sum of " + num + " is " +sumDigits(num));

	}
	public static int sumDigits(Long n) {
		int sum = 0;
		int digit = 0;
		int num = (int)Math.abs(n);
		
		while(num != 0) {
			digit = num % 10;
			sum += digit;
			num = num /10;
		}
		return sum;
	}

}
