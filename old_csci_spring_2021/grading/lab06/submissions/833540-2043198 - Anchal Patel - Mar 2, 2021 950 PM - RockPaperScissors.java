/*
 * [RockPaperScissors].java
 * Author:  [Anchal Patel] 
 * Submission Date:  [March 2, 2021]
 * Purpose: The purpose of my program is for the user to play a game of
 * rock paper scissors with the computer. The user will enter a move
 * and than the computer will generate a move and the program will
 * decide who wins!
 * 
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

		int myScore = 0;
		int computerScore = 0;
		String userMove;
		int pointsToWin;
		String computerMove;

		System.out.print("Points to win: ");
		pointsToWin = keyboard.nextInt();


		do {
			System.out.print("Rock, Paper, or Scissors?");
			userMove = keyboard.next();
			computerMove = ComputerOpponent.getMove();

			if(userMove.equalsIgnoreCase(computerMove)) {
				System.out.print("The computer chose, " +computerMove+ " so it's a tie");
				System.out.println("\t(" +myScore+ "-"+ computerScore+ ")");
			}

			else if(userMove.equalsIgnoreCase("rock"))
			{
				if(computerMove.equalsIgnoreCase("scissors"))
				{
					System.out.print("The computer chose scissors, so you win!");
					myScore++;
					System.out.println("\t(" +myScore+ "-"+ computerScore+ ")");
				}
				else if(computerMove.equalsIgnoreCase("paper"))
				{
					System.out.print("The computer chose paper, so you lose");
					computerScore++;
					System.out.println("\t(" +myScore+"-"+ computerScore+ ")");
				}
			}


			else if(userMove.equalsIgnoreCase("paper"))
			{
				if(computerMove.equalsIgnoreCase("scissors")){
					System.out.print("The computer chose scissors, so you lose.");
					computerScore++;
					System.out.println("\t("+myScore +"-"+ computerScore+ ")");
				}
				else if(computerMove.equalsIgnoreCase("rock"))
				{
					System.out.print("The computer chose rock, so you win!");
					myScore++;
					System.out.println("\t("+myScore +"-"+ computerScore+ ")");
				}
			}


			else if(userMove.equalsIgnoreCase("scissors"))
			{
				if(computerMove.equalsIgnoreCase("paper"))
				{
					System.out.print("The computer chose paper, so you win!");
					myScore++;
					System.out.println("\t("+myScore +"-"+ computerScore+ ")");
				}
				else if(computerMove.equalsIgnoreCase("rock"))
				{
					System.out.print("The computer chose rock, so you lose.");
					computerScore++;
					System.out.println("\t("+myScore +"-"+ computerScore+ ")");
				}
			}
			else {
				System.out.println("invalid user input");
			}


			if(myScore == pointsToWin)
			{
				System.out.println("Congratulations! You won!");
				System.exit(0);
			}
			else if(computerScore == pointsToWin) {
				System.out.println("Sorry, you lost. Better luck next time!");
				System.exit(0);
			}




		}while(true);





	}


}






































