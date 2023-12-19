/*
 * NetPay.java
 * Author:  Everett Wayman 
 * Submission Date:  02/05/2021
 *
 * Purpose: This program computes a person's gross and net pay based on their 
 * hourly wage, hours worked, and several withholdings.
 *
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
		
		//Here I state and initialize my constants and variables as doubles.
		double grosspay;
		double netpay;
		double FEDERAL_TAX_PERCENT;
		double federaltotal;
		double STATE_TAX_PERCENT;
		double statetotal;
		double SS_PERCENT;
		double sstotal;
		double MEDICARE_PERCENT;
		double medicaretotal;
		double PAY_PER_HOUR;
		double deductions;
		
		// Here I call for scanner.
		Scanner keyboard = new Scanner(System.in);
		
		// This prompts the user to input their number of hours they worked.
		System.out.print("Hours per Week:\t\t");
		double hoursperweek = keyboard.nextDouble();

		/* This part is for stating what each constant equals.
		 * This includes the percent for each tax/deduction.
		 */
		FEDERAL_TAX_PERCENT=10.00;
		STATE_TAX_PERCENT=4.5;
		SS_PERCENT=6.2;
		MEDICARE_PERCENT=1.45;
		PAY_PER_HOUR=7.25;
		
		// These equations calculate the gross pay, net pay, and each deduction.
		grosspay = hoursperweek * PAY_PER_HOUR;
		
		federaltotal = grosspay / FEDERAL_TAX_PERCENT;
		
		statetotal = grosspay * (STATE_TAX_PERCENT / 100);
		
		sstotal = grosspay * (SS_PERCENT / 100);
		
		medicaretotal = grosspay * (MEDICARE_PERCENT / 100);
		
		deductions = federaltotal + statetotal + sstotal + medicaretotal;
		
		netpay = grosspay - deductions;
		
		/*This part prints out the calculations showing the use their gross and net pay
		 * based on the deductions calculated.
		 */
		System.out.println("Gross Pay:\t\t" + grosspay);
		
		System.out.println("Net Pay:\t\t" + netpay);
		
		System.out.println("");
		
		System.out.println("Deductions");
		
		System.out.println("Federal:\t\t" + federaltotal);
		
		System.out.println("State:\t\t\t" + statetotal);
	
		System.out.println("Social Security:\t" + sstotal);
		
		System.out.println("Medicare:\t\t" + medicaretotal);
		
		// Closes scanner.
		keyboard.close();
	}

}
