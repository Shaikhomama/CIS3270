package edu.gsu.cis3270.Chapter7;

import java.util.Scanner;
/*
 * Sort students) Write a program that prompts the user to enter the number of stu-
 * dents, the students’ names, and their scores, and prints student names in decreas-
 * ing order of their scores
 */
public class Chap7_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int numOfStudents = input.nextInt();
		double [] scores = new double [numOfStudents];
		String[] names = new String[numOfStudents];
		double max = scores[0];
		
			
		for (int i = 0; i < scores.length; i++) {
			System.out.print("Enter student "+ i +" 's name: ");
			names[i] = input.next();
			System.out.print("Enter student "+ i +" 's score: ");
			scores[i] = input.nextDouble();
		}
		for (int i = 0; i < scores.length; i++) {
			for (int j = i + 1; j < scores.length;j++) {
				if (scores[j] > scores[i]) {
					int temp = (int) scores[i];
					max = scores[j];
					scores[j]= temp;
				
					String tempst = names[i];
					names[i] = names[j];
					names[j] = tempst;
				}
				
			}
		}
		System.out.println("Decreasing order of student names according to scores:");
		for (String i : names) {
			System.out.println(i);
		}
	}

}
