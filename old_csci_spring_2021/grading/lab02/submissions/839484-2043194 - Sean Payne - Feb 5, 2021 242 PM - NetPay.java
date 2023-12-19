
/*
 * NetPay.java
 * Author:  Sean Payne 
 * Submission Date:  02/05/21
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 		It computes a person's gross and net pay based on hourly wage.
 * It does this by first asking the user for hours worked. Then based on the
 * hours worked it can then calculate the net and gross pay with respect to 
 * taxes. It then outputs the information as a pay-stub for our user to see.
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

/* Imports the Scanner */
import java.util.Scanner;

public class NetPay {
	public static void main(String[] args) {

		/* Initializing the Scanner For User Input */
		Scanner keyboard = new Scanner(System.in);

		/*
		 * Initializing the User Response Variable Then Asking User To Input Hours Per
		 * Week To Calculate Pay Stub
		 */
		int HOURS_PER_WEEK;
		System.out.print("Hours per Week:\t\t");
		HOURS_PER_WEEK = keyboard.nextInt();
		keyboard.close();

		/*
		 * Initializing Variables Needed In Calculation Section. Note: Variables With
		 * AMOUNT Are For Calculating Total Amount of Money Taxed of the Gross Pay.
		 */
		double GROSS_PAY;
		double NET_PAY;
		double SS_AMOUNT;
		double FEDERAL_TAX_AMOUNT;
		double STATE_TAX_AMOUNT;
		double MEDICARE_AMOUNT;

		/* Declaring/Initializing Constants */
		double PAY_PER_HOUR = 7.25;
		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;

		/* Calculating the Values for Specific Variables */
		GROSS_PAY = HOURS_PER_WEEK * PAY_PER_HOUR;
		SS_AMOUNT = GROSS_PAY * (SS_PERCENT / 100.0);
		FEDERAL_TAX_AMOUNT = GROSS_PAY * (FEDERAL_TAX_PERCENT / 100.0);
		STATE_TAX_AMOUNT = GROSS_PAY * (STATE_TAX_PERCENT / 100.0);
		MEDICARE_AMOUNT = GROSS_PAY * (MEDICARE_PERCENT / 100.0);
		NET_PAY = GROSS_PAY - (FEDERAL_TAX_AMOUNT + STATE_TAX_AMOUNT + MEDICARE_AMOUNT + SS_AMOUNT);

		/* Outputting the The Pay Stub Based On HOURS_PER_WEEK */
		System.out.println("Gross Pay:\t\t" + GROSS_PAY);
		System.out.println("Net Pay:\t\t" + NET_PAY);
		System.out.println("");
		System.out.println("Deductions\t\t");
		System.out.println("Federal:\t\t" + FEDERAL_TAX_AMOUNT);
		System.out.println("State:\t\t\t" + STATE_TAX_AMOUNT);
		System.out.println("Social Security:\t" + SS_AMOUNT);
		System.out.println("Medicare:\t\t" + MEDICARE_AMOUNT);

	}
}