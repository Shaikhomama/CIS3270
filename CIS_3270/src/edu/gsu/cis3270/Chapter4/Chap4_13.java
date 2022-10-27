package edu.gsu.cis3270.Chapter4;

import java.util.Scanner;

/*
 * (Vowel or consonant?) Write a program that prompts the user to enter a letter and
 * check whether the letter is a vowel or consonant. 
 */
public class Chap4_13 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter grade: ");
		String letter = input.nextLine();
		char character = letter.charAt(0);
		if (Character.isLetter(character)) {
			switch (character) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U': System.out.println(letter + " is a vowel"); break;
			default : System.out.println(letter + " is a consonent");
	
			}
		}
		else {
			System.out.println(letter + " is not a letter"); }
	}
}
