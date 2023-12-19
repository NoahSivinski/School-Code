/*
 * NetPay.java
 * Author:  Quinton Heald 
 * Submission Date:  2-5-2021
 *
 * Purpose: This program takes user inputed hours per week and uses the 
 * provided number to determine a gross pay by multiplying the 
 * hours per week by the constant PAY_PER_HOUR. This calculated gross pay is also
 * used for the constants of federal tax, state tax, social security, and
 * medicare. The percentages of the constants are multiplied with the gross pay,
 * and then their total is subtracted from the gross pay number; this results in a calculated net pay.
 * When given the output, the user is shown their inputed hours per week,
 * gross pay, and total net pay; in addition to this, they are shown
 * how much each tax constant deducted from their total gross pay.
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
	
	//declares tax and percentage constants 
	public static final double FEDERAL_TAX_PERCENT = .1;
	public static final double STATE_TAX_PERCENT = .045;
	public static final double SS_PERCENT = .062;
	public static final double MEDICARE_PERCENT = .0145;
	public static final double PAY_PER_HOUR = 7.25;
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner (System.in);
	
		System.out.print("Hours per Week:\t\t");
		
		int hoursPerWeek = input.nextInt();
		
		//calculates gross pay
		double grossPay = PAY_PER_HOUR * hoursPerWeek;
		
		//calculates totals given in the deductions output by multiplying gross pay by constants
		double fedTot = FEDERAL_TAX_PERCENT * grossPay;
		double stateTot = STATE_TAX_PERCENT * grossPay;
		double socialTot = SS_PERCENT * grossPay;
		double medTot = MEDICARE_PERCENT * grossPay;
		
		//subtracts the totals from the gross pay to provide the total net pay
		double netPay = grossPay - fedTot - stateTot - socialTot - medTot;
		
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + fedTot);
		System.out.println("State:\t\t\t" + stateTot);
		System.out.println("Social Security:\t" + socialTot);
		System.out.println("Medicare:\t\t" + medTot);
		
		input.close();
		
	}
	

}
