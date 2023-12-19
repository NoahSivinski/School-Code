/*
 * RockPaperScissors.java
 * Author:  Sean Payne 
 * Submission Date:  03/05/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *      This program utilizes to separate classes in order to form a rock, paper,
 * scissors game. The computer uses a random number to create a move while the user simply chooses.
 * This program keeps track of the wins each player has and the first one to reach the points
 * to win total determined by the user ends up winning the game.  
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
		System.out.print("Points to win: ");
		int points = keyboard.nextInt(); // stores points needed to win

		// initializing variables for while loop
		int computerPoints = 0; // stores computer wins
		int userPoints = 0; // stores user wins
		String computerMove = ""; // stores the computer's moves

		// Keeps track of both moves, shows current score, and decides winner.
		while (userPoints < points && computerPoints < points) {
			System.out.print("Rock, paper, or scissors? ");
			String choice = keyboard.next(); // stores users choice for game
			computerMove = ComputerOpponent.getMove();
			System.out.print("The computer chose " + computerMove);
			if (computerMove.equals("rock") && choice.equals("scissors")
					|| computerMove.equals("paper") && choice.equals("rock")
					|| (computerMove.equals("scissors") && choice.equals("paper"))) {
				computerPoints++;
				System.out.print(", so you lose."); // user loses point to computer

			} else if (computerMove.equals("scissors") && choice.equals("rock")
					|| computerMove.equals("rock") && choice.equals("paper")
					|| (computerMove.equals("paper") && choice.equals("scissors"))) {
				userPoints++;
				System.out.print(", so you win!"); // user wins point
			} else {
				System.out.print(", so it's a tie."); // user ties with computer
			}
			System.out.println(" (" + userPoints + "-" + computerPoints + ")");
		}
		if (computerPoints > userPoints) {
			System.out.println("Sorry, you lost. Better luck next time!");
		} else {
			System.out.println("Congratulations! You won!");
		}
		keyboard.close(); // closes Scanner "keyboard"
	}
}