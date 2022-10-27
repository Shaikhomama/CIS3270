package edu.gsu.cis3270.Chapter7;

import java.util.Scanner;

public class Chap7_33 {

	public static void main(String[] args) {
		String [] chineseZodiac = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", 
									"rabbit","dragon", "snake", "horse", "sheep"};
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		int zodiac = year % 12;
		System.out.println("Your chinese zodiac is "+ chineseZodiac[zodiac]);

	}

}
