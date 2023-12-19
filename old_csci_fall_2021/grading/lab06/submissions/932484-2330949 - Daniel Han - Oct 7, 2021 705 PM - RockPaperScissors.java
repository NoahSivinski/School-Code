/*
 * [RockPaperScissors].java
 * Author:  [Daniel Han] 
 * Submission Date:  [10/7/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * The program will also use methods from the ComputerOpponent program to get the computer's moves.
 * The program will ask for the number of wins for the game to end. It will then ask the user for which move they want: rock, paper, or scissors.
 * If the user input correctly, then the program will calculate to see if the user won
 * The program will output if the user won, lost, or tied, and will add a point if it was a victory of loss
 * After the number of wins is reached, then it will output who won. 
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






import java.util.*;

public class RockPaperScissors {
	//created an enumeration with only 3 values: win, tie, or defeat
	enum GameResults {Victory, Tie, Loss}
	
	public static void main(String[] args) {
		//creates a scanner object named keyboard
		Scanner keyboard = new Scanner(System.in);
		//stores the computer's move and the user's move
		String computerMove = ""; String userMove = "";
		//stores the number of wins needed to win, the computer's amount of wins, and the player's number of wins
		int numOfWins; int comNumOfWins = 0; int playerNumOfWins = 0;
		//boolean variable that confirms if the user entered in the right output
		boolean rightInput = false;
		///enum variable to see if the player won, lost, or tied
		GameResults result = GameResults.Victory;
		
		
		//asks the user for the number of wins needed for victory
		System.out.print("Points to win: ");
		numOfWins = keyboard.nextInt();
		
		
		//this while loop will continue running until someone wins a game
		while ((comNumOfWins < numOfWins) && (playerNumOfWins < numOfWins)) {
			//will ask the user for input of rock, paper, or scissors and will assign it to userMove and will make sure to trim the whitespace
			System.out.print("Rock, paper, or scissors? ");
			userMove = keyboard.next().trim();
			//if the userMove string equalsIgnoreCase matches rock, paper, or scissors, then it will set the rightInput boolean variable to true and set all the userMove variable to all lowercase
			if (userMove.equalsIgnoreCase("rock")) {
				rightInput = true;
				userMove = "rock";
			}
			else if (userMove.equalsIgnoreCase("paper")) {
				rightInput = true;
				userMove = "paper";
			}
			else if (userMove.equalsIgnoreCase("scissors")) {
				rightInput = true;
				userMove = "scissors";
			}
			//if the user puts in the right input, then we will set computerMove using the .getMove() method
			if (rightInput) {
				computerMove = ComputerOpponent.getMove();
				//series of if statements to see if the player won, lost, or tied 
				//we don't need any statements if the player won because the variable is automatically set to victory
				if (userMove.equals(computerMove)) {
					result = GameResults.Tie;
				}
				else if (userMove.equals("rock") && computerMove.equals("paper")) {
					result = GameResults.Loss;
				}
				else if (userMove.equals("paper") && computerMove.equals("scissors")) {
					result = GameResults.Loss;
				}
				else if (userMove.equals("scissors") && computerMove.equals("rock")) {
					result = GameResults.Loss;
				}
				//if statements to see which variable to add the point to, if the enum variable results is set to victory, then add one point to playerNumOfWins, no points results is tie, and one point to comNumOfWins if set to loss
				if (result == GameResults.Victory) {
					playerNumOfWins++;
					System.out.println("The computer chose " + computerMove + ", so you win!  " + "(" + playerNumOfWins + "-" + comNumOfWins + ")");
				}
				else if (result == GameResults.Tie) {
					System.out.println("The computer chose " + computerMove + ", so it's a tie.  " + "(" + playerNumOfWins + "-" + comNumOfWins + ")");
				}
				else if (result == GameResults.Loss) {
					comNumOfWins++;
					System.out.println("The computer chose " + computerMove + ", so you lose.  " + "(" + playerNumOfWins + "-" + comNumOfWins + ")");
					
				}
			}
			
			//at the very end the rightInput variable will be reset back to false
			rightInput = false;
			//reset the results enum variable back to victory
			result = GameResults.Victory;
		}
		//outputs if the computer wins
		if (comNumOfWins == numOfWins) {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		//outputs if the user wins
		else if (playerNumOfWins == numOfWins) {
			System.out.println("Congratulations! You won!");
		}
	}
}
