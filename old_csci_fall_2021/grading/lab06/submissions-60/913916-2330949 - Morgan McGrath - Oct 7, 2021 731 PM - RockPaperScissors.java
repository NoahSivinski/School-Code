/*
 * RockPaperScissors.java
 * Author:  Morgan McGrath 
 * Submission Date:  10/7/2021
 *
 * Purpose: This program creates a game of rock, paper, scissors in which the user plays against
 * the computer. The computer's responses are based on the class ComputerOpponent, which is called on
 * in this program. The user enters in the number of points needed to win, and then they start
 * entering their moves. Once either the computer or the user wins, a corresponding message is displayed
 * and the game ends.
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
		//declare and initialize variables
		String computerMove;
		String userMove;
		int computerPoints=0;
		int userPoints=0;
		int pointsToWin;
		//create scanner
		Scanner keyboard=new Scanner(System.in);
		//allow the user to enter in how many points they need to win
		System.out.print("Points to win: ");
		pointsToWin=keyboard.nextInt();
		//continue the game while neither the computer or user have score needed to win
		while(userPoints<pointsToWin&&computerPoints<pointsToWin) {
			System.out.print("Rock, paper, or scissors? ");
			userMove=keyboard.next();
			//make sure input is valid
			if(userMove.equalsIgnoreCase("rock")||userMove.equalsIgnoreCase("paper")||userMove.equalsIgnoreCase("scissors")) {
				//get the computer's move
				computerMove=ComputerOpponent.getMove();
				//Check to see if it's a tie, you won, or the computer won
				if(userMove.equalsIgnoreCase(computerMove)) {
					System.out.println("The computer chose " + computerMove + ", so it's a tie. ("+userPoints+"-"+computerPoints+")");
				}
				else if(computerMove.equalsIgnoreCase("rock")) {
					if(userMove.equalsIgnoreCase("paper")) {
						userPoints=userPoints+1;
						System.out.println("The computer chose " + computerMove + ", so you win! ("+userPoints+"-"+computerPoints+")");
					}
					else {
						computerPoints=computerPoints+1;
						System.out.println("The computer chose " + computerMove + ", so you lose. ("+userPoints+"-"+computerPoints+")");
					}
				}
				else if(computerMove.equalsIgnoreCase("paper")) {
					if(userMove.equalsIgnoreCase("scissors")) {
						userPoints=userPoints+1;
						System.out.println("The computer chose " + computerMove + ", so you win! ("+userPoints+"-"+computerPoints+")");
					}
					else {
						computerPoints=computerPoints+1;
						System.out.println("The computer chose " + computerMove + ", so you lose. ("+userPoints+"-"+computerPoints+")");
					}
				}
				else {
					if(userMove.equalsIgnoreCase("rock")) {
						userPoints=userPoints+1;
						System.out.println("The computer chose " + computerMove + ", so you win! ("+userPoints+"-"+computerPoints+")");
					}
					else {
						computerPoints=computerPoints+1;
						System.out.println("The computer chose " + computerMove + ", so you lose. ("+userPoints+"-"+computerPoints+")");
					}
				}
			}
		}
		//print end statement about whether or not you won
		if(userPoints==pointsToWin) {
			System.out.println("Congratulations! You won!");
		}
		else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
	}
	
}
