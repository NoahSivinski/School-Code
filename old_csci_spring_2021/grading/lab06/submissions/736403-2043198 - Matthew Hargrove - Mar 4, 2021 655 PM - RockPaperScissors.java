/*
 * RockPaperScissors.java
 * Author:  Matthew Hargrove 
 * Submission Date:  3/4/2021
 *
 * Purpose: Playing rock paper scissors against the computer
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
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Points to win: ");
		int pointsToWin=keyboard.nextInt();
		int userCount=0;
		int computerCount=0;

		do {
			System.out.print("Rock, paper, or scissors? ");
			String userMove=keyboard.next();
			String computerMove = ComputerOpponent.getMove();
			//		count++;
			


			if (computerMove.equalsIgnoreCase("rock")&&userMove.equalsIgnoreCase("paper")) {
				userCount++;
				System.out.println("The computer chose " + computerMove + ", so you win!" + "(" + userCount + "-" + computerCount + ")");}
			if (computerMove.equalsIgnoreCase("rock")&&userMove.equalsIgnoreCase("scissors")) {
				computerCount++;
				System.out.println("The computer chose " + computerMove + ", so you lose."+ "(" + userCount + "-" + computerCount + ")");}
			if (computerMove.equalsIgnoreCase("rock")&&userMove.equalsIgnoreCase("rock"))
				System.out.println("The computer chose " + computerMove + ", so it's a tie."+ "(" + userCount + "-" + computerCount + ")");

			if (computerMove.equalsIgnoreCase("paper")&&userMove.equalsIgnoreCase("scissors")) {
				userCount++;
				System.out.println("The computer chose " + computerMove + ", so you win!"+ "(" + userCount + "-" + computerCount + ")");}
			if (computerMove.equalsIgnoreCase("paper")&&userMove.equalsIgnoreCase("rock")) {
				computerCount++;
				System.out.println("The computer chose " + computerMove + ", so you lose."+ "(" + userCount + "-" + computerCount + ")");}
			if (computerMove.equalsIgnoreCase("paper")&&userMove.equalsIgnoreCase("paper"))
				System.out.println("The computer chose " + computerMove + ", so it's a tie."+ "(" + userCount + "-" + computerCount + ")");

			if (computerMove.equalsIgnoreCase("scissors")&&userMove.equalsIgnoreCase("rock")) {
				userCount++;
				System.out.println("The computer chose " + computerMove + ", so you win!"+ "(" + userCount + "-" + computerCount + ")");}
			if (computerMove.equalsIgnoreCase("scissors")&&userMove.equalsIgnoreCase("paper")) {
				computerCount++;
				System.out.println("The computer chose " + computerMove + ", so you lose."+ "(" + userCount + "-" + computerCount + ")");}
			if (computerMove.equalsIgnoreCase("scissors")&&userMove.equalsIgnoreCase("scissors"))
				System.out.println("The computer chose " + computerMove + ", so it's a tie."+ "(" + userCount + "-" + computerCount + ")");
			}
		while ((userCount<pointsToWin)&&(computerCount<pointsToWin));
		
		if (userCount==pointsToWin)
			System.out.print("Congratulations! You won!");
		else
			System.out.print("Sorry, you lost. Better luck next time");
		
		}
	}
