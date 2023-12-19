/*
* RockPaperScissors.java
* Author: Connor Malloch
* Submission Date: March 5 2021
*
* Purpose: To play a game of Rock Paper Scissors with the computer until a score set by the player is reached.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing 
* or posting of source code for this assignment is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.  
*/

import java.util.Scanner;

public class RockPaperScissors {
	
	public static void main(String[] args) {
		
		Scanner keyBoard = new Scanner(System.in); //scanner
		
		int userScore = 0;
		int compScore = 0;
		int maxScore = 0; 
		//int variables
		String userHand = "", compHand;				//string variables
		System.out.print("Points to Win: ");		// points to win
		maxScore = keyBoard.nextInt();				// get maxScore
		
		while( !(userScore == maxScore || compScore == maxScore) ) { //the while loop
		System.out.print("\nRock, paper, or scissors? ");		//initial comparison
		userHand = keyBoard.next();								//get the comparison

		if (userHand.equalsIgnoreCase("Scissors")) {			//make comparison and adjust score
			compHand = ComputerOpponent.getMove();
				if (compHand.equalsIgnoreCase(userHand)) {
					System.out.printf("\nThe computer chose scissors, so it's a tie.  (%d-%d)", userScore, compScore);
				} else if (compHand.equalsIgnoreCase("rock")) {
					compScore++;
					System.out.printf("\nThe computer chose rock, so you lose.  (%d-%d)", userScore, compScore);
				} else if (compHand.equalsIgnoreCase("paper")) {
					userScore++;
					System.out.printf("\nThe computer chose paper, so you win!  (%d-%d)", userScore, compScore);
				}
		}
		else if(userHand.equalsIgnoreCase("rock")) {
			compHand = ComputerOpponent.getMove();
				if (compHand.equalsIgnoreCase(userHand)) {
					System.out.printf("\nThe computer chose rock, so it's a tie.  (%1d-%1d)", userScore, compScore);
				} else if (compHand.equalsIgnoreCase("paper")) {
					compScore++;
					System.out.printf("\nThe computer chose paper, so you lose.  (%1d-%1d)", userScore, compScore);
				} else if (compHand.equalsIgnoreCase("scissors")) {
					userScore++;
					System.out.printf("\nThe computer chose scissors, so you win!  (%1d-%1d)", userScore, compScore);
				}
		}
		else if(userHand.equalsIgnoreCase("paper")) {
			compHand = ComputerOpponent.getMove();
				if (compHand.equalsIgnoreCase(userHand)) {
					System.out.printf("\nThe computer chose paper, so it's a tie.  (%1d-%1d)", userScore, compScore);
				} else if (compHand.equalsIgnoreCase("scissors")) {
					compScore++;
					System.out.printf("\nThe computer chose scissors, so you lose.  (%1d-%1d)", userScore, compScore);
				} else if (compHand.equalsIgnoreCase("rock")) {
					userScore++;
					System.out.printf("\nThe computer chose rock, so you win!  (%1d-%1d)", userScore, compScore);
				}
		}
		else {
			System.out.print("\nPlease choose 'rock', 'paper', or 'scissors'!"); //if command invalid
		}
		
		if(maxScore == userScore) {
			System.out.println("\nCongratulations! You won!"); //if userScore is maxScore
			System.exit(0);
			} else if(maxScore == compScore) {
				System.out.println("\nSorry, you lost. Better luck next time!"); //if compScore is maxScore
				System.exit(0);
				}
		
		}

	}

}
