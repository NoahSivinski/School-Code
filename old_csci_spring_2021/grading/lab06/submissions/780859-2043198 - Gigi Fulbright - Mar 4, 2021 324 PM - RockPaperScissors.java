/**
 * RockPaperScissors.java
 * Author:  Jordyn Fulbright
 * Submission Date:  March 5th
 *
 * Purpose: This program allows the user to play rock paper scissors 
 * against a computer opponent and allows user to choose number of
 * points played to and keeps score of both the user and computer and
 * ends the game when the score limit is reached.
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
	
		String computerMove;
		String userMove;
		int pointsToWin;
		int userScore = 0;
		int computerScore = 0;
		
		System.out.print("Points to win: ");
		pointsToWin = keyboard.nextInt();
		
		while (((userScore < pointsToWin)) && ((computerScore < pointsToWin))) {
			System.out.print("Rock, paper, or scissors? ");
			userMove = keyboard.next();
			//while statement for if user doesn't input a valid answer
			while (!((userMove.equalsIgnoreCase("rock")) || (userMove.equalsIgnoreCase("paper")) || (userMove.equalsIgnoreCase("scissors"))) ) {
				System.out.print("Rock, paper, or scissors? ");
				userMove = keyboard.next();
			}
			computerMove = ComputerOpponent.getMove();
			//If user chooses rock and computer chooses paper
			if ((userMove.equalsIgnoreCase("rock")) && (computerMove.equalsIgnoreCase("Paper"))) {
				computerScore++;
				System.out.print("The computer chose paper, so you lose. ");
				System.out.print("(" + userScore + "-" + computerScore + ")"+ "\n");
			} 
			//If user chooses rock and computer chooses scissors
			else if (((userMove.equalsIgnoreCase("rock")) && (computerMove.equalsIgnoreCase("scissors")) )){
				userScore++;
				System.out.print("The computer chose scissors, so you win! ");
				System.out.print("(" + userScore + "-" + computerScore + ")"+ "\n");
			}
			//If user chooses paper and computer chooses rock
			else if ((userMove.equalsIgnoreCase("paper")) && (computerMove.equalsIgnoreCase("rock"))) {
				userScore++;
				System.out.print("The computer chose rock, so you win! ");
				System.out.print("(" + userScore + "-" + computerScore + ")"+ "\n");
			} 
			//if user chooses paper and computer chooses scissors
			else if ((userMove.equalsIgnoreCase("paper")) && (computerMove.equalsIgnoreCase("scissors"))) {
				computerScore++;
				System.out.print("The computer chose scissors, so you lose. ");
				System.out.print("(" + userScore + "-" + computerScore + ")"+ "\n");
			} 
			//if user chooses scissors and computer chooses rock
			else if ((userMove.equalsIgnoreCase("scissors")) && (computerMove.equalsIgnoreCase("rock"))) {
				computerScore++;
				System.out.print("The computer chose rock, so you lose. ");
				System.out.print("(" + userScore + "-" + computerScore + ")"+ "\n");
			} 
			//if user chooses scissors and computer chooses paper
			else if ((userMove.equalsIgnoreCase("scissors")) && (computerMove.equalsIgnoreCase("paper"))) {
				userScore++;
				System.out.print("The computer chose paper, so you win! ");
				System.out.print("(" + userScore + "-" + computerScore + ")"+ "\n");
			} 
			//If user and computer make same choice
			else if (userMove.equalsIgnoreCase(computerMove)) {
				System.out.print("The computer chose " + computerMove + ", so it's a tie.");
				System.out.print("(" + userScore + "-" + computerScore + ")"+ "\n");
			}
		}
		//After point limit has been reached, determines which player won and prints messages accordingly
		if (userScore == pointsToWin) {
		System.out.println("Congratulations! You won!");
		}
		else {
		System.out.println("Sorry, you lost. Better luck next time!");
		}
		
		keyboard.close();
	
	}
}
