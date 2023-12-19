/*
 * [RockPaperScissors].java
 * Author:  [Anjali Shajan] 
 * Submission Date:  [3/5/2021]
 *
 * Purpose: The program allows a user to input rock, paper, or scissors to play the game. It also allows 
 * the computer to input rock, paper or scissors. This allows the user to play a game with the computer.
 * The program keeps track of who is winning and who is losing. The aspect points to win decides how many times
 * the user or computer has to win in order to end the game.
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

		Scanner keyboard = new Scanner (System.in);
		int pointstowin;
		System.out.print("Points to win: ");
		pointstowin =keyboard.nextInt();
		String computerMove;


		String rock= "rock";
		String paper = "paper";
		String scissors ="scissors";


		String reply;


		int userScore;
		int computerScore;

		userScore=0;
		computerScore=0;

		while((userScore != pointstowin) && (computerScore != pointstowin)) {

			System.out.print("Rock, paper, or scissors?");
			reply =keyboard.next();
			computerMove = ComputerOpponent.getMove();

			if(reply.equalsIgnoreCase("Rock") && (computerMove.equalsIgnoreCase("Scissors"))) {
				userScore++;
				System.out.println("The computer chose scissors, so you win!"+"("+userScore+"-"+computerScore+")");

			}
			else if (reply.equalsIgnoreCase("Scissors") && (computerMove.equalsIgnoreCase("Rock"))) {
				computerScore++;
				System.out.println("The computer chose rock, so you lose"+"("+userScore+"-"+computerScore+")");   

			}
			else if (reply.equalsIgnoreCase("Rock") && (computerMove.equalsIgnoreCase("Paper"))) {
				computerScore++;
				System.out.println("The computer chose paper, so you lose"+"("+userScore+"-"+computerScore+")"); 
			}
			else if (reply.equalsIgnoreCase("Paper") && (computerMove.equalsIgnoreCase("Rock"))) {
				userScore++;
				System.out.println("The computer chose rock, so you win!"+"("+userScore+"-"+computerScore+")"); 
			}
			else if (reply.equalsIgnoreCase("Paper") && (computerMove.equalsIgnoreCase("Scissors"))) {
				computerScore++;
				System.out.println("The computer chose scissors, so you lose"+"("+userScore+"-"+computerScore+")");    
			}
			else if (reply.equalsIgnoreCase("Scissors") && (computerMove.equalsIgnoreCase("Paper"))) {
				userScore++;
				System.out.println("The computer chose paper, so you win!"+"("+userScore+"-"+computerScore+")");
			}  
			else if (reply.equalsIgnoreCase(computerMove))
				System.out.println("The computer chose "+computerMove+ ", so its a tie."+"("+userScore+"-"+computerScore+")");
		}
		if((userScore ==pointstowin)) {
			System.out.println("Congratulations! You won!");
		}
		else if ((userScore != pointstowin)) {
			System.out.println("Sorry, you lose. Better luck next time!");
		}
	}
}














