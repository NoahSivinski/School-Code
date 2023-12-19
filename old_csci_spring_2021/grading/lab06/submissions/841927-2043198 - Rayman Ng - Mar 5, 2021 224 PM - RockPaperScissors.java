/*
 * CSCI1301.java
 * Author: Rayman Ng
 * Submission Date: 3/5/2021
 *
 * Purpose: This program allows the user to play the classic game Rock, Paper, Scissors against a computer opponent.
 * It first prompts the user to decide the number of points needed to win. Then it prompts the user to chosse rock, paper, scissor.
 * The computer opponent will randomly pick one, and the outcome of the round will be based on these rules:
 * Rock beats Scissor.
 * Paper beats Rock.
 * Scissor beats Paper.
 * If both players pick the same thing, it's a draw and they move on to the next round. They will keep playing until they win. 
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
		String userMove;
		int userScore = 0;
		int computerScore = 0;
		Scanner keyboard = new Scanner (System.in);
		int pointsToWin;
		String computerMove;

		System.out.print("Points to win:");
		pointsToWin = keyboard.nextInt();
		keyboard.nextLine();
		while (userScore < pointsToWin && computerScore < pointsToWin) {
			System.out.print("Rock, paper, or scissors?");
			userMove = keyboard.nextLine();
			userMove = userMove.trim();
			if (userMove.equalsIgnoreCase("rock") || userMove.equalsIgnoreCase("paper") || userMove.equalsIgnoreCase("scissors")) {
				computerMove = ComputerOpponent.getMove();
				if (userMove.equalsIgnoreCase("rock")){
					if (computerMove.equalsIgnoreCase("paper")) {
						computerScore++;
						System.out.println("The computer chose paper, so you lose."+ " "+ "(" + userScore + "-" + computerScore + ")" );
					}
					else if (computerMove.equalsIgnoreCase("scissors")) {
						userScore++;
						System.out.println("The computer chose scissors, so you win!" +" " + "("+ userScore + "-" + computerScore + ")" );
					}
					else if (computerMove.equalsIgnoreCase("rock")) {
						System.out.println("The computer chose rock, so it's a tie." + " " + "("+ userScore + "-" + computerScore + ")" );
					}
				}
				else if (userMove.equalsIgnoreCase("paper")){
					if (computerMove.equalsIgnoreCase("scissors")) {
						computerScore++;
						System.out.println("The computer chose scissors, so you lose." + " " + "(" + userScore + "-" + computerScore + ")" );
					}
					else if (computerMove.equalsIgnoreCase("rock")) {
						userScore++;
						System.out.println("The computer chose rock, so you win!" + " " + "(" + userScore + "-" + computerScore + ")" );
					}
					else if (computerMove.equalsIgnoreCase("paper")) {
						System.out.println("The computer chose paper, so it's a tie." + " " + "(" + userScore + "-" + computerScore + ")" );
					}
				}
				else if (userMove.equalsIgnoreCase("scissors")) {
					if (computerMove.equalsIgnoreCase("rock")) {
						computerScore++;
						System.out.println("The computer chose rock, so you lose."+ " " + "("+ userScore + "-" + computerScore + ")" );
					}	
					else if (computerMove.equalsIgnoreCase("paper")) {
						userScore++;
						System.out.println("The computer chose paper, so you win!" + " " + "(" + userScore + "-" + computerScore + ")");
					}
					else if (computerMove.equalsIgnoreCase("scissors")) {
						System.out.println("The computer chose scissors, so it's a tie." + " " + "("+ userScore + "-" + computerScore + ")");
					}
				}
			}
			else {
				System.out.println("Invalid input. Try again.");
			}
		}
		if (userScore == pointsToWin) {
			System.out.println("Congratulations! You won!");
		}
		else if(computerScore == pointsToWin) {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		keyboard.close();
	}
}
