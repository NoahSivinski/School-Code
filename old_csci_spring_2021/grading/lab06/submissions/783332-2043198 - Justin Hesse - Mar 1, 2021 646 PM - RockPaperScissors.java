/*
 * RockPaperScissors.java
 * Author:  Justin Hesse 
 * Submission Date:  3/1/2021
 *
 * Purpose: Allows the user to play rock paper scissors against a computer opponent.
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
		
		Scanner scan = new Scanner(System.in);
		int playerScore = 0;
		int computerScore = 0;
		
		System.out.print("Points to win: ");
		int pointsToWin = scan.nextInt();
		scan.nextLine();
		
		//loop runs as long as neither the player nor computer has won the game
		while(playerScore < pointsToWin && computerScore < pointsToWin) {
			
			System.out.print("Rock, paper, or scissors? ");
			String playerMove = scan.nextLine();
			String computerMove = ComputerOpponent.getMove();
			
			//block of if-elses compares playerMove to computerMove to determine the winner of each round
			if (playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("paper")) {
				
				computerScore++;
				System.out.println("The computer chose " + computerMove + ", " + "so you lose." + " (" + playerScore + "-" + computerScore + ")");
				
			}
			
			else if (playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("scissors")) {
				
				playerScore++;
				System.out.println("The computer chose " + computerMove + ", " + "so you win!" + " (" + playerScore + "-" + computerScore + ")");
							
			}
			
			else if (playerMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("scissors")) {
				
				computerScore++;
				System.out.println("The computer chose " + computerMove + ", " + "so you lose." + " (" + playerScore + "-" + computerScore + ")");
			
			}
			
			else if (playerMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock")) {
				
				playerScore++;
				System.out.println("The computer chose " + computerMove + ", " + "so you win!" + " (" + playerScore + "-" + computerScore + ")");
			
			}
			
			else if (playerMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("rock")) {
				
				computerScore++;
				System.out.println("The computer chose " + computerMove + ", " + "so you lose." + " (" + playerScore + "-" + computerScore + ")");
			
			}
			
			else if (playerMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("paper")) {
				
				playerScore++;
				System.out.println("The computer chose " + computerMove + ", " + "so you win!" + " (" + playerScore + "-" + computerScore + ")");
			
			}
			
			else if (playerMove.equalsIgnoreCase(computerMove)) {
				
				System.out.println("The computer chose " + computerMove + ", " + "so it's a tie." + " (" + playerScore + "-" + computerScore + ")");
				
			}
			//validates player move 
			else if (!playerMove.equalsIgnoreCase("rock") && !playerMove.equalsIgnoreCase("scissors") && !playerMove.equalsIgnoreCase("paper")){
				
				System.out.println("That is not a valid move. Please try again.");
			}
			
		
		}
		
		if (playerScore == pointsToWin) {
			
			System.out.println("Congratulation! You won!");
		}
		
		else {
			System.out.println("Sorry, you lost. Better luck next time!");
			
		}
		
		scan.close();
	}

}
