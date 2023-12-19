/*
 * [NetPay].java
 * Author:  [Shovek Basu] 
 * Submission Date:  [2/5/2021]
 *
 * Purpose: This program is used to calculate ones Net Pay by the 
 * user inputting his/her hours worked within any given week. 
 * 
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
		Scanner keyboard = new Scanner (System.in);
		
		//initialized values from the "Implementation Details"
		double FEDERAL_TAX_PERCENT = 10;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;
		
		System.out.print("Hours per Week:\t\t");
		int hoursPerWeek = keyboard.nextInt();
		
		double grossPay = hoursPerWeek * PAY_PER_HOUR; 
		System.out.print("Gross Pay: \t\t" + grossPay);
		
		double federalDeduction = grossPay*FEDERAL_TAX_PERCENT/100;
		double stateDeduction = grossPay*STATE_TAX_PERCENT/100;
		double socialSecurityDeduction = grossPay*SS_PERCENT/100;
		double medicareDeduction = grossPay*MEDICARE_PERCENT/100;
		
		double netPay= grossPay - federalDeduction - stateDeduction - socialSecurityDeduction - medicareDeduction;
		
		System.out.print("\nNet Pay: \t\t" + netPay +"\n");
		
		System.out.println("\nDeductions");
	
		System.out.print("Federal: \t\t" + federalDeduction);
		System.out.print("\nState: \t\t\t" + stateDeduction);
		System.out.print("\nSocial Security: \t" + socialSecurityDeduction);
		System.out.print("\nMedicare: \t\t" + medicareDeduction);
		
		keyboard.close();
		
		
	}
}
