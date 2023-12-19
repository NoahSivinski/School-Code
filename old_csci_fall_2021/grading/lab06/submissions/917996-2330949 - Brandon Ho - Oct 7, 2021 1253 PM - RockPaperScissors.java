/*
 * RockPaperScissors.java
 * Author:  Brandon Ho
 * Submission Date:  Oct 7 2021
 *
 * Purpose:allows user plays rock paper scissors against a computer to a user chosen amount of points
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
		String computerMove;
		int pointsToWin, scoreUser = 0, scoreComputer = 0;
		String choice;

		//asks user for points to win and stores
		System.out.print("Points to win: ");
		pointsToWin = keyboard.nextInt();

		//loops to keep game going while points to win has not been reached
		while(pointsToWin > scoreUser && pointsToWin > scoreComputer ) {

			//gets user to enter rock, paper, or scissors
			System.out.print("Rock, paper, or scissors? ");
			choice = keyboard.next();
			keyboard.nextLine();

			//takes only valid inputs
			if (choice.equalsIgnoreCase("rock") || choice.equalsIgnoreCase("paper") || choice.equalsIgnoreCase("scissors")) {

				//generate random computer choice
				computerMove = ComputerOpponent.getMove();

				//if computer and user choice is the same, tie occurs
				if(choice.equalsIgnoreCase(computerMove)) {
					System.out.println("The computer chose " + computerMove + ", so it's a tie." + " (" + scoreUser + "-" + scoreComputer + ")");
				}

				//if the user wins the current round
				else if((choice.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("scissors")) || (choice.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock")) || (choice.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("paper"))) {
					scoreUser++;
					System.out.println("The computer chose " + computerMove + ", so you win! " + " (" + scoreUser + "-" + scoreComputer + ")");
				}

				//if the user loses the current round
				else if((computerMove.equalsIgnoreCase("rock") && choice.equalsIgnoreCase("scissors")) || (computerMove.equalsIgnoreCase("paper") && choice.equalsIgnoreCase("rock")) || (computerMove.equalsIgnoreCase("scissors") && choice.equalsIgnoreCase("paper"))) {
					scoreComputer++;
					System.out.println("The computer chose " + computerMove + ", so you lose. " + " (" + scoreUser + "-" + scoreComputer + ")");
				}	

			}

		}
		
		//if user wins game
		if (scoreUser == pointsToWin) {
			System.out.println("Congratulations! You won!");
		}
		
		//if computer wins game
		else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		keyboard.close();

	}
}