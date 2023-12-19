/**
 * 
 */

/**
 * @author hunterschramm
 *
 *
 * [RockPaperScissors].java
 * Author:  [Hunter Schramm] 
 * Submission Date:  [03/05/21]
 *
 * Purpose: This program allows the user to play Rock, Paper, Scissors against a computer. 
 * The user inputs either "rock", "paper", or "scissors", and the computer makes its choice
 * at random. The program will track the winner of each round and continue to run until
 * either the player or computer wins the number of rounds specified by the user at the beginning.
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

/**
*
* @author your name
*/
public class RockPaperScissors {

	public static void main(String [] args)
{
		Scanner keyboard = new Scanner(System.in);
 
		int playerScore = 0,computerScore = 0;
  
		System.out.print("Points to win: ");
		int p = keyboard.nextInt();

		do
{
		System.out.print("Rock, paper, or scissors?");
		String playerMove = keyboard.next();

		playerMove = playerMove.toLowerCase();

		if (playerMove.equalsIgnoreCase("rock") || playerMove.equalsIgnoreCase("ROCK"))
		playerMove = "rock";

		else if (playerMove.equalsIgnoreCase("paper") || playerMove.equalsIgnoreCase("PAPER"))
		playerMove = "paper";

		else if(playerMove.equalsIgnoreCase("scissors") || playerMove.equalsIgnoreCase("scissors"))
		playerMove = "scissors";


		String computerMove = ComputerOpponent.getMove();
  
		//If the User and Computer choose the same move
		if (playerMove.equals(computerMove))
			System.out.println("The computer chose " + playerMove + ", so it's a tie. " + "(" + playerScore + "-" + computerScore + ")");
		
		// If the User chooses Rock
		else if (playerMove.equals("rock"))
		{
		if (computerMove.equals("scissors"))
		{playerScore++;
			System.out.println("The computer chose scissors, so you win! " + "(" + playerScore + "-" + computerScore + ")");
		}
		else if (computerMove.equals("paper"))
		{	playerScore++;
			System.out.println("The computer chose paper, so you lose. " + "(" + playerScore + "-" + computerScore + ")" );;
		}
  
  
		}
		// If the User chooses Paper
		else if (playerMove.equals("paper"))
		{
		if (computerMove.equals("scissors"))
		{	computerScore++;
			System.out.println("The computer chose scissors, so you lose." + "(" + playerScore + "-" + computerScore + ")");
		}
		else if (computerMove.equals("rock"))
		{	playerScore++;
			System.out.println("The computer chose rock, so you win!" + "(" + playerScore + "-" + computerScore + ")");
	}
}
		// If the User chooses Scissors
		else if (playerMove.equals("scissors"))
{
		if (computerMove.equals("paper"))
		{	playerScore++;
			System.out.println("The computer chose paper, so you win! " + "(" + playerScore + "-" + computerScore + ")");
	}
		else if (computerMove.equals("rock"))
		{	computerScore++;
			System.out.println("The computer chose rock, so you lose. " + "(" + playerScore + "-" + computerScore + ")");
	}
}
		if(playerScore == p)
{
			System.out.println("Congratulations! You won!");
			break;
}
		else if(computerScore == p)
{
			System.out.println("Sorry, you lost. Better luck next time!");
			break;
}
	}while(true);

	}
}