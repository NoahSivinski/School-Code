/*
 * RockPaperScissors.java
 * Author:  Angel Marsh 
 * Submission Date:  March 5, 2021
 *
 * Purpose: The purpose of this program is to simulate a rock,
 * paper, scissors game between the user and the computer where
 * the user enters how many points either they or the computer
 * must earn to win the game. The user's moves are read in from
 * the scanner, and the computer's moves are generated randomly.
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

		String computerMove = null;
		String userMove;
		int pointsToWin;

		Scanner keyboard = new Scanner(System.in);

		System.out.printf("Points to win: ");
		pointsToWin = keyboard.nextInt();
		keyboard.nextLine();

		int userScore = 0;
		int computerScore = 0;
		// Condition for loop. Loop will continue as long as neither userScore nor
		// computerScore equals pointsToWin
		while ((userScore != pointsToWin) && (computerScore != pointsToWin)) {
			System.out.print("Rock, paper, or scissors? ");
			userMove = keyboard.nextLine();
			userMove = userMove.trim();
			if (userMove.equalsIgnoreCase("rock") || userMove.equalsIgnoreCase("paper")
					|| userMove.equalsIgnoreCase("scissors")) {
				// computerMove is not called unless user enters valid input.
				computerMove = ComputerOpponent.getMove();
			}
			if (userMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("scissors")) {
				// increases user's score
				userScore++;
				System.out.printf(
						"The computer chose scissors, so you win! " + "(" + userScore + "-" + computerScore + ")");
				System.out.println("");
			} else if (userMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("paper")) {
				// increases computer's score
				computerScore++;
				System.out.printf(
						"The computer chose paper, so you lose. " + "(" + userScore + "-" + computerScore + ")");
				System.out.println("");
			} else if (userMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("rock")) {
				System.out.printf(
						"The computer chose rock, so it's a tie. " + "(" + userScore + "-" + computerScore + ")");
				System.out.println("");
			} else if (userMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("scissors")) {
				computerScore++;
				System.out.printf(
						"The computer chose scissors, so you lose. " + "(" + userScore + "-" + computerScore + ")");
				System.out.println("");
			} else if (userMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("paper")) {
				System.out.printf(
						"The computer chose paper, so it's a tie. " + "(" + userScore + "-" + computerScore + ")");
				System.out.println("");
			} else if (userMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock")) {
				userScore++;
				System.out
						.printf("The computer chose rock, so you win! " + "(" + userScore + "-" + computerScore + ")");
				System.out.println("");
			} else if (userMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("scissors")) {
				System.out.printf(
						"The computer chose scissors, so it's a tie. " + "(" + userScore + "-" + computerScore + ")");
				System.out.println("");
			} else if (userMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("paper")) {
				userScore++;
				System.out
						.printf("The computer chose paper, so you win! " + "(" + userScore + "-" + computerScore + ")");
				System.out.println("");
			} else if (userMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("rock")) {
				computerScore++;
				System.out
						.printf("The computer chose rock, so you lose. " + "(" + userScore + "-" + computerScore + ")");
				System.out.println("");
			}
		}
		if (userScore > computerScore) {
			System.out.printf("Congratulations! You won!");
		} else {
			System.out.printf("Sorry, you lost. Better luck next time!");
		}

		keyboard.close();

	}

}
