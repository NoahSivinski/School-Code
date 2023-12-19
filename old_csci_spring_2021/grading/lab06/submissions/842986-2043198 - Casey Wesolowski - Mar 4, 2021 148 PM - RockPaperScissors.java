
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Points to win: ");
		int totalNumberOfRounds = keyboard.nextInt();
		
		//String userMove;
		String computerMove;
		int computerWins = 0;
		int userWins = 0;
		
		
		
		// To get rid of the repeat
		String extraSpace = keyboard.nextLine();
		extraSpace.equalsIgnoreCase("");
		
		// Remember to turn on the assertion check
		//assert (totalNumberOfRounds >= 1);
		
		int gamesPlayed = 1;
		while (gamesPlayed <= totalNumberOfRounds) {
			
			// Getting the user's move
			System.out.print("Rock, paper, or scissors? ");
			//userMove = keyboard.nextLine();
			// Now importing the computer's move
			computerMove = ComputerOpponent.getMove();
			
			String userMove = keyboard.nextLine();
			userMove.toLowerCase();
			switch (userMove) {
				case ("rock"):
					if (computerMove.equalsIgnoreCase("paper")) {
						computerWins++;
						gamesPlayed = computerWins;
						System.out.println("The computer chose " + computerMove 
								+ ", so you lose. " + "(" + userWins + "-" + computerWins + ")");
					}
					else if (computerMove.equalsIgnoreCase("scissors")) {
						userWins++;
						gamesPlayed = userWins;
						System.out.println("The computer chose " + computerMove 
								+ ", so you win! " + "(" + userWins + "-" + computerWins + ")");
					}
						else {
							gamesPlayed--;
							System.out.println("The computer chose " + computerMove 
									+ ", so it's a tie. " + "(" + userWins + "-" + computerWins + ")");
						}
					break;
				case "paper": 
					if (computerMove.equalsIgnoreCase("scissors")) {
						computerWins++;
						gamesPlayed = computerWins;
						System.out.println("The computer chose " + computerMove 
								+ ", so you lose. " + "(" + userWins + "-" + computerWins + ")");
					}
					else if (computerMove.equalsIgnoreCase("rock")) {
						userWins++;
						gamesPlayed = userWins;
						System.out.println("The computer chose " + computerMove 
								+ ", so you win! " + "(" + userWins + "-" + computerWins + ")");
					}
						else	{
							gamesPlayed--;
							System.out.println("The computer chose " + computerMove 
									+ ", so it's a tie. " + "(" + userWins + "-" + computerWins + ")");
						}
					break;
				case "scissors":
					if (computerMove.equalsIgnoreCase("rock")) {
						computerWins++;
						gamesPlayed = computerWins;
						System.out.println("The computer chose " + computerMove 
								+ ", so you lose. " + "(" + userWins + "-" + computerWins + ")");
					}
					else if (computerMove.equalsIgnoreCase("paper")) {
						userWins++;
						gamesPlayed = userWins;
						System.out.println("The computer chose " + computerMove 
								+ ", so you win! " + "(" + userWins + "-" + computerWins + ")");
					}
						else	{
							gamesPlayed--;
							System.out.println("The computer chose " + computerMove 
									+ ", so it's a tie. " + "(" + userWins + "-" + computerWins + ")");
						}
					break;
				default:
					System.out.println("Enter a viable move.");
					
					
			}
			
		gamesPlayed++;	
			
		}
			
			if (userWins > computerWins)	{
					System.out.println("Contratulations! You won!");
				}
			else	{
					System.out.println("Sorry, you lost. Better luck next time!");
				}
			

		
		// Remember to close the keyboard!!
		keyboard.close();
		
	}
		
}
