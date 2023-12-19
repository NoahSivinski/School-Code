
/*
 * RockPaperScissors.java
 * Author: Brandon Czech
 * Submission Date:  March 5, 2021
 *
 * Purpose: Allows the user to play rock, paper, scissors with a computer for as many rounds as they specify
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

class RockPaperScissors {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Points to win: ");
		int pointsToWin = keyboard.nextInt();
		keyboard.nextLine();

		int playerPoints = 0;
		int computerPoints = 0;
		String computerMove;

		while ((playerPoints < pointsToWin) && (computerPoints < pointsToWin)) {
			System.out.print("Rock, paper or scissors? ");
			String turn = keyboard.nextLine();
			if (turn.equalsIgnoreCase("rock") || turn.equalsIgnoreCase("paper") || turn.equalsIgnoreCase("scissors")) {
				computerMove = ComputerOpponent.getMove();
				if (turn.equalsIgnoreCase(computerMove))
					System.out.printf("The computer chose %s, so it''s a tie. (%d-%d)\n", computerMove, playerPoints,
							computerPoints);

				else if ((turn.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("scissors"))
						|| (turn.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("paper"))
						|| (turn.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock"))) {
					playerPoints++;
					System.out.printf("The computer chose %s, so you win! (%d-%d)\n", computerMove, playerPoints,
							computerPoints);
				} else {
					computerPoints++;
					System.out.printf("The computer chose %s, so you lose. (%d-%d)\n", computerMove, playerPoints,
							computerPoints);
				}
			}
		}
		if (playerPoints > computerPoints)
			System.out.println("Congratulations! You won!");
		else
			System.out.println("Sorry, you lost. Better luck next time!");
	}

}