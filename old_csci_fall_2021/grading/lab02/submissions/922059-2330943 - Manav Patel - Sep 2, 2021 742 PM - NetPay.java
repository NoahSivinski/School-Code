/*
 * NetPay.java
 * Author:  Manav Patel  
 * Submission Date:  09/02/2021
 *
 * Purpose: This program asks the user to input the total hours they worked in a given week. From this data
 * the program will calculate the Gross Pay, as well as any deductions from Federal taxes, State taxes, 
 * Social Security, and Medicare. Using this, the program will calculate and output the user's Net Pay. 
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
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner;

public class NetPay {


	public static void main(String[] args) {

		//Asks user for hours worked
		int hoursWorked; 
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours Per Week: " + "\t");
		hoursWorked = keyboard.nextInt(); 
		keyboard.close(); 

		//Declares constants in decimal form 
		double FEDERAL_TAX_PERCENT = 10.00/100;
		double STATE_TAX_PERCENT = 4.5/100;
		double SS_PERCENT = 6.2/100; 
		double MEDICARE_PERCENT = 1.45/100; 
		double PAY_PER_HOUR = 7.25;  

		//Calculations for amount paid in gross pay, net pay, and taxes.
		double grossPay = hoursWorked * PAY_PER_HOUR;
		double federalTax = FEDERAL_TAX_PERCENT * grossPay;
		double stateTax = STATE_TAX_PERCENT * grossPay; 
		double sSTax = SS_PERCENT * grossPay; 
		double medicareTax = MEDICARE_PERCENT * grossPay; 
		double netPay = grossPay - (federalTax + stateTax + sSTax + medicareTax);

		//Prints the Net and Gross pay, as well as any deductions from taxes
		System.out.println("Gross Pay: " + "\t" + "\t" + grossPay);	
		System.out.println("Net Pay: " + "\t" + "\t" + netPay);
		System.out.println("\n" + "Deductions");
		System.out.println("Federal: " + "\t" + "\t" + federalTax);
		System.out.println("State: " + "\t" + "\t" + "\t" + stateTax);
		System.out.println("Social Security: " + "\t" + sSTax); 
		System.out.println("Medicare: " + "\t" + "\t" + medicareTax);
	}

}
