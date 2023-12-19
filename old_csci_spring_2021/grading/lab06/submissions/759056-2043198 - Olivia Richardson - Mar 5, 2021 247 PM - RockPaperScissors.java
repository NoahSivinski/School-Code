
/*
 * CSCI1301.java
 * Author:  Olivia Richardson 
 * Submission Date:  March 5, 2021
 *
 * Purpose: This program is a game of Rock, Paper, 
 * Scissors. The user plays against the computer by inputting
 * the appropriate string values. If the inputs are not correct
 * the program will prompt the user to input the correct response. 
 * The program starts by asking the user how many wins they want to 
 * play (pointsToWin). The program keeps track of the points for
 * each player and displays them with what the computer chose in 
 * the outputs. The game will continue until the user or computer 
 * wins the amount of times specified by the variable pointsToWin.
 * The computer's moves are retrieved from ComputerOpponenet.java by
 * the getMove() method after the user inputs. 
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
import java.util.Scanner; //imported to get user inputs

public class RockPaperScissors {

	public static void main(String[] args) {

		// initializing variables
		int pointsToWin; // variable to store how many wins the user wants to play. User input for this
							// will be >= 1
		String userMove; // variable used to store the user's move
		String computerMove = ComputerOpponent.getMove(); // variable used to get the computer move
		int userScore = 0; // to keep track of user's score. set to 0 because both players stater with no
							// points
		int computerScore = 0; // to keep track of computer's score. set to 0 because both players stater with
								// no points

		Scanner keyboard = new Scanner(System.in); // initializing keyboard
		System.out.print("Points to win: "); // prompt for user to input how many wins they want to play
		pointsToWin = keyboard.nextInt(); // User input will be >=1

		while (userScore != pointsToWin && computerScore != pointsToWin) { // this statement will allow the loop to
																			// continue until either the user's or
																			// computer's scores hit the number enter
																			// for the pointsToWin value
			System.out.print("Rock, paper, or scissors? "); // prompts for user input for what move the user wants to
															// make
			userMove = keyboard.next(); // reads user input for what move they want to make

			// following lines check to see if the user's move is valid (rock, paper, or
			// scissors). if the response is not valid, the program will ask again until the
			// appropriate response is entered by the user
			while (!userMove.equalsIgnoreCase("rock") && !userMove.equalsIgnoreCase("paper")
					&& !userMove.equalsIgnoreCase("scissors")) {
				System.out.print("Rock, paper, or scissors? "); // prompts for user input for what move the user wants
																// to make
				userMove = keyboard.next(); // reads user input for what move they want to make

			}
			// following lines are if there is a tie. no points are added
			if (userMove.equalsIgnoreCase(computerMove)) {
				System.out.println("The computer chose " + ComputerOpponent.getMove() + ", so it's a tie!" + "("
						+ userScore + "-" + computerScore + ")"); // ComputerOpponenet.getMove is used to pull from the
																	// other src file to get the computer's move
			}

			// following lines are for the instances in which rock is played by the user
			else if (userMove.equalsIgnoreCase("rock")) //
			{
				if (computerMove.equalsIgnoreCase("scissors")) {
					userScore++; // a point is added to the user score if the user wins the round in this
									// instance
					System.out.println("The computer chose " + ComputerOpponent.getMove() + ", so you win!" + "("
							+ userScore + "-" + computerScore + ")"); // ComputerOpponenet.getMove is used to pull from
																		// the other src file to get the computer's
																		// move. userScore and computerScore display
																		// up-to-date scores in the format:
																		// (userScore-computerScore)

				} else if (computerMove.equalsIgnoreCase("paper")) {
					computerScore++; // a point is added to the computer score if the computer wins the round in this
										// instance
					System.out.println("The computer chose " + ComputerOpponent.getMove() + ", so you lose." + "("
							+ userScore + "-" + computerScore + ")");// ComputerOpponenet.getMove is used to pull from
																		// the other src file to get the computer's
																		// move. userScore and computerScore display
																		// up-to-date scores in the format:
																		// (userScore-computerScore)
				}
			}
			// following lines are for the instances in which scissors is played by the user
			else if (userMove.equalsIgnoreCase("scissors")) //
			{
				if (computerMove.equalsIgnoreCase("paper")) {
					userScore++; // a point is added to the user score if the user wins the round in this
									// instance
					System.out.println("The computer chose " + ComputerOpponent.getMove() + ", so you win!" + "("
							+ userScore + "-" + computerScore + ")");// ComputerOpponenet.getMove is used to pull from
																		// the other src file to get the computer's
																		// move. userScore and computerScore display
																		// up-to-date scores in the format:
																		// (userScore-computerScore)

				} else if (computerMove.equalsIgnoreCase("rock")) {
					computerScore++; // a point is added to the computer score if the computer wins the round in this
										// instance
					System.out.println("The computer chose " + ComputerOpponent.getMove() + ", so you lose." + "("
							+ userScore + "-" + computerScore + ")");// ComputerOpponenet.getMove is used to pull from
																		// the other src file to get the computer's
																		// move. userScore and computerScore display
																		// up-to-date scores in the format:
																		// (userScore-computerScore)
				}
			}
			// following lines are for the instances in which paper is played by the user
			else if (userMove.equalsIgnoreCase("paper")) {
				if (computerMove.equalsIgnoreCase("rock")) {
					userScore++; // a point is added to the user score if the user wins the round in this
									// instance
					System.out.println("The computer chose " + ComputerOpponent.getMove() + ", so you win!" + "("
							+ userScore + "-" + computerScore + ")");// ComputerOpponenet.getMove is used to pull from
																		// the other src file to get the computer's
																		// move. userScore and computerScore display
																		// up-to-date scores in the format:
																		// (userScore-computerScore)

				} else if (computerMove.equalsIgnoreCase("scissors")) {
					computerScore++; // a point is added to the computer score if the computer wins the round in this
										// instance
					System.out.println("The computer chose " + ComputerOpponent.getMove() + ", so you lose." + "("
							+ userScore + "-" + computerScore + ")");// ComputerOpponenet.getMove is used to pull from
																		// the other src file to get the computer's
																		// move. userScore and computerScore display
																		// up-to-date scores in the format:
																		// (userScore-computerScore)
				}
			}
		}

		// following if else statement uses the score values to determine who won
		if (userScore == pointsToWin) { // if the user's score equals pointToWin first, the user wins
			System.out.println("Congratulations! You won!");
		} else { // if the user's score DOESN'T equal the pointsToWin but the computer's score
					// DOES equal the pointsToWin, the computer wins.
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		keyboard.close(); // closes the keyboard
	}
}