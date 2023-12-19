/*
 * NetPay.java
 * Author:  James Breathnach 
 * Submission Date:  [9/8/2021]
 *
 * Purpose: The purpose of this program is to determine the amount of money made based upon the number of hours worked (imputed by the user).
 *It calculates both the amount made before tax and amount made after tax. In addition, it shows the amount of money lost to a specific tax.
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

import java.util.Scanner; // Scanner has been imported and will be later used on line 40-41

public class NetPay {


	public static void main(String[] args) {

		//Lines 33-37 contain the double values for all the constants given on the lab sheet.
		Double FEDERAL_TAX_PERCENT = 10.00; 
		Double STATE_TAX_PERCENT = 4.5;
		Double SS_PERCENT = 6.2;
		Double MEDICARE_PERCENT = 1.45;
		Double PAY_PER_HOUR = 7.25;

		// Scanner is used to detect the hours per week input.
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:		" );   //print statement is here to match with the I/O.
		int hoursPerWeek= keyboard.nextInt();

		/* In lines 50-55, the value for hours per week is plugged into the first equation to become gross pay and
		 * and gross pay is multiplied by each of the previously defined constants (turned into percentages) which
		 * gets the new doubles (nameOfTaxAmount) 
		 * These get added together at the end and subtracted from gross play to get net pay.
		 */

		Double grossPay = hoursPerWeek * PAY_PER_HOUR;
		Double federalTaxAmount = grossPay * (FEDERAL_TAX_PERCENT/100);
		Double stateTaxAmount = grossPay * (STATE_TAX_PERCENT/100);
		Double ssAmount = grossPay * (SS_PERCENT/100);
		Double medicareAmount = grossPay * (MEDICARE_PERCENT/100);
		Double netPay= grossPay - (federalTaxAmount + stateTaxAmount + ssAmount + medicareAmount);

		/* The lines 61-68 display the values of the gross and net pay as well as the cost of the taxes. 
		 * It is displayed as instructed in the lab sheet.
		 */

		System.out.println("Gross Pay:		" + grossPay);
		System.out.println("Net Pay:		" + netPay);
		System.out.println(" ");
		System.out.println("Deductions");
		System.out.println("Federal:		" +	federalTaxAmount);
		System.out.println("State:			" + stateTaxAmount);
		System.out.println("Social Security:	" + ssAmount );
		System.out.println("Medicare:		" + medicareAmount);

	}

}
