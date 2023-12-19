import java.util.Scanner;

/*
 * [PayOffDebt].java
 * Author:  [Connor Malloch] 
 * Submission Date:  [Feburary 12]
 *
 * Purpose: The program is for calculating how many months it will take to pay off credit card debt, total amount payed, overpayment, and total amount of interest payed
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

public class PayOffDebt {
	public static void main(String[] args) {
		double principal = 0;
		double annualInterestRate = 0;
		double monthlyPayment = 0;
		double numberOfMonths = 0;
		// Prompt Variables
		System.out.println("How much do you owe on the credit card?");
		Scanner keyBoard = new Scanner(System.in);
		principal = keyBoard.nextDouble();
		//Asking for the principal
		System.out.println("What is the annual interest rate on the card?");
		annualInterestRate = keyBoard.nextDouble();
		//Asking for the annual interest rate
		System.out.println("How much every month are you going to allocate toward the payment of the debt?");
		monthlyPayment = keyBoard.nextDouble();
		//Asking for the monthly payment
			
		numberOfMonths = ( Math.log( monthlyPayment )
							- Math.log( monthlyPayment - ( annualInterestRate /1200.0 ) * principal )) 
								/ Math.log((annualInterestRate/1200.0) + 1.0);
		//The equation
			
		int numberOfMonthsInt = (int) Math.ceil(numberOfMonths);
		//We have to get the ceiling of numberOfMonths because you can't pay only a fraction of a month
		
		double totalAmountPaid = numberOfMonthsInt * monthlyPayment;
		//equation for the totalAmountPaid
		double totalInterestPaid = Math.abs(principal - totalAmountPaid);
		//equation for the amount of interest paid
		double overPayment = monthlyPayment*(numberOfMonthsInt - numberOfMonths);
		//equation for the monthly payment
				System.out.printf("\nPrincipal:\t\t\t %7.2f\n", principal);
		// call for the principal and its value
		System.out.print("Annual Interest Rate(%):");
		System.out.printf("\t%5.1f \nMonthly Payment:\t\t %6.2f\n\nMonths Needed to Pay Off:\t%3d"
				+ "\nTotal Amount Paid: \t\t $%2.2f\nTotal Interest Paid: \t\t $%3.2f"
				+ "\nOverPayment: \t\t\t $%4.2f", annualInterestRate, monthlyPayment, numberOfMonthsInt, totalAmountPaid,
				totalInterestPaid, overPayment);
						
		}
}
