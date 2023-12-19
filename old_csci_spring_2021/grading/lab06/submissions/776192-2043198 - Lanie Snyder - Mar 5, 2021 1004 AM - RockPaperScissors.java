/*
 * RockPaperScissors.java
 * Author:  Lanie Snyder 
 * Submission Date:  March 5, 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * I made this program for the user to play Rock, Paper, 
 * Scissors against a computer. The user inputs how many 
 * games are needed to win. The user then inputs their 
 * move. The program displays who won that round and the
 * score until the number of games that are needed to win 
 * is met. 
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
		String computerMove;
		int points;
		String usersMove;
		int userScore;
		int computerScore;
		boolean choiceConditions; //The conditions that are true if the users input is valid 

		//Initialize the variables
		userScore = 0;
		computerScore = 0;
		
		System.out.print("Points to win: ");
		points = keyboard.nextInt();
		usersMove = keyboard.nextLine(); //To get rid of the end-of-line character '\n' after points.
		
		do 
		{
			do
			{
				System.out.print("Rock, paper, or scissors? ");
				usersMove = keyboard.nextLine();
				usersMove = usersMove.trim(); //To get rid of any extra spaces
				choiceConditions = (usersMove.equalsIgnoreCase("rock")) || (usersMove.equalsIgnoreCase("paper") 
									|| (usersMove.equalsIgnoreCase("scissors")));
			} while (choiceConditions == false);
			
			computerMove = ComputerOpponent.getMove(); //Gets the computers move
			
			//Computer chose rock
			if (computerMove.equalsIgnoreCase("rock") && usersMove.equalsIgnoreCase("rock"))
			{
				System.out.println("The computer chose rock, so it's a tie. " +
									"(" + userScore + "-" + computerScore + ")");
			}
			
			else if (computerMove.equalsIgnoreCase("rock") && usersMove.equalsIgnoreCase("paper"))
			{
				userScore = userScore + 1;
				System.out.println("The computer chose rock, so you win! " +
									"(" + userScore + "-" + computerScore + ")");
			}
			else if (computerMove.equalsIgnoreCase("rock") && usersMove.equalsIgnoreCase("scissors"))
			{
				computerScore = computerScore + 1;
				System.out.println("The computer chose rock, so you lose. " + 
									"(" + userScore + "-" + computerScore + ")");
			}
			
			//Computer chose paper
			else if (computerMove.equalsIgnoreCase("paper") && usersMove.equalsIgnoreCase("paper"))
			{
				System.out.println("The computer chose paper, so it's a tie. " + 
									"(" + userScore + "-" + computerScore + ")");
			}
			else if (computerMove.equalsIgnoreCase("paper") && usersMove.equalsIgnoreCase("rock"))
			{
				computerScore = computerScore + 1;
				System.out.println("The computer chose paper, so you lose. " +
									"(" + userScore + "-" + computerScore + ")");
			}
			else if (computerMove.equalsIgnoreCase("paper") && usersMove.equalsIgnoreCase("scissors"))
			{
				userScore = userScore + 1;
				System.out.println("The computer chose paper, so you win! " +
									"(" + userScore + "-" + computerScore + ")");
			}
			
			//Computer chose scissors 
			else if (computerMove.equalsIgnoreCase("scissors") && usersMove.equalsIgnoreCase("scissors"))
			{
				System.out.println("The computer chose scissors, so it's a tie. " +
									"(" + userScore + "-" + computerScore + ")");
			}
			else if (computerMove.equalsIgnoreCase("scissors") && usersMove.equalsIgnoreCase("rock"))
			{
				userScore = userScore + 1;
				System.out.println("The computer chose scissors, so you win! " +
									"(" + userScore + "-" + computerScore + ")");
			}
			else if (computerMove.equalsIgnoreCase("scissors") && usersMove.equalsIgnoreCase("paper"))
			{
				computerScore = computerScore + 1;
				System.out.println("The computer chose scissors, so you lose. " +
									"(" + userScore + "-" + computerScore + ")");
			}
			
			
		} while ((userScore < points) && (computerScore < points));
		
		//Announcing the winner
		if (computerScore < userScore)
		{
			System.out.println("Congratulations! You won!");
		}
		else 
		{
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		keyboard.close();
	}
}
