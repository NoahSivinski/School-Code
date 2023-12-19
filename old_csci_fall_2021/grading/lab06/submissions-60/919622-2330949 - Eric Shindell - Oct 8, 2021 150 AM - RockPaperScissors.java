/*
 * RockPaperScissors.java
 * Author:  Eric Shindell 
 * Submission Date:  10/8/2021
 *
 * Purpose: This program lets the user play a game of rock paper scissors
 * against a computer to a point goal of their choosing (as long as it is a whole
 * number, so an Int). The user can then pick between rock, paper, or scissors, with
 * any capitalization of their choosing (since it will be set to lower case with
 * .toLowerCase regardless), and then will be told if they won, tied, or lost that round,
 * with an updated score as well. Once one of the two scores equals the maximum point total
 * set in the beginning, the game ends and a winner is chosen.
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
		
		//Variables
		int pointsToWin;
		String computerMove;
		String userMove = "N/A"; //set to a placeholder until a real move is set
		int userScore = 0; 
		int computerScore = 0;
				
		Scanner input = new Scanner(System.in);
		
		//Finds out the maximum points per game.
		System.out.print("Points to win: ");
		pointsToWin = input.nextInt();
		
		//Bug fix
		input.nextLine();
		
		do {

			do {
				//Gets the user's move, and I trimmed/toLowerCase the input so that there is less complications
				System.out.print("Rock, paper, or scissors? ");
				userMove = input.nextLine();
				userMove = userMove.toLowerCase();
				userMove = userMove.trim();
			}
			//Makes sure the userMove is a genuine move.
			while (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors"));
			
			
			//gets the computer's input, then also .toLowerCases it just in case.
			computerMove = ComputerOpponent.getMove();
			computerMove = computerMove.toLowerCase();
		
			//Tie condition
			if(userMove.equals(computerMove)) {
				System.out.println("The computer chose " + computerMove + ", so it's a tie. (" + userScore + "-" + computerScore + ")");
			}
			
			//Win conditions for the user
			else if (userMove.equals("rock") && computerMove.equals("scissors")) {
				userScore++;
				System.out.println("The computer chose " + computerMove + ", so you win! (" + userScore + "-" + computerScore + ")");
			}
			else if (userMove.equals("paper") && computerMove.equals("rock")) {
				userScore++;
				System.out.println("The computer chose " + computerMove + ", so you win! (" + userScore + "-" + computerScore + ")");
			}
			else if (userMove.equals("scissors") && computerMove.equals("paper")) {
				userScore++;
				System.out.println("The computer chose " + computerMove + ", so you win! (" + userScore + "-" + computerScore + ")");
			}
			
			//Lose conditions for the user
			else if (userMove.equals("rock") && computerMove.equals("paper")) {
				computerScore++;
				System.out.println("The computer chose " + computerMove + ", so you lose. (" + userScore + "-" + computerScore + ")");
			}
			else if (userMove.equals("paper") && computerMove.equals("scissors")) {
				computerScore++;
				System.out.println("The computer chose " + computerMove + ", so you lose. (" + userScore + "-" + computerScore + ")");
				
			}
			else if (userMove.equals("scissors") && computerMove.equals("rock")) {
				computerScore++;
				System.out.println("The computer chose " + computerMove + ", so you lose. (" + userScore + "-" + computerScore + ")");
				
			}
		}
		//The condition to keep looping (whoever's score reaches the maximum points first
		while (userScore != pointsToWin && computerScore != pointsToWin);	
		
		
		//Checks who won based on whose final score is greater
		if(userScore > computerScore) {
			System.out.println("Congratulations! You won!");
		}
		else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}

	}

}
