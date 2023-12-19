/*
 * RockPaperScissors.java
 * Author:  Ashlin Yeo
 * Submission Date:  10/5/2021
 *
 * Purpose: This program allows the user to play a game of Rock, Paper, Scissors.
 * After entering the amount of points needed to win the game, the program
 * will ask the user to make a move, and then will show the computer's move
 * and its outcome as well as the score.
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
		int pointsToWin, userScore = 0, computerScore = 0;
		String userMove, computerMove;

		System.out.print("Points to win: ");
		pointsToWin = keyboard.nextInt();
		while (userScore < pointsToWin && computerScore < pointsToWin) { //While no one has won
			System.out.print("Rock, paper, or scissors? ");
			userMove = keyboard.next().toLowerCase().trim();
			if (userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissors")) { //If user input is valid
				computerMove = ComputerOpponent.getMove();
				//All possible combinations of user and computer moves
				if (userMove.equals("rock") && computerMove.equals("scissors")) {
					userScore++;
					System.out.println("The computer chose " + computerMove + ", so you win! (" + userScore + "-" + computerScore + ")");
				}
				if (userMove.equals("rock") && computerMove.equals("paper")) {
					computerScore++;
					System.out.println("The computer chose " + computerMove + ", so you lose. (" + userScore + "-" + computerScore + ")");
				}
				if (userMove.equals("rock") && computerMove.equals("rock")) {
					System.out.println("The computer chose " + computerMove + ", so it's a tie. (" + userScore + "-" + computerScore + ")");
				}
				if (userMove.equals("paper") && computerMove.equals("scissors")) {
					computerScore++;
					System.out.println("The computer chose " + computerMove + ", so you lose. (" + userScore + "-" + computerScore + ")");
				}
				if (userMove.equals("paper") && computerMove.equals("paper")) {
					System.out.println("The computer chose " + computerMove + ", so it's a tie. (" + userScore + "-" + computerScore + ")");
				}
				if (userMove.equals("paper") && computerMove.equals("rock")) {
					userScore++;
					System.out.println("The computer chose " + computerMove + ", so you win! (" + userScore + "-" + computerScore + ")");
				}
				if (userMove.equals("scissors") && computerMove.equals("scissors")) {
					System.out.println("The computer chose " + computerMove + ", so it's a tie. (" + userScore + "-" + computerScore + ")");
				}
				if (userMove.equals("scissors") && computerMove.equals("paper")) {
					userScore++;
					System.out.println("The computer chose " + computerMove + ", so you win! (" + userScore + "-" + computerScore + ")");
				}
				if (userMove.equals("scissors") && computerMove.equals("rock")) {
					computerScore++;
					System.out.println("The computer chose " + computerMove + ", so you lose. (" + userScore + "-" + computerScore + ")");
				}
			} //end of if statement
		} //end of while loop
		if (userScore > computerScore) {
			System.out.print("Congratulations! You won!");
		}
		else {
			System.out.print("Sorry, you lost. Better luck next time!");
		}
	}
}
