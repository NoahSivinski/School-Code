/*
 * RockPaperScissors.java
 * Author:  Nazha Erakat
 * Submission Date:  3/5/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program is a rock, paper, scissors game between the user and a computer. The user will be able to play as many rounds of rock, paper, or scissors as they specify. 
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

		int yourScore = 0; 
		int compScore = 0;    // the computer's score

		System.out.print("Points to win:\t");
		int points = keyboard.nextInt();
		keyboard.nextLine();

		String yourMove;              // the user's input (move)
		String computerMove;         // the computer's move

		while (!(yourScore == points) && (!(compScore == points))) {

			System.out.print("Rock, paper, or scissors?");
			yourMove = keyboard.nextLine();

			computerMove = ComputerOpponent.getMove();

			if (yourMove.equalsIgnoreCase(computerMove)) {
				System.out.println("The computer chose " + computerMove + ", so it's a tie. " + " (" + yourScore + "-"
						+ compScore + ")");
			}
			if (yourMove.equalsIgnoreCase("rock") && computerMove.equals("scissors")) {
				yourScore++;
				System.out
						.println("The computer chose scissors, so you win! " + "(" + yourScore + "-" + compScore + ")");
			} else if (yourMove.equalsIgnoreCase("scissors") && computerMove.equals("rock")) {
				compScore++;
				System.out.println("The computer chose rock, so you lose. " + "(" + yourScore + "-" + compScore + ")");
			}
			if (yourMove.equalsIgnoreCase("rock") && computerMove.equals("paper")) {
				compScore++;
				System.out.println("The computer chose paper, so you lose. " + "(" + yourScore + "-" + compScore + ")");
			} else if (yourMove.equalsIgnoreCase("paper") && computerMove.equals("rock")) {
				yourScore++;
				System.out.println("The computer chose rock, so you win! " + "(" + yourScore + "-" + compScore + ")");
			}
			if (yourMove.equalsIgnoreCase("paper") && computerMove.equals("scissors")) {
				compScore++;
				System.out.println(
						"The computer chose scissors, so you lose. " + "(" + yourScore + "-" + compScore + ")");
			} else if (yourMove.equalsIgnoreCase("scissors") && computerMove.equals("paper")) {
				yourScore++;
				System.out.println("The computer chose paper, so you win! " + "(" + yourScore + "-" + compScore + ")");
			} else if (!(yourMove.equalsIgnoreCase("rock")
					|| (yourMove.equalsIgnoreCase("paper") || (yourMove.equalsIgnoreCase("scissors"))))) {
				System.out.print("Invalid input. Please choose rock, paper, or scisssors.\n");
			}
		}

		if (yourScore == points) {
			System.out.print("Congratulations! You won!");
		}

		else if (compScore == points) {
			System.out.print("Sorry, you lost. Better luck next time.");
		}

	}

}
