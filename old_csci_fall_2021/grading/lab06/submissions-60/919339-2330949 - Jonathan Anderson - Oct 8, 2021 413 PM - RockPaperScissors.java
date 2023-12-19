import java.util.Scanner;

/*
 * RockPaperScissors.java
 * Author:  Jonathan Anderson
 * Submission Date:  10/8/2021
 *
 * Purpose: This program plays a game of Rock, Paper, Scissors between a player and a computer opponent.
 * The player gives an input that determines the number of points needed to win, and types in their move.
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
    public static void main(String[] args){
        System.out.print("Points to win: ");
        Scanner input = new Scanner(System.in);
        int pointsToWin = input.nextInt();

        int computerPoints = 0;
        int playerPoints = 0;

        ComputerOpponent computer = new ComputerOpponent();
        String playerMove = "";

        while(computerPoints < pointsToWin && playerPoints < pointsToWin){
            System.out.print("Rock, paper, or scissors? ");
            playerMove = input.next().toLowerCase();

            while(!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")){
                System.out.print("Invalid input. Rock, paper, or scissors? ");
                playerMove = input.next().toLowerCase();
            }

            String computerMove = computer.getMove();

            if(playerMove.equals("rock")){
                if(computerMove.equals("rock")){
                    System.out.println("The computer chose rock, so it's a tie. (" + playerPoints + "-" + computerPoints + ")");
                }
                else if(computerMove.equals("paper")){
                    computerPoints++;
                    System.out.println("The computer chose paper, so you lose. (" + playerPoints + "-" + computerPoints + ")");
                }
                else if(computerMove.equals("scissors")){
                    playerPoints++;
                    System.out.println("The computer chose scissors, so you win! (" + playerPoints + "-" + computerPoints + ")");
                }
            }
            else if(playerMove.equals("paper")){
                if(computerMove.equals("rock")){
                    playerPoints++;
                    System.out.println("The computer chose rock, so you win! (" + playerPoints + "-" + computerPoints + ")");
                }
                else if(computerMove.equals("paper")){
                    System.out.println("The computer chose paper, so it's a tie. (" + playerPoints + "-" + computerPoints + ")");
                }
                else if(computerMove.equals("scissors")){
                    computerPoints++;
                    System.out.println("The computer chose scissors, so you lose. (" + playerPoints + "-" + computerPoints + ")");
                }
            }
            else if(playerMove.equals("scissors")){
                if(computerMove.equals("rock")){
                    computerPoints++;
                    System.out.println("The computer chose rock, so you lose. (" + playerPoints + "-" + computerPoints + ")");
                }
                else if(computerMove.equals("paper")){
                    playerPoints++;
                    System.out.println("The computer chose paper, so you win! (" + playerPoints + "-" + computerPoints + ")");
                }
                else if(computerMove.equals("scissors")){
                    System.out.println("The computer chose scissors, so it's a tie. (" + playerPoints + "-" + computerPoints + ")");
                }
            }
        }

        if(computerPoints == pointsToWin){
            System.out.println("Sorry, you lost. Better luck next time!");
        }

        if(playerPoints == pointsToWin){
            System.out.println("Congratulations! You won!");
        }
    }
}
