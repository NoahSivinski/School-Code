package exercise1;
/* 
 * NetPay.java
 * Author: Angel Cyrus
 * Submission Date: February 5, 2021
 * 
 * Purpose: Cresting a program which computes a person's
 * gross and net pay based on their hourly wage, hours worked,
 * and several witholdings.
 * 
 * Statement of Academic Honesty
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
 * 
 * I agree
 */

import java.util.Scanner;
public class NetPay {
	/**
	 * @param args
	 */	
	
	//public static void main(String[] args) {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
			final double FEDERAL_TAX_PERCENT= 10.00;
			final double STATE_TAX_PERCENT= 4.5;
			final double SS_PERCENT= 6.2;
			final double MEDICARE_PERCENT= 1.45;
			final double PAY_PER_HOUR= 7.25;
			
			double HoursWorked= 40;
			double GrossPay= (HoursWorked*PAY_PER_HOUR);
			double FederalTax= GrossPay* (FEDERAL_TAX_PERCENT/100);
			double StateTax= GrossPay* (STATE_TAX_PERCENT/100);
			double SS= GrossPay* (SS_PERCENT/100);
			double Medicare= GrossPay* (MEDICARE_PERCENT/100);
			double Netpay= GrossPay- (FederalTax+StateTax+SS+Medicare);
			
			System.out.println("Hours Per Week: \t"+ HoursWorked);
			System.out.println("Gross Pay: \t\t"+ GrossPay);
			System.out.println("Net Pay: \t\t" + Netpay);
			
			System.out.println("");
		
			System.out.println("Deductions");
			System.out.println("Federal: \t\t" + FederalTax);
			System.out.println("State: \t\t\t" + StateTax);
			System.out.println("Social Security: \t" + SS);
			System.out.println("Medicare: \t\t" + Medicare);

	}

}
