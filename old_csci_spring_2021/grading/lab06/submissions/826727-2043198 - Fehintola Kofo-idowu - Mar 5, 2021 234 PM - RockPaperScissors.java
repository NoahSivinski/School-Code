/*
 * [CSCI 1301].java
 * Author:  [Fehintola Kofo-Idowu] 
 * Submission Date:  [3/5/2021]
 *
 * Purpose: This code aims at creating a rock, paper, scissors game to be played  against a computer program

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
		Scanner input = new Scanner(System.in);
		int userscore=0,compscore=0;
		String computermove;
		
//		//Allows user to enter 
		System.out.print("Points to win: ");
		int win = input.nextInt();
		
		while (!(userscore == win)){
			System.out.print("Rock, paper, or scissors? ");
			String usermove = input.next().toLowerCase();
		
			computermove = ComputerOpponent.getMove();
				  
				//check for valid moves
				if (usermove.equals(computermove))
				System.out.println("The computer chose " + computermove + ",so it's a tie. (" + userscore+"-"+compscore+")");
				//if user move is rock
				else if (usermove.equals("rock"))
				{
				if (computermove.equals("scissors"))
				{
					userscore++;
				System.out.println("The computer chose scissors, so you win! (" + userscore+"-"+compscore+")");
				
				}
				else if (computermove.equals("paper"))
				{
					compscore++;
				System.out.println("The computer chose paper, so you lose. (" + userscore+"-"+compscore+")");
				
				}
				  
				  
				}
				//if user move is paper
				else if (usermove.equals("paper"))
				{
				if (computermove.equals("scissors"))
				{
					compscore++;
				System.out.println("The computer chose scissors, so you lose. (" + userscore+"-"+compscore+")");
				//compscore++;
				}
				else if (computermove.equals("rock"))
				{
					userscore++;
				System.out.println("The computer chose rock, so you win! (" + userscore+"-"+compscore+")");
				//userscore++;
				}
				}
				//if user move is scissors
				else if (usermove.equals("scissors"))
				{
				if (computermove.equals("paper"))
				{
					userscore++;
				System.out.println("The computer chose paper, so you win! (" + userscore+"-"+compscore+")");
				//userscore++;
				}
				else if (computermove.equals("rock"))
				{
					compscore++;
				System.out.println("The computer chose rock, so you lose. (" + userscore+"-"+compscore+")");
				//compscore++;
				}
				}
				
				
				if(userscore==win)
				{
				System.out.println("Congratulations! You won!");
				System.exit(0);
				}
				else if(compscore ==win )
				{
				System.out.println("Sorry, you lost. Better luck next time!");
				System.exit(0);
				}
		      }
		input.close();	
			}
		
	}

			
