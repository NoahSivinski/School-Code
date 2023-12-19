/*
 * RockPaperScissors.java
 * Author: Aaron Brown
 * Submission Date: 03/01/2021
 *
 * Purpose: This program allows the user to play Rock, Paper, Scissors with a computer
 * opponent. It begins by asking the user how many points they want to play to. Once 
 * this input is given, the program then enters a for loop that will not end until
 * the user has either lost or won. The program asks the user to input a move, and 
 * then the computer makes its move too, based upon the computer's move, the user
 * either gains a point, the computer gains a point, or neither gain a point. Once
 * the user or computer have reached the points required to win, the loop ends and
 * the user is declared the winner or the loser.
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
		Scanner input = new Scanner (System.in);
		//The following variables will be used to store scores and current 'moves' in the game.
		int userPoints = 0;
		int compPoints = 0;
		String userMove;
		String compMove;
		//The user is prompted to input the points needed to win.
		System.out.print("Points to win: ");
		int pointsToWin = input.nextInt();
		//Clears the \n to allow nextLine to work properly.
		userMove = input.nextLine();
		/*The loop of the game begins, the integer 'leading value' is used to keep the loop going until the user or computer
		 *reaches the required points to win.
		 */
		for(int leadingValue = 0; leadingValue < pointsToWin;) {
			/*User is prompted for input and computer move is generated as well. Due to the way
			 *I formatted my loop, the value for ending the loop only goes up by the highest number
			 *of points, and the number of points cannot increase if the input is not valid, so invalid
			 *inputs are covered.
			 */
			System.out.print("Rock, paper, or scissors? ");
			userMove = input.nextLine();
			userMove = userMove.trim();
			compMove = ComputerOpponent.getMove();
			//For result calculation, the user input is inputed as all lower case letters to simplify the if statements.
			userMove = userMove.toLowerCase();
			/*The following scenario is for the user inputting rock, it checks the computer move and based
			 *on that scenario of user versus computer, returns the appropriate statement for winning or losing
			 *and increases the points accordingly.
			 */
			if(userMove.equalsIgnoreCase("rock")) {
				//Checks if the computer generated rock.
				if(compMove.equalsIgnoreCase("rock")) {
					System.out.println("The computer chose rock, so it's a tie. (" + userPoints + "-" + compPoints + ")");
				}
				//Checks if the computer generated scissors.
				else if(compMove.equalsIgnoreCase("scissors")) {
					userPoints++;
					System.out.println("The computer chose scissors, so you win! (" + userPoints + "-" + compPoints + ")");
				}
				//Checks if the computer generated paper.
				else if(compMove.equalsIgnoreCase("paper")) {
					compPoints++;
					System.out.println("The computer chose paper, so you lose. (" + userPoints + "-" + compPoints + ")");
				}
			}
			/*The following scenario is for the user inputting scissors, it checks the computer move and based
			 *on that scenario of user versus computer, returns the appropriate statement for winning or losing
			 *and increases the points accordingly.
			 */
			else if(userMove.equalsIgnoreCase("scissors")) {
				//Checks if the computer generated scissors.
				if(compMove.equalsIgnoreCase("scissors")) {
					System.out.println("The computer chose scissors, so it's a tie. (" + userPoints + "-" + compPoints + ")");
				}
				//Checks if the computer generated paper.
				else if(compMove.equalsIgnoreCase("paper")) {
					userPoints++;
					System.out.println("The computer chose paper, so you win! (" + userPoints + "-" + compPoints + ")");
				}
				//Checks if the computer generated rock.
				else if(compMove.equalsIgnoreCase("rock")) {
					compPoints++;
					System.out.println("The computer chose rock, so you lose. (" + userPoints + "-" + compPoints + ")");
				}
			}
			/*The following scenario is for the user inputting paper, it checks the computer move and based
			 *on that scenario of user versus computer, returns the appropriate statement for winning or losing
			 *and increases the points accordingly.
			 */
			else if(userMove.equalsIgnoreCase("paper")) {
				//Checks if the computer generated paper.
				if(compMove.equalsIgnoreCase("paper")) {
					System.out.println("The computer chose paper, so it's a tie. (" + userPoints + "-" + compPoints + ")");
				}
				//Checks if the computer generated rock.
				else if(compMove.equalsIgnoreCase("rock")) {
					userPoints++;
					System.out.println("The computer chose rock, so you win! (" + userPoints + "-" + compPoints + ")");
				}
				//Checks if the computer generated scissors.
				else if(compMove.equalsIgnoreCase("scissors")) {
					compPoints++;
					System.out.println("The computer chose scissors, so you lose. (" + userPoints + "-" + compPoints + ")");
				}
			}
			/*The following if/else determines the value of leading value which is the user or computer
			 *point total depending upon which one has the most points.
			 */
			if(userPoints > compPoints) leadingValue = userPoints;
			else leadingValue = compPoints;
			}
		//This statement closes the scanner value after the loop ends since user input is finished.
		input.close();
		//This statement prints if the user won.
		if(userPoints == pointsToWin) System.out.println("Congratulations! You won!");
		//This statement prints if the computer won.
		else System.out.println("Sorry, you lost. Better luck next time!");
		}
	}
