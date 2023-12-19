/*
 * RockPaperScissors.java
 * Author:  Tenacity Murdie 
 * Submission Date:  10-7-2021
 *
 * Purpose: This program allows the user to play rock, paper, scissors with the computer until either the user
 * or the computer reach a certain number of points (determined by the user).
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
		String computerMove = "";
		String playerInput = "";
		String score = "";
		int playerScore = 0;
		int computerScore = 0;

		//rock beats scissors
		//paper beats rock
		//scissors beat paper

		System.out.print("Points to win: ");
		int pointsToWin = keyboard.nextInt(); //getting user input for number of points needed
		keyboard.nextLine(); //clearing out the extra \n character


		while((playerScore < pointsToWin) && (computerScore < pointsToWin)) {
			
			System.out.print("Rock, paper, or scissors? ");
			playerInput = keyboard.nextLine().toLowerCase().trim();//getting user input
			
			//repeatedly asking for user input until it is valid
			while(!(playerInput.equals("rock")) && !(playerInput.equals("paper")) && !(playerInput.equals("scissors"))){
				System.out.print("Rock, paper, or scissors? ");
				playerInput = keyboard.nextLine().toLowerCase().trim();
			}

			computerMove = ComputerOpponent.getMove(); //getting computer's move

			//checking to see who wins each round and printing resulting scores
			if (playerInput.equals("rock")) {
				if (computerMove.equals("rock")){
					score = "(" + playerScore + "-" + computerScore + ")";
					System.out.println("The computer chose rock, so it's a tie. " + score);
				}
				else if (computerMove.equals("scissors")) {
					playerScore++;
					score = "(" + playerScore + "-" + computerScore + ")";
					System.out.println("The computer chose scissors, so you win! " + score);
				}
				else {
					computerScore++;
					score = "(" + playerScore + "-" + computerScore + ")";
					System.out.println("The computer chose paper, so you lose. " + score);
				}
			}
			else if (playerInput.equals("paper")) {
				if (computerMove.equals("rock")){
					playerScore++;
					score = "(" + playerScore + "-" + computerScore + ")";
					System.out.println("The computer chose rock, so you win! " + score);
				}
				else if (computerMove.equals("scissors")) {
					computerScore++;
					score = "(" + playerScore + "-" + computerScore + ")";
					System.out.println("The computer chose scissors, so you lose. " + score);
				}
				else {
					score = "(" + playerScore + "-" + computerScore + ")";
					System.out.println("The computer chose paper, so it's a tie. " + score);
				}

			}
			else if (playerInput.equals("scissors")) {
				if (computerMove.equals("rock")){
					computerScore++;
					score = "(" + playerScore + "-" + computerScore + ")";
					System.out.println("The computer chose rock, so you lose. " + score);
				}
				else if (computerMove.equals("scissors")) {
					score = "(" + playerScore + "-" + computerScore + ")";
					System.out.println("The computer chose scissors, so it's a tie " + score);
				}
				else {
					playerScore++;
					score = "(" + playerScore + "-" + computerScore + ")";
					System.out.println("The computer chose paper, so you win! " + score);
				}
			}
		}

		//checking to see who won the game
		if (playerScore == pointsToWin) {
			System.out.println("Congratulations! You won!");
		}
		else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}

		keyboard.close(); //optional closing of keyboard
	}


}

