
/*
 * [RockPaperScissors].java
 * Author:  [Austin Brock] 
 * Submission Date:  [3/5/2021]
 *
 * Purpose: This program takes the users input of either rock, paper, or scissors and 
 * plays a game with the computer to see who can win
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
		//Points to win
		int playerPoints = 0;
		int computerPoints = 0;
		int PTW1;
		System.out.print("Points to win:");
		Scanner keyboard = new Scanner(System.in);
		
		PTW1 = keyboard.nextInt();
//PTW is points to win 
		//Loop so you can find out the winner
		while (PTW1 != playerPoints && PTW1 != computerPoints)
{
		System.out.println("Rock, paper, or scissors?");
		String playerMove = keyboard.next();
		String CM;
		CM = ComputerOpponent.getMove();
		//Loop  so you can see the winner
		
		

		if(CM.equalsIgnoreCase(playerMove))
		{	
			System.out.println("The computer chose, " + CM + " so it's a tie" + "(" + playerPoints + "-" + computerPoints + ")");
		}
		else if(playerMove.equalsIgnoreCase("rock") && CM.equalsIgnoreCase("scissors") || playerMove.equalsIgnoreCase("paper") && CM.equalsIgnoreCase("rock") || playerMove.equalsIgnoreCase("scissors") && CM.equalsIgnoreCase("paper"))
		{
	
			playerPoints ++;
			System.out.println("The computer chose " +  CM + " so you win" + "(" + playerPoints + "-" + computerPoints + ")");
		}
		else if (playerMove.equalsIgnoreCase("rock") && CM.equalsIgnoreCase("paper") || playerMove.equalsIgnoreCase("paper") && CM.equalsIgnoreCase("scissors") || playerMove.equalsIgnoreCase("scissors") && CM.equalsIgnoreCase("rock"))
		{
			computerPoints ++;
			System.out.println("The computer chose," + CM + " so you lose." + "(" + playerPoints + "-" + computerPoints + ")");
		}


}
		if(computerPoints > playerPoints)
		System.out.println("Sorry, you lost. Better luck next time!");
		
		else if(computerPoints < playerPoints)
		System.out.println("Congratulations! You won!");
	}
}


