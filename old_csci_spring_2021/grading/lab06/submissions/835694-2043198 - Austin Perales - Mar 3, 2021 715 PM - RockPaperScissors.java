/*
 * [RockPaperScissors.java]
 * Author:  [Austin Perales] 
 * Submission Date:  [3/3/2021]
 *
 * This program does the following: 
 * RockPaperScissors.java allows the user to play the computer in a game of rock, paper, scissors.
 * It begins by prompting the user for the amount of points needed to reach by either the user or 
 * the computer for the game to be over. Then, it asks the user for their input of rock, paper, or 
 * scissors. If they win, they get a point. If they lose, the computer gets a point, otherwise if 
 * they tie, no points are awarded. The game continues until either the user or the computer gets the
 * necessary amount of points to win.
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
		
		//Initializing a scanner object and asking the user for the points needed to win the game
		Scanner input = new Scanner(System.in);
		System.out.print("Points to win: ");
		int pointsToWin = input.nextInt();
		input.nextLine();
		
		//Initializing the userMove and computerMove Strings to hold the String value of the move for the turn
		//along with the userScore and computerScore during the game
		String userMove;
		String computerMove;
		int userScore = 0;
		int computerScore = 0;

		//while loop that repeats the game until either the user or the computer reaches the score needed to win
		while ( (userScore < pointsToWin) && (computerScore < pointsToWin) ) {
			
			//asking the user for their input one time to begin the loop and storing it in userMove. .trim() is used in case there are
			//extra spaces added before or after the word when typed
			System.out.print("Rock, paper, or scissors? ");
			userMove = input.nextLine();
			userMove = userMove.trim();

			//if statement that checks to make sure the user inputs a valid input, otherwise it returns to the beginning of the loop
			if ( (userMove.equalsIgnoreCase("rock")) || (userMove.equalsIgnoreCase("paper")) || (userMove.equalsIgnoreCase("scissors")) ) {

				//Initializing computerMove using the ComputerOpponent class
				computerMove = ComputerOpponent.getMove();

				//if statement that checks to see if the user and computer move are equal, and if so, it prints out there is a tie and
				//the score does not change
				if ( userMove.equalsIgnoreCase(computerMove) ) {
					System.out.print("The computer chose " + computerMove.toLowerCase() + ", so it's a tie.");
					System.out.print("\t("+ userScore + "-" + computerScore + ")\n");
				}
				else {
					//if statement that checks to see the options when the user inputs "rock". If the computer move is scissors, then
					//the user wins and the user score is increased and printed out. If the computer input is paper, then the computer
					//wins and the computer score is changed and printed
					if ( (userMove.equalsIgnoreCase("rock")) ) {
						if ( (userMove.equalsIgnoreCase("rock")) && (computerMove.equalsIgnoreCase("scissors")) ) {
							userScore++;
							System.out.print("The computer chose " + computerMove.toLowerCase() + ", so you win!");
							System.out.print("\t("+ userScore + "-" + computerScore + ")\n");
						}
						else {
							computerScore++;
							System.out.print("The computer chose " + computerMove.toLowerCase() + ", so you lose.");
							System.out.print("\t("+ userScore + "-" + computerScore + ")\n");
						}
					}

					//if statement that checks to see the options when the user inputs "scissors". If the computer move is paper, then
					//the user wins and the user score is increased and printed out. If the computer input is rock, then the computer
					//wins and the computer score is changed and printed
					if ( (userMove.equalsIgnoreCase("scissors")) ) {
						if ( (userMove.equalsIgnoreCase("scissors")) && (computerMove.equalsIgnoreCase("paper")) ) {
							userScore++;
							System.out.print("The computer chose " + computerMove.toLowerCase() + ", so you win!");
							System.out.print("\t("+ userScore + "-" + computerScore + ")\n");
						}
						else {
							computerScore++;
							System.out.print("The computer chose " + computerMove.toLowerCase() + ", so you lose.");
							System.out.print("\t("+ userScore + "-" + computerScore + ")\n");
						}
					}

					//if statement that checks to see the options when the user inputs "paper". If the computer move is rock, then
					//the user wins and the user score is increased and printed out. If the computer input is scissors, then the computer
					//wins and the computer score is changed and printed
					if ( (userMove.equalsIgnoreCase("paper")) ) {
						if ( (userMove.equalsIgnoreCase("paper")) && (computerMove.equalsIgnoreCase("rock")) ) {
							userScore++;
							System.out.print("The computer chose " + computerMove.toLowerCase() + ", so you win!");
							System.out.print("\t("+ userScore + "-" + computerScore + ")\n");
						}
						else {
							computerScore++;
							System.out.print("The computer chose " + computerMove.toLowerCase() + ", so you lose.");
							System.out.print("\t("+ userScore + "-" + computerScore + ")\n");
						}
					}
				}
			}
		}

		//if statement to check to see whether the user won or the computer won after the loop is finished,
		//and prints out the appropriate statement
		if ( (userScore == pointsToWin) ) {
			System.out.println("Congratulations! You won!");
		}
		else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		
		input.close();
	}

}
