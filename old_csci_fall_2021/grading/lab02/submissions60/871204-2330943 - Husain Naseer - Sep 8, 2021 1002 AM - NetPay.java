/*
 * NetPay.java
 * Author:  Husain Naseer 
 * Submission Date:  09/08/2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * In this code we used java to find the a person's netpay and grosspay based on their hours worked,
 * hourly wage and how much they pay in deductions. 
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

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:\t ");
		int hoursperweek = keyboard.nextInt();
		keyboard.close();

		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;

		double grosspay = hoursperweek * PAY_PER_HOUR;
		double federal = grosspay * (FEDERAL_TAX_PERCENT / 100);
		double state = grosspay * (STATE_TAX_PERCENT / 100);
		double socialsecurity = grosspay * (SS_PERCENT / 100);
		double medicare = grosspay * (MEDICARE_PERCENT / 100);
		double netpay = grosspay - (federal + state + socialsecurity + medicare);

		System.out.println("Gross Pay:\t " + grosspay);
		System.out.println("Net Pay:\t " + netpay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal:\t " + federal);
		System.out.println("State:	\t " + state);
		System.out.println("Social Security: " + socialsecurity);
		System.out.println("Medicare:\t " + medicare);
	}

}
