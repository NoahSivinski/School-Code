/*
 * CSCI1301.java
 * Author: Brooks Ruehle
 * Submission Date:  10/8/21
 *
 * Purpose:
 * The purpose of this lab is to write a program that allows the user to play the
 * game rock, paper, scissors against the computer.
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Points to win: ");
		int pointsToWin = keyboard.nextInt();
		
		int currentPoints = 0;
		int computerPoints = 0;
		
		while(currentPoints < pointsToWin && computerPoints < pointsToWin) {
			
			System.out.print("Rock, paper, or scissors? ");
			String userMove = keyboard.next();
			String computerMove = ComputerOpponent.getMove();
			
			
			if(userMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("scissors")) {
				currentPoints++;
				System.out.println("The computer chose scissors, so you win!  " + "(" + currentPoints + "-" + computerPoints + ")" );
				
			}
			else if(userMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("paper")) {
				computerPoints++;
				System.out.println("The computer chose paper, so you lose.  " + "(" + currentPoints + "-" + computerPoints + ")" );
			}
			else if(userMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("scissors")) {
				computerPoints++;
				System.out.println("The computer chose scissors, so you lose.  " + "(" + currentPoints + "-" + computerPoints + ")" );
			}
			else if(userMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock")) {
				currentPoints++;
				System.out.println("The computer chose rock, so you win!  " + "(" + currentPoints + "-" + computerPoints + ")" );
			}
			else if(userMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("rock")) {
				computerPoints++;
				System.out.println("The computer chose rock, so you lose.  " + "(" + currentPoints + "-" + computerPoints + ")" );
			}
			else if(userMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("paper")) {
				currentPoints++;
				System.out.println("The computer chose paper, so you win!  " + "(" + currentPoints + "-" + computerPoints + ")" );
			}
			else {
				System.out.println("The computer chose " + computerMove + " so it's a tie. " + "(" + currentPoints + "-" + computerPoints + ")" );
			}
		}
	    
		if(computerPoints > currentPoints) {
			System.out.println("Sorry, you lost. Better luck next time! ");
		}else {
			System.out.println("Congratulations! You won!");
		}
		
	}

}
