/*
 * RockPaperScissors.java
 * Author:  Jonathan Sanderford 
 * Submission Date:  10/8/2021
 *
 * Purpose: This program plays rock paper scissors to as many points as you want.
 * The program uses a loop to run until the game is over.
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
	
		
		Scanner scanner = new Scanner(System.in);
		
		String computerMove;
		String personMove;
		int numberOfWins, computerPoints = 0, peoplePoints = 0;
		
		
		
		System.out.print("Points to win: ");
		numberOfWins = scanner.nextInt();
		
			while (computerPoints<numberOfWins && peoplePoints<numberOfWins) {
			
				System.out.print("Rock, paper, or scissors? ");
				personMove = scanner.next();
				
			if (personMove.equalsIgnoreCase("rock")||
					personMove.equalsIgnoreCase("paper")||
					personMove.equalsIgnoreCase("scissors")) {
				
				computerMove = ComputerOpponent.getMove();
						
				if (computerMove.equalsIgnoreCase("rock") && 
						personMove.equalsIgnoreCase("rock")) {
					System.out.print("The computer chose rock, so it's a tie. (" + peoplePoints +"-"+ computerPoints + ")\n"); 
				}
				else if (computerMove.equalsIgnoreCase("rock") && 
						personMove.equalsIgnoreCase("paper")) {
					peoplePoints++;
					System.out.print("The computer chose rock, so you win! (" + peoplePoints +"-"+ computerPoints + ")\n");
				}
				else if (computerMove.equalsIgnoreCase("rock") && 
						personMove.equalsIgnoreCase("scissors")) {
					computerPoints++;
					System.out.print("The computer chose rock, so you lose. (" + peoplePoints +"-"+ computerPoints + ")\n");
				}
				else if (computerMove.equalsIgnoreCase("paper") && 
						personMove.equalsIgnoreCase("rock")) {
					computerPoints++;
					System.out.print("The computer chose paper, so you lose. (" + peoplePoints +"-"+ computerPoints + ")\n");
				}
				else if (computerMove.equalsIgnoreCase("paper") && 
						personMove.equalsIgnoreCase("paper")) {
					System.out.print("The computer chose rock, so it's a tie. (" + peoplePoints +"-"+ computerPoints + ")\n");
				}
				else if (computerMove.equalsIgnoreCase("paper") && 
						personMove.equalsIgnoreCase("scissors")) {
					peoplePoints++;
					System.out.print("The computer chose paper, so you win! (" + peoplePoints +"-"+ computerPoints + ")\n");
				}
				else if (computerMove.equalsIgnoreCase("scissors") && 
						personMove.equalsIgnoreCase("rock")) {
					peoplePoints++;
					System.out.print("The computer chose scissors, so you win! (" + peoplePoints +"-"+ computerPoints + ")\n");
				}
				else if (computerMove.equalsIgnoreCase("scissors") && 
						personMove.equalsIgnoreCase("paper")) {
					computerPoints++;
					System.out.print("The computer chose scissors, so you lose. (" + peoplePoints +"-"+ computerPoints + ")\n");
				}
				else if (computerMove.equalsIgnoreCase("scissors") && 
						personMove.equalsIgnoreCase("scissors")) {
					System.out.print("The computer chose rock, so it's a tie. (" + peoplePoints +"-"+ computerPoints + ")\n");
				}
				

			}
			}
			if (peoplePoints == numberOfWins) {
				System.out.print("Congratulations! You won!");
			}
			else {System.out.print("Sorry, you lost. Better luck next time!");
			}
			scanner.close();
	}
	}