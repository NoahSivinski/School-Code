/*
 	* NetPay.java
 	* Author:  Austin Debrody
 	* Submission Date:  August 30th, 2021
 	*
 	* Purpose: A brief paragraph description of the
	* program. What does it do?
	* 	This program takes an input of a user's number of hours 
	* 	worked and uses those number of hours to compute their 
	*   gross and net pay. The net pay is calculated by finding the 
	*   deductions taken from the original gross pay. These deductions 
	*   follow a constant percentage value, so each deduction (Federal 
	*   tax, State tax, Social Security tax, and Medicare tax) can be 
	*   calculated easily and separately. The program then outputs all of these values, 
	*   both gross and net pay, as well as all of the deductions. 
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
		Scanner scan = new Scanner(System.in);
		
		//constants
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		//variables
		int hours;
		double grossPay;
		double netPay;
		
		//deductions
		double federal;
		double state;
		double socialSecurity;
		double medicare;
		double totalDeductions;
		
		//input
		System.out.print("Hours per Week: \t");
		hours = scan.nextInt();
		
		//calculations
		grossPay = hours * PAY_PER_HOUR;
		federal = grossPay * (FEDERAL_TAX_PERCENT / 100);
		state = grossPay * (STATE_TAX_PERCENT / 100);
		socialSecurity = grossPay * (SS_PERCENT / 100);
		medicare = grossPay * (MEDICARE_PERCENT / 100);
		totalDeductions = federal + state + socialSecurity + medicare;
		
		netPay = grossPay - totalDeductions;
		
		//output
		System.out.println("Gross Pay: \t \t" + grossPay);
		System.out.println("Net Pay: \t \t" + netPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal: \t \t" + federal);
		System.out.println("State: \t \t \t" + state);
		System.out.println("Social Security: \t" + socialSecurity);
		System.out.println("Medicare: \t \t" + medicare);
		

	}

}

