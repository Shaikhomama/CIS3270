package edu.gsu.cis3270.Chapter7;

import java.util.Scanner;
/*
 * (Computing gcd) Write a method that returns the gcd of an unspecified number
 * of integers. The method header is specified as follows:
 * public static int gcd(int... numbers)
 * Write a test program that prompts the user to enter five numbers, invokes the
 * method to find the gcd of these numbers, and displays the gcd
 */
public class Chap7_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five numbers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		int n4 = input.nextInt();
		int n5 = input.nextInt();
		
		int gcd = gcd(n1, n2, n3, n4, n5);
		System.out.println("The GCD is "+ gcd);
	}
	public static int gcd(int n1,int n2,int n3,int n4,int n5) {
		int gcd = 1; // Initial gcd is 1
		int k = 2; // Possible gcd
		
		while (k <= n1 && k <= n2 && k <= n3 && k <= n4 && k <= n5) {
			if (n1 % k == 0 && n2 % k == 0 && n3 % k == 0 && n4 % k == 0 && n5 % k == 0)
				gcd = k; // Update gcd
			k++;
		}
		
		return gcd; // Return gcd
	}

}
