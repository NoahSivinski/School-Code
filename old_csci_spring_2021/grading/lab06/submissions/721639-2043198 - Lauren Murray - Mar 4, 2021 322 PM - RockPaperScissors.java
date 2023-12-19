/*
 * CSCI1301.java
 * Author:  Lauren Murray 
 * Submission Date:  3/4/2021
 *
 * Purpose: This program allows the user to play a game of Rock, Paper, Scissors with 
 * a computer opponent. The number of rounds played is determined by the user, and the 
 * current score is given after each round. 
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
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
			System.out.print("Points to win: ");
			int ptsToWin = s.nextInt();
			s.nextLine();
			int playerPts = 0, computerPts = 0;
			
			while ((playerPts < ptsToWin) && (computerPts < ptsToWin)) {
				System.out.print("Rock, paper or scissors? ");
				String play = s.nextLine();
				play = play.trim();
				if (play.equalsIgnoreCase("rock") || play.equalsIgnoreCase("paper") || play.equalsIgnoreCase("scissors")) {
					String cplay = ComputerOpponent.getMove();
				if (play.equalsIgnoreCase(cplay)) {
					System.out.printf("The computer chose " +cplay+ ", so it's a tie. (" +playerPts+ "-" +computerPts +")");
					System.out.println("");
				}
				
					else if ((play.equalsIgnoreCase("rock") && cplay.equals("scissors")) ||
							(play.equalsIgnoreCase("scissors") && cplay.equals("paper")) ||
							(play.equalsIgnoreCase("paper") && cplay.equals("rock"))) {
						playerPts++;
						System.out.printf("The computer chose " +cplay+ ", so you win! (" +playerPts+ "-" +computerPts+")");
						System.out.println("");
					}
					
					else {
						computerPts++;
						System.out.printf("The computer chose " +cplay+  ", so you lose. (" +playerPts+ "-" +computerPts+")");
						System.out.println("");
					}
						
				}
			}
		
		if (playerPts > computerPts)
			System.out.println("Congratulations! You won!");
		else
			System.out.println("Sorry, you lost. Better luck next time!");

		s.close();
	}

}
