/*
 * RockPaperScissors.java
 * Author:  Anh Ho
 * Submission Date:  10/04/2021
 *
 * Purpose: getting from user the points needed to win, play the amounts of games needed to get to
 * the amount of points needed provided by user, the one that get there first (player or computer) wins
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

	public static void main (String[] args) {
		//Declare variables
		int pointNeeded;
		int playerScore = 0;
		int computerScore = 0;
		String computerMove;
		String playerMove;
		
		//create new Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		//getting user input on points needed
		System.out.print("Points to win: ");
		pointNeeded = keyboard.nextInt();
		keyboard.nextLine();
		
		//loops until one player reaches the point needed to win
		while (playerScore < pointNeeded && computerScore < pointNeeded) {
			System.out.print("Rock, paper, or scissors? ");
			playerMove = keyboard.nextLine().toLowerCase();
			computerMove = ComputerOpponent.getMove();
			
			//checking player move
			switch (playerMove) {
				case "rock": {
					switch (computerMove) {
						case "rock": {
							System.out.println("The computer chose " + computerMove + ", so it's a tie.\t(" + playerScore + "-" + computerScore +")");
							break;
						}
						case "paper": {
							computerScore++;
							System.out.println("The computer chose " + computerMove + ", so you lose.\t(" + playerScore + "-" + computerScore +")");
							break;
						}
						case "scissors": {
							playerScore++;
							System.out.println("The computer chose " + computerMove + ", so you win!\t(" + playerScore + "-" + computerScore +")");
							break;
						}
					}	//close switch checking computer's move while player's move is rock
					break;
				}	//close case player's move rock
				case "paper": {
					switch (computerMove) {
						case "rock": {
							playerScore++;
							System.out.println("The computer chose " + computerMove + ", so you win!\t(" + playerScore + "-" + computerScore +")");
							break;
						}
						case "paper": {
							System.out.println("The computer chose " + computerMove + ", so it's a tie.\t(" + playerScore + "-" + computerScore +")");
							break;
						}
						case "scissors": {
							computerScore++;
							System.out.println("The computer chose " + computerMove + ", so you lose.\t(" + playerScore + "-" + computerScore +")");
							break;
						}
					}
					break;
				}	//close case player's move paper
				case "scissors": {
					switch (computerMove) {
						case "rock": {
							computerScore++;
							System.out.println("The computer chose " + computerMove + ", so you lose.\t(" + playerScore + "-" + computerScore +")");
							break;
						}
						case "paper": {
							playerScore++;
							System.out.println("The computer chose " + computerMove + ", so you win!\t(" + playerScore + "-" + computerScore +")");
							break;
						}
						case "scissors": {
							System.out.println("The computer chose " + computerMove + ", so it's a tie.\t(" + playerScore + "-" + computerScore +")");
							break;
						}
					}	//close switch checking computer move to compare with player's move scissors
					break;
				}	//close case player's move scissors
				default: {
					System.out.println("Error: Invalid move.");
				}	//error message if input doesn't match the 3 moves
			}	//close switch checking player's move
		}	//close while loop
		if (computerScore > playerScore) {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		else {
			System.out.println("Congratulations! You won!");
		}
		keyboard.close();	//close scanner object
	}	//close main
}	//close class
