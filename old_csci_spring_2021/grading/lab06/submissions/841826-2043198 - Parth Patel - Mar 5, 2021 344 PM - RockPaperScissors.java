/*
 * RockPaperScissors.java
 * Author:  Parth Patel 
 * Submission Date:  March 05, 2021
 *
 * Purpose: The purpose of this lab is to create a program where the user goes against the computer,
 * this would require two class, one for the user interface, and the other one for the computer to 
 * go against the user. 
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
		
		final String tie = "so you tie. ";
		final String lose = "so you lose.";
		final String win = "so you win !";
		String computerMove,usersMove;
		
		int pointsToWin, userPoints, computerPoints;
		userPoints = 0;
		computerPoints = 0;
		System.out.print("Points to Win: ");
		pointsToWin = keyboard.nextInt();
		
		do {
			System.out.print("Rock, paper, or scissors? ");
			usersMove = keyboard.next();
			
			computerMove = ComputerOpponent.getMove();
			if(usersMove.equalsIgnoreCase("rock") && computerMove.equals("rock")) {
				System.out.println("The computer chose rock, " + tie + "("+userPoints + "-" +computerPoints+")");
			}
			else if(usersMove.equalsIgnoreCase("rock") && computerMove.equals("paper"))
			{
				computerPoints++;
				System.out.println("The computer chose paper, " + lose + "("+userPoints + "-" +computerPoints+")");
			}
			else if(usersMove.equalsIgnoreCase("rock") && computerMove.equals("scissors"))
			{
				userPoints++;
				System.out.println("The computer chose scissors, " + win + "("+userPoints + "-" +computerPoints+")");
			}
			else if(usersMove.equalsIgnoreCase("paper") && computerMove.equals("rock"))
			{
				userPoints++;
				System.out.println("The computer chose rock, " + win + "("+userPoints + "-" +computerPoints+")");
			}
			else if(usersMove.equalsIgnoreCase("paper") && computerMove.equals("paper"))
			{
				System.out.println("The computer chose paper, " + tie + "("+userPoints + "-" +computerPoints+")");
			}
			else if(usersMove.equalsIgnoreCase("paper") && computerMove.equals("scissors"))
			{
				computerPoints++;
				System.out.println("The computer chose scissors, " + lose + "("+userPoints + "-" +computerPoints+")");
			}
			else if(usersMove.equalsIgnoreCase("scissors") && computerMove.equals("paper"))
			{
				userPoints++;
				System.out.println("The computer chose paper, " + win + "("+userPoints + "-" +computerPoints+")");
			}
			else if(usersMove.equalsIgnoreCase("scissors") && computerMove.equals("rock"))

			{
				computerPoints++;
				System.out.println("The computer chose rock, " + lose + "("+userPoints + "-" +computerPoints+")");
			}
			else if(usersMove.equalsIgnoreCase("scissors") && computerMove.equals("scissors"))
			{
				
				System.out.println("The computer chose scissors, " + tie + "("+userPoints + "-" +computerPoints+")");
			}
			
			}
		while((pointsToWin-1) >= computerPoints && (pointsToWin-1) >= userPoints);
		if(userPoints == pointsToWin)
		{
			System.out.println("Congratulations! You won!");
		}
		else if (computerPoints == pointsToWin)
		{
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		keyboard.close();

	}

}
