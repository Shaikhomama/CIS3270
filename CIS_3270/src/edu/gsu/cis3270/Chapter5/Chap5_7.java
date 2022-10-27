package edu.gsu.cis3270.Chapter5;

/*
 * (Financial application: compute future tuition) Suppose that the tuition for a 
 * university is $10,000 this year and increases 5% every year. In one year, the tuition
 * will be $10,500. Write a program that computes the tuition in ten years and the
 * total cost of four years’ worth of tuition after the tenth year.
 */
public class Chap5_7 {
	public static void main(String [] args) {
		double tuition = 10000;
		double annualIncrPercentage = 0.05;
    
		double tuitionInTenYears = 0;
		double fourYearsOfTuition= 0;

		for (int i = 1; i <= 14; i++){
			tuition += tuition * annualIncrPercentage; 
        
			if (i == 10)
				tuitionInTenYears = tuition;

			if (i == 11 || i == 12| i == 13 || i == 14)
				fourYearsOfTuition += tuition;
    }

    System.out.printf("Tuition cost in 10 years is: $%.2f%n" + 
    				  "Four years of tuition after 10 years is: $%.2f%n", 
    				   tuitionInTenYears, fourYearsOfTuition);
	}
}
