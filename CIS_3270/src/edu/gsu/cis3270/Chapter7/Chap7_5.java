package edu.gsu.cis3270.Chapter7;

import java.util.Scanner;
/*
 * (Print distinct numbers) Write a program that reads in ten numbers and displays
 * the number of distinct numbers and the distinct numbers separated by exactly one
 * space (i.e., if a number appears multiple times, it is displayed only once). ( Hint:
 * Read a number and store it to an array if it is new. If the number is already in the
 * array, ignore it.) After the input, the array contains the distinct numbers. 
 */
public class Chap7_5 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter ten numbers: ");
			
		int [] distinct = new int[10]; // max values
		int num;
		int count = 0;
			
		for (int i = 0; i < 10; i++) {
				num = input.nextInt();
				if (isDistinct(distinct, num)) {
					distinct[i] = num;
					count++;
				}
		}
		System.out.println("The number of distinct numbers is " + count);
		System.out.println("The distinct numbers are ");
		for (int i = 0; i < 10; i++) {
			if (distinct[i] > 0) // add if statement to not shows the 0 values
				System.out.print(distinct[i] + " ");
		}
	
			
		
	}
	// tests if the number is distinct in the array
	public static boolean isDistinct(int [] array, int number) {
		for (int i = 0; i < 10; i++) {
			if (number == array[i]) {
				return false;	
			}
		}
		return true;
	}
}



	

