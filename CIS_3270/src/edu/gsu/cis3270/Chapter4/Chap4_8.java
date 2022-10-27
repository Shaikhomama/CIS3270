package edu.gsu.cis3270.Chapter4;

import java.util.Scanner;

/*
 * (Find the character of an ASCII code) Write a program that receives an ASCII code
 * (an integer between 0 and 127) and displays its character. 
 */
public class Chap4_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCHII code: ");
		int code = input.nextInt();
		
		char character = (char)code;
		
		System.out.println("The character for "+ code + " is " + character);
		
		
	}

}
