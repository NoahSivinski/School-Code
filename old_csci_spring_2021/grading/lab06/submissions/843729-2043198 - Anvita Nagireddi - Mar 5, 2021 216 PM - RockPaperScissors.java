/**
 * RockPaperScissors.java
 * Author:  Anvita Nagireddi 
 * Submission Date:  March-5-2021
 * File name: TemperatureConverter.java
 *
 *This program does the following: implement a version of Rock, Paper, Scissors where the user plays against the
computer
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
		
		System.out.print("Points to win: ");
		Scanner scan = new Scanner (System.in);
		int points = scan.nextInt();
		//user = userPoints; Computer = computerPoints
		int user = 0;
		int computer = 0;
		do {  
			System.out.print("Rock, paper, or scissors? ");
			String hand = scan.next();

			if((hand.equalsIgnoreCase("rock")||hand.equalsIgnoreCase("paper")||hand.equalsIgnoreCase("scissors"))) {
			
				String computerMove = ComputerOpponent.getMove();
				System.out.print("The computer chose "+ computerMove +", so ");
				if(hand.equalsIgnoreCase("rock")&&(computerMove.equalsIgnoreCase("paper"))) {
					computer++;
					System.out.print("you lose.");
					System.out.print(" (" + user + "-"+ computer +")");
				}
				else if(hand.equalsIgnoreCase("rock")&&(computerMove.equalsIgnoreCase("scissors"))) {
					user++;
					System.out.print("you win!");
					System.out.print(" (" + user + "-"+ computer +")");
				}
				else if(hand.equalsIgnoreCase("paper")&&(computerMove.equalsIgnoreCase("rock"))) {
					user++;
					System.out.print("you win!");
					System.out.print(" (" + user + "-"+ computer +")");
				}
				else if(hand.equalsIgnoreCase("paper")&&(computerMove.equalsIgnoreCase("scissors"))) {
					computer++;
					System.out.print("you lose.");
					System.out.print(" (" + user + "-"+ computer +")");
				}
				else if(hand.equalsIgnoreCase("scissors")&&(computerMove.equalsIgnoreCase("rock"))) {
					computer++;
					System.out.print("you lose.");
					System.out.print(" (" + user + "-"+ computer +")");
				}
				else if(hand.equalsIgnoreCase("scissors")&&(computerMove.equalsIgnoreCase("paper"))) {
					user++;
					System.out.print("you win!");
					System.out.print(" (" + user + "-"+ computer +")");
				}
				else if(hand.equalsIgnoreCase("scissors")&&(computerMove.equalsIgnoreCase("scissors"))) {
					System.out.print("it's a tie.");
					System.out.print(" (" + user + "-"+ computer +")");
				}
				else if(hand.equalsIgnoreCase("paper")&&(computerMove.equalsIgnoreCase("paper"))) {
					System.out.print("it's a tie. ");
					System.out.print(" (" + user + "-"+ computer +")");
				}
				else if(hand.equalsIgnoreCase("rock")&&(computerMove.equalsIgnoreCase("rock"))) {
					System.out.print("it's a tie. ");
					System.out.print(" (" + user + "-"+ computer +")");
				}
				System.out.println("");
				}
			}
			// repeat until one side has reached the desired number of points
			while (user < points && computer < points);
			
			if(user == points ) {
				System.out.println("Congratulations! You won!");	
			}
			else if(computer == points) {
				System.out.println("Sorry, you lost. Better luck next time!");
			}

	}

}
