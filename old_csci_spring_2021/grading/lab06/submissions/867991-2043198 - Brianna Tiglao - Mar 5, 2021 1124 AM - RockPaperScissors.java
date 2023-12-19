/*
 * RockPaperScissors.java
 * Author:  Brianna Tiglao 
 * Submission Date:  March 05, 2021
 *
 * Purpose: This program takes a user's input out of the three choices (rock, paper, scissors)
 * and compares it to the computer's output (the same three choices) to check who wins
 * for a game of rock, paper, scissors.
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

		int points = 0;
		int playerPoints = 0;
		int computerPoints = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Points to win: ");
		points = input.nextInt();
		input.nextLine();

		while (playerPoints != points && computerPoints != points) {

			System.out.print("Rock, paper, or scissors? ");
			String playerMove = input.nextLine().trim();
			String computerMove = ComputerOpponent.getMove(); 
			
			if (playerMove.equalsIgnoreCase(computerMove)) {

				System.out.println("The computer chose " + computerMove + ", so it's a tie.  (" + playerPoints + "-"+ computerPoints +")");
			}
			else if (playerMove.equalsIgnoreCase("rock") && !computerMove.equalsIgnoreCase("paper") || playerMove.equalsIgnoreCase("scissors") && !computerMove.equalsIgnoreCase("rock") || playerMove.equalsIgnoreCase("paper") && !computerMove.equalsIgnoreCase("scissors")) {

				playerPoints++;
				System.out.println("The computer chose " + computerMove + ", so you win!  (" + playerPoints + "-"+ computerPoints +")");
			}
			else if (playerMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("paper") || playerMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("rock") || playerMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("scissors")) {

				computerPoints++;
				System.out.println("The computer chose " + computerMove + ", so you lose.  (" + playerPoints + "-"+ computerPoints +")");
			}
			if (playerPoints == points) {

				System.out.println("Congratulations! You won!");
			}
			else if (computerPoints == points){

				System.out.println("Sorry, you lost. Better luck next time!");
			}	

		}
		input.close();
	}
}

