/*
 * [RockPaperScissors].java
 * Author:  [Chris Hernandez] 
 * Submission Date:  [3/4/2021]
 *
 * Purpose: This program is a game of rock, paper, scissors. It takes the input of the user as the move and retrieves the move
 * of the computer opponent at random. User inputs the points to win and either computer or user wins when that score is reached.
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
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Points to win: ");
	int pointsToWin = input.nextInt();
	System.out.print("Rock, paper, or scissors? ");
	String playerMove = input.next();
	
	int playerScore = 0;
	int computerScore = 0;
	String computerMove = ComputerOpponent.getMove();
	
	while ((computerMove.equals("rock")) || (computerMove.equals("paper")) || (computerMove.equals("scissors"))) {
		if (computerMove.equals("rock")) {
			if (playerMove.equalsIgnoreCase("paper")) {
				playerScore++;
				System.out.println("The computer chose rock, so you win! " + "(" + playerScore + "-" + computerScore + ")");
				System.out.print("Rock, paper, or scissors? ");
				playerMove = input.next();
			}
			else if (playerMove.equalsIgnoreCase("scissors")) {
				computerScore++;
				System.out.println("The computer chose rock, so you lose. " + "(" + playerScore + "-" + computerScore + ")");
				System.out.print("Rock, paper, or scissors? ");
				playerMove = input.next();
			}
			else if (playerMove.equalsIgnoreCase("rock")) {
				System.out.println("The computer chose rock, so it's a tie. " + "(" + playerScore + "-" + computerScore + ")");
				System.out.print("Rock, paper, or scissors? ");
				playerMove = input.next();
			}
			else {
				System.out.print("Rock, paper, or scissors? ");
				playerMove = input.next();
			}
		}
		else if (computerMove.equals("paper")) {
			if (playerMove.equalsIgnoreCase("scissors")) {
				playerScore++;
				System.out.println("The computer chose paper, so you win! " + "(" + playerScore + "-" + computerScore + ")");
				System.out.print("Rock, paper, or scissors? ");
				playerMove = input.next();
			}
			else if (playerMove.equalsIgnoreCase("rock")) {
				computerScore++;
				System.out.println("The computer chose paper, so you lose. " + "(" + playerScore + "-" + computerScore + ")");
				System.out.print("Rock, paper, or scissors? ");
				playerMove = input.next();
			}
			else if (playerMove.equalsIgnoreCase("paper")) {
				System.out.println("The computer chose paper, so it's a tie. " + "(" + playerScore + "-" + computerScore + ")");
				System.out.print("Rock, paper, or scissors? ");
				playerMove = input.next();
			}
			else {
				System.out.print("Rock, paper, or scissors? ");
				playerMove = input.next();
			}
		}
		else if (computerMove.equals("scissors")) {
			if (playerMove.equalsIgnoreCase("rock")) {
				playerScore++;
				System.out.println("The computer chose scissors, so you win! " + "(" + playerScore + "-" + computerScore + ")");
				System.out.print("Rock, paper, or scissors? ");
				playerMove = input.next();	
			}
			else if (playerMove.equalsIgnoreCase("paper")) {
				computerScore++;
				System.out.println("The computer chose scissors, so you lose. " + "(" + playerScore + "-" + computerScore + ")");
				System.out.print("Rock, paper, or scissors? ");
				playerMove = input.next();
			}
			else if (playerMove.equalsIgnoreCase("scissors")) {
				System.out.println("The computer chose scissors, so it's a tie. " + "(" + playerScore + "-" + computerScore + ")");
				System.out.print("Rock, paper, or scissors? ");
				playerMove = input.next();
			}
			else {
				System.out.print("Rock, paper, or scissors? ");
				playerMove = input.next();
			}
		}
		
		if(playerScore == (pointsToWin - 1)) {
			System.out.println("The computer chose " + computerMove + ", so you win! " + "(" + (playerScore + 1) + "-" + computerScore + ")");
			System.out.println("Congratulations! You won!");
			System.exit(0);
	}
		else if (computerScore == (pointsToWin - 1)) {
			System.out.println("The computer chose " + computerMove + ", so you lose. " + "(" + playerScore + "-" + (computerScore + 1) + ")");
			System.out.println("Sorry, you lost. Better luck next time!");
			System.exit(0);
		}
	 }
   }
}