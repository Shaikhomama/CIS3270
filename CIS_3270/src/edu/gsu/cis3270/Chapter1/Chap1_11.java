package edu.gsu.cis3270.Chapter1;

// population projection
// One birth every 7 seconds
// One death every 13 seconds
// One new immigrant every 45 seconds
// Current population is 312,032,486 and one year has 365 days
public class Chap1_11 {
	public static void main(String[] args) {
		double birthRate = 7.0;
		double deathRate = 13.0;
		double immigrantRate = 45.0;
		
		int currentPopulation = 312032486;
		
		double secInYear = 31536000;
		
		double numOfBirths= secInYear /  birthRate;
		double numOfDeaths = secInYear / deathRate;
		double numOfImmigrants = secInYear / immigrantRate;
		
		for (int i = 1; i <= 5; i++) {
			currentPopulation += numOfBirths - numOfDeaths + numOfImmigrants;
			System.out.println("Year "+ i + "'s population is " + (int)(currentPopulation));
		}
		
	}
}


