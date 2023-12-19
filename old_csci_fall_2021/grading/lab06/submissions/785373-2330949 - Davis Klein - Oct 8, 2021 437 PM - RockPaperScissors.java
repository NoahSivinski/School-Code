/*
 * [RockPaperScissors].java
 * Author:  [Davis Klein] 
 * Submission Date:  [10/8/2021]
 *
 * Purpose: This program plays a game of rock paper scissors with the user. The user must enter a valid input of the three options. Then,
 * a move is randomly selected by the computer to be compared. If a tie occurs, no points are awarded. The game continues until a player 
 * reaches the input number of points to win.
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
		int ptsToWin = keyboard.nextInt();
		
		
		int scoreUser = 0, scoreComputer = 0;
		boolean validUserInput;
		String userMove;
		
		for (int i = 0; scoreUser < ptsToWin && scoreComputer < ptsToWin; i++) {
			
			do {
				System.out.print("Rock, paper, or scissors? ");
				userMove = keyboard.next();
				userMove = userMove.trim();
				if (userMove.equalsIgnoreCase("paper") || userMove.equalsIgnoreCase("rock") || userMove.equalsIgnoreCase("scissors")) {
					validUserInput = false;
				}
				else {
					validUserInput = true;
				}
			}
			while (validUserInput);
			
			String computerMove = ComputerOpponent.getMove();
			if (userMove.equals(computerMove)) {
				System.out.print("The computer chose " + computerMove + ", so it's a tie.");
				System.out.println("(" + scoreUser + "-" + scoreComputer + ")");
			}
			else if (userMove.equalsIgnoreCase("rock")) {
				if (computerMove.equals("scissors")) {
					System.out.print("The computer chose " + computerMove + ", so you win!");
					scoreUser++;
					System.out.println(" (" + scoreUser + "-" + scoreComputer + ")");
				}
				else if (computerMove.equals("paper")) {
					System.out.print("The computer chose " + computerMove + ", so you lose.");
					scoreComputer++;
					System.out.println(" (" + scoreUser + "-" + scoreComputer + ")");
				}
			}
			else if (userMove.equalsIgnoreCase("paper")) {
				if (computerMove.equals("rock")) {
					System.out.print("The computer chose " + computerMove + ", so you win!");
					scoreUser++;
					System.out.println(" (" + scoreUser + "-" + scoreComputer + ")");
				}
				else if (computerMove.equals("scissors")) {
					System.out.print("The computer chose " + computerMove + ", so you lose.");
					scoreComputer++;
					System.out.println(" (" + scoreUser + "-" + scoreComputer + ")");
				}
			}
			else if (userMove.equalsIgnoreCase("scissors")) {
				if (computerMove.equals("paper")) {
					System.out.print("The computer chose " + computerMove + ", so you win!");
					scoreUser++;
					System.out.println(" (" + scoreUser + "-" + scoreComputer + ")");
				}
				else if (computerMove.equals("rock")) {
					System.out.print("The computer chose " + computerMove + ", so you lose.");
					scoreComputer++;
					System.out.println(" (" + scoreUser + "-" + scoreComputer + ")");
				}
			}
		}	
		if (scoreUser > scoreComputer) {
			System.out.println("Congratulations! You won!");
		}
		else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
	}

}
