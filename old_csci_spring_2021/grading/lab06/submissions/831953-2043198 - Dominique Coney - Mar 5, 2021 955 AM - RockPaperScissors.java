/**
 * 
 */

/**
 * @author Dominique Coney

 *
 */
/*
 * RockPaperScissors.java
 * Author:  Dominique Coney
 * Submission Date:  March 5, 2021
 *
 * Purpose: The purpose of this program is to use loops to run a rock paper scissors game against a user and the computer.
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Points to win:");
		int points=keyboard.nextInt();
		String userMove;
		String compMove;
		int userScore=0;
		int compScore=0;
		while ((userScore < points) && (compScore < points)) {
			System.out.print("Rock, paper, or scissors? ");
			userMove=keyboard.next();
			compMove=ComputerOpponent.getMove();
			if (userMove.equalsIgnoreCase ("rock")) {
				if (compMove.equalsIgnoreCase ("rock")) {
					System.out.print("The computer chose rock, so it's a tie.");
					System.out.println("("+ userScore +  "-" + compScore +")");
				}
				else if (compMove.equalsIgnoreCase("paper")){
					compScore++;
					System.out.print("The computer chose paper, so you lose.");
					System.out.println("("+ userScore +  "-" + compScore +")");
				}
				else if (compMove.equalsIgnoreCase("scissors")){
					userScore++;
					System.out.print("The computer chose scissors, so you win.");
					System.out.println("("+ userScore +  "-" + compScore +")");
				}
			}
			if (userMove.equalsIgnoreCase ("paper")) {
				if (compMove.equalsIgnoreCase ("paper")) {
					System.out.print("The computer chose paper, so it's a tie.");
					System.out.println("("+ userScore +  "-" + compScore +")");
				}
				else if (compMove.equalsIgnoreCase("scissors")){
					compScore++;
					System.out.print("The computer chose scissors, so you lose.");
					System.out.println("("+ userScore +  "-" + compScore +")");
				}
				else if (compMove.equalsIgnoreCase("rock")){
					userScore++;
					System.out.print("The computer chose rock, so you win.");
					System.out.println("("+ userScore +  "-" + compScore +")");
				}
			}
			if (userMove.equalsIgnoreCase ("scissors")) {
				if (compMove.equalsIgnoreCase ("scissors")) {
					System.out.print("The computer chose scissors, so it's a tie.");
					System.out.println("("+ userScore +  "-" + compScore +")");
				}
				else if (compMove.equalsIgnoreCase("rock")){
					compScore++;
					System.out.print("The computer chose rock, so you lose.");
					System.out.println("("+ userScore +  "-" + compScore +")");
				}
				else if (compMove.equalsIgnoreCase("paper")){
					userScore++;
					System.out.print("The computer chose paper, so you win.");
					System.out.println("("+ userScore +  "-" + compScore +")");
				}
			}
			
		}
		if((userScore > compScore)) {
			System.out.println("Congratulations! You won!");
		}
		else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		keyboard.close();
		}
	}

