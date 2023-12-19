/*
 * [RockPaperScissors].java
 * Author:  [Stephanie Ibarra] 
 * Submission Date:  [03/05/2021]
 *
 * Purpose: This is a simulation of the game Rock, Paper, Scissors,
 * where instead of two players playing, it's one player and a 
 * computer. The objective is to win the game as many times as
 * the user has entered in the beginning. It has the same rules,
 * Rock beats scissors, but loses against paper. Paper wins against
 * rock, but loses against scissors. Scissors wins against paper, but 
 * loses against rock. If you and the computer draw the same thing
 * it's a tie and neither get points. 
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
		System.out.print ("Points to win: ");
		int pointsToWin = keyboard.nextInt();
		keyboard.nextLine();                              
		int playerPoints = 0, computerPoints = 0;

		// Make a limit
		while ((playerPoints < pointsToWin) && (computerPoints < pointsToWin)) {
			System.out.print ("Rock, paper or scissors? ");
			String play = keyboard.nextLine ();
			if (play.equals("rock") || play.equals("paper") || play.equals("scissors"))  {
				String computerPlay = ComputerOpponent.getMove ();
				if (play.equals(computerPlay))
					System.out.printf ("The computer chose %s, so it's a tie. (%d-%d)\n", 
							computerPlay, playerPoints, computerPoints);

				// The plays that win 
				else if ( (play.equals("rock") && computerPlay.equals("scissors")) || 
						(play.equals("scissors") && computerPlay.equals("paper")) || 
						(play.equals("paper") && computerPlay.equals("rock")) ) {
					playerPoints++;
					System.out.printf ("The computer chose %s, so you win! (%d-%d)\n", 
							computerPlay, playerPoints, computerPoints);
				}
				else { // Don't have to write the plays that lose, since earlier you wrote all the 
					// plays that win. So all thats left is losing plays
					computerPoints++;
					System.out.printf ("The computer chose %s, so you lose. (%d-%d)\n", 
							computerPlay, playerPoints, computerPoints);
				}
			}
		}
		if (playerPoints > computerPoints)
			System.out.println ("Congratulations! You won!");
		else
			System.out.println ("Sorry, you lost. Better luck next time!");

		keyboard.close();

	}

}

