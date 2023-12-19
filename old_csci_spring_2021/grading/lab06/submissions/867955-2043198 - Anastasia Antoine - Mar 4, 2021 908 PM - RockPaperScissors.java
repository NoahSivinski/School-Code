import java.util.Scanner; 
/*
 * RockPaperScissors.java
 * Author:  [Anastasia Antoine] 
 * Submission Date:  [3/4/2021]
 *
 * Purpose: This program asks you how many wins you want to play 
 * and it should keep track of the score of both the computer and the user.
 * The program should also keep running until either the player or the computer
 * wins the number of games. 
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
public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int playersScore = 0; 
		int computerScore = 0; 
		
		System.out.print("Points to win:" + "\t"); 
		int points = input.nextInt(); 
		
		do {
			System.out.print("Rock, paper, or scissors?");
			String playersMove = input.next(); 
			String computerMove; 
			computerMove = ComputerOpponent.getMove();
			if (playersMove.equalsIgnoreCase(computerMove)) {
				System.out.println("The computer chose" + " " + computerMove + ", so it's a tie" + "(" + playersScore + "-" + computerScore + ")");
			}
			else if (playersMove.equalsIgnoreCase("rock")) {
				if (computerMove.equalsIgnoreCase("scissors")) {
					playersScore++;
					System.out.println("The computer chose scissors, so you win!" + "(" + playersScore + "-" + computerScore + ")");
				}
				else if (computerMove.equalsIgnoreCase("paper")) {
					computerScore++;
					System.out.println("The computer chose paper, so you lose." + "(" + playersScore + "-" + computerScore + ")");
				}
			}
			else if (playersMove.equalsIgnoreCase("paper")) {
				if (computerMove.equalsIgnoreCase("rock")) {
					playersScore++;
					System.out.println("The computer chose rock, so you win!" + "(" + playersScore + "-" + computerScore + ")");
				}
				else if (computerMove.equalsIgnoreCase("scissors")) {
					computerScore++;
					System.out.println("The computer chose scissors, so you lose." + "(" + playersScore + "-" + computerScore + ")");
				}
			}
			else if (playersMove.equalsIgnoreCase("scissors")) {
				if (computerMove.equalsIgnoreCase("paper")) {
					playersScore++;
					System.out.println("The computer chose paper, so you win!" + "(" + playersScore + "-" + computerScore + ")");
				}
				else if (computerMove.equalsIgnoreCase("rock")) {
					computerScore++;
					System.out.println("The computer chose rock, so you lose." + "(" + playersScore + "-" + computerScore + ")");
				}
			}
			
			if (playersScore == points) {
				System.out.println("Congratulations! You won!");
				System.exit(0);
			}
			else if (computerScore == points) {
				System.out.println("Sorry, you lost. Better luck next time!");
				System.exit(0);
			} 
		} while (true); 

	}

}
