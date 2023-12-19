/*
 * RockPaperScissors.java
 * Author:  William Malonda 
 * Submission Date:  March 4, 2021
 *
 * Purpose: The program RockPaperScissors.java is a little game where you play rock, paper, scissors, with the computer opponent taken from 
 * a separate program in ComputerOpponent.java. The user is asked to input how many points is needed to win and the game is played until 
 * the user either wins or loses.
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

		Scanner keyboard = new Scanner(System.in);

		// Declaring variables
		String computerMove = null;
		String userMove;
		int computerWins = 0;
		int userWins = 0;
		int pointsToWin;

		// Prompts user to input how many wins they want to play to
		System.out.print("Points to win: ");
		pointsToWin = keyboard.nextInt();

		// Asks user to pick rock, paper, or scissors and then gets computer's move
		do {
			System.out.print("Rock, paper, or scissors? ");
			userMove = keyboard.next();
			if (userMove.equalsIgnoreCase("rock") || userMove.equalsIgnoreCase("paper")
					|| userMove.equalsIgnoreCase("scissors")) {
				computerMove = ComputerOpponent.getMove();
			}

			/*
			 * Compares user's move to computer's move and outputs a line saying if they won
			 * or not and displays record, this is in a loop until the user or computer
			 * reaches the number of points to win
			 */
			if (userMove.equalsIgnoreCase("rock") && computerMove == "paper") {
				computerWins++;
				System.out.println("The computer chose paper, so you lose. (" + userWins + "-" + computerWins + ")");
			} else if (userMove.equalsIgnoreCase("rock") && computerMove == "scissors") {
				userWins++;
				System.out.println("The computer chose scissors, so you win! (" + userWins + "-" + computerWins + ")");
			} else if (userMove.equalsIgnoreCase("paper") && computerMove == "rock") {
				userWins++;
				System.out.println("The computer chose rock, so you win! (" + userWins + "-" + computerWins + ")");
			} else if (userMove.equalsIgnoreCase("paper") && computerMove == "scissors") {
				computerWins++;
				System.out.println("The computer chose scissors, so you lose. (" + userWins + "-" + computerWins + ")");
			} else if (userMove.equalsIgnoreCase("scissors") && computerMove == "rock") {
				computerWins++;
				System.out.println("The computer chose rock, so you lose. (" + userWins + "-" + computerWins + ")");
			} else if (userMove.equalsIgnoreCase("scissors") && computerMove == "paper") {
				userWins++;
				System.out.println("The computer chose paper, so you win! (" + userWins + "-" + computerWins + ")");
			} else if (userMove.equalsIgnoreCase(computerMove)) {
				System.out.println("The computer chose " + computerMove + ", so it's a tie. (" + userWins + "-"
						+ computerWins + ")");
			}
		} while (userWins < pointsToWin && computerWins < pointsToWin);

		// When the user or computer gets the proper amount of points to win, it will output if the user won or not
		if (userWins == pointsToWin) {
			System.out.println("Congratulations! You won!");
		} else if (computerWins == pointsToWin) {
			System.out.println("Sorry, you lost. Better luck next time!");
		}

		keyboard.close();

	}

}
