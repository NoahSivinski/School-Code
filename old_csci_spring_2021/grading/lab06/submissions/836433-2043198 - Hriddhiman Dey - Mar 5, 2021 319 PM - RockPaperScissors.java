/*
 * [RockPaperScissors].java
 * Author:  [Hriddhiman Dey] 
 * Submission Date:  [3/5/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *
 *The program is designed to allow the user to play rock, paper, scissors with the
 *computer. The computer randomly chooses between rock, paper, and scissors while
 *the user has to input what they choose. The program also keeps track of the rounds
 *and points needed to win. Once the rounds are all over, the program is designed
 *to state whether the user lost or won.
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

		Scanner keyboard= new Scanner(System.in);

		String userinput;
		String computerMove;
		int computerpoints=0;
		int mypoints=0;

		int pointsTillOver;
		System.out.print("Points to win: ");
		pointsTillOver = keyboard.nextInt();
		keyboard.nextLine();
		
		//start the loop?
		while(computerpoints<pointsTillOver && mypoints<pointsTillOver){
			computerMove=ComputerOpponent.getMove();

			System.out.print("\nRock, paper, or scissors? ");
			userinput = keyboard.next();


			//rock
			if (userinput.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("Paper")) {
				System.out.print("The computer chose paper, so you lose. ");
				computerpoints++;
				System.out.print("("+mypoints+"-"+computerpoints+")");
			}
			else if (userinput.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("scissors")) {
				System.out.print("The computer chose scissors, so you win! ");
				mypoints++;
				System.out.print("("+mypoints+"-"+computerpoints+")");
			}
			if (userinput.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("rock")) {
				System.out.print("The computer chose rock, so it's a tie. ");
				System.out.print("("+mypoints+"-"+computerpoints+")");
			}
			//scissors
			if (userinput.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("Paper")) {
				System.out.print("The computer chose paper, so you win!");
				mypoints++;
				System.out.print("("+mypoints+"-"+computerpoints+")");
			}
			else if (userinput.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("scissors")) {
				System.out.print("The computer chose scissors, so it's a tie.");
			}
			if (userinput.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("rock")) {
				System.out.print("The computer chose rock, so you lose. ");
				computerpoints++;
				System.out.print("("+mypoints+"-"+computerpoints+")");
			}


			//paper
			if (userinput.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("Paper")) {
				System.out.print("The computer chose paper, so it's a tie. ");
			}
			else if (userinput.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("scissors")) {
				System.out.print("The computer chose scissors, so you lose. ");
				computerpoints++;
				System.out.print("("+mypoints+"-"+computerpoints+")");
			}
			if (userinput.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock")) {
				System.out.print("The computer chose rock, so you win!");
				mypoints++;
				System.out.print("("+mypoints+"-"+computerpoints+")");
			}

		}
		if (computerpoints>mypoints) {
			System.out.print("\nSorry, you lost. Better luck next time! ");
		}else {
			System.out.print("\nCongratulations! You won! ");
		}

		keyboard.close();
	}

}

