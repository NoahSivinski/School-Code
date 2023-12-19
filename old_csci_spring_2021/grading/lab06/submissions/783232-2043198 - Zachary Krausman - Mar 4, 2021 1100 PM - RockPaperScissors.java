/*
 * RockPaperScissors.java
 * Author:  Zachary Krausman 
 * Submission Date:  4 March 2021
 *
 * Purpose: A project that lets you play Rock, Paper, Scissors against a randomized
 * computer opponent. You choose how many wins you need. It tests our knowledge on loops.
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

		// Declare variables
		int playerScore = 0;
		int computerScore = 0;
		int pointsToWin = 0;
		String playerMove = "";
		String computerMove = "";
		String singlePassResult = "";
		boolean checkState = false;

		// Set up scanner
		Scanner keyboard = new Scanner(System.in);

		// Defines the amount of games needed to win as determined by user
		System.out.print("Points to win: ");
		pointsToWin = keyboard.nextInt();
		keyboard.nextLine(); // this line seems superfluous if we just used next() on userMove

		// Game code
		do {
			System.out.print("Rock, paper, or scissors? ");
			playerMove = keyboard.nextLine();
			playerMove = playerMove.trim().toLowerCase(); // remove white space but allow correct input to be used
			computerMove = ComputerOpponent.getMove().toLowerCase(); // ensure computer's response is lower case

			// Checks to make sure user input is a valid move
			if (!(playerMove.equals("rock") || playerMove.equals("paper")
					|| playerMove.equals("scissors"))){
				checkState = true;
				// loops until the appropriate input given
				while (checkState == true) {
					System.out.print("Rock, paper, or scissors? ");
					playerMove = keyboard.nextLine();
					// if user gives correct input, changes boolean to allow escape of loop
					if (playerMove.equals("rock") || playerMove.equals("paper")
							|| playerMove.equals("scissors")) {
						checkState = false;
					}
				}
			}
			// Compare results and distribute points
			if (playerMove.equals(computerMove)){
				singlePassResult = "it's a tie."; // no points allocated because of tie
			}
			// user win cases
			else if ((playerMove.equals("rock") && computerMove.equals("scissors"))
					|| (playerMove.equals("paper") && computerMove.equals("rock"))
					|| (playerMove.equals("scissors") && computerMove.equals("paper"))) {
				singlePassResult = "you win!";
				playerScore++;
			}
			// computer win cases
			else {
				singlePassResult = "you lose.";
				computerScore++;
			}

			// single pass result output
			System.out.println("The computer chose " + computerMove + ", so " + singlePassResult 
					+ " (" + playerScore + "-" + computerScore +")");
		}
		while ((playerScore < pointsToWin) && (computerScore < pointsToWin));

		keyboard.close(); // must be outside loop so the scanner does not close prematurely

		// Game end statements
		if (playerScore == pointsToWin) {
			System.out.println("Congratulations! You won!");
		}
		else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}

	}

}
