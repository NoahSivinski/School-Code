/*
 * NetPay.java
 * Author:  Alice Szymkiewicz 
 * Submission Date:  2/5/2021
 *
 * Purpose: 
 * 
 * This program calculates the user's weekly gross pay and net pay using 
 * constant variable values and user input for hours worked per week. 
 * The program has federal tax percent, state tax percent, Social Security percent, 
 * Medicare percent, and pay per hour set as constant values. When the program runs, 
 * the Scanner allows the user to input the number of hours per week. 
 * The program runs calculations for gross pay, federal tax, state tax, 
 * Social Security, Medicare, and net pay based on the number of hours 
 * while using the constant variables declared initially. 
 * These calculations are printed out in a list for the user to view, 
 * which shows the gross and net pay first and the deductions made to the user's income. 
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

public class NetPay {

	public static void main(String[] args) {

		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;

		int HOURS_PER_WEEK;
		Scanner input = new Scanner(System.in);
		System.out.print("Hours per Week:\t\t");
		HOURS_PER_WEEK = input.nextInt();

		double GROSS_PAY = HOURS_PER_WEEK * PAY_PER_HOUR; // calculates gross based on user's input
		double FED_TAX = (GROSS_PAY * FEDERAL_TAX_PERCENT) / 100;
		double STATE_TAX = (GROSS_PAY * STATE_TAX_PERCENT) / 100;
		double SOCIAL = (GROSS_PAY * SS_PERCENT) / 100;
		double MEDICARE = (GROSS_PAY * MEDICARE_PERCENT) / 100;
		double NET_PAY = (GROSS_PAY - (FED_TAX + STATE_TAX + SOCIAL + MEDICARE)); // calculates net pay by subtracting
																					// deductions from gross pay

		System.out.println("Gross Pay:\t\t" + GROSS_PAY + "\nNet Pay:\t\t" + NET_PAY + "\n" + "\nDeductions"
				+ "\nFederal:\t\t" + FED_TAX + "\nState:\t\t\t" + STATE_TAX + "\nSocial Security:\t" + SOCIAL
				+ "\nMedicare:\t\t" + MEDICARE);

		input.close();

	}

}
