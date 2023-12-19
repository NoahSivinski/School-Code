/*
 * RockPaperScissors.java
 * Author:  Anna Kerber
 * Submission Date:  3/5/21
 *
 * Purpose: The purpose of this program is to let a person play
 * rock, paper, scissors against a computer. The person can input
 * the number of points needed to win, and the program will tell
 * the player if they won each round and if they won the entire 
 * game.
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
		Scanner scanner = new Scanner(System.in);
		String yourMove, computerMove;
		int pointsToWin, yourCount = 0, computerCount = 0;

		System.out.print("Points to win: ");
		pointsToWin = scanner.nextInt();
		scanner.nextLine();

		while (yourCount < pointsToWin && computerCount < pointsToWin) {
			System.out.print("Rock, paper, or scissors? ");
			yourMove = scanner.nextLine().toUpperCase();
			computerMove = ComputerOpponent.getMove();
			while (!(yourMove.equals("ROCK") || yourMove.equals("SCISSORS") || yourMove.equals("PAPER"))) {
				System.out.print("Invalid input. Rock, paper, or scissors? ");
				yourMove = scanner.nextLine().toUpperCase();
			}
			if (yourMove.equals(computerMove.toUpperCase())) {
				System.out.println("The computer chose " + computerMove + ", so it's a tie. (" + yourCount + "-"
						+ computerCount + ")");
			} else if ((yourMove.equals("SCISSORS") && computerMove.equals("rock"))
					|| (yourMove.equals("PAPER") && computerMove.equals("scissors"))
					|| (yourMove.equals("ROCK") && computerMove.equals("paper"))) {
				computerCount++;
				System.out.println("The computer chose " + computerMove + ", so you lose. (" + yourCount + "-"
						+ computerCount + ")");
			} else {
				yourCount++;
				System.out.println("The computer chose " + computerMove + ", so you win! (" + yourCount + "-"
						+ computerCount + ")");
			}

		}
		if (yourCount > computerCount) {
			System.out.println("Congratulations! You won!");
		} else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}

		scanner.close();
	}
}
