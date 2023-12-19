/*
 *  RockPaperScissors.java
 * Author:  Husain Naseer 
 * Submission Date:  10.08.2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *			In this lab we learned how to used scanner and loop to play the game of rock paper scissor. 
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
		int wins;
		String computerMove;
		String yourMove;
		int yourWins = 0;
		int computerWins = 0;
		System.out.print("Points to win: ");
		wins = Integer.parseInt(keyboard.nextLine());

		while (computerWins <= wins && yourWins <= wins) {
			System.out.print("Rock, paper, or scissors? ");
			yourMove = keyboard.nextLine();
			if(!(yourMove.equalsIgnoreCase("rock") || yourMove.equalsIgnoreCase("paper") || (yourMove.equalsIgnoreCase("scissors")))) {
				continue;
			}
			computerMove = ComputerOpponent.getMove();
			if(yourMove.equalsIgnoreCase("rock") && computerMove.equals("scissors")) {
				yourWins++;
				System.out.println("The computer chose scissors, so you win. (" + yourWins + "-" + computerWins + ")");
			}
			else if(yourMove.equalsIgnoreCase("rock") && computerMove.equals("paper")) {
				computerWins++;
				System.out.println("The computer chose paper, so you lose. (" + yourWins + "-" + computerWins + ")");
			}
			else if(yourMove.equalsIgnoreCase("paper") && computerMove.equals("scissors")) {
				computerWins++;
				System.out.println("The computer chose scissors so you lose. (" + yourWins + "-" + computerWins + ")");
			}
			else if(yourMove.equalsIgnoreCase("paper") && computerMove.equals("rock")) {
				yourWins++;
				System.out.println("The computer chose rock, so you win! (" + yourWins + "-" + computerWins + ")");
			}
			else if(yourMove.equalsIgnoreCase("scissors") && computerMove.equals("rock")) {
				computerWins++;
				System.out.println("The computer chose rock, so you lose. (" + yourWins + "-" + computerWins + ")");
			}
			else if(yourMove.equalsIgnoreCase("scissors") && computerMove.equals("paper")) {
				yourWins++;
				System.out.println("The computer chose paper, so you win! (" + yourWins + "-" + computerWins + ")");
			}
			else if(yourMove.equalsIgnoreCase(computerMove)) {
				System.out.println("The computer chose" + computerMove + ", so it's a tie. (" + yourWins + "-" + computerWins +")");
			}
		}
		if(yourWins == wins) {
			System.out.println("Congratulations! You won!");
		}
		else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		keyboard.close();
	}
}

