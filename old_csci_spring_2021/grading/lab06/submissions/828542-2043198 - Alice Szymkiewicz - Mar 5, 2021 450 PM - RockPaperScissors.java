/*
 * RockPaperScissors.java
 * Author:  Alice Szymkiewicz
 * Submission Date:  03/05/2021
 *
 * Purpose: 
 * 
 * This program allows for a user to play Rock, Paper, Scissors 
 * against a computer. The user can input either rock, paper, or scissors
 * and the computer will respond with a random choice. The program also 
 * keeps track of the player and computer's points: if one wins a round, 
 * they get one point but do not score a point if they tie. The first while
 * loop continuously runs the game until the player or computer reaches the
 * points to win set by the player. Whatever the player inputs, 
 * the program determines the outcome of their choice through if 
 * statements that use the randomized computer outputs. If the player 
 * does not input either rock, paper, or scissors, not cases sensitive, 
 * then the program asks the player "Rock, Paper Scissors?" again. 
 * The scores are updated after every round, and the loop stops
 * when one of the players reaches the points to win. 
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

		int playerScore = 0;
		int computerScore = 0;
		boolean valid = false;
		String playerMove = "";

		System.out.print("Points to win: ");
		Scanner scan = new Scanner(System.in);
		int points = scan.nextInt();

		while (playerScore != points && computerScore != points) {
			while (!valid) {
				System.out.print("Rock, paper, or scissors? ");
				playerMove = scan.next();

				if (playerMove.equalsIgnoreCase("rock") || playerMove.equalsIgnoreCase("paper")
						|| playerMove.equalsIgnoreCase("scissors")) {
					valid = true;
				}
			}

			valid = false;
			String computerMove = ComputerOpponent.getMove();
			if (playerMove.equalsIgnoreCase("rock")) {
				if (computerMove.equals("rock")) {
					System.out.print("The computer chose rock, so its a tie. (" + playerScore + "-" + computerScore + ")\n");
				}
				if (computerMove.equals("scissors")) {
					playerScore += 1;
					System.out.print("The computer chose scissors, so you win! (" + playerScore + "-" + computerScore + ")\n");
				}
				if (computerMove.equals("paper")) {
					computerScore += 1;
					System.out.print("The computer chose paper, so you lose. (" + playerScore + "-" + computerScore + ")\n");
				}
			} 
			
			else if (playerMove.equalsIgnoreCase("scissors")) {
				if (computerMove.equals("rock")) {
					computerScore += 1;
					System.out.print("The computer chose rock, so you lose. (" + playerScore + "-" + computerScore + ")\n");
				}
				if (computerMove.equals("scissors")) {
					System.out.print("The computer chose scissors, so its a tie. (" + playerScore + "-" + computerScore + ")\n");
				}
				if (computerMove.equals("paper")) {
					playerScore += 1;
					System.out.print("The computer chose paper, so you win! (" + playerScore + "-" + computerScore + ")\n");
				}
			} 
			
			else if (playerMove.equalsIgnoreCase("paper")) {
				if (computerMove.equals("rock")) {
					playerScore += 1;
					System.out.print("The computer chose rock, so you win! (" + playerScore + "-" + computerScore + ")\n");
				}
				if (computerMove.equals("scissors")) {
					computerScore += 1;
					System.out.print("The computer chose scissors, so you lose. (" + playerScore + "-" + computerScore + ")\n");
				}
				if (computerMove.equals("paper")) {
					System.out.print("The computer chose paper, so its a tie. (" + playerScore + "-" + computerScore + ")\n");
				}
			}
		}

		if (playerScore == points) {
			System.out.print("Congratulations! You won!");
		} 
		else {
			System.out.print("Sorry, you lost. Better luck next time!");
		}

		scan.close();
	}
}