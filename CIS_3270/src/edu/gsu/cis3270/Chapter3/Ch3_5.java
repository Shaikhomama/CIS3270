package edu.gsu.cis3270.Chapter3;
import java.util.Scanner;
/*
 * (Find future dates) Write a program that prompts the user to enter an integer for
 * today’s day of the week (Sunday is 0, Monday is 1, ..., and Saturday is 6). Also
 * prompt the user to enter the number of days after today for a future day and dis-
 * play the future day of the week. 
 */
public class Ch3_5 {
	public static String dates( int today) {
		today = today % 7;
		switch (today) {
		case 0: return "Sunday";
		case 1: return "Monday";
		case 2: return "Tuesday";
		case 3: return "Thursday";
		case 4: return "Friday";
		case 5: return "Saturday";
		case 6: return "Sunday";
		}
		return "";
	}
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of todays day: "); // Sun is 0, Mon is 1, Tue is 2, Wed is 3, Thur is 4, Fri is 5, Sat is 6
		int today =  input.nextInt();
		
		System.out.println("Enter the number of days elapsed since today: ");
		int elapsedDays = input.nextInt();
		int futureDate = (today + elapsedDays) % 7;
		
		if (futureDate == 0){
			System.out.println("Today is " + dates(today) + " and the future day is Sunday");
        }else if(futureDate == 1){
        	System.out.println("Today is " + dates(today) + " and the future day is Monday");
        }else if(futureDate == 2){
        	System.out.println("Today is " + dates(today) + " and the future day is Tuesday");
        }else if(futureDate == 3){
        	System.out.println("Today is " + dates(today) + " and the future day is Wednesday");
        }else if(futureDate == 4){
        	System.out.println("Today is " + dates(today) + " and the future day is Thursday");
        }else if(futureDate == 5){
        	System.out.println("Today is " + dates(today) + " and the future day is Friday");
        }else if(futureDate == 6){
        	System.out.println("Today is " + dates(today) + " and the future day is Saturday");
        }
	}

}
