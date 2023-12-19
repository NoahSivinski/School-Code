
/*
* RockPaperScissors.java
* Author:  Malinda Uboh 
* Submission Date:  10/06/2021
*
* Purpose: This program simulates a game of rock, paper, scissors
* in which the user plays against the computer. At the beginning
* of the game the user decides how long the game will go on
* by entering in how many points are required to win the game, and 
* during the game the user is asked to choose between rock, paper,
* and scissors multiple times. The game ends once either the user
* or computer gains the required number of points decided by the user 
* at the beginning of the game.
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

		String computerMove, userMove;
		int pointsToWin, userScore, computerScore;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Points to win: ");
		pointsToWin = keyboard.nextInt(); // Grab integer value of points from user
		userMove = keyboard.nextLine(); // Grab decided move from user
		userScore = 0; // Initially set the userScore to zero
		computerScore = 0; // Initially set the computerScore to zero

		while (pointsToWin > 0) { // Set loop to execute as long as user entered value of pointsToWin is greater than zero
									

			System.out.print("Rock, paper, or scissors? ");
			userMove = keyboard.nextLine();
			userMove = userMove.trim(); //Remove leading and trailing white spaces from the string
			
			// Restrict user input to rock, paper, or scissors
			if (userMove.equalsIgnoreCase("rock")
					|| (userMove.equalsIgnoreCase("paper") || (userMove.equalsIgnoreCase("scissors")))) {

				computerMove = ComputerOpponent.getMove(); // grabs move from computer

				// Execute nested if-statement if user enters rock
				if (userMove.equalsIgnoreCase("rock")) {
					if (computerMove.equalsIgnoreCase("paper")) {
						System.out.print("The computer chose paper, so you lose.");
						computerScore++; // Increment computer score when computer makes a winning move
					} else if (computerMove.equalsIgnoreCase("scissors")) {
						System.out.print("The computer chose scissors, so you win!");
						userScore++; // Increment user score when user makes a winning move
					}
				}
				// Execute nested if-statement if user enters paper
				if (userMove.equalsIgnoreCase("paper")) {
					if (computerMove.equalsIgnoreCase("scissors")) {
						System.out.print("The computer chose scissors, so you lose.");
						computerScore++;
					} else if (computerMove.equalsIgnoreCase("rock")) {
						System.out.print("The computer chose rock, so you win!");
						userScore++;
					}
				}
				// Execute nested if-statement if user enters scissors
				if (userMove.equalsIgnoreCase("scissors")) {
					if (computerMove.equalsIgnoreCase("rock")) {
						System.out.print("The computer chose rock, so you lose.");
						computerScore++;
					} else if (computerMove.equalsIgnoreCase("paper")) {
						System.out.print("The computer chose paper, so you win!");
						userScore++;
					}
				}
				// Execute if-statement if user enters same move as computer
				if (userMove.equalsIgnoreCase(computerMove)) {
					System.out.print("The computer chose " + computerMove + ", so it's a tie.");
				}

				System.out.print(" (" + userScore + "-");
				System.out.print(computerScore + ")");
				System.out.println();

				// Execute if-statement if computer wins the required number of points first
				if ((computerScore == pointsToWin) && (computerScore > 0)) {
					System.out.println("Sorry, you lost. Better luck next time!");
					System.exit(0);
				}
				// Execute if-statement if user wins the required number of points first
				if ((userScore == pointsToWin) && (userScore > 0)) {
					System.out.println("Congratulations! You won!");
					System.exit(0);
				}

			}

		}

	}

}
