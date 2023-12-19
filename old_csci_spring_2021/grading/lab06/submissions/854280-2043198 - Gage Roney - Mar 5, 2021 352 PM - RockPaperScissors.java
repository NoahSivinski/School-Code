/*
 * GradeCalculator.java
 * Author:  Gage Roney 
 * Submission Date:  3/5/2021
 *
 * Purpose: This program allows for the user to calculate his or her grade depending on
 * a certain amount of various known grades and the weights for each of those graded items.
 * The program allows for numerous scenarios and allows for a current score eve if there 
 * is not enough information and how to get the desired grade and if it is possible.
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
import java.util.Scanner; //import that allows for the user to input 

public class RockPaperScissors {

	public static void main(String[] args) {

		Scanner Keyboard = new Scanner(System.in);
		// Initialized variables for int and String values
		// String computerMove gets the computer's move from the computer opponent java
		// file which is randomized inputs
		String computerMove = ComputerOpponent.getMove();
		int userWins = 0;
		int computerWins = 0;

		// Prompt for the user for how many points is needed for the win
		System.out.print("Points to Win: ");
		int winValue = Keyboard.nextInt();

		// The condition for the loop and end of the loop
		while ((winValue > userWins && winValue > computerWins)) {
			// Another prompt for the user to input which move is desired
			System.out.print("Rock, paper, or scissors? ");
			String userMove = Keyboard.next();
			computerMove = ComputerOpponent.getMove();
			// Multi-branch if else statements for if the user ties with the computer
			if ((userMove.equalsIgnoreCase("rock")) && (computerMove == "rock")
					|| (userMove.equalsIgnoreCase("scissors")) && (computerMove == "scissors")
					|| (userMove.equalsIgnoreCase("paper")) && (computerMove == "paper")) {
				System.out.print("The computer chose " + computerMove + ", so it's a tie. ");
				System.out.println("(" + userWins + "-" + computerWins + ")");
				// Multi-branch if else statements for if the user wins against the computer
			} else if ((userMove.equalsIgnoreCase("rock")) && (computerMove == "scissors")
					|| (userMove.equalsIgnoreCase("scissors")) && (computerMove == "paper")
					|| (userMove.equalsIgnoreCase("paper")) && (computerMove == "rock")) {
				System.out.print("The computer chose " + computerMove + ", so you win! ");
				userWins++; // increases the user's score
				System.out.println("(" + userWins + "-" + computerWins + ")");
				// Multi-branch if else statements for if the user loses against the computer
				// and the computer wins
			} else if ((userMove.equalsIgnoreCase("rock")) && (computerMove == "paper")
					|| (userMove.equalsIgnoreCase("scissors")) && (computerMove == "rock")
					|| (userMove.equalsIgnoreCase("paper")) && (computerMove == "scissors")) {
				System.out.print("The computer chose " + computerMove + ", so you lose. ");
				computerWins++; // increases the computer's score
				System.out.println("(" + userWins + "-" + computerWins + ")");
				// statement for if the user's input is incorrect
			} else
				System.out.println("Incorrect input. Try again.");
		}
		// statement for user winning the game
		if (userWins > computerWins)
			System.out.print("Congratulations! You Won!");
		// statement for computer winning the game
		else
			System.out.print("Sorry, you lost. Better luck next time!");
		// input for the keyboard being closed
		Keyboard.close();

	}
}