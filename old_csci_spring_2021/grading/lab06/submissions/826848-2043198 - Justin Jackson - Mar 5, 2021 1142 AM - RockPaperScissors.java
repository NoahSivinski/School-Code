/*
 * RockPaperScissors.java
 * Author:  Justin Jackson 
 * Submission Date:  3/5/2021
 *
 * Purpose: Plays a game of rock, paper, scissors with the users based off how many points to win the user inputs 
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
		

		int winScore = 0;
		int playerScore = 0;
		int computerScore = 0;
		String response = "";
		String ComputerMove = "";
		
		
		Scanner keyboard =  new Scanner(System.in);
		System.out.print("Points to win: ");
		winScore = keyboard.nextInt();
		do 
		{
			System.out.print("Rock, paper, or scissors? ");
			response = keyboard.next();
			ComputerMove = ComputerOpponent.getMove();
			
			if (response.equalsIgnoreCase("rock") && ComputerMove.equalsIgnoreCase("scissors"))
				{
					playerScore++;
					System.out.println("The computer chose " + ComputerMove + ", so you win! ("+playerScore+"-"+computerScore+")");
					
				}else if (response.equalsIgnoreCase("rock") && ComputerMove.equalsIgnoreCase("paper"))
				{
					computerScore++;
					System.out.println("The computer chose " + ComputerMove + ", so you lose. ("+playerScore+"-"+computerScore+")");
					
				}else if (response.equalsIgnoreCase("paper") && ComputerMove.equalsIgnoreCase("rock"))
				{
					playerScore++;
					System.out.println("The computer chose " + ComputerMove + ", so you win! ("+playerScore+"-"+computerScore+")");
					
				}else if (response.equalsIgnoreCase("paper") && ComputerMove.equalsIgnoreCase("scissors"))
				{
					computerScore++;
					System.out.println("The computer chose " + ComputerMove + ", so you lose. ("+playerScore+"-"+computerScore+")");
					
				}else if (response.equalsIgnoreCase("scissors") && ComputerMove.equalsIgnoreCase("paper"))
				{
					playerScore++;
					System.out.println("The computer chose " + ComputerMove + ", so you win! ("+playerScore+"-"+computerScore+")");
					
				}else if (response.equalsIgnoreCase("scissors") && ComputerMove.equalsIgnoreCase("rock"))
				{
					computerScore++;
					System.out.println("The computer chose " + ComputerMove + ", so you lose. ("+playerScore+"-"+computerScore+")");
					
				}else if (response.equalsIgnoreCase(ComputerMove))
				{
					System.out.println("The computer chose " + ComputerMove + ", so it's a tie.");
					
				}
		} while (playerScore < winScore && computerScore < winScore);
		
		}
		
	}

