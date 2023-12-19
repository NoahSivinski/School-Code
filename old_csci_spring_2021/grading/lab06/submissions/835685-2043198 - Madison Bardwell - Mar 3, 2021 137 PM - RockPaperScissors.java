import java.util.Scanner;			//import scanner
public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);		//new scanner
		
		int pointstowin;
		
		System.out.print("Points to win: ");
		pointstowin= keyboard.nextInt();			// the number of points needed to win the game is entered by the zero
		
		String computerMove;
		String userMove;
		String winner;
		int  computerScore=0;
		int userScore=0;
		
 
		do{
		
		System.out.print("Rock, Paper, or Scissors?");			
		userMove= keyboard.next();							//get the users choice between rock paper or scissor
		computerMove= ComputerOpponent.getMove();

		
		if (userMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("scissors")|| userMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock")|| userMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("paper"))		//all the ways the user can win
			{ 
			System.out.print("The computer chose "+computerMove+" so you win! ");
			userScore++;		//increases user score by one
			System.out.println("("+userScore+"-"+ computerScore+")");
			}
		else if (userMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("paper")|| userMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("scissors")|| userMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("rock"))		//all the ways the computer can win
			{
			System.out.print("The computer chose "+computerMove+" so you lose. ");
			computerScore++;		//increases the computer score by one
			System.out.println("("+userScore+"-"+ computerScore+")");
			}
		else if (userMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("rock")|| userMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("scissors")|| userMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("paper"))		//all the ways the two can tie
		{
		System.out.print("The computer chose "+computerMove+" so it's a tie. ");
		System.out.println("("+userScore+"-"+ computerScore+")");
		}
		else if (!userMove.equalsIgnoreCase("rock")||!userMove.equalsIgnoreCase("paper")||!userMove.equalsIgnoreCase("scissors")||!computerMove.equalsIgnoreCase("rock")||!computerMove.equalsIgnoreCase("paper")||!computerMove.equalsIgnoreCase("scissors"))		//if the user inputs something that is not valid
		{
		System.out.println("Invalid input please try again.");
		}
		
		
		}while(userScore<pointstowin && computerScore<pointstowin);		//only repeats when both scores are below the needed points to win
		
		
		if(computerScore==pointstowin)		//exits loop and computer wins
		{
			System.out.println("Sorry, you lost. Better luck next time!");
		}
		else if(userScore==pointstowin)		//exits loop and user wins
		{
			System.out.println("Congratulations! You won!");
		}
		
		
		
		
		keyboard.close();
	}

}
