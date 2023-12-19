/*
 * CSCI1301.java
 * Author:  Justin Jackson 
 * Submission Date:  2/4/2021
 *
 * Purpose: Accepts user input for hours worked and computes the net earnings and deductions
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
		double hours, grossPay, netPay, dedFederal, dedState, dedSS, dedMedicare, pay_per_hour, federal_tax_percent, ss_percent, state_tax_percent, medicare_percent;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week: \t");
		hours = keyboard.nextInt();
		
		//Gets input from user
		
		pay_per_hour = 7.25;
		grossPay =hours * pay_per_hour;
		federal_tax_percent = 10;
		ss_percent = 6.2;
		state_tax_percent = 4.5;
		medicare_percent = 1.45;
		dedFederal = grossPay * (federal_tax_percent/100);
		dedState = grossPay * (state_tax_percent/100);
		dedSS = grossPay * (ss_percent/100);
		dedMedicare = grossPay * (medicare_percent/100);
		netPay = grossPay - (dedFederal + dedState + dedSS + dedMedicare);
		
			//Variables
		
		System.out.println("Gross Pay: \t \t" + grossPay);
		System.out.println("Net Pay: \t \t" + netPay);
		System.out.println(" ");
		System.out.println("Deductions");
		System.out.println("Federal: \t \t" + dedFederal);
		System.out.println("State: \t \t \t" + dedState);
		System.out.println("Social Security: \t" + dedSS);
		System.out.println("Medicare: \t \t" + dedMedicare); 
		
		//Outputs calculation
		
	}

}
