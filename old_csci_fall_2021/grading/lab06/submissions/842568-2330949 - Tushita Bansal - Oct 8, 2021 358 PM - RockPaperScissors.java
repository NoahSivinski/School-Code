/*
 * RockPaperScissors.java
 * Author:  Tushita Bansal 
 * Submission Date:  October 8, 2021
 *
 * Purpose: This program is used to play rounds of rock, paper, scissors against a computer. 
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String [] args) {

		Scanner s = new Scanner (System.in);
		System.out.print("Points to win: ");
		int pointsToWin = s.nextInt();
		s.nextLine();

		int userScore = 0;
		int computerScore = 0;

		for (int timesProgramDone = 0; timesProgramDone < pointsToWin; timesProgramDone++) {
			System.out.print("Rock, paper, or scissors? ");
			String answer = s.next();
			if (answer.equalsIgnoreCase("rock") || answer.equalsIgnoreCase("paper") || answer.equalsIgnoreCase("scissors")) {


				String computerMove = ComputerOpponent.getMove();
				if(answer.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("rock")){
					System.out.print("The computer chose " + computerMove + ", so it's a tie. ");
					System.out.println("(" + userScore + "-" + computerScore + ")");
				}

				else if(answer.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("paper")){
					System.out.print("The computer chose " + computerMove + ", so you lose. ");
					computerScore++;
					System.out.println("(" + userScore + "-" + computerScore + ")");
				}
				else if(answer.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("scissors")){
					System.out.print("The computer chose " + computerMove + ", so you win! ");
					userScore++;
					System.out.println("(" + userScore + "-" + computerScore + ")");
				}
				else if(answer.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("ccissors")){
					System.out.print("The computer chose " + computerMove + ", so you lose. ");
					computerScore++;
					System.out.println("(" + userScore + "-" + computerScore + ")");
				}
				else if(answer.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock")){
					System.out.print("The computer chose " + computerMove + ", so you win! ");
					userScore++;
					System.out.println("(" + userScore + "-" + computerScore + ")");
				}
				else if(answer.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("paper")){
					System.out.print("The computer chose " + computerMove + ", so it's a tie. ");
					System.out.println("(" + userScore + "-" + computerScore + ")");
				}
				else if(answer.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("scissors")){
					System.out.print("The computer chose " + computerMove + ", so it's a tie. ");
					System.out.println("(" + userScore + "-" + computerScore + ")");
				}
				else if(answer.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("paper")){
					System.out.print("The computer chose " + computerMove + ", so you win! ");
					userScore++;
					System.out.println("(" + userScore + "-" + computerScore + ")");
				}
				else if(answer.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("rock")){
					System.out.print("The computer chose " + computerMove + ", so you lose. ");
					computerScore++;
					System.out.println("(" + userScore + "-" + computerScore + ")");
				}

			}
			else {
				timesProgramDone--;
			}
		}
		if(userScore < computerScore) {
			System.out.println("Sorry, you lost. Better luck next time!");	
		}
		if(userScore > computerScore) {
			System.out.println("Congratulations! You won!");
		}
		if(userScore == computerScore) {
			System.out.println("It is a tie.");
		}
	}
}
