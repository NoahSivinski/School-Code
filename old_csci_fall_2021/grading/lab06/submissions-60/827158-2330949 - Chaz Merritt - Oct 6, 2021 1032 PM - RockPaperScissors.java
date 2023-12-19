/*
 * RockPaperScissors.java
 * Author:  Charles Merritt 
 * Submission Date:  10/6/21
 *
 * Purpose: This Rock, Paper, Scissors program is exactly as you'd expect. It allows you to play
 * rock, paper, scissors with a 'pseudorandom' computer opponent. It takes in string inputs for 
 * the users selection of either rock, paper, or scissors, then compares that to the computer's
 * random selection and declares victory or loss. It also features a score tracker, replayablity
 * with loops. and interclass functionality.
 *
 * Statement of Academic Honesty: CEM
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

		// init
		String userMove, computerMove, winString, scoreBoard, rockVar, paperVar, scissorsVar;
		rockVar = "ROCK";
		paperVar = "PAPER";
		scissorsVar = "SCISSORS";
		int userScore = 0, computerScore = 0, pointsToWin = 0;
		scoreBoard = "(" + userScore + "-" + computerScore + ")";

		// inputs and game set up
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Points to win: ");
		pointsToWin = keyboard.nextInt();
		// start of loop
		while ((userScore < pointsToWin) && (computerScore < pointsToWin)) {
			System.out.print("Rock, paper, or scissors? ");
			userMove = keyboard.next();
			userMove = userMove.toUpperCase();
			computerMove = ComputerOpponent.getMove().toUpperCase();

			if ((userMove.equalsIgnoreCase(rockVar)) && (computerMove.equalsIgnoreCase(rockVar))) {
				winString = " it's a tie.";
				System.out.println("The computer chose "+ computerMove + ", so" + winString + " " + scoreBoard);
			}

			else if ((userMove.equalsIgnoreCase(rockVar)) && (computerMove.equalsIgnoreCase(paperVar))) {
				winString = " you lose.";
				computerScore += 1;
				scoreBoard = "(" + userScore + "-" + computerScore + ")";
				System.out.println("The computer chose "+ computerMove + ", so" + winString + " " + scoreBoard);

			}

			else if ((userMove.equalsIgnoreCase(rockVar)) && (computerMove.equalsIgnoreCase(scissorsVar))) {
				winString = " you win!";
				userScore += 1;
				scoreBoard = "(" + userScore + "-" + computerScore + ")";
				System.out.println("The computer chose "+ computerMove + ", so" + winString + " " + scoreBoard); 
			}

			else if ((userMove.equalsIgnoreCase(paperVar)) && (computerMove.equalsIgnoreCase(rockVar))) {
				winString = " you win!";
				userScore += 1;
				scoreBoard = "(" + userScore + "-" + computerScore + ")";
				System.out.println("The computer chose "+ computerMove + ", so" + winString + " " + scoreBoard); 
			}

			else if ((userMove.equalsIgnoreCase(paperVar)) && (computerMove.equalsIgnoreCase(paperVar))) {
				winString = " it's a tie.";
				System.out.println("The computer chose "+ computerMove + ", so" + winString + " " + scoreBoard); 
			}

			else if ((userMove.equalsIgnoreCase(paperVar)) && (computerMove.equalsIgnoreCase(scissorsVar))) {
				winString = " you lose.";
				computerScore += 1;
				scoreBoard = "(" + userScore + "-" + computerScore + ")";
				System.out.println("The computer chose "+ computerMove + ", so" + winString + " " + scoreBoard);
			}

			else if ((userMove.equalsIgnoreCase(scissorsVar)) && (computerMove.equalsIgnoreCase(rockVar))) {
				winString = " you lose.";
				computerScore += 1;
				scoreBoard = "(" + userScore + "-" + computerScore + ")";
				System.out.println("The computer chose "+ computerMove + ", so" + winString + " " + scoreBoard); 
			}

			else if ((userMove.equalsIgnoreCase(scissorsVar)) && (computerMove.equalsIgnoreCase(paperVar))) {
				winString = " you win!";
				userScore += 1;
				scoreBoard = "(" + userScore + "-" + computerScore + ")";
				System.out.println("The computer chose "+ computerMove + ", so" + winString + " " + scoreBoard); 
			}

			else if ((userMove.equalsIgnoreCase(scissorsVar)) && (computerMove.equalsIgnoreCase(scissorsVar))) {
				winString = " it's a tie.";
				System.out.println("The computer chose "+ computerMove + ", so" + winString + " " + scoreBoard); 
			}
			else {
				System.out.println("Invalid input");
			}
			if (userScore == pointsToWin) {
				System.out.println("Congratulations! You won!");
			}
			if (computerScore == pointsToWin) {
				System.out.println("Sorry, you lost. Better luck next time!");
			}
		}	
	}
}

