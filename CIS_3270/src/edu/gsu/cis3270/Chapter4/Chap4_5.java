package edu.gsu.cis3270.Chapter4;

import java.util.Scanner;
/*
 * (Geometry: area of a regular polygon) A regular polygon is ann-sided polygon in
 * which all sides are of the same length and all angles have the same degree (i.e., the
 * polygon is both equilateral and equiangular). The formula for computing the area
 * of a regular polygon is
 * Area = n * s2 / 4 * tan(pi / n)
 * Here, s is the length of a side. Write a program that prompts the user to enter the
 * number of sides and their length of a regular polygon and displays its are
 */
public class Chap4_5 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of sides: ");
		int lenOfSides = input.nextInt();
		System.out.println("Enter the side: ");
		double side = input.nextDouble();
		
		double area = (lenOfSides * Math.pow(side, 2) / (4 * (Math.tan(Math.PI/lenOfSides))));
		
		System.out.println("The area of a polygon is " + area);		
		
	}

}
