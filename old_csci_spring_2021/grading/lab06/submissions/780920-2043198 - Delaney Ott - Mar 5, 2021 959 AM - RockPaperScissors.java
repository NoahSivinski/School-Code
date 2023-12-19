/*
 * RockPaperScissors.java
 * Author:  Delaney Ott 
 * Submission Date:  March 5th, 2021
 *
 * Purpose: This program is designed to run a version of the game
 * Rock, Paper, Scissors. In this version, the user plays against
 * the computer as many times as they want. After each game, the
 * program prints who won the game and it continuously runs until
 * either the user or computer reaches the points to win that is
 * determined by the user.
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

		double pointsToWin;
		String userMove;
		String computerMove;
		int userScore = 0;
		int computerScore = 0;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Points to win: ");
		pointsToWin = keyboard.nextDouble();

		do {
			System.out.print("Rock, paper, or scissors? ");
			userMove = keyboard.next();
			computerMove = ComputerOpponent.getMove();

			if (computerMove.equalsIgnoreCase("rock") && userMove.equalsIgnoreCase("scissors")) {
				computerScore++;
				System.out.println("The computer chose rock, so you lose." + " (" + userScore + "-" + computerScore + ")");
			}
			else if (computerMove.equalsIgnoreCase("rock") && userMove.equalsIgnoreCase("paper")) {
				userScore++;
				System.out.println("The computer chose rock, so you win!" + " (" + userScore + "-" + computerScore + ")");
			}
			else if (computerMove.equalsIgnoreCase("rock") && userMove.equalsIgnoreCase("rock")) {
				System.out.println("The computer chose rock, so it's a tie." + " (" + userScore + "-" + computerScore + ")");
			}
			else if (computerMove.equalsIgnoreCase("paper") && userMove.equalsIgnoreCase("scissors")) {
				userScore++;
				System.out.println("The computer chose paper, so you win!" + " (" + userScore + "-" + computerScore + ")");
			}
			else if (computerMove.equalsIgnoreCase("paper") && userMove.equalsIgnoreCase("paper")) {
				System.out.println("The computer chose paper, so it's a tie." + " (" + userScore + "-" + computerScore + ")");
			}
			else if (computerMove.equalsIgnoreCase("paper") && userMove.equalsIgnoreCase("rock")) {
				computerScore++;
				System.out.println("The computer chose paper, so you lose." + " (" + userScore + "-" + computerScore + ")");
			}
			else if (computerMove.equalsIgnoreCase("scissors") && userMove.equalsIgnoreCase("scissors")) {
				System.out.println("The computer chose scissors, so it's a tie." + " (" + userScore + "-" + computerScore + ")");
			}
			else if (computerMove.equalsIgnoreCase("scissors") && userMove.equalsIgnoreCase("paper")) {
				computerScore++;
				System.out.println("The computer chose scissors, so you lose." + " (" + userScore + "-" + computerScore + ")");
			}
			else if (computerMove.equalsIgnoreCase("scissors") && userMove.equalsIgnoreCase("rock")) {
				userScore++;
				System.out.println("The computer chose scissors, so you win!" + " (" + userScore + "-" + computerScore + ")");
			}
		} while ((userScore < pointsToWin) && (computerScore < pointsToWin));

		if (userScore < computerScore) {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		else {
			System.out.println("Congratulations! You won!");
		}
		keyboard.close();
	}

}
