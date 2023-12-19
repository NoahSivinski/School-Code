/*
 * [RockPaperScissors].java
 * Author:  [Kyle Bai] 
 * Submission Date:  [03/04/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program allow the user play rock, paper, scissors with computer. The program will count the score for user and computer, who got the points to win first, who win the game.
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

		System.out.print("Points to win: ");

		int pointsToWin = keyboard.nextInt();

		//Initialize variable to 0.
		int userScore = 0;
		int computerScore = 0;

		do {
			System.out.print("Rock, paper, or scissors?");
			String userInput = keyboard.next();	

			//Store the the input from user to unserInput variable.
			if(userInput.equalsIgnoreCase ("rock")) {
				userInput = "rock";
			}
			else if(userInput.equalsIgnoreCase ("paper")) {
				userInput = "paper";
			}
			else if(userInput.equalsIgnoreCase ("scissors")) {
				userInput = "scissors";
			}

			//import ComputerOpponent.java
			String computerMove = ComputerOpponent.getMove();
			System.out.print("The computer chose " + computerMove + ", ");

			// If user input is rock.
			if(userInput.equals("rock")) {
				if(userInput.equals(computerMove)) {
					System.out.println("so it's a tie. " + "(" + userScore + "-" + computerScore + ")");
				}
				else if(computerMove.equals("paper")) {
					computerScore += 1;
					System.out.println("so you lose. " + "(" + userScore + "-" + computerScore + ")");
				}
				else if(computerMove.equals("scissors")) {
					userScore += 1;
					System.out.println("so you win! " + "(" + userScore + "-" + computerScore + ")");
				}
			}
			//If user input is paper.
			else if(userInput.equals("paper")) {
				if(userInput.equals(computerMove)) {
					System.out.println("so it's a tie. " + "(" + userScore + "-" + computerScore + ")");
				}
				else if(computerMove.equals("scissors")) {
					computerScore += 1;
					System.out.println("so you lose. " + "(" + userScore + "-" + computerScore + ")");
				}
				else if(computerMove.equals("rock")) {
					userScore += 1;
					System.out.println("so you win! " + "(" + userScore + "-" + computerScore + ")");
				}
			}
			else if(userInput.equals("scissors")) {
				if(userInput.equals(computerMove)) {
					System.out.println("so it's a tie. " + "(" + userScore + "-" + computerScore + ")");
				}
				else if(computerMove.equals("paper")) {
					userScore += 1;
					System.out.println("so you win! " + "(" + userScore + "-" + computerScore + ")");
				}
				else if(computerMove.equals("rock")) {
					computerScore +=1;
					System.out.println("so you lose. " + "(" + userScore + "-" + computerScore + ")");
				}
			}
			if(userScore == pointsToWin) {
				System.out.println("Congratulations! You won!");
				System.exit(0);
			}
			else if(computerScore == pointsToWin) {
				System.out.println("Sorry, you lost. Better luck next time!");
				System.exit(0);
			}
		}
		while(true);
	}
}