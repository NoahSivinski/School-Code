/*
 * RockPaperScissors.java
 * Author:  Sunny Shah 
 * Submission Date:  03/05/2021
 *
 * Purpose: This program is a version of Rock, Paper, Scissors where the user plays against the
 * computer. The user inputs in their choice as a String (either "rock", "paper", or "scissors"
 * - not case sensitive), and the computer will make its choice at pseudorandom.
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
		
		String userChoice;	// user chooses rock, paper, or scissor
		String computerMove;	// computer chooses rock, paper, or scissor from ComputerOpponent.java
		int userPoints = 0;	// number of rounds the user has won
		int computerPoints = 0;	// number of rounds the computer has won
		
		System.out.print("Points to win: ");
		int pointsToWin = keyboard.nextInt();	// points needed to win the game
		userChoice = keyboard.nextLine();
		
		do
		{
			System.out.print("Rock, paper, or scissors? ");
			userChoice = keyboard.nextLine();
			userChoice = userChoice.trim();
			
			// if user enters rock, paper, or scissors, then the computer makes it's choice
			if (userChoice.equalsIgnoreCase("rock") || userChoice.equalsIgnoreCase("paper") || userChoice.equalsIgnoreCase("scissors"))
			{
				computerMove = ComputerOpponent.getMove(); // computer's choice
				
				// the user wins according to the game's rules
				if ((userChoice.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("scissors")) || 
						(userChoice.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock")) || 
						(userChoice.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("paper")))
				{
					userPoints++;	// user gains a point
					System.out.println("The computer chose " + computerMove + ", so you win!  " + "(" + userPoints + "-" + computerPoints + ")");
				}
				// the computer wins according to the game's rules
				else if ((userChoice.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("paper")) || 
						(userChoice.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("scissors")) || 
						(userChoice.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("rock")))
				{
					computerPoints++;	// computer gains a point
					System.out.println("The computer chose " + computerMove + ", so you lose.  " + "(" + userPoints + "-" + computerPoints + ")");
				}
				// if both the computer and user make the same choice
				else
				{
					System.out.println("The computer chose " + computerMove + ", so it's a tie.  " + "(" + userPoints + "-" + computerPoints + ")");
				}
			}
			
		} while (userPoints != pointsToWin && computerPoints != pointsToWin);	// loop continues until the computer or user points equal the points to win
		
		if (userPoints == pointsToWin)	// if user wins
		{
			System.out.println("Congratulations! You won!");
		}
		else	// if computer wins
		{
			System.out.println("Sorry, you lost. Better luck next time!");
		}

		keyboard.close();
		
	}

}
