/*
 * RockPaperScissors.java
 * Author:  Carla Pena 
 * Submission Date:  5 March 2021
 *
 * Purpose: The program created allows a user 
 * to play a friendly game of rock, paper,
 * scissors. The user inputs their selection from 
 * 3 choices. The computer will then select a 
 * randomized response of the 3 choices. The user
 * and computer will then tie or a winner is 
 * determined for that round. The game last 
 * until the points to win is reached.
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
	//enum RPS {ROCK, PAPER, SCISSORS}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//assigning variables to user score and computer score
		int userScore = 0;
		int computerScore = 0;
		
		System.out.print("Points to win:\t");
		int nPoints = scan.nextInt();
		
		String computerMove = "";
		
		while(userScore != nPoints && computerScore != nPoints)
		{
			String userMove = scan.nextLine();
			computerMove = ComputerOpponent.getMove();
			
			if (userMove.equalsIgnoreCase("rock") || userMove.equalsIgnoreCase("paper") ||
				userMove.equalsIgnoreCase("scissors"))
			{
				if (userMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("paper")) {
					computerScore++;
					System.out.println("The computer chose paper, so you lose. (" + userScore + " - " + computerScore + ")");
				}
				else if (userMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("scissors")) {
					computerScore++;
					System.out.println("The computer chose scissors, so you lose. (" + userScore + " - " + computerScore + ")");
				}
				else if (userMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("rock")) {
					computerScore++;
					System.out.println("The computer chose rock, so you lose. (" + userScore + " - " + computerScore + ")");
				}
				else if (computerMove.equalsIgnoreCase("rock") && userMove.equalsIgnoreCase("paper")) {
					userScore++;
					System.out.println("The computer chose rock, so you win! (" + userScore + " - " + computerScore + ")");
				}
				else if (computerMove.equalsIgnoreCase("paper") && userMove.equalsIgnoreCase("scissors")) {
					userScore++;
					System.out.println("The computer chose paper, so you win! (" + userScore + " - " + computerScore + ")");
				}
				else if (computerMove.equalsIgnoreCase("scissors") && userMove.equalsIgnoreCase("rock")) {
					userScore++;
					System.out.println("The computer chose scissors, so you win! (" + userScore + " - " + computerScore + ")");
				}
				else {
					System.out.println("The computer chose " + computerMove + ", so it's a tie. (" + userScore + " - " + computerScore + ")");
				}
			}
			if (userScore != nPoints && computerScore != nPoints)
			{
				System.out.print("Rock, paper, or scissors? ");
			}
			else 
			{
				if (userScore == nPoints) 
				{
					System.out.println("Congratulations! You won!");
				}
				else
				{
					System.out.println("Sorry, you lost. Better luck next time!");
				}
			}
		}
	}
	
}
