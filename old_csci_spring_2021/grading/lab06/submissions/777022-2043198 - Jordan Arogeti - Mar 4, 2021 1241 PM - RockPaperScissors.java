
/*
 * RockPaperScissors.java
 * Author:  Jordan Arogeti 
 * Submission Date:  3/4/21
 *
 * Purpose: This program allows the user to play rock, paper, scissors
 * with the computer for how ever many rounds the user wants to play.
 * A score for each opponent is listed as the rounds go on.
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
		
		// Declaring variables

		String computerMove;
		int pointsToWin = 0;
		String answer;
		int myWins = 0;
		int computerWins = 0;
		
		
		// LOOP!
		
		System.out.print("Points to Win: ");
		pointsToWin = keyboard.nextInt();
		keyboard.nextLine();
		//boolean validInput = (true);
		while (myWins < pointsToWin && computerWins < pointsToWin) {
			System.out.print("Rock, paper, or scissors? ");
			answer = keyboard.nextLine();
			answer = answer.toLowerCase();
			if (answer.equals("paper") || answer.equals("rock") || answer.equals("scissors") ) {
				computerMove = ComputerOpponent.getMove();
				System.out.print("The computer chose " + computerMove);
				if(answer.equals("paper")) { 
					if (computerMove.equals("paper")) {
					System.out.print(", so it's a tie.");
					}
					else if (computerMove.equals("scissors")) {
						computerWins++;
						System.out.print(", so you lose.");
					}					
					else if (computerMove.equals("rock")) {
						myWins++;
						System.out.print(", so you win!");	
					}
				} else if (answer.equals("rock")) { 
					if (computerMove.equals("paper")) {
						computerWins++;
						System.out.print(", so you lose.");
					}
					if (computerMove.equals("scissors")) {
						myWins++;
						System.out.print(", so you win!");		
					}
					if (computerMove.equals("rock")) {
						System.out.print(", so it's a tie.");
					}
				} else { 
					if (computerMove.equals("paper")) {
						myWins++;
						System.out.print(", so you win!");					
					}
					if (computerMove.equals("scissors")) {
						System.out.print(", so it's a tie.");
					}
					if (computerMove.equals("rock")) {
						computerWins++;
						System.out.print(", so you lose.");	
					}
											
				}
				
				System.out.println( " (" + myWins +"-" + computerWins + ")");
			} 
			
					
		} // while
	 
		if (myWins > computerWins)
			System.out.print("Congratulations! You won!");
		else
			System.out.print("Sorry, you lost. Better luck next time!");
		
		keyboard.close();
	}

}
