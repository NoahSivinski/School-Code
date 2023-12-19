/*
 * PayoffDebt.java
 * Author:  Lincoln Ledet
 * Submission Date:  9/8/21
 * Project 01
 *
 * Purpose: This Program asks its user the principle amount of money loaned, the annual interest on said principal, and the monthly
 * payment made to pay off the principal. It calculates the months need to pay off the principle and the interest paid.  
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

public class PayoffDebt {
	public static void main(String[] args) {
		
		//asks user for values of "Principal","Annual interest Rate", and "monthly Payment"
		Scanner Keyboard = new Scanner(System.in);
		System.out.print("Principal:\t\t\t");
		double principal = Keyboard.nextDouble();
		System.out.print("Annual interest Rate (%):\t");
		double annualInterestRate = Keyboard.nextDouble();
		System.out.print("Monthly Payment:\t\t");
		double monthlyPayment = Keyboard.nextDouble();
		System.out.println("");
		
		//calculates months to pay off
		double monthsToPayOff = (Math.log(monthlyPayment)-Math.log(monthlyPayment-(annualInterestRate/1200.0)*principal)) / (Math.log((annualInterestRate/1200)+1));
		
		//calculates Total amount payed
		//Math.ceil is used to round the "monthsToPayOff" up to the nearest whole number
		double totalAmountPayed = (Math.ceil(monthsToPayOff)*monthlyPayment);
		
		//calculates over payment 
		double overPayment = (totalAmountPayed-(monthsToPayOff*monthlyPayment));
		double totalInterestPayed = (totalAmountPayed-principal);
		
		//Double values are rounded to 2 decimal places. 
		double totalAmountPayedRounded = (Math.round(totalAmountPayed*100))/ (100.00);
		double totalInterestPayedRounded = (Math.round(totalInterestPayed*100))/ (100.00);
		double overPaymentRounded = (Math.round(overPayment*100))/ (100.00);
		
		//displays info to user
		System.out.println("Months Needed to pay off:\t" +  (int) Math.ceil(monthsToPayOff));

		System.out.printf("Total Amount Paid:\t\t$%4.2f%n",totalAmountPayedRounded);
		System.out.printf("Total interest Paid:\t\t$%4.2f%n",totalInterestPayedRounded);
		System.out.printf("Overpayment:\t\t\t$%4.2f%n",overPaymentRounded);
		
	}

}
