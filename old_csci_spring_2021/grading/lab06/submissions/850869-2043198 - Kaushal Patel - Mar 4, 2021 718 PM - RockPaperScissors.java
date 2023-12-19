/*
 * RockPaperScissors.java
 * Author:  Kaushalkumar A. Patel
 * Submission Date: 03-04-21
 *
 * Purpose: A brief paragraph description of the program. What does it do?
 * The program will implement a version of Rock, Paper, Scissors 
 * where the user plays against the computer. The user inputs in their 
 * choice as a String (either "rock", "paper", or "scissors"), and the computer 
 * will make its choice at pseudorandom. The winner should be determined based on 
 * the rules specified. The user will also get to play multiple rounds of Rock, Paper, 
 * Scissors against the computer until a winner is declared.
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

		// Instance of scanner
		Scanner keyboard = new Scanner(System.in);

		// Takes the user input on how many points to win the game
		System.out.print("Points to win: ");
		int winPoints = keyboard.nextInt();

		// Keeps score of the user and computer
		int computerPoints = 0, playerPoints = 0;

		// Game repeats using while loop as while the computer or player
		// has not reached points to win, the game will repeats
		while (!(winPoints == computerPoints || winPoints == playerPoints)) {
			System.out.print("Rock, paper, or scissors? ");
			String playerMove = keyboard.next();
			String computerMove = ComputerOpponent.getMove();

			// Determines if player won, lost, or tied with the computer if rock was played
			if (playerMove.equalsIgnoreCase("rock")) {
				if (computerMove == "rock") {
					System.out.println(
							"The computer chose rock, so it's a tie.  (" + playerPoints + "-" + computerPoints + ")");
				} else if (computerMove == "paper") {
					computerPoints++;
					System.out.println(
							"The computer chose paper, so you lose.  (" + playerPoints + "-" + computerPoints + ")");
				} else {
					playerPoints++;
					System.out.println(
							"The computer chose scissors, so you win!  (" + playerPoints + "-" + computerPoints + ")");
				}
			}

			// Determines if player won, lost, or tied with the computer if paper was played
			else if (playerMove.equalsIgnoreCase("paper")) {
				if (computerMove == "rock") {
					playerPoints++;
					System.out.println(
							"The computer chose rock, so you win!  (" + playerPoints + "-" + computerPoints + ")");
				} else if (computerMove == "paper") {
					System.out.println(
							"The computer chose paper, so it's a tie.  (" + playerPoints + "-" + computerPoints + ")");
				} else {
					computerPoints++;
					System.out.println(
							"The computer chose scissors, so you lose.  (" + playerPoints + "-" + computerPoints + ")");
				}
			}

			// Determines if player won, lost, or tied with the computer if scissors was
			// played
			else if (playerMove.equalsIgnoreCase("scissors")) {
				if (computerMove == "rock") {
					computerPoints++;
					System.out.println(
							"The computer chose rock, so you lose.  (" + playerPoints + "-" + computerPoints + ")");
				} else if (computerMove == "scissors") {
					System.out.println("The computer chose scissors, so it's a tie.  (" + playerPoints + "-"
							+ computerPoints + ")");
				} else {
					playerPoints++;
					System.out.println(
							"The computer chose paper, so you win!  (" + playerPoints + "-" + computerPoints + ")");
				}
			}

		}

		// Determines if the player has won or lost against the computer
		if (playerPoints == winPoints) {
			System.out.println("Congratulations! You won!");
		} else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
	}
}