
/*
 * RockPaperScissors.java
 * Author:  Chloe Hangartner
 * Submission Date:  March 2, 2021
 *
 * Purpose: This application will allow users to
 * play multiple rounds of a game against the 
 * computer.
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

		// Create keyboard object and declare variables.

		Scanner keyboard = new Scanner(System.in);
		String userMove;
		int playerScore = 0, computerScore = 0, pointsToWin;

		// Prompt user for input on points needed to win.

		System.out.print("Points to win: ");
		pointsToWin = keyboard.nextInt();



		do {

			// User enters move, and computer generates move after prompt.

			System.out.print("Rock, paper, or scissors? ");
			userMove = keyboard.next();
			String computerMove = ComputerOpponent.getMove();

			if (userMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("rock")) {
				computerScore++;
				System.out.println("The computer chose rock, so you lose. " + " (" + playerScore + "-" + computerScore + ")");
			}
			if (userMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock")) {
				playerScore++;
				System.out.println("The computer chose rock, so you win!" + " (" + playerScore + "-" + computerScore + ")");
			}
			if (userMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("paper")) {
				playerScore++;
				System.out.println("The computer chose paper, so you win!" + " (" + playerScore + "-" + computerScore + ")");
			}
			if (userMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("paper")) {
				computerScore++;
				System.out.println("The computer chose paper, so you lose." + " (" + playerScore + "-" + computerScore + ")");
			}
			if (userMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("scissors")) {
				playerScore++;
				System.out.println("The computer chose scissors, so you win!" + " (" + playerScore + "-" + computerScore + ")");
			}
			if (userMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("scissors")) {
				computerScore++;
				System.out.println("The computer chose scissors, so you lose." + " (" + playerScore + "-" + computerScore + ")");
			}
			if (userMove.equalsIgnoreCase(computerMove)) {
				System.out.println("The computer chose " + computerMove + ", so it's a tie." + " (" + playerScore + "-" + computerScore + ")");

			}


			if (playerScore == pointsToWin) {
				System.out.println("Congratulations! You won!");
				System.exit(0);
			}
			if (computerScore == pointsToWin) {
				System.out.println("Sorry, you lost. Better luck next time!");
				System.exit(0);
			}


		} while (((playerScore < pointsToWin) || (computerScore < pointsToWin)));





		keyboard.close();
	}
}
