
/*
 * RockPaperScissors.java
 * Author: Jonathan Dintino
 * Submission Date: 8 October 2021
 *
 * Purpose: This program is a very simple, text-based
 * "rock, paper, scissors" game where the user will play
 * against the computer which chooses it's moves pseudorandomly.
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		// user and computer points
		int userScore = 0;
		int computerScore = 0;
		
		String userMove; // stores last move user chose
		String computerMove; // stores last move computer chose
		
		// prompt user for amount of points to win
		System.out.print("Points to win: ");
		int pointsToWin = userInput.nextInt();
		userInput.nextLine();
		
		// game loop
		while (userScore < pointsToWin && computerScore < pointsToWin) {
			
			// keep prompting user for valid move input
			do {
				System.out.print("Rock, paper, or scissors? ");
				userMove = userInput.nextLine().trim().toLowerCase();
			} while (!(userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissors")));
			
			// get next move from computer opponent
			computerMove = ComputerOpponent.getMove();
			System.out.printf("The computer chose %s, ", computerMove);
			
			// compare user and computer opponent moves to see who scored or if it was a tie
			if (userMove.equals(computerMove)) {
				System.out.print("so it's a tie. " );
			} else if ((userMove.equals("rock") && computerMove.equals("scissors"))
					|| (userMove.equals("paper") && computerMove.equals("rock"))
					|| (userMove.equals("scissors") && computerMove.equals("paper"))) {
				System.out.print("so you win! ");
				userScore += 1;
			} else if ((computerMove.equals("rock") && userMove.equals("scissors"))
					|| (computerMove.equals("paper") && userMove.equals("rock"))
					|| (computerMove.equals("scissors") && userMove.equals("paper"))) {
				System.out.print("so you lose. ");
				computerScore += 1;
			}
			System.out.printf("(%s-%s)\n", userScore, computerScore);
			
		}
		
		// check if user or computer opponent won the game
		if (userScore > computerScore) {
			System.out.println("Congratulations! You won!");
		} else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}

	}

}
