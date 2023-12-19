/*
 * RockPaperScissors.java
 * Author:  Raegan Girdley
 * Submission Date:  10/7/2021
 *
 * Purpose: User plays a game of rock, paper, scissors with a computer.
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
		
		//declares variables
		String computerMove, userInput;
		int pointsToWin, userWins = 0, computerWins = 0;
		Scanner keyboard = new Scanner(System.in);
		
		//asks user how many wins until game ends
		System.out.print("Points to win: ");
		pointsToWin = keyboard.nextInt();
		
		//game
		do {
			//asks for input
			System.out.print("Rock, paper, or scissors? ");
			userInput = keyboard.next();
			computerMove = ComputerOpponent.getMove();
			
			//user chooses rock
			if (userInput.toLowerCase().compareTo("rock") == 0) {
				if (computerMove.compareTo("rock") == 0) {
					System.out.println("The computer chose rock, so it's a tie. (" + userWins + "-" + computerWins + ")");
				}
				else if (computerMove.compareTo("scissors") == 0) {
					userWins++;
					System.out.println("The computer chose scissors, so you win! (" + userWins + "-" + computerWins + ")");
				}
				else if (computerMove.compareTo("paper") == 0) {
					computerWins++;
					System.out.println("The computer chose paper, so you lose. (" + userWins + "-" + computerWins + ")");
				}
			}
			
			//user chooses paper
			if (userInput.toLowerCase().compareTo("paper") == 0) {
				if (computerMove.compareTo("rock") == 0) {
					userWins++;
					System.out.println("The computer chose rock, so you win! (" + userWins + "-" + computerWins + ")");
				}
				else if (computerMove.compareTo("scissors") == 0) {
					computerWins++;
					System.out.println("The computer chose scissors, so you lose. (" + userWins + "-" + computerWins + ")");
				}
				else if (computerMove.compareTo("paper") == 0) {
					System.out.println("The computer chose paper, so it's a tie. (" + userWins + "-" + computerWins + ")");
				}
			}
			
			//user chooses scissors
			//user chooses paper
			if (userInput.toLowerCase().compareTo("scissors") == 0) {
				if (computerMove.compareTo("rock") == 0) {
					computerWins++;
					System.out.println("The computer chose rock, so you lose. (" + userWins + "-" + computerWins + ")");
				}
				else if (computerMove.compareTo("scissors") == 0) {
					System.out.println("The computer chose scissors, so it's a tie. (" + userWins + "-" + computerWins + ")");
				}
				else if (computerMove.compareTo("paper") == 0) {
					userWins++;
					System.out.println("The computer chose paper, so you win! (" + userWins + "-" + computerWins + ")");
				}
			}
			
		} while (userWins < pointsToWin && computerWins < pointsToWin);
	
		//prints if user or computer won, game ends
		if (userWins == pointsToWin) {
			System.out.print("Congratulations! You won!");
		}
		else if (computerWins == pointsToWin) {
			System.out.print("Sorry, you lost. Better luck next time!");
		}
	}
}
