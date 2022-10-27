package edu.gsu.cis3270.Chapter5;

import java.util.Scanner;

/*
 * (Financial application: compare loans with various interest rates) Write a pro-
 * gram that lets the user enter the loan amount and loan period in number of years
 * and displays the monthly and total payments for each interest rate starting from
 * 5% to 8%, with an increment of 1/8.
 */
public class Chap5_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years: ");
		int numOfYears = input.nextInt();
		
		System.out.println("Interest Rate    Monthly Payment    Total Payment");
		
		for (double i = 5.0; i <= 8.0; i += 0.125) {
			System.out.printf(" %.3f", i);
			System.out.print(" %          ");
			
			double monthlyInterestRate = i / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate / 
								(1- 1 / Math.pow(1 + monthlyInterestRate, numOfYears * 12));
			
			System.out.printf("%-19.2f", monthlyPayment);
			System.out.printf("%.2f\n",(monthlyPayment * 12) * numOfYears);
		}
	}

}
