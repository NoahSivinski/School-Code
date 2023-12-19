/*
 * RockPaperScissors.java
 * Author:  Jaren Spitters 
 * Submission Date:  03/03/2021
 *
 * Purpose: This program allows a user to play the game Rock, Paper, Scissors with a computer. The program will ask the user 
 * how many points they would like to play to in order to win, and then it starts the game. The computer will ask the user if they 
 * choose rock, paper, or scissors. it will move on unless the user enters an answer other than "rock", "paper", or "scissors," in 
 * which case it will prompt the user until it gets a valid answer.Once the player loses, wins, or ties a match, it will notify 
 * them of their loss/win/tie and then display the score. Once either the computer or the user have enough points, the game is 
 * over, and the computer consoles or congratulates the user based on the outcome.
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
		int points = 0;
		int losses = 0;
		String move = "";
		boolean moveIsValid = false;

		System.out.println("Points to Win: ");
		int pointsToWin = keyboard.nextInt();
		@SuppressWarnings("unused")								//to take away the warning for the unused variable emptyStr
		String emptyStr = keyboard.nextLine();					//to account for the '\n' left behind after the reading of pointsToWin
		while ((points < pointsToWin) && (losses < pointsToWin)) {

			moveIsValid = false;
			while (moveIsValid == false) {

			System.out.println("Rock, paper, or scissors?");
				
				move = keyboard.nextLine();

			if (move.equalsIgnoreCase("rock") || move.equalsIgnoreCase("paper")
					|| move.equalsIgnoreCase("scissors")) {
				moveIsValid = true;
				
			} else {
				
				moveIsValid = false;
				}
			}

			String computerMove = ComputerOpponent.getMove();

			if (((move.equalsIgnoreCase("rock")) && (computerMove.equalsIgnoreCase("paper")))
					|| ((move.equalsIgnoreCase("paper")) && (computerMove.equalsIgnoreCase("scissors")))
					|| ((move.equalsIgnoreCase("scissors")) && (computerMove.equalsIgnoreCase("rock")))) {

				losses++;
				System.out.println(
						"The computer chose " + computerMove + ", so you lose. " + "(" + points + "-" + losses + ")");

			} else if (move.equalsIgnoreCase(computerMove)) {

				System.out.println(
						"The computer chose " + computerMove + ", so it's a tie. " + "(" + points + "-" + losses + ")");

			} else {

				points++;
				System.out.println(
						"The computer chose " + computerMove + ", so you win! " + "(" + points + "-" + losses + ")");
			}
		}

		if (points == pointsToWin) {
			System.out.println("Congratulations! You won!");

		} else {

			System.out.println("Sorry, you lost. Better luck next time!");
		}

		keyboard.close();

	}
}
