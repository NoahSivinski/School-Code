/*
 * RockPaperScissors.java
 * Author:  Nicolas Blandino 
 * Submission Date:  10/7/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * The program will play basically allow you to play rock paper scissors against a computer
 * for a specified amount of rounds
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
	public static void main(String [] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		String YourMove;
		String computerMove;
		
		int NumberofMatches;
		int YourWins;
		int ComputerWins;
		YourWins = 0;
		ComputerWins = 0;
		
		System.out.print("Points to win: ");
		NumberofMatches = keyboard.nextInt();
		
		do {
					
			System.out.print("Rock, paper, or scissors? ");
			computerMove = ComputerOpponent.getMove();
			YourMove = keyboard.next();
			if(YourMove.equalsIgnoreCase("Rock") || YourMove.equalsIgnoreCase("Paper")|| YourMove.equalsIgnoreCase("Scissors")) {
		
				if (computerMove.equalsIgnoreCase(YourMove))	{
					System.out.println("The computer chose " + computerMove + ", so it's a tie.\t" + YourWins+"-"+ComputerWins);
				}
		
				else if (computerMove.equalsIgnoreCase("Rock") && YourMove.equalsIgnoreCase("Paper"))	{
					YourWins++;
					System.out.println("The computer chose " + computerMove + ", so you win!\t" + YourWins+"-"+ComputerWins);
			
				}
				else if (computerMove.equalsIgnoreCase("Paper") && YourMove.equalsIgnoreCase("Scissors")) {
					YourWins++;
					System.out.println("The computer chose " + computerMove + ", so you win!\t" + YourWins+"-"+ComputerWins);
				}
				else if (computerMove.equalsIgnoreCase("Scissors") && YourMove.equalsIgnoreCase("Rock")) {
					YourWins++;
					System.out.println("The computer chose " + computerMove + ", so you win!\t"+ YourWins+"-"+ComputerWins);
				}
		
				else {
					ComputerWins++;
					System.out.println("The computer chose " + computerMove + ", so you lose.\t" + YourWins+"-"+ComputerWins);
				}
			}
			else {
				System.out.println("You really should put in a legitimate move");
			}
			
			
		} while(YourWins < NumberofMatches && ComputerWins < NumberofMatches);
		
		
		
		if (YourWins == NumberofMatches) {
			System.out.println("Congratulations! You won!");
		}
		else if (ComputerWins == NumberofMatches) {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		
		
		keyboard.close();
	}
}
