/*
 * [CSCI1301L].java
 * Author:  [Jaehoon Seol] 
 * Submission Date:  [03042021]
 *
 * Purpose:This program lets a user play a rock, paper, scissor game with computer. 
 * 			The program generates random computer moves, calculates scores, then determines the winner.
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

public class RockPaperScissors{
	
	public static void main(String[] args) {
		
	Scanner keyboard = new Scanner(System.in);
	
	String userMove;
	int pointsToWin=0;
	int opponentPoints=0;
	int userPoints=0;
	String gameResult;	
	
	String win="so you win! ";
	String tie="so it's a tie. ";
	String lose="so you lose. ";
	
	System.out.print("Points to win: ");
	pointsToWin=keyboard.nextInt();
	//System.out.println(pointsToWin);
	
	//loop of rock,paper,scissors game.
	do {
		System.out.print("Rock, paper, or scissors? ");
		userMove = keyboard.next();
		String computerMove;
		computerMove=ComputerOpponent.getMove();
		
		if(computerMove.equalsIgnoreCase("rock") && (userMove.equalsIgnoreCase("scissors"))) {
			opponentPoints++;
			gameResult=lose;
			System.out.println("The computer chose "+computerMove+" "+gameResult+"("+userPoints+"-"+opponentPoints+")");
			};
			if(computerMove.equalsIgnoreCase("rock") && (userMove.equalsIgnoreCase("paper"))) {
				userPoints++;
				gameResult=win;
				System.out.println("The computer chose "+computerMove+" "+gameResult+"("+userPoints+"-"+opponentPoints+")");
				};
				if(computerMove.equalsIgnoreCase("rock") && (userMove.equalsIgnoreCase("rock"))) {
					gameResult=tie;
					System.out.println("The computer chose "+computerMove+" "+gameResult+"("+userPoints+"-"+opponentPoints+")");
					};
					if(computerMove.equalsIgnoreCase("paper") && (userMove.equalsIgnoreCase("scissors"))) {
						userPoints++;
						gameResult=win;
						System.out.println("The computer chose "+computerMove+" "+gameResult+"("+userPoints+"-"+opponentPoints+")");
						};
						
						if(computerMove.equalsIgnoreCase("paper") && (userMove.equalsIgnoreCase("paper"))) {
							gameResult=tie;
							System.out.println("The computer chose "+computerMove+" "+gameResult+"("+userPoints+"-"+opponentPoints+")");
							};			
							if(computerMove.equalsIgnoreCase("paper") && (userMove.equalsIgnoreCase("rock"))) {
								opponentPoints++;
								gameResult=lose;
								System.out.println("The computer chose "+computerMove+" "+gameResult+"("+userPoints+"-"+opponentPoints+")");
								};
								if(computerMove.equalsIgnoreCase("scissors") && (userMove.equalsIgnoreCase("rock"))) {
									userPoints++;
									gameResult=win;
									System.out.println("The computer chose "+computerMove+" "+gameResult+"("+userPoints+"-"+opponentPoints+")");
									};
									if(computerMove.equalsIgnoreCase("scissors") && (userMove.equalsIgnoreCase("paper"))) {
										opponentPoints++;
										gameResult=lose;
										System.out.println("The computer chose "+computerMove+" "+gameResult+"("+userPoints+"-"+opponentPoints+")");
										};
										if(computerMove.equalsIgnoreCase("scissors") && (userMove.equalsIgnoreCase("scissors"))) {
											gameResult=tie;
											System.out.println("The computer chose "+computerMove+" "+gameResult+"("+userPoints+"-"+opponentPoints+")");
											};
	//when one of the players reach the point to win, the game ends
	}while((pointsToWin > userPoints) && (pointsToWin > opponentPoints));
	
	//if-else statement to determine the winner.
	if (opponentPoints > userPoints){
		System.out.println("Congratulations! You won!");
	}
	else{
		System.out.println("Sorry, you lost. Better luck next time!");
		
	keyboard.close();
	System.exit(0);
	
	}
	}
}