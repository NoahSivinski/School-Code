/*
 * [CSCI1301].java
 * Author:  [Nicholas Corwin] 
 * Submission Date:  [3/5/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program is a simulation of the game Rock, Paper, Scissors. The user is playing against a computer in this situation. The user input will trigger a computer reponse and a winner is selected after a set number of points is reached. 
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

import java.util.Scanner; // Import Scanner class

public class RockPaperScissors {
	
	public static String computerMove;
	public static String playerMove;
	public static int pointsToWin;
	public static int playerScore = 0;
	public static int computerScore = 0;

	public static void main(String[] args) {
		
		// Scanner Init
		Scanner keyboard = new Scanner(System.in);
		
		// User Input: Points to Win
		System.out.print("Points to win:");
		pointsToWin = keyboard.nextInt();
		
		// Game While Loop
		while((playerScore < pointsToWin) && (computerScore < pointsToWin)){
			
			// User Input: Player's Move
			System.out.print("Rock, paper, or scissors? ");
			playerMove = keyboard.next();

			computerMove = ComputerOpponent.getMove(); // Grab computer's move
			
			// Tie Instance
			if (playerMove.equalsIgnoreCase(computerMove)) {
				System.out.println("The computer chose " + computerMove +
						", so it's a tie. (" + playerScore +
						"-" + computerScore + ")");
			}
			
			// Invalid Player Move Instance
			else if (!(playerMove.equalsIgnoreCase("ROCK")  ||
					   playerMove.equalsIgnoreCase("PAPER") ||
					   playerMove.equalsIgnoreCase("SCISSORS"))) {
				System.out.print("");
			}
			
			// Player Winning Instance
			else if ((playerMove.equalsIgnoreCase("ROCK") && computerMove.equalsIgnoreCase("SCISSORS")) ||
					 (playerMove.equalsIgnoreCase("PAPER") && computerMove.equalsIgnoreCase("ROCK"))   ||
					 (playerMove.equalsIgnoreCase("SCISSORS") && computerMove.equalsIgnoreCase("PAPER"))) {
				playerScore += 1;
				System.out.println("The computer chose " + computerMove +
							", so you win! (" + playerScore +
							"-" + computerScore + ")");
			}
			
			// Player Losing Instance
			else {
				computerScore += 1;
				System.out.println("The computer chose " + computerMove +
							", so you lose. (" + playerScore +
							"-" + computerScore + ")");
			}
		}
		
		// Winner Print Statement
		if (playerScore > computerScore) {
			System.out.println("Congratulations! You won!");
		}
		else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		
		keyboard.close();
	}
}
