/*
 * RockPaperScissors.java
 * Author:  Jacob Glover 
 * Submission Date:  03-04-2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program simulates a 
 * rock paper scissors game with a computer opponent that generates
 * random moves. It is run through a loop that allows a user input of 
 * points to win.
 * 
 * 
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
		Scanner input = new Scanner(System.in);
		
		//Initializing variables
		String computerMove;
		int computerPoints = 0;
		int points = 0;
		int pointsToWin = -1;
		String choice;
		String ratio; 
		boolean round = true;
		boolean game = true;
		
		// Outer loop that begins the game
		while (game) { 
			// Prompts the user to choose the amount of points to win
			if (pointsToWin == -1) {
				System.out.print("Points To Win: ");
				pointsToWin = input.nextInt();
			}
			// Inside loop that repeats the round
			while (round) {
				// Begins the round by asking for the user's move
				boolean displayRatio = true;
				System.out.print("Rock, paper, or scissors? ");
				choice = input.next();
				// Calls for the computer's move to be used
				computerMove = ComputerOpponent.getMove();
				/* Scenarios of wins and losses for the game, declaring the winner of the round and adding
				 * the point to the winner.
				*/
				if (choice.equalsIgnoreCase("rock") && (computerMove.equals("scissors"))) {
					System.out.print("The computer chose scissors, so you win! ");
					++points;
				} else if (choice.equalsIgnoreCase("rock") && (computerMove.equals("paper"))) {
					System.out.print("The computer chose paper, so you lose. ");
					++computerPoints;
				} else if (choice.equalsIgnoreCase("rock") && (computerMove.equals("rock"))) {
					System.out.print("The computer chose rock, so it's a tie. ");
				} else if (choice.equalsIgnoreCase("paper") && (computerMove.equals("rock"))) {
					System.out.print("The computer chose rock, so you win! ");
					++points;
				} else if (choice.equalsIgnoreCase("paper") && (computerMove.equals("scissors"))) {
					System.out.print("The computer chose scissors, so you lose. ");
					++computerPoints;
				} else if (choice.equalsIgnoreCase("paper") && (computerMove.equals("paper"))) {
					System.out.print("The computer chose paper, so it's a tie. ");
				} else if (choice.equalsIgnoreCase("scissors") && (computerMove.equals("paper"))) {
					System.out.print("The computer chose paper, so you win! ");
					++points;
				} else if (choice.equalsIgnoreCase("scissors") && (computerMove.equals("rock"))) {
					System.out.print("The computer chose rock, so you lose. ");
					++computerPoints;
				} else if (choice.equalsIgnoreCase("scissors") && (computerMove.equals("scissors")))
					System.out.print("The computer chose scissors, so it's a tie. "); 
				// Used as a precaution of the user entering a different answer
				else {
					displayRatio = false; // The ratio won't display if the input was invalid
				}
				// Prints the amount of points the user and the computer has
				ratio = ("(" + points + "-" + computerPoints + ")" + "\n");
				if (displayRatio == true) { 
					System.out.print(ratio);
				}
				
				// Declares the winner and ends the game
				if (computerPoints == pointsToWin) {
					System.out.print("Sorry, you lost. Better luck next time!");
					round = false;
					game = false;
				} else if (points == pointsToWin) {
					System.out.print("Congratulations! You won!");
					round = false;
					game = false;
				}
			} 
		} 
		input.close();
	}
}
