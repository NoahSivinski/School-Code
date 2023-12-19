import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userscore = 0, compscore = 0;
		String computermove;

		System.out.print("Points to win: ");
		int win = input.nextInt();

		while (!(userscore == win)) {
			System.out.print("Rock, paper, or scissors? ");
			String usermove = input.next().toLowerCase();

			computermove = ComputerOpponent.getMove();

			if (usermove.equals(computermove))
				System.out.println("The computer chose " + computermove + ",so it's a tie. (" + userscore + "-" + compscore + ")");

			else if (usermove.equals("paper")) {
				if (computermove.equals("scissors")) {
					compscore++;
					System.out.println("The computer chose scissors, so you lose. (" + userscore + "-" + compscore + ")");
				} else if (computermove.equals("rock")) {
					userscore++;
					System.out.println("The computer chose rock, so you win! (" + userscore + "-" + compscore + ")");
				}
			}

			else if (usermove.equals("rock")) {
				if (computermove.equals("scissors")) {
					userscore++;
					System.out.println("The computer chose scissors, so you win! (" + userscore + "-" + compscore + ")");
				} else if (computermove.equals("paper")) {
					compscore++;
					System.out.println("The computer chose paper, so you lose. (" + userscore + "-" + compscore + ")");
				}
			}

			else if (usermove.equals("scissors")) {
				if (computermove.equals("paper")) {
					userscore++;
					System.out.println("The computer chose paper, so you win! (" + userscore + "-" + compscore + ")");
				} else if (computermove.equals("rock")) {
					compscore++;
					System.out.println("The computer chose rock, so you lose. (" + userscore + "-" + compscore + ")");
				}
			}

			if (userscore == win) {
				System.out.println("Congratulations! You won!");
				System.exit(0);
			} else if (compscore == win) {
				System.out.println("Sorry, you lost. Better luck next time!");
				System.exit(0);
			}
		}
		input.close();
	}

}
