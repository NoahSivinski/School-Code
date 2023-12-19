/*
 * NetPay.java
 * Author:  Matthew Hargrove 
 * Submission Date:  Feb. 5 2021
 *
 * Purpose: This program uses your hours worked weekly to calculate Gross Pay as well as the required tax deductions to ultimate find Net Pay
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

/**
 * 
 */

/**
 * @author mjhar
 *
 */
public class NetPay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final double FEDERAL_TAX_PERCENT=.1;
		final double STATE_TAX_PERCENT=.045;
		final double SS_PERCENT=.062;
		final double MEDICARE_PERCENT=.0145;
		final double PAY_PER_HOUR=7.25;
		Scanner keyboard=new Scanner(System.in);
	
		System.out.print("Hours Per Week:\t\t");
		int hoursPerWeek=keyboard.nextInt();
		double grossPay=hoursPerWeek*PAY_PER_HOUR;
		System.out.println("Gross Pay:\t\t"+grossPay);
		double netPay=grossPay-(grossPay*FEDERAL_TAX_PERCENT)-(grossPay*STATE_TAX_PERCENT)-(grossPay*SS_PERCENT)-(grossPay*MEDICARE_PERCENT);
		System.out.println("Net Pay:\t\t"+netPay);
		
		System.out.println("\nDeductions");
		double federal=grossPay*FEDERAL_TAX_PERCENT;
		System.out.println("Federal:\t\t"+federal);
		double state=grossPay*STATE_TAX_PERCENT;
		System.out.println("State:\t\t\t"+state);
		double socialSecurity=grossPay*SS_PERCENT;
		System.out.println("Social Security:\t"+socialSecurity);
		double medicare=grossPay*MEDICARE_PERCENT;
		System.out.println("Medicare:\t\t"+medicare);
		
		
		

	}

}
