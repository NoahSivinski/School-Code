/*
 * CSCI 1301.java
 * Author: Joo Young Kang
 * Submission Date:  March 4, 2021
 *
 * Purpose: This program allows the user to play multiple rounds of "Rock, Paper, or Scissors"
 * where the user will play against the computer until there is a game winner. The winner is
 * determined when the user or the computer reaches the set amount of points to win which is
 * established by the user before the game rounds start.
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
		
		// set scanner keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// initialize i & j for score tab
		int i = 0;
		int j = 0;
		
		// inputPoint: points to win
		// inputMove: input of user move
		int inputPoint = 0;
		String inputMove;
		
		// prompts user to input
		System.out.print("Points to win: ");
		inputPoint = keyboard.nextInt();
			
			// if statement: input is greater than 0
			if (inputPoint > 0) {
				
				// loop when i & j is less than inputPoint (points to win)
				while(i < inputPoint && j < inputPoint) {
					
					// sets computerMove to call on generated computer move
					String computerMove = ComputerOpponent.getMove();
					
					// prompts user for inputMove: rock, paper, or scissors
					System.out.print("Rock, paper, or scissors? ");
					inputMove = keyboard.next().trim();
					
					// if inputMove equals to either rock, paper, or scissors then computerMove is called
					if (inputMove.equalsIgnoreCase("rock") || inputMove.equalsIgnoreCase("paper") 
																|| inputMove.equalsIgnoreCase("scissors")) {
							
							// condition are set to determine who wins during the round
							// condition: rock < paper
							if (inputMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("paper")) {
								j++;
								System.out.println("The computer chose " + computerMove + " so you lose. "
										+ "(" + i + "-" + j + ")");
								
								// condition: if score j equals to inputPoint then user loses game
								if (j==inputPoint){
									System.out.print("Sorry, you lost. Better luck next time!");
								}
							}
							
							// condition: rock > scissors
							else if (inputMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("scissors")) {
								i++;
								System.out.println("The computer chose " + computerMove + " so you win! "
										+ "(" + i + "-" + j + ")");
								// condition: if score i equals to inputPoint then user wins game
								if (i==inputPoint) {
									System.out.print("Congratulations! You won!");
								}
							}
							
							// condition: scissors > paper
							else if (inputMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("paper")) {
								i++;
								System.out.println("The computer chose " + computerMove + " so you win! "
										+ "(" + i + "-" + j + ")");
								if (i==inputPoint) {
									System.out.print("Congratulations! You won!");
								}
							}
							
							// condition: scissors < rock
							else if (inputMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("rock")) {
								j++;
								System.out.println("The computer chose " + computerMove + " so you lose. "
										+ "(" + i + "-" + j + ")");
								if (j==inputPoint){
									System.out.print("Sorry, you lost. Better luck next time!");
								}
							}
							
							// condition: paper < scissors
							else if (inputMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("scissors")) {
								j++;
								System.out.println("The computer chose " + computerMove + " so you lose. "
										+ "(" + i + "-" + j + ")");
								if (j==inputPoint){
									System.out.print("Sorry, you lost. Better luck next time!");
								}
							}
							
							// condition: paper > rock
							else if (inputMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock")) {
								i++;
								System.out.println("The computer chose " + computerMove + " so you win! "
										+ "(" + i + "-" + j + ")");
								if (i==inputPoint) {
									System.out.print("Congratulations! You won!");
								}
							}
							
							// condition: if inputMove equals to computerMove
							// i=i, j=j is set to be the same
							else if (inputMove.equalsIgnoreCase(computerMove)) {
								System.out.println("The computer chose " + computerMove + " so it's a tie. "
										+ "(" + i + "-" + j + ")");
								i = i;
								j = j;
							}
						}
					// if inputMove is not rock, paper, or scissors
					else {
						System.out.println("Invalid");
					}
				}
			}
			// if inputPoint is not greater than 0
			else {
				System.out.print("Invalid");
			}
		}
}
