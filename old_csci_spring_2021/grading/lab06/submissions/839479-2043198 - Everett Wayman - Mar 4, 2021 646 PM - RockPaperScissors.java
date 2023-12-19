/*
 * RockPaperScissors.java
 * Author: Everett Wayman 
 * Submission Date: 03/4/21
 *
 * Purpose: In this program the user can play the classic game of
 * rock, paper, scissors. The user can pick how many rounds they
 * want to play the game and can then type out their choice. The user will compete
 * against the computer. If the user or computer wins the selected amount of rounds
 * chosen they will win the game. Have fun!
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
		
		// Initializing the variables
		int playerScore = 0;
		int computerScore = 0;
		String computerChoice;
		String playerChoice;
		
		Scanner keyboard = new Scanner(System.in);
	
		// Asking user how many round's they want to play.
		System.out.print("Points to win: ");
		int pointsToWin = keyboard.nextInt();
		
		// Users move is assigned to the scanner.
		playerChoice = keyboard.nextLine();
		
		// The do-while statement allows for the game to be played then after game 
		// is finished it checks the scores to see if it can announce the winner.
		do {
			
			// Calling the given computer move
			computerChoice = ComputerOpponent.getMove();
			
			// Prompts user with move options and allows them to enter an answer.
			System.out.print("Rock, paper, or scissors? ");
			playerChoice = keyboard.nextLine();
			
			// If-else statements are used to determine who wins each round.
			// First part describes the situation if both user and computer tie.
			if (playerChoice.equalsIgnoreCase(computerChoice)) {
				System.out.println("The computer chose " + computerChoice + ", so it's a tie. (" + playerScore + "-" + computerScore + ")");
			
			// This is the user wins situation.
			} else if ((playerChoice.equalsIgnoreCase("rock") && computerChoice.equals("scissors")) 
						|| (playerChoice.equalsIgnoreCase("scissors") && computerChoice.equals("paper")) 
						|| (playerChoice.equalsIgnoreCase("paper") && computerChoice.equals("rock"))) {
				playerScore++;
				System.out.println("The computer chose " + computerChoice + ", so you win! (" + playerScore + "-" + computerScore + ")"); 
			
			// This is the user loses situation.		
			} else  if ((playerChoice.equalsIgnoreCase("rock") && computerChoice.equals("paper")) 
						|| (playerChoice.equalsIgnoreCase("scissors") && computerChoice.equals("rock")) 
						|| (playerChoice.equalsIgnoreCase("paper") && computerChoice.equals("scissors"))){
				computerScore++;
				System.out.println("The computer chose " + computerChoice + ", so you lose. (" + playerScore + "-" + computerScore + ")");
			
			// 	This if the entered string is not one of choices.		
			} else
				System.out.println("Invalid choice! Try again.");
				
				
		// Loops until either the players score is the same as the pointToWin 
		// or the computer score is the same as the points to win.
		} while ((playerScore < pointsToWin) && (computerScore < pointsToWin)); {
			
			if (playerScore > computerScore) {
					System.out.println("Congratulations! You won!");
			} else
					System.out.println("Sorry, you lost. Better luck next time!");
			}

		keyboard.close();	
		
	}

}
