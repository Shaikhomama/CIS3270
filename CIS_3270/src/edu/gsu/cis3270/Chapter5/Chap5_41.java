package edu.gsu.cis3270.Chapter5;

import java.util.Scanner;

/*(Occurrence of max numbers) Write a program that reads integers, finds the larg-
 * est of them, and counts its occurrences. Assume that the input ends with number
 * 0. Suppose that you entered 3 5 2 5 5 5 0; the program finds that the largest
 * is 5 and the occurrence count for 5 is 4.
 * (Hint: Maintain two variables, max and count. max stores the current max num-
 * ber, and count stores its occurrences. Initially, assign the first number to max
 * and 1 to count. Compare each subsequent number with max. If the number is
 * greater than max, assign it to max and reset count to 1. If the number is equal to
 * max, increment count by 1.)
*/
public class Chap5_41 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int number = input.nextInt();
		int max = number;
		int count = 1;
		
		while (number > 0) {
			number = input.nextInt();
			if (number > max) {
				count = 1;
				max = number;
			}
			else if (number == max) {
				count += 1;
			}
		}
		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + count);
	}

}
