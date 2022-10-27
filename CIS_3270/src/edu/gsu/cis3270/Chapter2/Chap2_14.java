package edu.gsu.cis3270.Chapter2;
import java.util.Scanner;

// Calculate BMI

public class Chap2_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter you weight in pounds: ");
		double weight = input.nextDouble();
		System.out.println("Enter you height in inches: ");
		double height = input.nextDouble();
		
		final double KG_PER_POUND = 0.45359237;
		final double METERS_PER_INCH =  0.0254;
		
		double bmi = (weight * KG_PER_POUND) / Math.pow(height * METERS_PER_INCH, 2);
		
		System.out.println("BMI is " + bmi);
	}

}
