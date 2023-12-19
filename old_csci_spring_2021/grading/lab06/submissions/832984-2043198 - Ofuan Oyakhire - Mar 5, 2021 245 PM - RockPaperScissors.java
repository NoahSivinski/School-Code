/*
 * RockPaperScissors.java
 * Author: Ofuan Oyakhire
 * Submission Date:  03/05/21
 *
 * Purpose: simulate the game rock, paper, scissors.
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

        // Declare variables
        String computerMove = "";
        String userMove = "";
        String result = "";
        int userPoint = 0;
        int computerPoint = 0;
        int rounds;


        Scanner keyboard = new Scanner(System.in);


        System.out.print("Points to win: ");

        rounds = Integer.parseInt(keyboard.nextLine());

        while (!(userPoint >= rounds || computerPoint >= rounds)) {

            System.out.print("Rock, paper, or scissors? ");

            userMove = keyboard.nextLine().trim();
            while (!(userMove.equalsIgnoreCase("rock") ||
                    userMove.equalsIgnoreCase("scissors") ||
                    userMove.equalsIgnoreCase("paper"))){
                System.out.print("Rock, paper, or scissors? ");
                userMove = keyboard.nextLine().trim();
            }
            computerMove = ComputerOpponent.getMove();

            // Get the result of the round
            if(userMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("scissors")){
                userPoint++;
                result = "so you win!";
            } else if(userMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("paper")){
                userPoint++;
                result = "so you win!";
            } else if(userMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock")){
                userPoint++;
                result = "so you win!";
            }  else if(userMove.equalsIgnoreCase(computerMove)){
                result = "so it's a tie.";
            }  else {
                computerPoint++;
                result = "so you lose.";
            }
            System.out.println("The computer chose " + computerMove + ", " + result + " (" + userPoint + "-" + computerPoint + ")");
        }

        if(userPoint > computerPoint){
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println("Sorry, you lost. Better luck next time!");
        }

    }
}
