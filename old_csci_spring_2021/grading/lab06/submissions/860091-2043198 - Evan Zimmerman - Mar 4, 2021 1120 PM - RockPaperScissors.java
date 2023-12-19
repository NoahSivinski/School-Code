/*
 * RockPaperScissors.java
 * Author:  Evan Zimmerman 
 * Submission Date:  5th March 2021
 *
 * Purpose: The exercise being explored by Lab #5 is exploring applications of loops and strings in a "Rock, paper, scissors" game.
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

		Scanner input = new Scanner(System.in);

		//Get user input for the amount of points needed to win.
		System.out.print("Points to win: ");
		int pointsToWin = input.nextInt();

		//Declare variables for player and computer scores.
		int playerScore = 0;
		int computerScore = 0;
		
		
		//The main loop. playerScore and computerScore are both initialized to 0, and the program performs the while statement
		//until one of the two variables reaches the pointsToWin value (which is assumed to be an integer greater or equal to 1.)
		while ((playerScore != pointsToWin) && (computerScore != pointsToWin)) {
		
			//Declare the variable for the player's input inside the loop so that it is reset after each round.
			//Otherwise, the player's moves would be stuck as their first input for the entirety of the game.
			String playerInput = "";
			
			//For as long as the user's input is not "rock" "paper" or "scissors", prompts the user for an input.
			while (!playerInput.equalsIgnoreCase("rock") && !playerInput.equalsIgnoreCase("paper") && !playerInput.equalsIgnoreCase("scissors")) {
				System.out.print("Rock, paper, or scissors?");
				playerInput = input.next();
			} 

			//Get the computer's move from ComputerOpponent.java. 
			String computerInput = ComputerOpponent.getMove();
			
			//Checks if the two moves are the same, if so, does not update score and declares that a tie took place.
			if (computerInput.equalsIgnoreCase(playerInput)) {
				System.out.println("The computer chose " + computerInput + ", so it's a tie. (" + playerScore + "-" + computerScore + ")");
			}
			
			//Messy and repetitive code, but essentially it checks the user's input and depending on the computer's input,
			//updates one of the player's scores and notifies the user of the result. Each first nested if statement checks
			//if the user wins, and the following else-if statement checks if the user loses. It does not check for a tie
			//since that was already done by the above if statement.
			if (playerInput.equalsIgnoreCase("rock")) {
				if (computerInput.equalsIgnoreCase("scissors")) {
					playerScore++;
					System.out.println("The computer chose " + computerInput + ", so you win! (" + playerScore + "-" + computerScore + ")");
				} else if (computerInput.equalsIgnoreCase("paper")) {
					computerScore++;
					System.out.println("The computer chose " + computerInput + ", so you lose. (" + playerScore + "-" + computerScore + ")");
				}
			}
			if (playerInput.equalsIgnoreCase("paper")) {
				if (computerInput.equalsIgnoreCase("rock")) {
					playerScore++;
					System.out.println("The computer chose " + computerInput + ", so you win! (" + playerScore + "-" + computerScore + ")");
				} else if (computerInput.equalsIgnoreCase("scissors")) {
					computerScore++;
					System.out.println("The computer chose " + computerInput + ", so you lose. (" + playerScore + "-" + computerScore + ")");
				}
			}
			if (playerInput.equalsIgnoreCase("scissors")) {
				if (computerInput.equalsIgnoreCase("paper")) {
					playerScore++;
					System.out.println("The computer chose " + computerInput + ", so you win! (" + playerScore + "-" + computerScore + ")");
				} else if (computerInput.equalsIgnoreCase("rock")) {
					computerScore++;
					System.out.println("The computer chose " + computerInput + ", so you lose. (" + playerScore + "-" + computerScore + ")");
				}
			}
			
		}
		
		//Once the while loop is broken by either playerScore or computerScore reaching pointsToWin, prints a win or loss
		//statement depending on if the player's or computer's score reached pointsToWin.
		if (playerScore == pointsToWin) {
			System.out.println("Congratulations! You won!");
		} else if (computerScore == pointsToWin) {
			System.out.println("Sorry, you lost. Better luck next time!");
		}

		input.close();

	}

}
