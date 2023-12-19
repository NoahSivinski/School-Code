
/*
 * [RockPaperScissors].java
 * Author:  [Sona Makkanal] 
 * Submission Date:  [3-5-21]
 *
 * Purpose: The purpose of this program is to play a game of rock, paper, scissors with the computer using loops.
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
		// declaring the variables
		int pointsToWin;
		int computerScore = 0;
		int userScore = 0;
		String computerMove;
		String userMove;

		System.out.print("Points to win: ");
		pointsToWin = keyboard.nextInt();
		keyboard.nextLine();
		// loop
		while ((computerScore != pointsToWin) && (userScore != pointsToWin)) {

			System.out.print("Rock, paper, or scissors? ");
			userMove = keyboard.next();

			computerMove = ComputerOpponent.getMove();
			// tie
			if (computerMove.equalsIgnoreCase(userMove))
				System.out.println("The computer chose " + userMove + ", so it's a tie. " + "(" + userScore + "-"
						+ computerScore + ")");
			// user chooses rock
			else if (userMove.equalsIgnoreCase("rock")) {
				if (computerMove.equalsIgnoreCase("paper")) {
					computerScore++;
					System.out.println(
							"The computer chose paper, so you lose. " + "(" + userScore + "-" + computerScore + ")");

				} else if (computerMove.equalsIgnoreCase("scissors")) {
					userScore++;
					System.out.println(
							"The computer chose scissors, so you win! " + "(" + userScore + "-" + computerScore + ")");
					// user chooses paper
				}
			} else if (userMove.equalsIgnoreCase("paper")) {
				if (computerMove.equalsIgnoreCase("rock")) {
					userScore++;
					System.out.println(
							"The computer chose rock, so you win! " + "(" + userScore + "-" + computerScore + ")");

				} else if (computerMove.equalsIgnoreCase("scissors")) {
					computerScore++;
					System.out.println(
							"The computer chose scissors, so you lose. " + "(" + userScore + "-" + computerScore + ")");

				}
			}
			// user chooses scissors
			else if (userMove.equalsIgnoreCase("scissors")) {
				if (computerMove.equalsIgnoreCase("paper")) {
					userScore++;
					System.out.println(
							"The computer chose paper, so you win! " + "(" + userScore + "-" + computerScore + ")");

				} else if (computerMove.equalsIgnoreCase("rock")) {
					computerScore++;
					System.out.println(
							"The computer chose rock, so you lose. " + "(" + userScore + "-" + computerScore + ")");

				}
			}

		}
		// game results
		if (userScore < computerScore)
			System.out.println("Sorry, you lost. Better luck next time!");
		else
			System.out.println("Congratulations! You won!");

		keyboard.close();
	}

	{
	}

}
