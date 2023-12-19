
/*
 * RockPaperScissors.java
 * Author:  Deborah Orekoya 
 * Submission Date:  03/5/2021
 *
 * Purpose: 
 * 
 * The purpose of this program is to implement a version of Rock, 
 * Paper, Scissors where the user plays against the computer. The
 * user is able to input in his or her choice as a String (either 
 * "rock", "paper", or "scissors,") and the computer will make its
 * choice at pseudorandom. Then the winner is then determined based 
 * on certain rules.
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

		//Declare and initialize variables
		int UserScore = 0;
		int ComputerScore = 0;
		String computerMove;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Points to win: ");
		int PointsToWin = keyboard.nextInt();

		while (!(UserScore == PointsToWin)) {
			System.out.print("Rock, paper, or scissors?");
			String UserMove = keyboard.next().toLowerCase();
			//UserMove has to be rock, paper or scissors or the program will ask the question again until the right input occurs
			while (!(UserMove.equalsIgnoreCase("rock") || UserMove.equalsIgnoreCase("paper") || UserMove.equalsIgnoreCase("scissors"))) {
				System.out.print("Rock, paper, or scissors?");
				UserMove = keyboard.next().toLowerCase();
			}

			computerMove = ComputerOpponent.getMove();

			// Check for correct moves
			if (UserMove.equals(computerMove))
				System.out.println("The computer chose " + computerMove + ", so it's a tie. (" + UserScore + "-"+ ComputerScore + ")");
			// if UserMove is rock
			else if (UserMove.equals("rock")) {
				if (computerMove.equals("scissors")) {
					UserScore++;
					System.out.println(
							"The computer chose scissors, so you win! (" + UserScore + "-" + ComputerScore + ")");
					// UserScore++;
				} else if (computerMove.equals("paper")) {
					ComputerScore++;
					System.out.println(
							"The computer chose paper, so you lose. (" + UserScore + "-" + ComputerScore + ")");
					// ComputerScore++;
				}
			}
			// if UserMove is paper
			else if (UserMove.equals("paper")) {
				if (computerMove.equals("scissors")) {
					ComputerScore++;
					System.out.println(	"The computer chose scissors, so you lose. (" + UserScore + "-" + ComputerScore + ")");
					// ComputerScore++;
				} else if (computerMove.equals("rock")) {
					UserScore++;
					System.out.println(	"The computer chose rock, so you win! (" + UserScore + "-" + ComputerScore + ")");
					// UserScore++;
				}
			}
			// if UserMove is scissors
			else if (UserMove.equals("scissors")) {
				if (computerMove.equals("paper")) {
					UserScore++;
					System.out.println(
							"The computer chose paper, so you win! (" + UserScore + "-" + ComputerScore + ")");
					// UserScore++;
				} else if (computerMove.equals("rock")) {
					ComputerScore++;
					System.out.println(
							"The computer chose rock, so you lose. (" + UserScore + "-" + ComputerScore + ")");
					// ComputerScore++;
				}
			}
			// Print score
			if (UserScore == PointsToWin) {
				System.out.println("Congratulations! You won!");
				System.exit(0);
			} else if (ComputerScore == PointsToWin) {
				System.out.println("Sorry, you lost. Better luck next time!");
				System.exit(0);
			}

		}
		keyboard.close();
	}

}
