/*
 * CSCI1301 27827
 * NetPay.java
 * Author:  Casey Wesolowski 
 * Submission Date:  February 4th, 2021
 *
 * Purpose: This code was written to compute a person's gross pay and 
 * net pay based on several deductions. 
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
		
		Scanner keyboard = new Scanner(System.in); //Only one use of Scanner
		
		System.out.print("Hours per Week: \t");
		int hoursPerWeek = keyboard.nextInt();
		
		//into doubles now
		double wage = 7.25; //$ per hour
		double grossPay = hoursPerWeek * wage;
		
		//Now starting tax percent deductions
		double federalTaxDeduction = (10.00 * grossPay) / 100;
		double stateTaxDeduction = (4.5 * grossPay) / 100;
		double socialSecurityTaxDeduction = (6.2 * grossPay) / 100;
		double medicareTaxDeduction = (1.45 * grossPay) / 100;
		
		//now net pay part
		double netPay = grossPay - (federalTaxDeduction + stateTaxDeduction + 
				socialSecurityTaxDeduction + medicareTaxDeduction);
		
		//Now we print!!
		System.out.println("Gross Pay: \t\t" + grossPay);
		System.out.println("Net Pay: \t\t" + netPay);
		System.out.println("");
		System.out.println("Deductions ");
		System.out.println("Federal: \t\t" + federalTaxDeduction);
		System.out.println("State: \t\t\t" + stateTaxDeduction);
		//\t used multiple times to make the output easier to read
		System.out.println("Social Security: \t" + socialSecurityTaxDeduction);
		System.out.println("Medicare: \t\t" + medicareTaxDeduction);
		
		keyboard.close(); //Forcibly ends the program
	}

}
