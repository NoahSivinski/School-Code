/*
 * CSCI 1301.java
 * Author:  Adam Ruehle
 * Submission Date:  October 8, 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * The purpose of this program is to allow the user to play rock,
 * paper, scissors up to a certain number of wins against a computer
 * with randomly decided moves.
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

    //Main Method
	public static void main(String[] args) {
		
		//Number of Points to Win Input
		System.out.print("Points to win: ");
		Scanner keyboard = new Scanner(System.in);
		int points = keyboard.nextInt();
		
		//Variables
	    int wins = 0;
	    int losses = 0;
	    int i = 0;
	    int iTwo = 0;
	    int finalPoints = 0;
	    
	    //Game Loop
	    while (i < points && iTwo < points) {
	    	//User Choice
			System.out.print("Rock, paper, or scissors? ");
			String userMove = keyboard.next().toLowerCase();
	    	
			//Call Get Move Method
		    String computerChoice = ComputerOpponent.getMove();
			
			//Case Test
	    	if (userMove.equals(computerChoice)) {
		    	System.out.println("The computer chose " + computerChoice + ", so it's a tie. (" + wins + "-" + losses + ")");
		    } else if (userMove.equals("rock") && computerChoice.equals("paper")) {
		    	losses++;
		    	iTwo++;
		    	System.out.println("The computer chose " + computerChoice + ", so you lose. (" + wins + "-" + losses + ")");
		    } else if (userMove.equals("rock") && computerChoice.equals("scissors")) {
		    	wins++;
		    	finalPoints++;
		    	i++;
		    	System.out.println("The computer chose " + computerChoice + ", so you win! (" + wins + "-" + losses + ")");
		    } else if (userMove.equals("paper") && computerChoice.equals("rock")) {
		    	wins++;
		    	finalPoints++;
		    	i++;
		    	System.out.println("The computer chose " + computerChoice + ", so you win! (" + wins + "-" + losses + ")");
		    } else if (userMove.equals("paper") && computerChoice.equals("scissors")) {
		    	losses++;
		    	iTwo++;
		    	System.out.println("The computer chose " + computerChoice + ", so you lose. (" + wins + "-" + losses + ")");
		    } else if (userMove.equals("scissors") && computerChoice.equals("rock")) {
		    	losses++;
		    	iTwo++;
		    	System.out.println("The computer chose " + computerChoice + ", so you lose. (" + wins + "-" + losses + ")");
		    } else if (userMove.equals("scissors") && computerChoice.equals("paper")) {
		    	wins++;
		    	finalPoints++;
		    	i++;
		    	System.out.println("The computer chose " + computerChoice + ", so you win! (" + wins + "-" + losses + ")");
		    }
	    }
	    
	    //Print Win or Loss
	    if (wins > losses) {
	    	System.out.println("Congratulations! You won!");
	    } else {
	    	System.out.println("Sorry, you lost. Better luck next time!");
	    }
	}
}
