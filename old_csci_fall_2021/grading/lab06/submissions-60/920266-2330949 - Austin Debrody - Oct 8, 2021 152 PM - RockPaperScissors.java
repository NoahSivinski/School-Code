/*
 * RockPaperScissors.java
 * Author:  Austin Debrody
 * Submission Date:  10/8/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *
 * This program runs a version of rock, paper, scissors between a user
 * and a computer program (provided in the lab instructions). The player 
 * will input their move and the computer will make its choice as pseudorandom.
 * The winner will be determined based on the classic rules of rock, paper, 
 * scissors. Multiple rounds will also be played until either the computer or
 * user reaches the set number of wins in a full game. 
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


import java.util.Scanner;	// import scanner

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	// create scanner object
		
		// initialize and declare necessary variables
		int pointsToWin;
		int winCounter = 0;
		int lossCounter = 0;
		String userMove;
		String computerMove;
		
		System.out.print("Points to win: ");	// initialize pointsToWin to user input
		pointsToWin = scan.nextInt();
		
		// loop to continue while neither the user nor computer are at maximum number of wins
		while(winCounter < pointsToWin && lossCounter < pointsToWin) {
			// ask user for their move
			System.out.print("Rock, paper, or scissors? ");
			userMove = scan.next();
			computerMove = ComputerOpponent.getMove();	// get computer move
			
			// what happens if a player plays rock
			if(userMove.equalsIgnoreCase("rock")) {
				if(computerMove.equalsIgnoreCase("rock")) {
					System.out.println("The computer chose rock, so it's a tie.  (" + winCounter + "-" + lossCounter + ")");
				} else if(computerMove.equalsIgnoreCase("scissors")) {
					winCounter++;	// player wins increase
					System.out.println("The computer chose scissors, so you win!  (" + winCounter + "-" + lossCounter + ")");
				} else{
					lossCounter++;	// computer wins increase
					System.out.println("The computer chose paper, so you lose.  (" + winCounter + "-" + lossCounter + ")");
				}
			// what happens if a player plays paper
			}else if(userMove.equalsIgnoreCase("paper")) {
				if(computerMove.equalsIgnoreCase("paper")) {
					System.out.println("The computer chose paper, so it's a tie.  (" + winCounter + "-" + lossCounter + ")");
				} else if(computerMove.equalsIgnoreCase("rock")) {
					winCounter++;	// player wins increase
					System.out.println("The computer chose rock, so you win!  (" + winCounter + "-" + lossCounter + ")");
				} else{
					lossCounter++;	// computer wins increase
					System.out.println("The computer chose scissors, so you lose.  (" + winCounter + "-" + lossCounter + ")");
				}
			// what happens if player plays scissors
			} else if(userMove.equalsIgnoreCase("scissors")) {
				if(computerMove.equalsIgnoreCase("scissors")) {
					System.out.println("The computer chose scissors, so it's a tie.  (" + winCounter + "-" + lossCounter + ")");
				} else if(computerMove.equalsIgnoreCase("paper")) {
					winCounter++;	// player wins increase
					System.out.println("The computer chose paper, so you win!  (" + winCounter + "-" + lossCounter + ")");
				} else{
					lossCounter++;	// computer wins increase
					System.out.println("The computer chose rock, so you lose.  (" + winCounter + "-" + lossCounter + ")");
				}
				
			} else {
				// allows any other input to go back to the beginning of the while loop and repeat the process
			}	
		}
		
		if(winCounter == pointsToWin) {
			System.out.println("Congratulations! You won!");	// prints if user has the pointsToWin
		}else {
			System.out.println("Sorry, you lost. Better luck next time!");	// prints if the computer won
		}
		

	}

}
