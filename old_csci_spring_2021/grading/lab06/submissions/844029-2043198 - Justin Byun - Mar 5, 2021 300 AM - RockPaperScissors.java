
import java.util.Scanner;

	public class RockPaperScissors {

		public static void main(String[] args) {
            Scanner keyboard = new Scanner (System.in);
                System.out.print ("Points to win: ");
                int pointsToWin = keyboard.nextInt();
                keyboard.nextLine();                              
                int playerPoints = 0, computerPoints = 0;
                
                while ((playerPoints < pointsToWin) && (computerPoints < pointsToWin)) {
                    System.out.print ("Rock, paper or scissors? ");
                    String play = keyboard.nextLine ();
                    if (play.equals("rock") || play.equals("paper") || play.equals("scissors"))  {
					String computerplay = ComputerOpponent.getMove ();
                    if (play.equals(computerplay))
                        System.out.printf ("The computer chose %s, so it's a tie. (%d-%d)\n", 
                                        computerplay, playerPoints, computerPoints);
                    
                    else if ( (play.equals("rock") && computerplay.equals("scissors")) || 
                        (play.equals("scissors") && computerplay.equals("paper")) || 
                        (play.equals("paper") && computerplay.equals("rock")) ) {
                                playerPoints++;
                                System.out.printf ("The computer chose %s, so you win! (%d-%d)\n", 
                                        computerplay, playerPoints, computerPoints);
                        }
                    else {
                                computerPoints++;
                                System.out.printf ("The computer chose %s, so you lose. (%d-%d)\n", 
                                        computerplay, playerPoints, computerPoints);
                    }
                    }
                }
                if (playerPoints > computerPoints)
                    System.out.println ("Congratulations! You won!");
                else
                    System.out.println ("Sorry, you lost. Better luck next time!");
        }
    
}