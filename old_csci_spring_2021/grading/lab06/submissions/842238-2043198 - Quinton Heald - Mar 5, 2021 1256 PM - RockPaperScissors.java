/*
 * RockPaperScissors.java
 * Author:  Quinton Heald
 * Submission Date:  3-5-21
 *
 * Purpose: This program allows the user to play rock paper scissors
 * against the computer. The program first asks for how many points 
 * either the player or computer must score for the game to be won.
 * Then, the player will proceed to play against the computer until either
 * the player or the computer has won the game. The computer generates
 * its move through a method that randomly selects either rock, paper
 * or scissors. The game itself is run through a loop which allows the 
 * game to be continuously played until the win condition is met. This allows
 * the computer to display the current points each player has through each iteration.
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

	public static void main(String[]args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Points to win: ");
		int pointsToWin = input.nextInt();

		input.nextLine();

		int userPoints = 0;
		int computerPoints = 0;

		while((userPoints < pointsToWin) && (computerPoints < pointsToWin)) {

			System.out.print("Rock, paper, or scissors? ");
			String userMove = input.nextLine();

			if(userMove.equalsIgnoreCase("rock") || userMove.equalsIgnoreCase("paper") || userMove.equalsIgnoreCase("scissors")) {

				String computerMove = ComputerOpponent.getMove();

				if(userMove.equalsIgnoreCase("rock") && (computerMove.equalsIgnoreCase("scissors"))) {
					userPoints = userPoints + 1;
					System.out.println("The computer chose " + computerMove + ", so you win!  (" + userPoints + "-" + computerPoints + ")");
				} else if (userMove.equalsIgnoreCase("rock") && (computerMove.equalsIgnoreCase("paper"))) {
					computerPoints = computerPoints +1;
					System.out.println("The computer chose " + computerMove + ", so you lose.  (" + userPoints + "-" + computerPoints + ")");
				} else if (userMove.equalsIgnoreCase("rock") && (computerMove.equalsIgnoreCase("rock"))) {
					System.out.println("The computer chose " + computerMove + ", so it's a tie.  (" + userPoints + "-" + computerPoints + ")");		
				} 

				if(userMove.equalsIgnoreCase("paper") && (computerMove.equalsIgnoreCase("rock"))) {
					userPoints = userPoints + 1;
					System.out.println("The computer chose " + computerMove + ", so you win!  (" + userPoints + "-" + computerPoints + ")");
				} else if (userMove.equalsIgnoreCase("paper") && (computerMove.equalsIgnoreCase("scissors"))) {
					computerPoints = computerPoints +1;
					System.out.println("The computer chose " + computerMove + ", so you lose.  (" + userPoints + "-" + computerPoints + ")");
				} else if (userMove.equalsIgnoreCase("paper") && (computerMove.equalsIgnoreCase("paper"))) {
					System.out.println("The computer chose " + computerMove + ", so it's a tie.  (" + userPoints + "-" + computerPoints + ")");		
				} 

				if(userMove.equalsIgnoreCase("scissors") && (computerMove.equalsIgnoreCase("paper"))) {
					userPoints = userPoints + 1;
					System.out.println("The computer chose " + computerMove + ", so you win!  (" + userPoints + "-" + computerPoints + ")");
				} else if (userMove.equalsIgnoreCase("scissors") && (computerMove.equalsIgnoreCase("rock"))) {
					computerPoints = computerPoints +1;
					System.out.println("The computer chose " + computerMove + ", so you lose.  (" + userPoints + "-" + computerPoints + ")");
				} else if (userMove.equalsIgnoreCase("scissors") && (computerMove.equalsIgnoreCase("scissors"))){
					System.out.println("The computer chose " + computerMove + ", so it's a tie.  (" + userPoints + "-" + computerPoints + ")");	
				}
			} else {
				System.out.println("Invalid input...");
			}

		} 

		if(userPoints == pointsToWin){
			System.out.println("Congratulations! You Won!");

		}else if(computerPoints == pointsToWin) { 
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		
		input.close();
	}

}

