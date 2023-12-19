import java.util.Scanner;
public class RockPaperScissors {

	public static void main(String[] args) {
		System.out.print("Points to win:");
		Scanner keyboard= new Scanner(System.in);
		int points= keyboard.nextInt();
		int myWins=0;
		int myLoses=0;
		int number= ((int) (Math.random() * 3));
		while (points!=0) {

		System.out.print("Rock, paper, or scissors?");
		String myMove=keyboard.next();
		String computerMove=ComputerOpponent.getMove();
		
        if  (number==0) {
        computerMove="rock";
        }
        else if (number==1)
         {
        computerMove= "paper";
         }
        else {
        	computerMove="scissors";
        }
            
		if (myMove.equalsIgnoreCase("rock")|| myMove.equalsIgnoreCase("paper")|| myMove.equalsIgnoreCase("scissors"))
		
		 if(myMove.equals(computerMove)) 
		{
			System.out.print("The computer chose "+computerMove+", so it's a tie.\t");
			System.out.println("("+myWins +"-"+ myLoses+")");
		}
		//rck>ppr
		else if(myMove.equalsIgnoreCase("rock")&&computerMove.equals("scissors")) 
		{
			System.out.print("The computer chose scissors, so you win!\t");
			myWins++;
			System.out.println("("+myWins +"-"+ myLoses+")");
		}
		//sci>ppr
		else if (myMove.equalsIgnoreCase("scissors")&&(computerMove.equals("paper")))
		{
			System.out.print("The computer chose paper, so you win!\t");
			myWins++;
			System.out.println(myWins +"-"+ myLoses);

		}
		else if (myMove.equalsIgnoreCase("paper")&&(computerMove.equals("rock")))
		{
			System.out.print("The computer chose rock, so you win!\t");
			myWins++;
			System.out.println(myWins +"-"+ myLoses);

		}
		 //losses
		else if (myMove.equalsIgnoreCase("rock")&&(computerMove.equals("paper")))
		{
			System.out.print("The computer chose paper, so you lose.\t");
			myLoses++;
			System.out.println(myWins +"-"+ myLoses);
		}
		else if (myMove.equalsIgnoreCase("paper")&&(computerMove.equals("scissors")))
		{
			System.out.print("The computer chose scissors, so you loose.\t");
			myLoses++;
			System.out.println("("+myWins+ "-" +myLoses+")");
		}
		else if(myMove.equalsIgnoreCase("scissors")&&computerMove.equals("rock")) 
		{
			System.out.print("The computer chose rock, so you loose.\t");
			myLoses++;
			System.out.println("("+myWins+ "-"+ myLoses+")");
		}
		}
		//brkt 4 whle stmnt
		

		 if (myWins>myLoses) {
			 System.out.print("Congratulations! You won!");
		 }	
		 else if (myWins<myLoses) {
			 System.out.print("Sorry, you lost. Better luck next time!");
		 }	
		 
}}
