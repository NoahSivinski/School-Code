/*
 * [RockPaperScissors].java
 * Author:  [Shovek Basu] 
 * Submission Date:  [03/05/2021]
 *
 * Purpose: random rock paper scissors vs a computer
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
		int userScore = 0;
		int compScore = 0;
		int counter = 0;
		
		String userChoice;
		
		String rock = "rock";
		String paper = "paper";
		String scissors = "scissors";
		
		
		//asks how many points to win
		System.out.print("Points to win: ");
		int pointsForWin = keyboard.nextInt();
		if (pointsForWin < 0) {
			System.out.println("Please enter a number greater than 0");
			System.exit(0);
		}
		//while loop that deals with user choice and random computer choice
		while (counter == 0)  {
		
		System.out.print("Rock, paper, or scissors?");
		userChoice = keyboard.next();
		String computerMove = ComputerOpponent.getMove();
		
		//tells the code that if they misspell a word or something that isnt rock paper or scissors 
		if ( (!userChoice.equalsIgnoreCase(rock)) && (!userChoice.equalsIgnoreCase(paper)) && (!userChoice.equalsIgnoreCase(scissors))) {
			System.out.print("");
			
		}
		
		//if theres a tie
		if (userChoice.equalsIgnoreCase(computerMove)) {
			System.out.println("The computer chose " + computerMove + ", so it's a tie. " + "(" + userScore + "-"+ compScore +")" );
		}
		//when rock is chosen
		else if (userChoice.equalsIgnoreCase(rock)) {
			
			if (computerMove.equalsIgnoreCase(paper)) {
				compScore++;
				System.out.println("The computer chose " + computerMove + ", so you lose. " + "(" + userScore + "-"+ compScore +")" );
			}
			
			else if (computerMove.equalsIgnoreCase(scissors)) {
				userScore++;
				System.out.println("The computer chose " + computerMove + ", so you win! " + "(" + userScore + "-"+ compScore +")" );
			}
		
		}
		//if paper
		else if (userChoice.equalsIgnoreCase(paper)) {
			
			if (computerMove.equalsIgnoreCase(scissors)) {
				compScore++;
				System.out.println("The computer chose " + computerMove + ", so you lose. " + "(" + userScore + "-"+ compScore +")" );
			}
			
			else if (computerMove.equalsIgnoreCase(rock)) {
				userScore++;
				System.out.println("The computer chose " + computerMove + ", so you win! " + "(" + userScore + "-"+ compScore +")" );
			} 
		
		
		}
		//if scissors
		else if (userChoice.equalsIgnoreCase(scissors)) {
			
			if (computerMove.equalsIgnoreCase(rock)) {
				compScore++;
				System.out.println("The computer chose " + computerMove + ", so you lose. " + "(" + userScore + "-"+ compScore +")" );
			}
			
			else if (computerMove.equalsIgnoreCase(paper)) {
				userScore++;
				System.out.println("The computer chose " + computerMove + ", so you win! " + "(" + userScore + "-"+ compScore +")" );
			} 
		
		
	}	//winner text
		if (userScore == pointsForWin) {
			System.out.println("Congratulations! You won!");
			counter ++;
		}
		if (compScore == pointsForWin) {
			System.out.println("Sorry, you lose. Better luck next time!");
			counter++;
		}
}
	
		keyboard.close();
}
}		