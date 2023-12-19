/* [CSCI 1301 Section 27832].java

 * Author:  [Kathy Ho] 
 * Submission Date:  [3/07/2021]
 * 
 ** Purpose: This program allows a user to play rock, paper, or scissors with a computer randomized opponent. The user inputs 
 * amount of points desired to win. Then, The user will choose one of the options(rock,paper,scissors) in which the computer 
 * will respond back randomly with it's choice. Depending on the move, the user will either get a win, a loss, or get into a tie
 * which will add points accordingly to the user or computer's side. The Program will keep repeating into a loop until one recieves
 * the amount of points needed to win. 
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

		String userMove, computerMove;
		int userWins = 0, computerWins = 0;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Points to Win: ");
		double pointsToWin = keyboard.nextDouble();
		// loop that will repeat until either the user or computer reaches number of
		// points needed to win
		while ((userWins < pointsToWin) && (computerWins < pointsToWin)) {
			System.out.print("Rock, paper, or scissors? ");
			userMove = keyboard.next();

			computerMove = ComputerOpponent.getMove();
			// if user chooses rock
			if (userMove.equalsIgnoreCase("rock")) {

				if (userMove.equalsIgnoreCase(computerMove)) {
					System.out.println("The computer chose " + computerMove + ", so it's a tie. (" + userWins + ","
							+ computerWins + ")");
				} else if (computerMove.equalsIgnoreCase("scissors")) {
					userWins++; // adds 1 point to user
					System.out.println("The computer chose " + computerMove + ", so you win! (" + userWins + ","
							+ computerWins + ")");
				} else if (computerMove.equalsIgnoreCase("paper")) {
					computerWins++; // adds 1 point to computer
					System.out.println("The computer chose " + computerMove + ", so you lose. (" + userWins + ","
							+ computerWins + ")");
				}
			}
			// if user chooses paper
			if (userMove.equalsIgnoreCase("paper")) {

				if (userMove.equalsIgnoreCase(computerMove)) {
					System.out.println("The computer chose " + computerMove + ", so it's a tie. (" + userWins + ","
							+ computerWins + ")");
				} else if (computerMove.equalsIgnoreCase("scissors")) {
					computerWins++;
					System.out.println("The computer chose " + computerMove + ", so you lose. (" + userWins + ","
							+ computerWins + ")");
				} else if (computerMove.equalsIgnoreCase("rock")) {
					userWins++;
					System.out.println("The computer chose " + computerMove + ", so you win! (" + userWins + ","
							+ computerWins + ")");
				}
			}
			// if user chooses scissors
			if (userMove.equalsIgnoreCase("scissors")) {

				if (userMove.equalsIgnoreCase(computerMove)) {
					System.out.println("The computer chose " + computerMove + ", so it's a tie. (" + userWins + ","
							+ computerWins + ")");
				} else if (computerMove.equalsIgnoreCase("rock")) {
					computerWins++;
					System.out.println("The computer chose " + computerMove + ", so you lose. (" + userWins + ","
							+ computerWins + ")");
				} else if (computerMove.equalsIgnoreCase("paper")) {
					userWins++;
					System.out.println("The computer chose " + computerMove + ", so you win! (" + userWins + ","
							+ computerWins + ")");
				}
			}
		}
		// if-else statement that concludes if the user has won if he/she reached the
		// set points needed to win
		if (userWins == pointsToWin) {
			System.out.println("Congratulations! You won!");
		} else {
			System.out.print("Sorry, you lost. Better luck next time!");
			System.exit(0);
		}

	}

}
