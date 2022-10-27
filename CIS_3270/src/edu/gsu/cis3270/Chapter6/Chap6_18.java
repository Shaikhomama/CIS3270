package edu.gsu.cis3270.Chapter6;

import java.util.Scanner;

/*
 * (Check password ) Some websites impose certain rules for passwords. Write a
 * method that checks whether a string is a valid password. Suppose the password
 * rules are as follows:
 * ■ A password must have at least eight characters.
 * ■ A password consists of only letters and digits.
 * ■ A password must contain at least two digits.
 * Write a program that prompts the user to enter a password and displays Valid
 * Password if the rules are followed or Invalid Password otherwise.
 */
public class Chap6_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String password = input.nextLine();
		
		System.out.println("The password is " + (isValid(password)? "valid.": "invalid") );
		
	}
	public static boolean isValid(String password) {
		boolean isValid = (hasDigitandNumbers(password) && isDigit(password) && length(password));
		return isValid;
	}
	
	public static boolean hasDigitandNumbers(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (!Character.isLetterOrDigit(password.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isDigit(String password) {
		int count = 0;
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				count++;
			}
			if (count >= 2) {
				return true;
			}	
	   }
		return false;	
	}
	
	public static boolean length(String password) {
		boolean length = password.length() >= 8? true : false;
		return length;
	}

}
