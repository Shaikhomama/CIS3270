package edu.gsu.cis3270.Chapter7;

import java.util.Scanner;
/*
 * (Assign grades) Write a program that reads student scores, gets the best score,
 * and then assigns grades based on the following scheme:
 * Grade is A if score is Ú best - 10
 * Grade is B if score is Ú best - 20;
 * Grade is C if score is Ú best - 30;
 * Grade is D if score is Ú best - 40;
 * Grade is F otherwise.
 * The program prompts the user to enter the total number of students, then prompts
 * the user to enter all of the scores, and concludes by displaying the grades. 
 */
public class Chap7_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int student = input.nextInt();
		double [] score = new double [student]; //Receives the number of students in the score list
		
		// input values in the array
		System.out.println("Enter the scores: ");
		for (int i = 0; i < score.length; i++) {
			score [i] = input.nextDouble();
		}
		
		// find the best score
		double best = score[0];
		for (int i = 1; i < score.length; i++ ) {
			if (score[i] > best ) 
				best = score[i];
		}
		// displays scoring
		for (int i = 0; i < score.length; i++) {
			if (score[i] >= best - 10) {
				System.out.println("Student "+ i + " is " + score[i] + " and grade is A");
			}
			else if (score[i] >= best - 20) {
				System.out.println("Student "+ i + " is " + score[i] + " and grade is B");
			}
			else if (score[i] >= best - 30) {
				System.out.println("Student "+ i + " is " + score[i] + " and grade is C");
			}
			else if (score[i] >= best - 40) {
				System.out.println("Student "+ i + " is " + score[i] + " and grade is D");
			}
			else {
				System.out.println("Student "+ i + " is " + score[i] + " and grade is F");
			}
		}
	}

}
