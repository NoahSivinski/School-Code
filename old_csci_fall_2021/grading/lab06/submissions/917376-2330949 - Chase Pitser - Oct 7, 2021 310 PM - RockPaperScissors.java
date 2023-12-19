/*
 * RockPaperScissors.java
 * Author: Chase Pitser
 * Submission Date:  10/7/2021
 *
 * Purpose: The purpose of the program is to have the user play rock, paper, scissors with the computer. T
 * the program takes an int input of how many games need to be won by either the player or computer to win
 * the whole thing. The program asks for an input (invalid inputs will simply ask for it again). I had the program 
 * use the compareTo() method of the String class in order to determine who wins each round. When the desired
 * games needed to be won is met by either the player or the computer, the program either says congratulations or 
 * sorry, then the program terminates.
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
		//Creating Scanner object and variables
		Scanner keyboard = new Scanner(System.in);
		int playerScore = 0;
		int computerScore = 0;
		String playerMove = "";
		String computerMove = "";
		boolean tie;
		boolean win;
		//Asks user for input of what desired score they want to reach to win
		System.out.print("Points to win: ");
		int pointsToWin = keyboard.nextInt();
		keyboard.nextLine();
		//Loop until either player or computer reaches the desired score
		while(playerScore!=pointsToWin && computerScore!=pointsToWin) {
			//Asks for user input for the game and only accepts valid inputs, otherwise asks again
			do {
				System.out.print("Rock, paper, or scissors? ");
				playerMove = keyboard.nextLine();
			} while( !playerMove.toLowerCase().trim().equals("rock") &&
					!playerMove.toLowerCase().trim().equals("paper") &&
					!playerMove.toLowerCase().trim().equals("scissors") );
			computerMove = ComputerOpponent.getMove();
			/*
			Compare to values:
			---
			same word  = 0 (tie)
			---
			p - s = -3 (lose)
			s - r = 1 (lose)
			r - p = 2 (lose)
			---
			s - p = 3 (win)
			r - s = -1 (win)
			p - r = -2 (win)
			*/
			tie = false;
			switch(playerMove.compareTo(computerMove)) {
				case 0:
					tie = true;
				case -3:
				case 1:
				case 2:
					win = false;
					break;
				case 3:
				case -1:
				case -2:
					win = true;
					break;
				default: 
					System.out.print("There is an error within the switch statement.");
					win = true;
			}
			if(tie) {
				System.out.println("The computer chose " + computerMove + ", so it's a tie. "
						+ "("+playerScore+"-"+computerScore+")"); 
			}else if(win) {
				playerScore++;
				System.out.println("The computer chose " + computerMove + ", so you win! "
						+ "("+playerScore+"-"+computerScore+")");
			}else {
				computerScore++;
				System.out.println("The computer chose " + computerMove + ", so you lose. "
						+ "("+playerScore+"-"+computerScore+")");
			}
		}
		if(playerScore==pointsToWin) {
			System.out.println("Congratulations! You won!");
		}else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
	}
	
}
