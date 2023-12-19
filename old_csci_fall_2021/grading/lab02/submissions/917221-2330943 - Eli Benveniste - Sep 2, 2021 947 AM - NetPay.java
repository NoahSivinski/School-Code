/*
 * NetPay.java
 * Author:  Eli Benveniste 
 * Submission Date:  9/2/2021
 *
 * Purpose: 
 * The purpose of this program is to accept the amount of hours 
 * worked as input, then output the gross pay, net pay, and
 * deductions for federal/state/social security/medicare taxes, 
 * respectively, based on the input.
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
		/*
		 * ACCEPT # OF HOURS WORKED AS USER INPUT
		 */
		double hours;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:\t\t");
		hours = keyboard.nextInt();
		
		
		/*
		 * CONSTANTS
		 */
		double fedTax = 10.00;
		
		double stateTax = 4.5;
		
		double ss = 6.2;
		
		double medicare = 1.45;
		
		double payPerHour = 7.25;
		
		
		/*
		 * VARIABLES TO DISPLAY AS OUTPUT
		 */
		
		double grossPay, netPay, fedDecimal, stateDecimal, socialDecimal, medicareDecimal;
		
		
		
		
		/*
		 * Make all percentages into decimals so 
		 * they can be used mathematically:
		 */ 
		fedDecimal = (fedTax * .01);
		stateDecimal = (stateTax * .01);
		socialDecimal = (ss * .01);
		medicareDecimal = (medicare * .01);
	

		
		/*
		 * Compute grossPay
		 */
		grossPay = hours * payPerHour;
		
		
		/*
		 * Compute each deduction from grossPay
		 */
		double fedDeductions = grossPay * fedDecimal;
		double stateDeductions = grossPay * stateDecimal;
		double socialDeductions = grossPay * socialDecimal;
		double medicareDeductions = grossPay * medicareDecimal;
		
		/*
		 * Deduct all deductions from gross pay and save it as netPay
		 */
		netPay = grossPay - (fedDeductions + stateDeductions + socialDeductions + medicareDeductions);
		
		
		/*
		 * Print all output
		 */
		
		System.out.println("Gross Pay:\t\t" + (hours * payPerHour));
		System.out.println("Net Pay:\t\t" + netPay + "\n");

		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + fedDeductions);
		System.out.println("State:\t\t\t" + stateDeductions);
		System.out.println("Social Security:\t" + socialDeductions);
		System.out.println("Medicare:\t\t" + medicareDeductions);
		
		
	}
}
