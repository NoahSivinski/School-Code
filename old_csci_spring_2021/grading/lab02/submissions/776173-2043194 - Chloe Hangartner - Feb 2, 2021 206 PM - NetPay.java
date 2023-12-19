
/*
 * NetPay.java
 * Author:  Chloe Hangartner
 * Submission Date:  2/2/2021
 *
 * Purpose: The purpose of this lab to to compute a person's
 * gross and net pay based on their hourly wage, hours worked,
 * and several withholdings.
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

	//Establish Constants
	public static final double FEDERAL_TAX_PERCENT = 10.00;
	public static final double STATE_TAX_PERCENT = 4.5;
	public static final double SS_PERCENT = 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25;


	public static void main(String[] args) {

		//Establish Variables and Prompt User Input
		double hoursPerWeek, grossPay, netPay, federal, 
		state, socialSecurity, medicare;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week: \t");
		hoursPerWeek = keyboard.nextDouble();

		//Establish Equations for Computing Output
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federal = (grossPay / FEDERAL_TAX_PERCENT);
		state = (grossPay / 22.2222222);
		socialSecurity = (grossPay / 16.1290323);
		medicare = (grossPay / 68.9655172);
		netPay = (grossPay - (federal + state + socialSecurity + medicare));

		//Print Output
		System.out.println("Gross Pay:  \t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println("\nDeductions");
		System.out.println("Federal: \t\t" + federal);
		System.out.println("State:\t\t\t" + state);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare: \t\t" + medicare);

		keyboard.close();

	}

}
