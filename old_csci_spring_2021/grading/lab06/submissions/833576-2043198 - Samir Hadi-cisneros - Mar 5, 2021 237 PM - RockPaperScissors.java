
/*
 * RockPaperScissors.java
 * Author: Samir Hadi Cisneros 
 * Submission Date: 05 March 2021
 *
 * Purpose: This program is a simple rock paper scissors game that prompts the user how many points needed to win
 * then the user inputs rock,paper, or scissors. A randomized computer plays against the user.
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
 * 
 * I agree
 */
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int pointsToWin; // variable stores how many points needed to win
		int userScore = 0; // variables stores how many games the user won
		int computerScore = 0; // variable stores how many games the computer won
		String userMove = " "; // variable holds what the user chooses to throw (rock, paper, or scissors)
		String computerMove = " "; // variable holds what the computer chooses to throw (rock, paper, or scissors)

//asks the user how many points they want to play to win
		System.out.print("Points to win: ");
		pointsToWin = input.nextInt();

//Use the while statement to loop until the points to win is achieved
		while (userScore < pointsToWin && computerScore < pointsToWin) {
			System.out.print("Rock, paper, or scissors? ");
			userMove = input.next();

//while loops asks the user to reenter their move if what they entered was misspelled or wrong
			while (!(userMove.equalsIgnoreCase("Rock") || userMove.equalsIgnoreCase("Paper")
					|| userMove.equalsIgnoreCase("Scissors"))) {
				System.out.println("Rock, paper, or scissors? ");
				userMove = input.next();
			}

//gets the  computer's move from ComputerOpponent.java in the src folder
			computerMove = ComputerOpponent.getMove();
			System.out.print("The computer chose " + computerMove);

//checks to see if the inputs are the same which would be a tie
			if (userMove.equalsIgnoreCase(computerMove)) {
				System.out.print(", so it's a tie. ");
				System.out.println("(" + userScore + "-" + computerScore + ")");
			}

//checks to see if the computer won, which would be a loss and adds a score of 1 to the computer score
			else if (userMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Paper")
					|| userMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Scissors")
					|| userMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Rock")) {
				System.out.print(", so you lose. ");
				computerScore += 1;
				System.out.println("(" + userScore + "-" + computerScore + ")");
			}

//checks to see if the  user won, stores this as a win and adds 1 the userscore
			else {
				System.out.print(", so you win! ");
				userScore += 1;
				System.out.println("(" + userScore + "-" + computerScore + ")");
			}
		}

//checks to see if the computer or the user won the game
		if (userScore == pointsToWin) {
			System.out.println("Congratulations! You won!");
		}

		else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}

		input.close();
	}

}
