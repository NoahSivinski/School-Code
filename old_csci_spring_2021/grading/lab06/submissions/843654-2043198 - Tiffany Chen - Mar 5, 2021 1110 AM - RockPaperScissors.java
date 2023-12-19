/*
 * [RockPaperScissors].java
 * Author:  [Tiffany Chen] 
 * Submission Date:  [March 5, 2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *This program allows you to play the game of rock, paper, or scissors with the computer. 
 *The game will prompt you for the amount of rounds of rock, paper, or scissors. 
 *Then you will be prompt to choose either rock, paper, or scissors.
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
		// Scanner
		Scanner s = new Scanner(System.in);
		
		// Variables 
		int pointsToWin = 0;
		String playerMove = "";
	    String computerMove = "";
		int playerPoints= 0;
		int computerPoints = 0;
		
		//Prompt "points to win:"
		System.out.println("Points to win:");
		pointsToWin = s.nextInt();
		s.nextLine();
	     
		//loop statement
		 while (!(pointsToWin == computerPoints || pointsToWin == playerPoints)) {
			 
     	 // Prompt player for move
		System.out.println("Rock, paper, or scissors?");
		 playerMove = s.next();
	      computerMove = ComputerOpponent.getMove();
	      
	     // player move rock, paper, or scissor
	      if (playerMove.equalsIgnoreCase("rock"))
	      {
	    	  if (computerMove == "rock")  {
	    		  System.out.println("The computer chose " + computerMove + " so it's a tie! (" + playerPoints
	    		            + "-" + computerPoints + ")");
	    	  }else if (computerMove == "paper")  {
	    		  computerPoints = computerPoints + 1;
	    		  System.out.println("The computer chose " + computerMove + " so you lose! (" + playerPoints
	    		            + "-" + computerPoints + ")");
	    	  }
	    	  else { 
	    		  playerPoints = playerPoints + 1;
	    		  System.out.println("The computer chose " + computerMove + " so you win! (" + playerPoints
	    		            + "-" + computerPoints + ")");
	    	  }
	      }
	      else if (playerMove.equalsIgnoreCase("paper"))
	      {
	    	  if (computerMove == "rock")
	    	  {
	    		  playerPoints = playerPoints + 1;
	    		  System.out.println("The computer chose " + computerMove + " so you won! (" + playerPoints
	    		            + "-" + computerPoints + ")");
	    	  }else if (computerMove == "paper")
	    	  {
	    		  System.out.println("The computer chose " + computerMove + " so it's a tie! (" + playerPoints
	    		            + "-" + computerPoints + ")");
	    	  }
	    	  else { 
	    		  computerPoints = computerPoints + 1;
	    		  System.out.println("The computer chose " + computerMove + " so you lose! (" + playerPoints
	    		            + "-" + computerPoints + ")");
	    	  }
	      }
	      else if (playerMove.equalsIgnoreCase("scissors"))
	      {
	    	  if (computerMove == "rock")
    	  {
	    	  computerPoints = computerPoints + 1;
    		  System.out.println("The computer chose " + computerMove + " so you lose! (" + playerPoints
    		            + "-" + computerPoints + ")");
    		  }else if (computerMove == "paper")
    	  {
    		  playerPoints = playerPoints + 1;
    		  System.out.println("The computer chose " + computerMove + " so you won! (" + playerPoints
    		            + "-" + computerPoints + ")");
    	  }
    		  else { 
    		  System.out.println("The computer chose " + computerMove + " so it's a tie! (" + playerPoints
    		            + "-" + computerPoints + ")");
    		  }
	      }
		 }
		 
		  //If player wins or lose 
		    if (playerPoints == pointsToWin) {
		      System.out.println("Congratulations! You won!");
		    } else {
		      System.out.println("Sorry! You lost, better luck nect time!");
		      
		      s.close();
		    }
	      }
		 }
		    

		  
		



