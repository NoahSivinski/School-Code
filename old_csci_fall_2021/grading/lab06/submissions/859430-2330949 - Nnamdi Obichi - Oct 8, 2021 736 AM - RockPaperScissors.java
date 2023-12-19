/*
 * RockPaperScissors.java
 * Author:  Nnamdi Obichi 
 * Submission Date:  October 8th, 2021
 *
 * Purpose: 
 * This program plays a game of rock-paper-scissors with the
 * player. The program asks the user how many points are 
 * needed to win the game and the computer and player play
 * rock-paper-scissors until either reaches that point threshold.
 * The rules are that paper beats rock, rock beats scissors,
 * scissors beats paper, and two of the same moves are a tie.
 * The player or computer must reach the necessary amount 
 * of inputed points FIRST in order to win the game. 
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
		
		Scanner keyBo = new Scanner(System.in);
		
		boolean legalMove;
		int winner = 0;
		
		// Contains the player and computer moves in rock-paper-scissors
		String playerMove;
		String computerMove;
		
		// The computer and player scores for each win either gets
		int playerScore = 0;
		int computerScore = 0;

		// Player inputs how many wins of rock-paper-scissors needed to win the whole game  
		System.out.print("Points to win: ");
		int winCondition = keyBo.nextInt();
		keyBo.nextLine();
		
		/* If the player or computer's scores reach the amount of points needed to win before 
		 * the other, the game stops looping. If neither player reaches the win condition before
		 * the other the loop continues until either the player or the computer wins first. 
		 */
		while (playerScore < winCondition && computerScore < winCondition) {
			
			legalMove = false;
			
			// Player inputs a move into the game that read regardless of case or trailing/leading spaces
			System.out.print("Rock, paper, or scissors? ");
			playerMove = keyBo.nextLine();
			playerMove = playerMove.toLowerCase().trim();
			
			
			/* If the move in playerMove after processing equals "rock", "paper", or "scissors";
			 * the move is considered legal and legalMove is set to true. If the move is illegal,
			 * thus NOT "rock", "paper", or "scissors" after processing, legalMove defaults as false.
			 */
			if (playerMove.equals("rock")||playerMove.equals("paper")||playerMove.equals("scissors") ) {
				legalMove = true;
			}
			
			/* The branch below only occurs if the move in playerMove was legal. If legalMove is
			 * false then the while loop repeats and prompts the player for another input  
			 */
			
			if(legalMove) {
				
				// Gets the computer's move from the ComputerOpponent.java file
				computerMove = ComputerOpponent.getMove();
				
				// Player's rock beats the computer's scissors thus you win 
				if(playerMove.equals("rock") && computerMove.equals("scissors")) {
					winner = 1;
				}
				// Player's rock loses to the computer's paper thus you lose
				else if(playerMove.equals("rock") && computerMove.equals("paper")) {
					winner = 0;
				}
				// Player's paper beats the computer's rock thus you win
				else if(playerMove.equals("paper") && computerMove.equals("rock")) {
					winner = 1;
				}
				// Player's paper loses to the computer's scissors thus you lose
				else if(playerMove.equals("paper") && computerMove.equals("scissors")) {
					winner = 0;
				}
				// Player's scissors beat the computer's paper thus you win
				else if(playerMove.equals("scissors") && computerMove.equals("paper")) {
					winner = 1;
				}
				// Player's scissors lose to the computer's rock thus you lose
				else if(playerMove.equals("scissors") && computerMove.equals("rock")) {
					winner = 0;
				}
				// If both the player and computer choose the same move, it's a tie 
				else if(playerMove.equals(computerMove)){
					winner = 2;
				}
				
				/* In the switch statement below the winner variable can only equal 0, 1, or 2. 
				 * If the winner variable equals 0, then the player loses that round and the 
				 * computer gets one point.If the winner variable equals 1, then the player
				 * wins that round and the player gets one point. If the winner variable equals
				 * 2, then that was a tie and neither the player nor computer gain a point.  
				 */
	
				switch (winner) {
				
				case 0:
					System.out.print("The computer chose " + computerMove + ", so you lose. ");
					++computerScore;
					System.out.println("(" + playerScore + "-" + computerScore + ")");
					break;
				case 1:
					System.out.print("The computer chose " + computerMove + ", so you win! ");
					++playerScore;
					System.out.println("(" + playerScore + "-" + computerScore + ")");
					break;
				case 2:
					System.out.print("The computer chose " + computerMove + ", so it's a tie. ");
					System.out.println("(" + playerScore + "-" + computerScore + ")");
					break;
				}
			}
			
			// If the computer gets to the points necessary to win, THE PLAYER LOSES the game.
			if (computerScore == winCondition) {
				System.out.println("Sorry, you lost. Better luck next time!");
			}
			// If the player gets to the points necessary to win, THE PLAYER WINS the game.
			else if (playerScore == winCondition) {
				System.out.println("Congratulations! You won!");
				
			// Either the computer or player can win, but not both.
			}	
		}
			
		keyBo.close();
	}
}
