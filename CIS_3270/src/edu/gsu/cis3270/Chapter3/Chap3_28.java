package edu.gsu.cis3270.Chapter3;

import java.util.Scanner;
/*
 * (Geometry: two rectangles ) Write a program that prompts the user to enter the
 * center x-, y-coordinates, width, and height of two rectangles and determines
 * whether the second rectangle is inside the first or overlaps with the firs
 */
public class Chap3_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// r1
		System.out.println("Enter r1's center x-, y-coordinates, width, and height: ");
		double r1_x = input.nextDouble();
		double r1_y = input.nextDouble();
		double r1_width = input.nextDouble();
		double r1_height= input.nextDouble();
		
		//r2
		System.out.println("Enter r1's center x-, y-coordinates, width, and height: ");
		double r2_x = input.nextDouble();
		double r2_y = input.nextDouble();
		double r2_width = input.nextDouble();
		double r2_height= input.nextDouble();
		
		if	((Math.pow(Math.pow(r2_y - r1_y, 2), .05) + r2_height / 2 <= r1_height / 2) && 
			(Math.pow(Math.pow(r2_x - r1_x, 2), .05) + r2_width / 2 <= r1_width / 2) &&
			(r1_height / 2 + r2_height / 2 <= r1_height) &&
			(r1_width / 2 + r2_width / 2 <= r1_width)) {
			System.out.println("r2 is inside r1"); }
		else if ((r1_x + r1_width / 2 > r2_x - r2_width) ||
				(r1_y + r1_height / 2 > r2_y - r2_height)) {
			System.out.println("r2 overlaps r1"); }
		else
			System.out.println("r2 does not overlap r1");
	}

}
