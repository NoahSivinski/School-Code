/*
 * RockPaperScissors.java
 * Author:  Prateek Yadav
 * Submission Date:  10/5/2021
 * Due Date: 10/8/2021
 *
 *Code Description:
 *This program is a rock paper scissors simulator
 *that allows you to play against a computer until a specified
 *amount of points is earned by either player.
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
 * 
 * I agree with this statement^
 */
import java.util.Scanner;
public class RockPaperScissors {

	public static void main(String[] args) {
		
		//Creating Scanner Object
		Scanner scan = new Scanner(System.in);
		//Variables
		int score = 0;
		int compScore = 0;
		int ptsToWin;
		String choice = "";
		String compChoice;
		
		
		
		//Getting game length
		System.out.print("Points to win: ");
		ptsToWin = scan.nextInt();
		
		
		
		while((ptsToWin != score) && (ptsToWin != compScore)) {
			
			//User input
			choice = "";
			while((!(choice.equalsIgnoreCase("rock")))&&(!(choice.equalsIgnoreCase("paper")))&&(!(choice.equalsIgnoreCase("scissors")))){
				System.out.print("Rock, paper, or scissors?");
				choice = scan.next();
			}
			
			compChoice = ComputerOpponent.getMove();
			System.out.print("The computer chose " + compChoice);
			
			
			
			//Tie Case
			if(choice.equalsIgnoreCase(compChoice)) {
				System.out.println(", so its a tie. (" + score + "-" + compScore+ ")" );
			}
			//Rock Cases
			else if (choice.equalsIgnoreCase("rock")) {
						if(compChoice.equals("paper")) {
							compScore++;
							System.out.println(", so you lose. (" + score + "-" + compScore+ ")" );
						}
						else {
							score++;
							System.out.println(", so you win! (" + score + "-" + compScore+ ")" );
						}	
			}
			//Paper Cases
			else if (choice.equalsIgnoreCase("paper")) {
						if(compChoice.equals("rock")) {
							score++;
							System.out.println(", so you win! (" + score + "-" + compScore+ ")" );
						}
						else {
							compScore++;
							System.out.println(", so you lose. (" + score + "-" + compScore+ ")" );
						}	
			}
			//Scissors Cases
			else if (choice.equalsIgnoreCase("scissors")) {
						if(compChoice.equals("rock")) {
							compScore++;
							System.out.println(", so you lose. (" + score + "-" + compScore+ ")" );
						}
						else {
							score++;
							System.out.println(", so you win! (" + score + "-" + compScore+ ")" );
						}	
			}
		}	
		
		if(score == ptsToWin) {
			System.out.println("Congratulations! You won!");
		}
		else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		
		
		
		//Closing Scanner object
		scan.close();
	}

}
