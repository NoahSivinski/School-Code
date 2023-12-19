/*
 * [RockPaperScissors].java
 * Author:  [Kritika Rao] 
 * Submission Date:  [10/08/21]
 *
 * Purpose: This program will emulate a game of rock, paper, scissors. 
 * The program will prompt the user for their move, and then the program 
 * will get the computer's move. The program will compare the computer 
 * and user's move and let the user know if they won, tied, or lost. The
 * program will stop once either the computer or user has achieved the
 * points needed to win, which the user entered in the very beginning of
 * the program. 
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
		//declaring and initializing variables
		String computerMove;
		String userAnswer;
		int userScore = 0;
		int computerScore = 0;
		String result = "";
		
		//asking the user to enter how many points they want in order to win
		System.out.print("Points to win: ");
		Scanner keyboard = new Scanner(System.in);
		int pointsToWin = keyboard.nextInt();
		keyboard.nextLine();
		
		//continuing to ask the user to play game until user or computer wins
		while(userScore < pointsToWin && computerScore < pointsToWin) {
			//asking user for their answer
			System.out.print("Rock, paper, or scissors? ");
			userAnswer = keyboard.nextLine();
			userAnswer = userAnswer.trim();
			//if the user answer is invalid the entire outer if statement will skip and the while loop will start its next iteration to re-prompt the user for their move
			if(userAnswer.equalsIgnoreCase("Rock") || userAnswer.equalsIgnoreCase("Paper") || userAnswer.equalsIgnoreCase("Scissors")) {
				//saving the computer move in computerMove only if user answer is valid
				computerMove = ComputerOpponent.getMove(); 
				//comparing user and computer score to see who won and updating the scores
				if(userAnswer.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) {
					result = "so you win!";
					userScore++;
				}
				if(userAnswer.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Paper")) {
					result = "so you lose.";
					computerScore++;
				}
				if(userAnswer.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Rock")) {
					result = "so it's a tie.";
				}
				if(userAnswer.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) {
					result = "so you win!";
					userScore++;
				}
				if(userAnswer.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Scissors")) {
					result = "so you lose.";
					computerScore++;
				}
				if(userAnswer.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Paper")) {
					result = "so it's a tie.";
				}
				if(userAnswer.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper")) {
					result = "so you win!";
					userScore++;
				}
				if(userAnswer.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Rock")) {
					result = "so you lose.";
					computerScore++;
				}
				if(userAnswer.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Scissors")) {
					result = "so it's a tie.";
				}
				
				//printing the computer's move and the score after each round
				System.out.print("The computer chose " + computerMove + ", " + result);
				System.out.println(" " + "(" + userScore + "-" + computerScore + ")");

			}
		}
		//telling the user that they won
		if (userScore > computerScore) {
			System.out.println("Congratulations! You won!");
		}
		//telling the user that they lost
		else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		
		keyboard.close();
	}

}
