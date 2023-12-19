/*
 * NetPay.java
 * Author:  Anvita Shreya Nagireddi
 * Submission Date: February 4, 2021
 *
 * Purpose: to compute a person’s gross and net pay based
	on their hourly wage, hours worked, and several withholdings.
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
		
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		System.out.print("Hours per Week:" + "\t\t");	
		Scanner scan = new Scanner (System.in);
		double hour = scan.nextInt();
		
		double gross = hour * PAY_PER_HOUR;
		double fed= gross * (FEDERAL_TAX_PERCENT/100);
		double state = gross * (STATE_TAX_PERCENT/100);
		double social = gross * (SS_PERCENT/100);
		double medi = gross * (MEDICARE_PERCENT/100);
		double net = gross-fed-state-social-medi;		
		
		System.out.println("Gross Pay:" + "\t\t" + gross);
		System.out.println("Net Pay:" + "\t\t" + net);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal:" + "\t\t" + fed);
		System.out.println("State:" + "\t\t\t" + state);
		System.out.println("Social Security:" + "\t" + social);
		System.out.println("Medicare:" + "\t\t" + medi);
		

	}

}
