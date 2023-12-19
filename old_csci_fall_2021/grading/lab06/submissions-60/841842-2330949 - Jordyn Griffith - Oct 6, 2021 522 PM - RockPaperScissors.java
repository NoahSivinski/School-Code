/*
 * [RockPaperScissors].java
 * Author:  [Jordyn Griffith] 
 * Submission Date:  [October 6, 2021]
 *
 * Purpose: Thia program implements a version of Rock, Paper, Scissors 
 * where the user plays against the computer. The user inputs in their 
 * choice as a String (either "rock", "paper", or "scissors" not case
 * sensitive), and the computer will make its choice at pseudorandom. 
 * A winner is then determined based on the standard conventions of 
 * the game
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

import java.util.Scanner; //imports Scanner to get data from the user 

public class RockPaperScissors {

	public static void main(String[] args) {
		String computerMove; //auto-generated computer move 
		int pointsToWin = 0; // integer used to store the necessary number of points needed to win the game
		Scanner keyboard = new Scanner(System.in); //implements the scanner so that we can get input from the user 
		System.out.print("Points to win: "); //print statement 
		pointsToWin = keyboard.nextInt(); //allows the user to enter the necessary number of points needed to win the game 
		String userInput = " "; //creates a string variable that allows the user to enter in their choice of rock, paper, or scissors
		int userScore = 0; //this will be initialized later on, but holds the current score of the user throughout the game
		int computerScore = 0; //this will be initialized later on, but holds the current score of the computer throughout the game
		int roundsLeft = 0; //this will be initialized later on, but holds the current number of rounds left until the game is over
		boolean points = true; //this is apart of the do-while loop. It tells the program to stop once a winner is declared.
		do { //do-while loop. As long as the boolean value for points remains true, the game will continue to run
			System.out.print("Rock, paper, or scissors? "); //print statement 
			userInput = keyboard.next(); //allows the user to enter their choice of rock, paper, or scissors 
		if(userInput.equalsIgnoreCase("rock")) { //ignores the case of user input if they were to enter "rock"
			computerMove = ComputerOpponent.getMove(); //gets the computer's move from a different file stored in the same src folder.
			System.out.print("The computer chose " + computerMove + ", so "); //print statement displaying the computers move choice
			if (computerMove.equals("rock")) {// the computer's choice is rock
				System.out.print("it's a tie. " + "(" + userScore + "-" + computerScore + ")\n"); //displays the outcome of rock vs rock, then prints score
			} else if (computerMove.equals("scissors")) {//the computer's choice is scissors
				userScore = userScore + 1; // rock beats scissors so the user score increases by one 
				System.out.print("you win! " + "(" + userScore + "-" + computerScore + ")\n"); // displays the outcome of rock vs scissors, then prints score
			} else if (computerMove.equals("paper")) { //the computer's chose is paper
				computerScore = computerScore + 1; //paper beats rock so the computer's score increases by one 
				System.out.print("you lose. " + "(" + userScore + "-" + computerScore + ")\n");	//displays the outcome of rock vs paper, then prints score
		}} else if (userInput.equalsIgnoreCase("scissors")) {//ignores the case of the user input if they were to enter "scissors"
			computerMove = ComputerOpponent.getMove(); //gets the computer's move from a different file stored in the same src folder.
			System.out.print("The computer chose " + computerMove + ", so "); //print statement displaying the computer's move choice
			if (computerMove.equals("scissors")) {//the computer's choice is scissors 
				System.out.print("it's a tie. " + "(" + userScore + "-" + computerScore + ")\n");//displays the outcome of scissors vs scissors, then prints score 
			} else if (computerMove.equals("rock")) {//the computer's choice is rock
				computerScore = computerScore + 1;//rock beats scissors, so computer score increases by one
				System.out.print("you lose. " + "(" + userScore + "-" + computerScore + ")\n");
			} else if (computerMove.equals("paper")) {//the computer's choice is paper
				userScore = userScore + 1; //scissors beats paper, so user score increases by one 
				System.out.print("you win. " + "(" + userScore + "-" + computerScore + ")\n");//displays the outcome of scissors vs paper, then displays score 
		}} else if (userInput.equalsIgnoreCase("paper")) {//ignores the case of the user input if they were to enter "paper"
			computerMove = ComputerOpponent.getMove(); //gets the computer's move from a different file stored in the same src folder.
			System.out.print("The computer chose " + computerMove + ", so ");//print statement displaying the computers move choice
			if (computerMove.equals("paper")) {//the computer's choice is paper
				System.out.print("it's a tie. " + "(" + userScore + "-" + computerScore + ")\n");//displays the outcome of paper vs paper, then prints the score
			} else if (computerMove.equals("scissors")) {//the computer's choice is scissors
				computerScore = computerScore + 1;//paper loses to scissors, so the computer score increases by one
				System.out.print("you lose. " + "(" + userScore + "-" + computerScore + ")\n");//displays the outcome of paper vs scissors, then displays score
			} else if (computerMove.equals("rock")) {//the computer's  choice is rock 
				userScore = userScore + 1;//paper beats rock, so the user score increases by one 
				System.out.print("you win! " + "(" + userScore + "-" + computerScore + ")\n");//displays the outcome of paper vs rock, then prints the score 
			}
		} if (pointsToWin >= 0) //ensures that the user inputs a value in range
			roundsLeft = pointsToWin; //sets a variable roundsLeft equal to the variable pointsToWin, which was given by the user 
			if (computerScore < pointsToWin) // evaluates this boolean value 
				roundsLeft--; //each time this is true, the program continues, decreasing the number of rounds left by one 
			else if (userScore < pointsToWin) //evaluates the boolean value if the first if statement is false
				roundsLeft--;// each time this is true, the program continues, decreasing the number of rounds left by one.
			else if (computerScore == pointsToWin || userScore == pointsToWin) {//states that if this is true, the game is said to be over and then executes the following if statement
				
			}
			if (userScore == pointsToWin || computerScore == pointsToWin) {
				points = false; //sets the while portion of the do-while loop (below) equal to false, thus indicating that the game is over 
				if (userScore == pointsToWin) //boolean value
					System.out.println("Congratulations you won!");	//if the boolean value above is true, that means that the user has reached the necessary number of points to win.
				 else if (computerScore == pointsToWin)// boolean value executed if the above is false
					System.out.println("Sorry, you lost. Better luck next time!");// if the boolean value above is true, that means that the computer has reached the necessary number of points to win
			}
		} while (points);//as long as this value remains true, the loop will continue 
		
		} 
		
			
		{
	}

}