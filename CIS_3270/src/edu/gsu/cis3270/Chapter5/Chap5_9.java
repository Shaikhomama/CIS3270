package edu.gsu.cis3270.Chapter5;

import java.util.Scanner;
/*
 * (Find the two highest scores) Write a program that prompts the user to enter the
 * number of students and each student’s name and score, and finally displays the
 * student with the highest score and the student with the second-highest score
 */
public class Chap5_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int numOfStudents = input.nextInt();
		int n = 0;	
		
		String name = "";
		String student1 = "";
		String student2 = "";
		
		int score = 0;
		int highestScore = 0;
		int secondHighestScore = 0;
		
		while (n < numOfStudents) {
			n += 1;
			System.out.print("Student " + n + " Name: ");
			name = input.next();
			System.out.print("Student " + n + " Grade: ");
			score = input.nextInt();
			
			if (n == 0) {
				highestScore = score;
				student1 = name;
			}
			else if (n == 1 && score > highestScore) {
				highestScore = score;
				secondHighestScore= highestScore;
				student1 = name;
				student2 = student1;
			}
			else if (n == 1) {
				secondHighestScore = score;
				student2 = name;
			}
			else if (n > 1 && score > highestScore && score > secondHighestScore) {
				secondHighestScore = highestScore;
				highestScore = score;
				student2 = student1;
				student1 = name;
			}
			else if (n > 1) {
				secondHighestScore = score;
				student2 = name;
			}
		}
		System.out.println("The Highest Score was "+ highestScore + " from " + student1);
		System.out.println("The Second Highest Score was "+ secondHighestScore + " from " + student2);
	
	}
}
