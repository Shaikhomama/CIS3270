package edu.gsu.cis3270.Chapter2;

import java.util.Scanner;

/*(Find the number of years ) Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the number of years and days for the 
 * minutes. For simplicity, assume a year has 365 days
*/
public class Ch2_7 {
	public static void main(String []  args)  {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the number of minutes:");
			
			int minutes = input.nextInt();
			int year = minutes / 525600;
			int days = (minutes / 525600) - 365;
			
			System.out.println(minutes+" is approximately "+year+" years and "+ days+ " days.");
			
	}

}
