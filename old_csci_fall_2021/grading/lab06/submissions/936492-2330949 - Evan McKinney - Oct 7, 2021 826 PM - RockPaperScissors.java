/*
 * RockPaperScissors.java
 * Author:  Evan McKinney 
 * Submission Date:  10/7/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *	This program plays rock, paper, scissors with the computer. It first
 *	promts the user for the points needed to win the game. After that, the user
 *	inputs either rock, paper, or scissors. The computer chooses either rock, 
 *	paper, or scissors pseudorandomly in the ComputerOpponent class. The program
 *	then says if the user won, tied, or loss, and keeps score until the user or
 *	computer wins.
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

		String userMove, computerMove;
		int pointsToWin, userWins = 0, computerWins = 0;

		//prompts user for the points needed to win
		System.out.print("Points to win: ");
		pointsToWin = keyboard.nextInt();
		keyboard.nextLine();

		while(userWins < pointsToWin && computerWins < pointsToWin) {
			//this do while loop handles the input and asks again if they didn't input a valid string
			do {
				System.out.print("Rock, paper, or scissors? ");
				userMove = keyboard.nextLine().trim().toLowerCase();
			} while(!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors"));
			computerMove = ComputerOpponent.getMove();
			
			//checks if they tied
			if(computerMove.equals(userMove)) {
				System.out.print("The computer chose " + computerMove + ", so it's a tie. ");
			}else if(
					//these three conditions are when the user would win
					(userMove.equals("rock") && computerMove.equals("scissors")) ||
					(userMove.equals("paper") && computerMove.equals("rock")) ||
					(userMove.equals("scissors") && computerMove.equals("paper"))){
				System.out.print("The computer chose " + computerMove + ", so you win! ");
				userWins++;
			}else{//if the user didn't tie or win, then they lost
				System.out.print("The computer chose " + computerMove + ", so you lose. ");
				computerWins++;
			}
			//outputs the current score
			System.out.println("(" + userWins + "-" + computerWins + ")");
		}
		
		//checks whether the computer or user won
		if(userWins == pointsToWin) {
			System.out.println("Congratulations! You won!");
		}else{
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		
		keyboard.close();
	}
}