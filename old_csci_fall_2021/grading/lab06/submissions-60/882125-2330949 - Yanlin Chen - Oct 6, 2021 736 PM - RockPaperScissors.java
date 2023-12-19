/*
 * [CSCI 1301].java
 * Author:  [Yanlin Chen] 
 * Submission Date:  [10/8/2021]
 *
 * Purpose: Play rock-paper-scissors with computer.
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
		String myMove;
		int totalGames;
		int myPoint = 0;
		int pcPoint = 0;
		String computerMove;
		boolean gamesLeft = true;

		//Points to win
		System.out.print("Points to win: ");
		totalGames = keyboard.nextInt();

		while (gamesLeft) {
			System.out.print("Rock, paper, or scissors? ");
			myMove = keyboard.next();
			computerMove = ComputerOpponent.getMove();

			if ((myPoint < totalGames) && (pcPoint < totalGames)) {

				//myMove = paper
				if (myMove.equalsIgnoreCase("paper")){
					if (myMove.compareToIgnoreCase(computerMove) == 0) {
						System.out.print("The computer chose " + computerMove + ", so it's a tie. (" + myPoint + "-" + pcPoint + ")\n");
					}
					else if (myMove.compareToIgnoreCase(computerMove) == -2){
						myPoint++;
						System.out.print("The computer chose " + computerMove + ", so you win! (" + myPoint + "-" + pcPoint + ")\n");
					}
					else if (myMove.compareToIgnoreCase(computerMove) == -3) {
						pcPoint ++;
						System.out.print("The computer chose " + computerMove + ", so you lose. (" + myPoint + "-" + pcPoint + ")\n");
					}
				}

				//myMove = rock
				else if (myMove.equalsIgnoreCase("rock")) {
					if(myMove.compareToIgnoreCase(computerMove) == 2) {
						pcPoint ++;
						System.out.print("The computer chose " + computerMove + ", so you lose. (" + myPoint + "-" + pcPoint + ")\n");
					}
					else if (myMove.compareToIgnoreCase(computerMove) == -1) {
						myPoint ++;
						System.out.print("The computer chose " + computerMove + ", so you win! (" + myPoint + "-" + pcPoint + ")\n");
					}
					else if (myMove.compareToIgnoreCase(computerMove) == 0) {
						System.out.print("The computer chose " + computerMove + ", so it's a tie. (" + myPoint + "-" + pcPoint + ")\n");
					}
				}

				//myMOve = scissors
				else if (myMove.equalsIgnoreCase("scissors")){
					if(myMove.compareToIgnoreCase(computerMove) == 3) {
						myPoint ++;
						System.out.print("The computer chose " + computerMove + ", so you win! (" + myPoint + "-" + pcPoint + ")\n");
					}
					else if (myMove.compareToIgnoreCase(computerMove) == 1) {
						pcPoint ++;
						System.out.print("The computer chose " + computerMove + ", so you lose. (" + myPoint + "-" + pcPoint + ")\n");
					}
					else if (myMove.compareToIgnoreCase(computerMove) == 0) {
						System.out.print("The computer chose " + computerMove + ", so it's a tie. (" + myPoint + "-" + pcPoint + ")\n");
					}
				}
			}

			//Determine the winner
			if (pcPoint == totalGames) {
				System.out.println("Sorry, you lost. Better luck next time!");
				gamesLeft = false;
			}
			else if (myPoint == totalGames) {
				System.out.println("Congratulations! You won!");
				gamesLeft = false;
			}
		} //End of while

		keyboard.close();
	}



}


