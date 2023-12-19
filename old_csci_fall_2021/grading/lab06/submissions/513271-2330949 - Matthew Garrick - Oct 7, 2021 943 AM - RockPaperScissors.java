
/*
 * RockPaperScissors.java
 * Author:  Matthew "Ty" Garrick
 * Submission Date:  10/7/21
 *
 * Purpose: This program will allow you to play the game rock, paper, scissors against a pseudorandom computer opponent.
 * You will state how many points you want to play to and play until either you or the computer wins. 
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		// Score Variables
		int pointsToWin = 0, playerScore = 0, computerScore = 0;
		
		// Answer Variables
		String playerChoice, computerChoice, s1 = "rock", s2 = "paper", s3 = "scissors", s4 = "spock", s5 = "gun";
		
		// Scanner Variable
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		
		System.out.print("Points to win: ");
		pointsToWin = keyboard.nextInt();
		
		while ((playerScore < pointsToWin) && (computerScore < pointsToWin)) {
			computerChoice = ComputerOpponent.getMove();
			System.out.print("Rock, paper, or scissors? ");
			playerChoice = keyboard.next();
			
			if ((playerChoice.equalsIgnoreCase(s1)) || (playerChoice.equalsIgnoreCase(s2)) || 
					(playerChoice.equalsIgnoreCase(s3))) {
				
				// If player chooses rock
				
				if (playerChoice.equalsIgnoreCase(s1)) {
					
					// If computer chooses rock
					if (computerChoice.equalsIgnoreCase(s1)) {
						System.out.print("The computer also chose rock, it's a tie.");
					}
					
					// If computer chooses paper
					if (computerChoice.equalsIgnoreCase(s2)) {
						System.out.print("The computer chose paper so you lost this round.");
						computerScore = computerScore + 1;
					}
					
					// If computer chooses scissors
					if (computerChoice.equalsIgnoreCase(s3)) {
						System.out.print("The computer chose scissors so you won this round!");
						playerScore = playerScore + 1;
					}
				}
				
				// If player chooses paper
				
				if (playerChoice.equalsIgnoreCase(s2)) {
					
					// If computer chooses rock
					if (computerChoice.equalsIgnoreCase(s1)) {
						System.out.print("The computer chose rock so you won this round!");
						playerScore = playerScore + 1;
					}
					
					// If computer chooses paper
					if (computerChoice.equalsIgnoreCase(s2)) {
						System.out.print("The computer also chose paper, it's a tie.");
					}
					
					// If computer chooses scissors
					if (computerChoice.equalsIgnoreCase(s3)) {
						System.out.print("The computer chose scissors so you lost this round.");
						computerScore = computerScore + 1;
					}
				}
				
				// If player chooses scissors
				
				if (playerChoice.equalsIgnoreCase(s3)) {
					
					// If computer chooses rock
					if (computerChoice.equalsIgnoreCase(s1)) {
						System.out.print("The computer chose rock so you lost this round.");
						computerScore = computerScore + 1;
					}
					
					// If computer chooses paper
					if (computerChoice.equalsIgnoreCase(s2)) {
						System.out.print("The computer chose paper so you won this round!");
						playerScore = playerScore + 1;
					}
					
					// If computer chooses scissors
					if (computerChoice.equalsIgnoreCase(s3)) {
						System.out.print("The computer also chose scissors, it's a tie.");
					}
				}
			}
			
			// If player says Spock
			if (playerChoice.equalsIgnoreCase(s4)) {
				System.out.print("I'm sorry, you have not purchased the DLC required to use this answer.");
			}
			
			// If player says gun
			if (playerChoice.equalsIgnoreCase(s5)) {
				System.out.println("While the second admendment allows you the right to bear arms,");
				System.out.print("you really shouldn't have a gun here.");
			}
			
			// If player inputs an invalid answer
			if (!((playerChoice.equalsIgnoreCase(s1)) || (playerChoice.equalsIgnoreCase(s2)) || 
					(playerChoice.equalsIgnoreCase(s3)) || (playerChoice.equalsIgnoreCase(s4)) || 
					(playerChoice.equalsIgnoreCase(s5)))) {
				System.out.print("Invalid choice made, please choose either rock, paper, or scissors.");
			}
			System.out.println("   (" + playerScore + "-" + computerScore + ")");
		}
		
		if (playerScore == pointsToWin) {
			System.out.println("Congratulations! You have won the game!");
		}
		if (computerScore == pointsToWin) {
			System.out.println("Unfortunately you lost the game, better luch next time.");
		}
		
		keyboard.close();
	}

}
