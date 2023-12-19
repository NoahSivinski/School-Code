
/*
 * NetPay.java
 * Author:  Darren Thammavong
 * Submission Date:  Friday, September 10th, 2021, at 5:00 PM
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * This program takes the user's hours per week and calculates the user's
 * gross pay, net pay, and all the deductions - including federal, state,
 * social security, and medicare.
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

	//These are the constants that will aid in calculating the gross pay and
	//all the deductions - federal, state, social security, and medicare.
	public static final double FEDERAL_TAX_PERCENT = 10.00;
	public static final double STATE_TAX_PERCENT = 4.5;
	public static final double SS_PERCENT = 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25;

	public static void main(String[] args) {

		//Creating a Scanner object
		Scanner keyboard = new Scanner(System.in);

		//The user will input an integer for their hours per week.
		System.out.print("Hours per Week:\t\t");
		int hoursPerWeek = keyboard.nextInt();

		//These are the double variables that calculates gross pay, net pay,
		//and all the deduction - federal, state, social security, and medicare.
		double grossPay = (hoursPerWeek * PAY_PER_HOUR);
		double federal = (grossPay * (FEDERAL_TAX_PERCENT / 100));
		double state = (grossPay * (STATE_TAX_PERCENT / 100));
		double socialSecurity = (grossPay * (SS_PERCENT / 100));
		double medicare = (grossPay * (MEDICARE_PERCENT / 100));
		double netPay = grossPay - (federal + state + socialSecurity + medicare);

		//These lines of code print out the rest of the information - such as 
		//gross pay, net pay, and all the deductions - federal, state,
		//social security, and medicare.
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federal);
		System.out.println("State:\t\t\t" + state);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);

		keyboard.close();

	}

}
