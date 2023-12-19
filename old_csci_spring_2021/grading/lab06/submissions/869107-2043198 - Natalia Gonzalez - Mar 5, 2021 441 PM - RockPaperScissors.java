
/*
 * RockPaperScisssors.java
 * Author:  Natalia Gonzalez
 * Submission Date:  03-05-2021
 *
 * Purpose: This program is a game of rock, paper, scissors and the user will play with
 * the computer. It will also keep score and will take turns until the amount of "points to win" are played.
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
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Points to win:");
		double points = keyboard.nextDouble(); //pointsToWin the game
		int computerScore = 0;
		int userScore = 0;
		
		// the program will keep going until all rounds the user indicated are played.
		while (!(points == computerScore || points == userScore)) {
			System.out.print("Rock, paper, or scissors?");
			String myMove = keyboard.next();
			
			//if the users input isn't valid it will keep asking rock, paper, or scissors.
			while (!(myMove.equalsIgnoreCase("rock") || myMove.equalsIgnoreCase("scissors")
					|| myMove.equalsIgnoreCase("paper"))) {
				System.out.print("Rock, paper, or scissors?");
				myMove = keyboard.next();
			}

			String computerMove = "";
			computerMove = ComputerOpponent.getMove();
			
			//checks to see who won the round and keeps track of scores of both players.
			if (myMove.equalsIgnoreCase(computerMove)) {

				System.out.println("The computer chose " + computerMove + ", so it's a tie. " + "(" + userScore + "-"
						+ computerScore + ")");

			} else if ((myMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("scissors"))
					|| (myMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("paper"))
					|| (myMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock"))) {
				userScore++;
				System.out.println("The computer chose " + computerMove + ", so you win! " + "(" + userScore + "-"
						+ computerScore + ")");

			} else {
				computerScore++;
				System.out.println("The computer chose " + computerMove + ", so you lose. " + "(" + userScore + "-"
						+ computerScore + ")");

			}

		}
		//the game is finished and will let you know who won based on who won more games.
		if (computerScore >= userScore) {
			System.out.println("Sorry, you lost. Better luck next time!");
		} else {
			System.out.println("Congratulations! You won!");
		}
	}

}
