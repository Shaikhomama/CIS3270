package edu.gsu.cis3270.Chapter5;
import java.util.Scanner;
/*
 * (Count positive and negative numbers and compute the average of numbers) Write
 * a program that reads an unspecified number of integers, determines how many
 * positive and negative values have been read, and computes the total and average of
 * the input values (not counting zeros). Your program ends with the input0. Display
 * the average as a floating-point number. 
 */
public class Chap5_1 {
	public static void main(String[] args) {
		int positives = 0;
		int negatives = 0;
		int count = 0;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer, the input ends if 0: ");
		int number = input.nextInt();
		
		if (number == 0) {
			System.out.println("No numbers are entered except 0");
			System.exit(1);
		}

		while (number != 0) {
			if (number > 0) {
				++positives;
			}
			else {
				++negatives;
			}
			count += 1;
			sum += number ;
			number = input.nextInt();
		}
		
		System.out.println("The number of positives are " + positives);
		System.out.println("The number of negatives are " + negatives);
		System.out.println("The total is " + (double)sum);
		System.out.println("The average is " + (float)sum/count);
		
	}

}
