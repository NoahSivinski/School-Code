/*
 * RockPaperScissors.java
 * Author:  James Breathnach
 * Submission Date:  10/7/2021
 *
 * Purpose: The purpose of this program is to do some play rock, paper, scissors. The user inputs rock paper or scissors.
 * and the computer puts in their move as well. The program determines who wins and then counts the point values.
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner; // Scanner import
public class RockPaperScissors {

	public static void main(String[] args) {

		Scanner keyboard =  new Scanner(System.in);

		int playerWins = 0; int compWins = 0; // ints will be used to determine a players wins or the computers wins
		//initializing the string for the move of the player
		String playerMove ;
		// initializing the string for the move of the computer
		String computerMove;

		//the next 2 lines are used for getting the user to input the total amount of wins needed for their game.
		System.out.print("Points to win: ");
		int totalWins= keyboard.nextInt();

		//a loop is used here to get the user and computer to play the appropriate amount of games.
		while (playerWins<totalWins && compWins<totalWins) {

			//the users input is prompted and later determined.
			System.out.print("Rock, paper, or scissors? "); 
			playerMove = keyboard.next();
			
			
			//The next section functions identically, so it will be explained in detail for the first one
			if (playerMove.equalsIgnoreCase("rock")){ //checks to see what the user inputed. This one is in the case of rock.
				computerMove = ComputerOpponent.getMove(); // gets the computers move.
				//checks the computers move and has a result for each move option.
				if(computerMove.equalsIgnoreCase("rock")) { // the first case is rock so if the user inputs rock and so does the computer a tie occurs.
					// The result is printed out and 
					System.out.println("The computer chose rock, so it's a tie. (" + playerWins + "-" + compWins + ")");
					
				}else if(computerMove.equalsIgnoreCase("paper")) {
					//if the user loses, compWins goes up by 1 and then the you lose statement is printed with the score update as well.
					compWins++;
					System.out.println("The computer chose paper, so you lose. (" + playerWins + "-" + compWins + ")");

				}else {
					//If the player wins, playerWins goes up by 1 and a win statement is printed. The score is also updated as well.
					playerWins++;
					System.out.println("The computer chose scissors, so you win! (" + playerWins + "-" + compWins + ")");

				}
			}
			//Does the previously described process but with paper instead.
			if (playerMove.equalsIgnoreCase("paper")) {
				computerMove = ComputerOpponent.getMove();
				if(computerMove.equalsIgnoreCase("rock")) {
					playerWins++;
					System.out.println("The computer chose rock, so you win! (" + playerWins + "-" + compWins + ")");
				}else if(computerMove.equalsIgnoreCase("paper")) {
					System.out.println("The computer chose paper, so it's a tie. (" + playerWins + "-" + compWins + ")");
				}else {
					compWins++;
					System.out.println("The computer chose scissors, so you lose. (" + playerWins + "-" + compWins + ")");
				}
			}
			//Does the previously described process but with scissors instead.
			if (playerMove.equalsIgnoreCase("scissors")) {
				computerMove = ComputerOpponent.getMove();
				if(computerMove.equalsIgnoreCase("rock")) {
					compWins++;
					System.out.println("The computer chose rock, so you lose. (" + playerWins + "-" + compWins + ")");
				}else if(computerMove.equalsIgnoreCase("paper")) {
					playerWins++;
					System.out.println("The computer chose paper, so you win! (" + playerWins + "-" + compWins + ")");
				}else {
					System.out.println("The computer chose scissors, so it's a tie. (" + playerWins + "-" + compWins + ")");
				}
			}


		}
		// This statement is used to determine whether the player wins or the computer does.
		if (playerWins==totalWins) {
			System.out.print("Congratulations! You won!");	
		}
		else {
		System.out.print("Sorry, you lost. Better luck next time!");
		}
	}


}


