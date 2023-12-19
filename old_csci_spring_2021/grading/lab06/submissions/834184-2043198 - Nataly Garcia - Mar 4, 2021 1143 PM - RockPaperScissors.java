/*
 * [Intro to Computing and Program].java
 * Author:  [Nataly Garcia] 
 * Submission Date:  [Thursday March 4th 2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? The program essentially represents
 * a game of 'rock, paper, scissors, shoe' but with 
 * computer-generated inputs against user inputs. The computer
 * inputs are random -that is if the TESTING_MODE is false. 
 * Based on the input of both the computer and the user, the 
 * program will produce one of three response: a winning response,
 * a tied response, and a lost response.
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
		Scanner input = new Scanner(System.in);

		System.out.print("Points to win: ");
		int points = Integer.parseInt(input.nextLine());
		int computerPointsToWin = 0;
		int userPointsToWin = 0;

		while ((points > userPointsToWin) && (points > computerPointsToWin)) {

			System.out.print("Rock, paper, or scissors? ");
			String userMove = input.nextLine();
			String computerMove = ComputerOpponent.getMove();
			userMove = userMove.trim();

			if (computerMove.equals("rock")) {
				if (userMove.equalsIgnoreCase("rock")) {
					System.out.print("The computer chose rock, so it's a tie."  );
					System.out.println(" (" + userPointsToWin + "-" + computerPointsToWin +")");
				}
				else if (userMove.equalsIgnoreCase("paper")) {
					System.out.print("The computer chose rock, so you win!");
					userPointsToWin++;
					System.out.println(" (" + userPointsToWin + "-" + computerPointsToWin +")");
				}
				else if (userMove.equalsIgnoreCase("scissors")) {
					System.out.print("The computer chose rock, so you lose.");
					computerPointsToWin++;
					System.out.println(" (" + userPointsToWin + "-" + computerPointsToWin +")");
				}
			}

			else if (computerMove.equals("paper")) {
				if (userMove.equalsIgnoreCase("rock")) {
					System.out.print("The computer chose paper, so you lose.");
					computerPointsToWin++;
					System.out.println(" (" + userPointsToWin + "-" + computerPointsToWin +")");
				}
				else if (userMove.equalsIgnoreCase("paper")) {
					System.out.print("The computer chose paper, so it's a tie.");
					System.out.println(" (" + userPointsToWin + "-" + computerPointsToWin +")");
				}
				else if (userMove.equalsIgnoreCase("scissors")) {
					System.out.print("The computer chose paper, so you win!");
					userPointsToWin++;
					System.out.println(" (" + userPointsToWin + "-" + computerPointsToWin +")");
				}
			}

			else if (computerMove.equals("scissors")) {
				if (userMove.equalsIgnoreCase("rock")) {
					System.out.print("The computer chose scissors, so you win!");
					userPointsToWin++;
					System.out.println(" (" + userPointsToWin + "-" + computerPointsToWin +")");
				}
				else if (userMove.equalsIgnoreCase("paper")) {
					System.out.print("The computer chose scissors, so you lose.");
					computerPointsToWin++;
					System.out.println(" (" + userPointsToWin + "-" + computerPointsToWin +")");
				}
				else if (userMove.equalsIgnoreCase("scissors")) {
					System.out.print("The computer chose scissors, so it's a tie.");
					System.out.println(" (" + userPointsToWin + "-" + computerPointsToWin +")");
				}
			}
		}
		
		if (points == userPointsToWin) {
			System.out.print("Congratulations! You won!");
		}
		else if (points == computerPointsToWin) {
			System.out.print("Sorry, you lost. Better luck next time!");
		}
		input.close();
	}
}


