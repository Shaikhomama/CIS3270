package edu.gsu.cis3270.Chapter7;

/*
 * (Count single digits) Write a program that generates 100 random integers between
 * 0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
 * say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 */
public class Chap7_7 {

	public static void main(String[] args) {

		int [] count = new int [10];
		
		for ( int i = 0; i <= 100; i++) {
			count[(int)(Math.random() * 9)]++;
		}
		
		for (int i = 0; i < count.length; i++) {
			System.out.println("Ther are "+count[i] + " occurrences for the number "+ i);
		}
	}

}
