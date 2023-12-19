
/*
 * RockPaperScissors.java
 * Author:  Scott Wagner
 * Submission Date:  3/3/2021
 *
 * This program is a simple game of rock, paper, scissors played
 * between the user and the computer.
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

	public static final String ROCK_MOVE = "rock", PAPER_MOVE = "paper", SCISSORS_MOVE = "scissors";

	public static void main(String[] args) {

		String computerMove = "", playerMove = "";
		int pointsToWin = 0, playerScore = 0, computerScore = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Points to win: ");
		pointsToWin = scan.nextInt();

		do {

			// Player & computer chose move.
			System.out.print("Rock, paper, or scissors? ");
			playerMove = scan.next();
			computerMove = ComputerOpponent.getMove();
			
			// Move comparisons and score addition.
			if ((playerMove.equalsIgnoreCase(PAPER_MOVE)) && (computerMove.equalsIgnoreCase(PAPER_MOVE))) {
				System.out.print("The computer chose paper, so it's a tie.");
			} else if ((playerMove.equalsIgnoreCase(ROCK_MOVE)) && (computerMove.equalsIgnoreCase(ROCK_MOVE))) {
				System.out.print("The computer chose rock, so it's a tie.");
			} else if ((playerMove.equalsIgnoreCase(SCISSORS_MOVE)) && (computerMove.equalsIgnoreCase(SCISSORS_MOVE))) {
				System.out.print("The computer chose scissors, so it's a tie.");
			} else if ((playerMove.equalsIgnoreCase(PAPER_MOVE)) && (computerMove.equalsIgnoreCase(ROCK_MOVE))) {
				System.out.print("The computer chose rock, so you win!");
				playerScore++;
			} else if ((playerMove.equalsIgnoreCase(PAPER_MOVE)) && (computerMove.equalsIgnoreCase(SCISSORS_MOVE))) {
				System.out.print("The computer chose scissors, so you lose.");
				computerScore++;
			} else if ((playerMove.equalsIgnoreCase(ROCK_MOVE)) && (computerMove.equalsIgnoreCase(PAPER_MOVE))) {
				System.out.print("The computer chose paper, so you lose.");
				computerScore++;
			} else if ((playerMove.equalsIgnoreCase(ROCK_MOVE)) && (computerMove.equalsIgnoreCase(SCISSORS_MOVE))) {
				System.out.print("The computer chose scissors, so you win!");
				playerScore++;
			} else if ((playerMove.equalsIgnoreCase(SCISSORS_MOVE)) && (computerMove.equalsIgnoreCase(PAPER_MOVE))) {
				System.out.print("The computer chose paper, so you win!");
				playerScore++;
			} else if ((playerMove.equalsIgnoreCase(SCISSORS_MOVE)) && (computerMove.equalsIgnoreCase(ROCK_MOVE))) {
				System.out.print("The computer chose rock, so you lose.");
				computerScore++;
			} else {
				System.out.print("invalid input.");
			} // The invalid input message was added to satisfy the consideration "How do we
			 // "handle unindented input" on the lab page. Exact message was not specified. 

			System.out.print("  (" + playerScore + "-" + computerScore + ")\n");

			// Check for points to win against scores.
		} while ((computerScore < pointsToWin) && (playerScore < pointsToWin));
		
		// Declares winner outside of loop. 
		if (computerScore > playerScore) {
			System.out.println("Sorry, you lost. Better luck next time!");
		} else {
			System.out.println("Congratulations! You won!");
		}
		
		scan.close();
	} 

}
