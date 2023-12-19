/*
 * [RockPaperScissors].java
 * Author:  [Ethan Delamater]
 * Submission Date:  [3/5/2021]
 *
 * Purpose: Plays a game of rock paper scissors between the user and the computer.
 * prompts the user how many points one needs to win and games of rock paper scissors
 * are played until the target number of points is reached.
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

		Scanner input = new Scanner(System.in);     // defining the scanner

		int pointsToWin;                // establishing the variables
		int userScore = 0;
		int computerScore = 0;
		String userMove = " ";
		String computerMove = " ";

		System.out.print("Points to win: ");         // prompting the user on the amount of points they want to set as the target to win
		pointsToWin = input.nextInt();

		while (userScore < pointsToWin && computerScore < pointsToWin) {          // keeping the game running while both the user and computer have less points than the target
			System.out.print("Rock, paper, or scissors? ");
			userMove = input.next();

			while (!(userMove.equalsIgnoreCase("Rock") || userMove.equalsIgnoreCase("Paper")           // having the user select their move
					|| userMove.equalsIgnoreCase("Scissors"))) {
				System.out.println("Rock, paper, or scissors? ");
				userMove = input.next();
			}

			computerMove = ComputerOpponent.getMove();                             // bringing in the computer move from the other class file
			System.out.print("The computer chose " + computerMove);

			if (userMove.equalsIgnoreCase(computerMove)) {                           // declaring a tie if both the user and computer select the same move
				System.out.print(", so it's a tie. ");                           
				System.out.println("(" + userScore + "-" + computerScore + ")");                     // showing the user the score after the round
			}

			else if (userMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Paper")                     // establishing what results in a loss for the user
					|| userMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Scissors")
					|| userMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Rock")) {
				System.out.print(", so you lose. ");                                                                  // the losing message
				computerScore += 1;                                                                             // adding a point to the computer score for winning a round
				System.out.println("(" + userScore + "-" + computerScore + ")");                            // showing the user the score after the round
			}

			else {
				System.out.print(", so you win! ");                                                // establishing the wins for the user
				userScore += 1;                                                              // adding a point to the user score for winning a round
				System.out.println("(" + userScore + "-" + computerScore + ")");       // showing the user the score after the round
			}
		}

		if (userScore == pointsToWin) {                                                  // declaring the win for the user if they reach the desired number of points
			System.out.println("Congratulations! You won!");                    // printing the winning message
		}

		else {                                                                        // declaring the loss for the user if the computer reaches the desired number of points
			System.out.println("Sorry, you lost. Better luck next time!");            // printing the losing message
		}

		input.close();                        // closing the input.
	}

}
