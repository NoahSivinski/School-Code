/*
 * [RockPaperScissors].java
 * Author:  [Rachel Chesebro'] 
 * Submission Date:  [10/08/2021]
 *
 * Purpose: The purpose of this program is to allow the user to play the game, "Rock, Paper, Scissors"
 * against a computer. The score is kept track of until either the user or computer wins by scoring 
 * the amount of points initially entered by the user. 
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
		
		//Declare variables, including computerMove, which uses ComputerOpponent.java
		//score is the user's score and compScore is the computer's score
		int score = 0;
		int pointsToWin;
		int compScore = 0;
		String computerMove= "";
		computerMove = ComputerOpponent.getMove();
		String choice = "";
		System.out.print("Points to win: ");
		pointsToWin = keyboard.nextInt();
		keyboard.nextLine();

		//Create while loop so the program stops when someone wins
		while((pointsToWin != score) && (pointsToWin != compScore)) {
			System.out.print("Rock, paper, or scissors? ");
			choice = keyboard.nextLine();
			while ((choice.equalsIgnoreCase("rock")) || (choice.equalsIgnoreCase("paper")) || (choice.equalsIgnoreCase("scissors"))) { 

				//User chooses rock
				if (choice.equalsIgnoreCase("rock")) {
					if (computerMove.equalsIgnoreCase("paper")) {
						compScore ++;
						System.out.println("The computer chose " + computerMove + ", so you lose.(" + score + "-" + compScore + ")");
						if ((pointsToWin != score) && (pointsToWin != compScore)) {
							System.out.print("Rock, paper, or scissors? ");
							choice = keyboard.nextLine(); }}
					else if(computerMove.equalsIgnoreCase("scissors")) {
						score ++;
						System.out.println("The computer chose " + computerMove + ", so you win! (" + score + "-" + compScore + ")"); 
						if ((pointsToWin != score) && (pointsToWin != compScore)) {
							System.out.print("Rock, paper, or scissors? ");
							choice = keyboard.nextLine(); }}
					else {
						System.out.println("The computer chose " + computerMove + ", so it's a tie. (" + score + "-" + compScore + ")"); } 
						if ((pointsToWin != score) && (pointsToWin != compScore)) {
							System.out.print("Rock, paper, or scissors? ");
							choice = keyboard.nextLine(); }
				}
		
				//User chooses paper
				if (choice.equalsIgnoreCase("paper")) {
					if (computerMove.equalsIgnoreCase("scissors")) {
						compScore ++;
						System.out.println("The computer chose " + computerMove + ", so you lose. (" + score + "-" + compScore + ")"); 
						if ((pointsToWin != score) && (pointsToWin != compScore)) {
							System.out.print("Rock, paper, or scissors? ");
							choice = keyboard.nextLine(); }}
					else if(computerMove.equalsIgnoreCase("rock")) {
						score ++;
						System.out.println("The computer chose " + computerMove + ", so you win! (" + score + "-" + compScore + ")"); 
						if ((pointsToWin != score) && (pointsToWin != compScore)) {
							System.out.print("Rock, paper, or scissors? ");
							choice = keyboard.nextLine(); }}
					else {
						System.out.println("The computer chose " + computerMove + ", so it's a tie. (" + score + "-" + compScore + ")"); 
						if ((pointsToWin != score) && (pointsToWin != compScore)) {
							System.out.print("Rock, paper, or scissors? ");
							choice = keyboard.nextLine(); }}
				}

				//User chooses scissors
				if (choice.equalsIgnoreCase("scissors")) {
					if (computerMove.equalsIgnoreCase("rock")) {
						compScore ++;
						System.out.println("The computer chose " + computerMove + ", so you lose. (" + score + "-" + compScore + ")"); 
						if ((pointsToWin != score) && (pointsToWin != compScore)) {
							System.out.print("Rock, paper, or scissors? ");
							choice = keyboard.nextLine(); }}
					else if(computerMove.equalsIgnoreCase("paper")) {
						score ++;
						System.out.println("The computer chose " + computerMove + ", so you win! (" + score + "-" + compScore + ")"); 
						if ((pointsToWin != score) && (pointsToWin != compScore)) {
							System.out.print("Rock, paper, or scissors? ");
							choice = keyboard.nextLine(); }}
					else {
						System.out.println("The computer chose " + computerMove + ", so it's a tie. (" + score + "-" + compScore + ")"); 
						if ((pointsToWin != score) && (pointsToWin != compScore)) {
							System.out.print("Rock, paper, or scissors? ");
							choice = keyboard.nextLine(); }}
				}

			//Declare if user won or lost at the end of the game 
			if ((score > compScore) && (pointsToWin == score)) {
				System.out.println("Congratulations! You won!");
				return; }
			
			if ((compScore > score) && (pointsToWin == compScore)) {
				System.out.println("Sorry, you lost. Better luck next time!"); 
				return; }	

			} 
		}
	}
}