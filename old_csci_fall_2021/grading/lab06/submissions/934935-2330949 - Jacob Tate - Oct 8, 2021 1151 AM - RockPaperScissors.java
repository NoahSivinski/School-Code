/**
 * File name: RockPaperScissors.java
 * Author: Jacob Tate
 * Submission Date: Friday, October 8th, 2021.
 *
 *This program allows the user to play the classic game Rock Paper Scissors.
 *It has the same rules as the regular rock paper scissors. The user inputs the
 *score it takes to win, then the program, using a while loop, will go through the 
 *necessary number of rounds it takes until the user or the computer will get said score.
 *At the end, the program will print out who won.
 *
 *Statement of Academic Honesty:
 *
 *The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be playerMoveled in accordance with
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

	public static void main(String[] args) 
	{
		//Below code initializes and assigns some variables. 
		Scanner keyboard = new Scanner(System.in);
		int pointsToWin;
		String playerMove;
		int playerScore;
		int computerScore;
		System.out.print("Points to win: ");
		pointsToWin = keyboard.nextInt();
		playerScore = 0;
		computerScore = 0;
		
		//Below code loops through how many rounds are necessary until the user or the computer reach the point value specified by the user.
		while((playerScore < pointsToWin) && (computerScore < pointsToWin))
		{
			//Below code assigns the playerMove variable to the user's input, and checks to see if the input is rock, paper, or scissors. 
			System.out.print("Rock, paper, or scissors? ");
			playerMove = keyboard.next().trim();
			String computerMove = ComputerOpponent.getMove();
			if(!(playerMove.equalsIgnoreCase("Scissors") || playerMove.equalsIgnoreCase("Rock") || playerMove.equalsIgnoreCase("Paper")))
			{
				while(!(playerMove.equalsIgnoreCase("Scissors") || playerMove.equalsIgnoreCase("Rock") || playerMove.equalsIgnoreCase("Paper")))
				{
					System.out.print("Rock, paper, or scissors? ");
					playerMove = keyboard.next().trim();
				}
			}
			//Below code calculates the scores and prints who won the round. 
			if(playerMove.equalsIgnoreCase(computerMove))
			{
				playerScore += 0;
				computerScore += 0;
				System.out.print("The computer chose " + computerMove + ", so it's a tie. " + "(" + playerScore + "-" + computerScore + ")");
			}
			
			else if((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Paper")) || (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Scissors")) || (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Rock")))
			{
				computerScore++;
				System.out.print("The computer chose " + computerMove + ", so you lose. " + "(" + playerScore + "-" + computerScore + ")");
			}
			
			else
			{
				playerScore++;
				System.out.print("The computer chose " + computerMove + ", so you win! " + "(" + playerScore + "-" + computerScore + ")");
			}
			System.out.println();
		}
		//Below code prints out the winner of the game after the rounds have been played. 
		if(playerScore > computerScore)
		{
			System.out.println("Congratulations! You won!");
		}
		else
		{
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		keyboard.close();
		System.exit(0);
	}
}
