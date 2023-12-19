/*
 * RockPaperScissors.java
 * Author:  Aaron Shurley 
 * Submission Date:  3/4/2021
 *
 * Purpose: To simulate a game of Rock, Paper, Scissors with the user selecting the number of points 
 * needed for either the user or the computer opponent to win.
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
		
		//Initializing Scanner
		Scanner Keyboard = new Scanner(System.in);
		//Initialing variables
		String computerMove = ComputerOpponent.getMove();
		int userWins = 0;
		int computerWins = 0;
		
		//ask for user input
    	System.out.print("Points to Win: ");
    	int winValue = Keyboard.nextInt();
    	
    	
    	//Condition to end the loop
    	while ((winValue > userWins && winValue > computerWins)){
    		//ask for user input
    		System.out.print("Rock, paper, or scissors? ");
    		String userMove = Keyboard.next();
    		computerMove = ComputerOpponent.getMove();
    			//statement for tie
    			if ((userMove.equalsIgnoreCase("rock")) && (computerMove == "rock") || (userMove.equalsIgnoreCase("scissors")) && (computerMove == "scissors") || (userMove.equalsIgnoreCase("paper")) && (computerMove == "paper")) {
    				System.out.print("The computer chose " + computerMove + ", so it's a tie. ");
    				System.out.println("(" + userWins + "-" + computerWins + ")");
    			//statement for user win
    			} else if ((userMove.equalsIgnoreCase("rock")) && (computerMove == "scissors") || (userMove.equalsIgnoreCase("scissors")) && (computerMove == "paper") || (userMove.equalsIgnoreCase("paper")) && (computerMove == "rock")) {
    				System.out.print("The computer chose " + computerMove + ", so you win! ");
    				userWins++; //increase user score
    				System.out.println("(" + userWins + "-" + computerWins + ")");
    			//Statement for computer win
    			} else if ((userMove.equalsIgnoreCase("rock")) && (computerMove == "paper") || (userMove.equalsIgnoreCase("scissors")) && (computerMove == "rock") || (userMove.equalsIgnoreCase("paper")) && (computerMove == "scissors")) {
    				System.out.print("The computer chose " + computerMove + ", so you lose. ");
    				computerWins++; //increase computer score
    				System.out.println("(" + userWins + "-" + computerWins + ")");
    			//statement for incorrect input
    			} else
    				System.out.println("Incorrect input. Try again.");
    	}
    	//statement for user winning game
    	if (userWins > computerWins)
    		System.out.print("Congratulations! You Won!");
    	//statement for computer winning game
    	else
    		System.out.print("Sorry, you lost. Better luck next time!");
    	//closing keyboard
		Keyboard.close();
    	
    	
	}
}	