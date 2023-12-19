/*
 * RockPaperScissors.java
 * Author:  Cole Lanham
 * Submission Date:  3/5/21
 *
 * Purpose: This program applies our newly found understanding of loops to 
 * create a game of rock, paper, scissors. The program asks the user for the amount 
 * of points to win, then prompts the user for what they want to play. Next, calculates if
 * the input is valid then finds if it beats or loses to a randomized choice by an already developed method.
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
		Scanner keyboard = new Scanner(System.in);

		//Initial variable declaration and initialization
		int pointsToWin;
		int count = 0;
		int computerScore = 0;
		int userScore = 0;
		String computerMove;
		String nextMove;

		System.out.print("Points to win: ");
		pointsToWin = keyboard.nextInt();

		//Loop which controls the game until the amount of possible rounds is achieved
		do {
			System.out.print("Rock, paper, or scissors? "); //Initial Prompt
			nextMove = keyboard.next();
			computerMove = ComputerOpponent.getMove(); //Reinitialize computerMove for each iteration of loop

			if ((nextMove.equalsIgnoreCase("rock")) || (nextMove.equalsIgnoreCase("paper")) || (nextMove.equalsIgnoreCase("scissors"))) {
				//Calculates an output based on user input and randomized computerMove

				if (computerMove.equalsIgnoreCase("rock")) {
					if (nextMove.equalsIgnoreCase("paper")) {
						userScore++;
						System.out.println("The computer chose " + computerMove + ", so you win! (" + userScore + "-" + computerScore + ")");//Win
						count++;
					}
					if (nextMove.equalsIgnoreCase("scissors")) {
						computerScore++;
						System.out.println("The computer chose " + computerMove + ", so you lose. (" + userScore + "-" + computerScore + ")"); //Loss
						count++;
					}
					if (nextMove.equalsIgnoreCase("rock")) {
						System.out.println("The computer chose " + computerMove + ", so it's a tie. (" + userScore + "-" + computerScore + ")"); //Tie
					}

				}
				
				//Computer Chooses Paper
				else if (computerMove.equalsIgnoreCase("paper")){
					if (nextMove.equalsIgnoreCase("scissors")) {
						userScore++;
						System.out.println("The computer chose " + computerMove + ", so you win! (" + userScore + "-" + computerScore + ")");
						count++;
					}
					if (nextMove.equalsIgnoreCase("rock")) {
						computerScore++;
						System.out.println("The computer chose " + computerMove + ", so you lose. (" + userScore + "-" + computerScore + ")");
						count++;
					}
					if (nextMove.equalsIgnoreCase("paper")) {
						System.out.println("The computer chose " + computerMove + ", so it's a tie. (" + userScore + "-" + computerScore + ")");
					}
						
				}
				//Computer Chooses Scissors
				else if (computerMove.equalsIgnoreCase("scissors")){
					if (nextMove.equalsIgnoreCase("rock")) {
						userScore++;
						System.out.println("The computer chose " + computerMove + ", so you win! (" + userScore + "-" + computerScore + ")");
						count++;
					}
					if (nextMove.equalsIgnoreCase("paper")) {
						computerScore++;
						System.out.println("The computer chose " + computerMove + ", so you lose. (" + userScore + "-" + computerScore + ")");;
						count++;
					}
					if (nextMove.equalsIgnoreCase("scissors")) {
						System.out.println("The computer chose " + computerMove + ", so it's a tie. (" + userScore + "-" + computerScore + ")" );
					}	
				}
			}

			else { //If the the user doesn't input a correct choice, the loop repeats until they do
			}

		} while (count < pointsToWin);
		
		//Final winning calculations 
		if (userScore > computerScore)
			System.out.println("Congratulations! You won!");
		else if (userScore == computerScore)
			System.out.println("It's a tie! Please try again."); //This isn't in the lab instructions but I just thought it was a necessary possibilty 
		else
			System.out.println("Sorry, you lost. Better luck next time!");

		keyboard.close();	

	}

}
