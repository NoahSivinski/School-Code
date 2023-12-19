import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String computerMove = null;
		String outcomeTie = null;
		String outcomeWin = null;
		String outcomeLose = null;
		System.out.print("Points to win: ");
		int pointsToWin = input.nextInt();
		int i = 0;
		input.nextLine();
		
		
		while (i < pointsToWin) {
		System.out.print("Rock, paper, or scissors? ");
		String answer = input.nextLine();
		computerMove = ComputerOpponent.getMove();
		if (answer.equalsIgnoreCase("rock") || answer.equalsIgnoreCase("paper") || answer.equalsIgnoreCase("scissors")) {
		}
			if (answer.equalsIgnoreCase("rock") && (computerMove.equals("rock")) || (answer.equalsIgnoreCase("paper") && (computerMove.equals("paper")) || (answer.equalsIgnoreCase("scissors") && (computerMove.equals("scissors"))))) {
				outcomeTie = ("it's a tie.");
				System.out.println("The computer choses " + computerMove + ", so " + outcomeTie);
				}
				if (answer.equalsIgnoreCase("paper") && (computerMove.equals("rock")) || (answer.equalsIgnoreCase("Rock") && computerMove.equals("scissors")) || (answer.equalsIgnoreCase("Scissors") && computerMove.equals("paper"))) {
				outcomeWin = ("you Win!");
				System.out.println("The computer choses " + computerMove + ", so " + outcomeWin);
				}
				if (answer.equalsIgnoreCase("scissors") && (computerMove.equals("rock")) || (answer.equalsIgnoreCase("rock") && computerMove.equals("paper")) || (answer.equalsIgnoreCase("paper") && computerMove.equals("scissors"))) {
					outcomeLose = ("you lose.");
					System.out.println("The computer choses " + computerMove + ", so " + outcomeLose);
					}
		}	
		input.close();
	}

}
