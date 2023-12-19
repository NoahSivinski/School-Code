/* RockPaperScissors.java
 * Author:  Ethan Milley 
 * Submission Date:  3/3/2021
 *
 * Purpose: The following code allows the user to play 
 * Rock Paper Scissors with a computer until a user decided win 
 * score is reached. It achieves this by using a variety of loop
 * and branching statements.
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
		
		int winScore, computerScore, userScore; 
		String computerMove, userMove;
		
		computerScore = 0;
		userScore = 0;
		
		System.out.print("Points to win:\t");
		winScore = keyboard.nextInt();
		
		userMove = "blank";
		
		do
		{	
			while ((userMove.equalsIgnoreCase("rock")) && (userMove.equalsIgnoreCase("paper")) 
			&& (userMove.equalsIgnoreCase("scissors")));
			{
				System.out.print("Rock, paper, scissors?\t");
				userMove = keyboard.nextLine();
			}
			
			computerMove = ComputerOpponent.getMove();
			
			if ((userMove.equalsIgnoreCase("rock")) && (computerMove.equalsIgnoreCase("scissors"))
			|| ((userMove.equalsIgnoreCase("paper")) && (computerMove.equalsIgnoreCase("rock"))) ||
			((userMove.equalsIgnoreCase("scissors")) && (computerMove.equalsIgnoreCase("paper"))))
			{
				userScore = userScore + 1;
				System.out.println("The computer chose " + computerMove + ", so you win!  " + "("
				+ userScore + "-" + computerScore + ")");
			}
			else if ((userMove.equalsIgnoreCase("scissors")) && (computerMove.equalsIgnoreCase("rock"))
			|| ((userMove.equalsIgnoreCase("rock")) && (computerMove.equalsIgnoreCase("paper"))) ||
			((userMove.equalsIgnoreCase("paper")) && (computerMove.equalsIgnoreCase("scissors"))))
			{
				computerScore = computerScore + 1;
				System.out.println("The computer chose " + computerMove + ", so you lose.  " + "("
				+ userScore + "-" + computerScore + ")");
			}
			
			else if ((userMove.equalsIgnoreCase("scissors")) && (computerMove.equalsIgnoreCase("scissors"))
			|| ((userMove.equalsIgnoreCase("rock")) && (computerMove.equalsIgnoreCase("rock"))) ||
			((userMove.equalsIgnoreCase("paper")) && (computerMove.equalsIgnoreCase("paper"))))
			{
				System.out.println("The computer chose " + computerMove + ", so it's a tie.  " +
			"(" + userScore + "-" + computerScore + ")");
			}
		}
		while ((winScore > computerScore) && (winScore > userScore));
		
		if (userScore == winScore)
		{
			System.out.println("Congratulations! You won!");
		}
		else
		{
			System.out.println("Sorry, you lost. Better luck next time!");
		}	
	}
}
