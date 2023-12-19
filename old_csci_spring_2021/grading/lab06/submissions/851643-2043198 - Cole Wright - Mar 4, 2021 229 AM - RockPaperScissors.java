/*
 * GradeCalculator.java
 * Author:  Cole Wright 
 * Submission Date:  3/4/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program runs a game of rock, paper, scissors against the computer. It asks the user to input what they are 
 * playing to and then asks them what their move is, rock, paper, or scissors. The computer randomly generates a move
 * and depending on who wins, it will output the winner of that turn and the score. If the user wins game won it will
 * show that they are up (1-0). Once either the CPU or user has reached the desired score, the game will end and a winner
 * will be announced. The game is run on a loop and will go until a winner has been crowned.
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

		int winningScore;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Points to win: ");
		winningScore = keyboard.nextInt();

		int cpuScore = 0;
		int userScore = 0;
		String userMove;
		String cpuMove;

		while ((cpuScore < winningScore) && (userScore < winningScore)) {
			System.out.print("Rock, paper, or scissors? ");
			userMove = keyboard.next();
			cpuMove = ComputerOpponent.getMove();

			if ((userMove.equalsIgnoreCase("rock") && cpuMove.equalsIgnoreCase("paper"))
					|| (userMove.equalsIgnoreCase("paper") && cpuMove.equalsIgnoreCase("scissors"))
					|| (userMove.equalsIgnoreCase("scissors") && cpuMove.equalsIgnoreCase("rock"))) {
				cpuScore++;
				System.out.println(
						"The computer chose " + cpuMove + ", so you lose. (" + userScore + "-" + cpuScore + ")");
			}

			else if (userMove.equalsIgnoreCase(cpuMove)) {
				System.out.println(
						"The computer chose " + cpuMove + ", so it's a tie.  (" + userScore + "-" + cpuScore + ")");
			}

			else if ((cpuMove.equalsIgnoreCase("rock") && userMove.equalsIgnoreCase("paper"))
					|| (cpuMove.equalsIgnoreCase("paper") && userMove.equalsIgnoreCase("scissors"))
					|| (cpuMove.equalsIgnoreCase("scissors") && userMove.equalsIgnoreCase("rock"))) {

				userScore++;
				System.out.println(
						"The computer chose " + cpuMove + " , so you win!  (" + userScore + "-" + cpuScore + ")");
			}

		}
		if (userScore > cpuScore) {
			System.out.println("Congratulations! You won!");
		} else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		keyboard.close();
	}
}
