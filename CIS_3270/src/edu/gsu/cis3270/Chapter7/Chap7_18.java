package edu.gsu.cis3270.Chapter7;

import java.util.Scanner;

/*
 * (Bubble sort) Write a sort method that uses the bubble-sort algorithm. The bubble-
 * sort algorithm makes several passes through the array. On each pass, successive
 * neighboring pairs are compared. If a pair is not in order, its values are swapped;
 * otherwise, the values remain unchanged. The technique is called a bubble sort or
 * sinking sort because the smaller values gradually “bubble” their way to the top
 * and the larger values “sink” to the bottom. Write a test program that reads in ten
 * double numbers, invokes the method, and displays the sorted numbers.
 */
public class Chap7_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		double[] list = new double[10];
		
		//Receives input values
		for( int i = 0; i < list.length; i++) {
			list[i] = input.nextDouble();
		}
		
		bubbleSort(list); // invokes the method
		for (double values: list) {
			System.out.print(values + " ");
		}
		System.out.println();

	}
	public static void bubbleSort(double[] list) {
		double temp;
		boolean sort;

		do {
			sort = false; 
			for (int i = 0; i < list.length - 1; i++) {
				
				if (list[i] > list[i + 1]) {
					temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
					sort = true;
				}
			}
		} while (sort);
	}

}
