package edu.gsu.cis3270.Chapter3;

import java.util.Scanner;

/*
 * (Game: scissor, rock, paper) Write a program that plays the popular scissor-rock-
 * paper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
 * wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
 * scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
 * 2 and displays a message indicating whether the user or the computer wins, loses,
 * or draws. 
 */
public class Ch3_17 {
	public static String choice(int n) {
		switch (n) {
		case 0: return "Scissor";
		case 1: return "Rock";
		case 2: return "Paper";
		}
		return "";
	}
	public static void main(String [] args) {
		int player1 = (int) (1 + Math.random() * 3);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Scissor \"0\", Rock \"1\", Paper \"2\" : ");
		int player2 = input.nextInt();
	
		
		if (player1 == player2) {
			System.out.println("You are " + choice(player2) + " and the computer was " + choice(player1) + " too. It is a draw." );
		}
		else if (player1 == 0 && player2 == 2  || player1 == 1 && player2 == 0 || player1 == 2 && player1 == 1 ) {
			System.out.println("You are " + choice(player2) + " and the computer was " + choice(player1) + ". You lost.");
		}
		else  {
			System.out.println("You are " + choice(player2) + " and the computer was " + choice(player1) + ". You won.");
		}
	}

}
