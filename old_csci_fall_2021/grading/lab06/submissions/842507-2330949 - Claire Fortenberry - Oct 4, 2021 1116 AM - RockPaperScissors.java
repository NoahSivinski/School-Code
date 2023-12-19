/*
 * RockPaperScissors.java
 * Author:  Claire Fortenberry
 * Submission Date:  [Submission date here]
 * Purpose:	This program allows the user to play the game Rock, Paper, Scissors
 * against the computer. The computer receives input for number of points needed to win, 
 * and for the user's move each round. It also keeps track of and displays the scores of both 
 * players and terminates once a player gets the number of points needed to win. 
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
		
		//Declare variables
		String computerMove = "";
		String playerMove = "";
		int computerScore = 0;
		int playerScore = 0;

		System.out.print("Points to win: ");
		int pointsToWin = input.nextInt();
		
		while (computerScore < pointsToWin && playerScore < pointsToWin) {
			System.out.print("Rock, paper, or scissors? ");
			playerMove = input.next();
			playerMove.toLowerCase();
			computerMove = ComputerOpponent.getMove();
			
			if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors")) {		//Check for valid input
				if (playerMove.equals("rock") && computerMove.equals("paper") || playerMove.equals("paper") && computerMove.equals("scissors") || playerMove.equals("scissors") && computerMove.equals("rock")) {		//Computer wins
					computerScore++;
					
					System.out.println("The computer chose " + computerMove + ", so you lose. (" + playerScore + "-" + computerScore + ")");
				}
				else if (computerMove.equals("rock") && playerMove.equals("paper") || computerMove.equals("paper") && playerMove.equals("scissors") || computerMove.equals("scissors") && playerMove.equals("rock")) {		//Player wins		
					playerScore++;
					
					System.out.println("The computer chose " + computerMove + ", so you win! (" + playerScore + "-" + computerScore + ")");
				}
				else {																													
					System.out.println("The computer chose " + computerMove + ", so it's a tie. (" + playerScore + "-" + computerScore + ")");
				}
		
			}
		
		}
		
		if (playerScore == pointsToWin) {
			System.out.println("Congratulations! You won!");
		}
		else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		
	input.close();
	
	}
	
}

