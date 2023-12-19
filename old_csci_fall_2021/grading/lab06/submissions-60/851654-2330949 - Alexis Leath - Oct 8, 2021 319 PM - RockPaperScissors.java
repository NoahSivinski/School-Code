
 /* RockPaperScissors.java
 * Author:  Alexis Leath
 * Submission Date:  10/08/2021
 *
 * Purpose: This program plays a game of rock paper scissors with a computer opponent who chooses
 *  its turn at random.
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
		Scanner scanner = new Scanner (System.in);
		int pointToWin;
		String computerMove;
		String myMove;
		int myPoints = 0; int computerPoints = 0;

		System.out.print("Point to win: ");
		pointToWin = Integer.parseInt(scanner.nextLine());

		while (computerPoints < pointToWin && myPoints < pointToWin) {
			System.out.print("Rock, paper, or scissors? ");
			myMove = scanner.nextLine();
			if (!(myMove.equalsIgnoreCase("rock") || myMove.equalsIgnoreCase("paper") || (myMove.equalsIgnoreCase("scissors")))) {
				continue;
			}
			computerMove = ComputerOpponent.getMove();
			if (myMove.equalsIgnoreCase("rock") && computerMove.equals("scissors")) {
				myPoints++;
				System.out.println("The computer chose scissors, so you win. (" + myPoints + "-" + computerPoints + ")");
			}
			else if (myMove.equalsIgnoreCase("rock") && computerMove.equals("paper")) {
				computerPoints++;
				System.out.println("The computer chose paper, so you lose. (" + myPoints + "-" + computerPoints + ")");
			}
			else if (myMove.equalsIgnoreCase("paper") && computerMove.equals("scissors")) {
				computerPoints++;
				System.out.println("The computer chose scissors, so you lose. (" + myPoints + "-" + computerPoints + ")");
			}
			else if (myMove.equalsIgnoreCase("paper") && computerMove.equals("rock")) {
				myPoints++;
				System.out.println("The computer chose rock, so you win. (" + myPoints + "-" + computerPoints + ")");
			}
			else if (myMove.equalsIgnoreCase("scissors") && computerMove.equals("rock")) {
				computerPoints++;
				System.out.println("The computer chose rock, so you lose. (" + myPoints + "-" + computerPoints + ")");
			}
			else if (myMove.equalsIgnoreCase("scissors") && computerMove.equals("paper")) {
				myPoints++;
				System.out.println("The computer chose paper, so you win. (" + myPoints + "-" + computerPoints + ")");
			}
			else if (myMove.equalsIgnoreCase(computerMove)) {
				System.out.println("The computer chose " + computerMove + ", so it's a tie. (" + myPoints + "-" + computerPoints + ")");
			}

		}
		if (myPoints == pointToWin ) {
			System.out.println("Congratulations! You won!");
		}
		else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}

		scanner.close();
	}
}



