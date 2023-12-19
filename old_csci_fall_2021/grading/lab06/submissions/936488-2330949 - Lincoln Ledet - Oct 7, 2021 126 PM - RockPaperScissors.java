/*
 * RockPaperScissors.java
 * Author: Lincoln Ledet
 * Submission Date:  10/7/21
 * Lab 06 – Rock, Paper, Scissors
 * 
 * Purpose: This program simulates a game of rock paper scissors.
 * The pseudorandom move of the computer is generated from a 
 * ComputerOpponent.java class.
 * 
 * 
 *  * Statement of Academic Honesty:
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
		//Initializing Variables
		Scanner keyboard =  new Scanner(System.in);
		String computerMove;
		String userMove ="";
		
		int userScore = 0;
		int computerScore = 0;
		
		//gets asks user how many points does it take to win.
		System.out.print("Points to win: ");
		int pointToWin = keyboard.nextInt();
		userMove = keyboard.nextLine();//first time using nextline does not for some reason?!? feedback is welcome 
		while (userScore < pointToWin && computerScore < pointToWin) {//While the has not reached pointsToWin
			computerMove = ComputerOpponent.getMove();
			while (!(userMove.equalsIgnoreCase("rock")||userMove.equalsIgnoreCase("paper")||userMove.equalsIgnoreCase("scissors"))){//gets users move
				System.out.print("Rock, paper, or scissors? ");
				userMove = keyboard.nextLine().trim();
			}
			//tie case
			if (userMove.equalsIgnoreCase(computerMove)){
				System.out.println("The computer chose "+computerMove+", so it's a tie. ("+userScore+"-"+computerScore+")");
			}
			//user win
			else if((userMove.equalsIgnoreCase("rock")&&computerMove.equalsIgnoreCase("scissors"))||(userMove.equalsIgnoreCase("paper")&&computerMove.equalsIgnoreCase("rock"))||(userMove.equalsIgnoreCase("scissors")&&computerMove.equalsIgnoreCase("paper"))) {
				userScore+= 1;
				System.out.println("The computer chose "+computerMove+", so you win! ("+userScore+"-"+computerScore+")");
		
			}
			//computer win
			else {
				computerScore+= 1;
				System.out.println("The computer chose "+computerMove+", so you lose. ("+userScore+"-"+computerScore+")");
			}
			userMove ="";//resets usermove
				
		}
		//player wins game
		if (userScore==pointToWin) {
			System.out.println("Congratulations! You won!");
		}//player loses game
		if (computerScore==pointToWin) {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
			
	}

}
