/*
 * RockPaperScissors.java
 * Author:  Nancy Bishop
 * Submission Date:  March 5 2021
 *
 * Purpose: The program allows for you to play rock paper scissors with a computer oponent.
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
        int pointsToWin, userPoints, computerPoints;
        String userMove, computerMove;
        
        System.out.println("Points to win: ");
        pointsToWin = keyboard.nextInt();
        userPoints = 0;
        computerPoints = 0;
        while ((userPoints < pointsToWin) && (computerPoints < pointsToWin))
        {
        	System.out.println("Rock, Paper, or Scissors?");
        	userMove = keyboard.next();
        	computerMove = ComputerOpponent.getMove();
        	
        if (userMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("paper")) {
        	computerPoints = computerPoints + 1;
        	System.out.println("The computer chose paper, so you lose. " + "(" + userPoints + "-" + computerPoints + ")");
        	
        }
        else if (userMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("scissors")) {
        	userPoints = userPoints + 1;
        	System.out.println("The computer chose scissors, so you win! " + "(" + userPoints + "-" + computerPoints + ")");
        	
        }
        else if (userMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("rock")) {
        	System.out.println("The computer chose rock, so it's a tie. " + "(" + userPoints + "-" + computerPoints + ")");
        	
        }
        else if (userMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock")) {
        	userPoints = userPoints + 1;
        	System.out.println("The computer chose rock, so you win! " + "(" + userPoints + "-" + computerPoints + ")");
        }
        else if (userMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("scissors")) {
        	computerPoints = computerPoints + 1;
        	System.out.println("The computer chose scissors, so you lose. " + "(" + userPoints + "-" + computerPoints + ")");
        }
        else if (userMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("rock")) {
        	computerPoints = computerPoints + 1;
        	System.out.println("The computer chose rock, so you lose. " + "(" + userPoints + "-" + computerPoints + ")");
        }
        else if (userMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("paper")) {
        	userPoints = userPoints + 1;
        	System.out.println("The computer chose paper, so you win! " + "(" + userPoints + "-" + computerPoints + ")");
        }
        else if (userMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("scissors")) {
        	System.out.println("The computer chose scissors, so it's a tie " + "(" + userPoints + "-" + computerPoints + ")");
        }
        else {
        	System.out.println("You must enter either, rock, paper, or scissors.");
        }	
        }
        if (userPoints == pointsToWin)  {
        	System.out.println("Congratulations! You won!");	
        }
        else {
        	System.out.println("Sorry, you lost. Better luck next time!");
        }
        
    }    
    }
        