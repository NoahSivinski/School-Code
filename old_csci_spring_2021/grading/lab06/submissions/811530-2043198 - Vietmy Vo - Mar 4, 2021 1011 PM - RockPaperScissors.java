/*
 * RockPaperScissors.java
 * Author:  Vietmy Vo
 * Submission Date:  3/4/2021
 *
 * Purpose: This is a rock, paper, scissors program that allows for user input of rock, paper,
 * or scissors. The opponent is a computer that randomly generates rock, paper, or scissors and the 
 * game continues until either the computer or user reaches the desired points to win number.
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

		System.out.print("Points to win:\t");
		int pointsToWin = keyboard.nextInt();
		keyboard.nextLine();

		int compPoints = 0;
		int playerPoints = 0;

		while (!(pointsToWin == compPoints || pointsToWin == playerPoints)) {
			System.out.print("Rock, paper, or scissors?");
			String input = keyboard.nextLine();
			if (input.equalsIgnoreCase("rock") || (input.equalsIgnoreCase("paper"))
					|| (input.equalsIgnoreCase("scissors"))) {
				computerMove = ComputerOpponent.getMove();

				if (input.equalsIgnoreCase("rock")) {
					if (computerMove == "rock") {
						System.out.println("The computer chose rock, so it's a tie. (" + playerPoints + "-" + compPoints + ")");
						
					} else if (computerMove == "paper") {
						compPoints++;
						System.out.println("The computer chose paper, so you lose.(" + playerPoints + "-" + compPoints + ")");
					} else if (computerMove == "scissors") {
						playerPoints++;
						System.out.println("The computer chose scissors, so you win!(" + playerPoints + "-" + compPoints + ")");
					}
				} else if (input.equalsIgnoreCase("paper")) {
					if (computerMove == "rock") {
						playerPoints++;
						System.out.println("The computer chose rock, so you win!(" + playerPoints + "-" + compPoints + ")");
					} else if (computerMove == "paper") {
						System.out.println("The computer chose paper, so it's a tie.(" + playerPoints + "-" + compPoints + ")");
					} else if (computerMove == "scissors") {
						compPoints++;
						System.out.println("The computer chose scissors, so you lose.(" + playerPoints + "-" + compPoints + ")");
					}
				} else if (input.equalsIgnoreCase("scissors")) {
					if (computerMove == "rock") {
						compPoints++;
						System.out.println("The computer chose rock, so you lose.(" + playerPoints + "-" + compPoints + ")");
					} else if (computerMove == "paper") {
						playerPoints++;
						System.out.println("The computer chose paper, so you win!(" + playerPoints + "-" + compPoints + ")");
					} else if (computerMove == "scissors") {
						System.out.println("The computer chose scissors, so it's a tie.(" + playerPoints + "-" + compPoints + ")");
					}

				}
			}

		}
		if (playerPoints == pointsToWin)
			System.out.println("Congratulations! You won!");
		else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		keyboard.close();
	}
}
