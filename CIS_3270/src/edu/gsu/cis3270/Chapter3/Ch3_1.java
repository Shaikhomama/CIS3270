package edu.gsu.cis3270.Chapter3;

import java.util.Scanner;
/*
 * (Algebra: solve quadratic equations ) The two roots of a quadratic equation
 * ax2 + bx + c = 0 can be obtained using the following formula:
 * r1 = -b + sqrt(b2 - 4ac) / 2a 
 * and 
 * r2 = -b - sqrt(b2 - 4ac) / 2a
 * b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
 * equation has two real roots. If it is zero, the equation has one root. If it is negative,
 * the equation has no real roots.
 * Write a program that prompts the user to enter values for a, b, and c and displays
 * the result based on the discriminant. If the discriminant is positive, display two
 * roots. If the discriminant is 0, display one root. Otherwise, display “The equation
 * has no real roots”
 */
public class Ch3_1 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = Math.pow(b,2) - 4 * a * c;
		double r1 = (-b + Math.pow(discriminant, 0.5))/2;
		double r2 = (-b - Math.pow(discriminant, 0.5))/2;
		
		if (discriminant > 0) {
			System.out.println("The squation has two roots" + r1 + " and "+ r2); }
		else if (discriminant == 0 && r1 == r2) {
			System.out.println("The equation has one root " + r1 );
		}
		else {
			System.out.println("The equation has no real roots.");
		}
	}
}