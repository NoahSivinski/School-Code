/*
 * [CSCI 1301].java
 * Author:  [Skyler Coleman] 
 * Submission Date:  [03/05/2021]
 *
 * Purpose: A program where the user can play rock, paper scissors 
 * against the computer, that is making it's decision at pseudorandom.
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
/**
 * @author sky.cole768
 *
 */
public class RockPaperScissors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Points to win: ");
		int pointsToWin = keyboard.nextInt(); // Points needed to win game. Whoever, between the computer or user, can get enough points to equal this variable, wins.
		
		int userScore = 0;  // The amount of times the user has won. 0 to start.
		int computerScore = 0; // The amount of times the computer has won. 0 to start.
		String answer; // User's answer to the question "Rock, paper, or scissors?".
		
	while (userScore < pointsToWin && computerScore < pointsToWin) {
		System.out.print("Rock, paper, or scissors? ");
		answer = keyboard.next();
		
		if (answer.equalsIgnoreCase("scissors") || answer.equalsIgnoreCase("paper") || answer.equalsIgnoreCase("rock")){
			String computerMove = ComputerOpponent.getMove(); // The computer's move. Either "rock", "paper", or "scissors".
			if((answer.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("rock")) || (answer.equalsIgnoreCase("paper") && 
					computerMove.equalsIgnoreCase("scissors")) || (answer.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("paper"))) {
				
				System.out.print("The computer chose " + computerMove + ", so you lose.");
				computerScore++;
			}
			else if (answer.equalsIgnoreCase(computerMove)) {
				System.out.print("The computer chose " + computerMove + ", so it's a tie.");
			}
			else {
				System.out.print("The computer chose " + computerMove + ", so you win!");
				userScore++;
			}
			System.out.println(" (" + userScore + "-" + computerScore + ")");
		}
	}
	
	if (userScore > computerScore) {
		System.out.println("Congratulations! You won!");
	}
	
	else {
		System.out.println("Sorry, you lost. Better luck next time!");
	}
	
	keyboard.close();
	}
}