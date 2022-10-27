package edu.gsu.cis3270.Chapter5;

import java.util.Scanner;

/*
 * (Statistics: compute mean and standard deviation) In business applications, you
 * are often asked to compute the mean and standard deviation of data. The mean is
 * simply the average of the numbers. The standard deviation is a statistic that tells
 * you how tightly all the various data are clustered around the mean in a set of data.
 * For example, what is the average age of the students in a class? How close are the
 * ages? If all the students are the same age, the deviation is 0.
 * Write a program that prompts the user to enter ten numbers, and displays the
 * mean and standard deviations of these numbers
 */
public class Chap5_45 {

	public static void main(String[] args) {
		double mean = 0; 				
		double standard_deviation = 0; 		
		
		Scanner input = new Scanner(System.in);				
		System.out.print("Enter ten numbers: ");

		for (int i = 1; i <= 10; i++) {
			double number = input.nextDouble();
			mean += number;
			standard_deviation += Math.pow(number, 2); 
		}
		
		standard_deviation = Math.sqrt((standard_deviation - (Math.pow(mean, 2) /10)) / (10 - 1));
		mean = mean / 10;

		
		System.out.println("The mean is " + mean);
		System.out.println("The standard deviation is " + standard_deviation);

	}

}
