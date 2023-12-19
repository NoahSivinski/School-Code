/*
 * RockPaperScissors.java
 * Author:  Melissa Neff
 * Submission Date:  10/8/2021
 *
 * Purpose: This program allows the user to play the game "rock, paper, scissors" with a computer. The
 * user is asked for their move on each turn, and the computer generates a random move each time. The program will
 * continue for a specified number of wins as input by the user in the beginning.
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
		//The following line prints to the console:
		System.out.print("Points to win: ");
		//pointsToWin will be the next int input by the user
		int pointsToWin = keyboard.nextInt();
		int userScore = 0;
		int computerScore = 0;
		
		
		do {
		//The following prints to the console:
		System.out.print("Rock, paper, or scissors? ");
		//The next string input by the user will be userMove
		String userMove = keyboard.next();
		//If the user does not input "rock," "paper," or "scissors," the program will prompt the user again
		if(!userMove.equalsIgnoreCase("scissors") && !userMove.equalsIgnoreCase("rock") && !userMove.equalsIgnoreCase("paper")) {
				System.out.print("Rock, paper, or scissors? ");
				userMove = keyboard.next();
		}
		//The following uses ComputerOponent to get the next move from the computer
		String computerMove = ComputerOpponent.getMove();
		//If the computer move and user move is the same, it is a tie, and the score does not change
		if(computerMove.equalsIgnoreCase(userMove)) {
			System.out.println("The computer chose " +computerMove+ ", so it's a tie. (" +userScore + " - " +computerScore + ")"); 
		}
		/*The following lines give all other scenarios of user and computer moves, and print whether the
		 * computer or user wins in each case, and what the updated scores will be
		 */
			else if(computerMove.equals("scissors") && userMove.equalsIgnoreCase("rock")) {
				userScore++;
				System.out.println("The computer chose scissors, so you win! (" +userScore + " - " + computerScore + ")");
				
			}
				else if(computerMove.equals("rock") && userMove.equalsIgnoreCase("scissors")) {
					computerScore++;
					System.out.println("The computer chose rock, so you lose. (" +userScore + " - " + computerScore + ")");
					
			}
				else if(computerMove.equals("paper") && userMove.equalsIgnoreCase("rock")) {
					computerScore++;
					System.out.println("The computer chose paper, so you lose. (" +userScore + " - " + computerScore + ")");
					
			}
				else if(computerMove.equals("rock") && userMove.equalsIgnoreCase("paper")) {
					userScore++; 
					System.out.println("The computer chose rock, so you win! (" +userScore + " - " + computerScore + ")");
					
			}
				else if (computerMove.equals("paper") && userMove.equalsIgnoreCase("scissors")) {
					userScore++; 
					System.out.println("The computer chose paper, so you win! (" +userScore + " - " + computerScore + ")");
					
			}
				else if(computerMove.equals("scissors") && userMove.equalsIgnoreCase("paper")) {
					computerScore++; 
					System.out.println("The computer chose scissors, so you lose. (" +userScore + " - " + computerScore + ")");
				}	
		/*The program will keep going until either the user or the computer achieves the number of points
		 * to win as specified by the user
		 */
		} while (computerScore < pointsToWin && userScore < pointsToWin);
		keyboard.close();
		//If the user ends up with more points, the program will congratulate the user
		if(userScore > computerScore) {
			System.out.println("Congratulations! You won!");
		}
		//If the computer ends up with more points, the program will wish the user better luck next time
		else if(computerScore > userScore) {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		}
		}
	
		
					

		
		
	
	

		





	


