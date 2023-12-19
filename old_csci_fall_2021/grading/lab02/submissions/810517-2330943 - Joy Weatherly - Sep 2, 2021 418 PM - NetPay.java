/*
 * NetPay.java
 * Author:  Joy Weatherly 
 * Submission Date:  September 2rd, 2021
 *
 * Purpose: This program is designed to calculate net pay by calculating gross pay and deducting from that a number of variables.
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
		double federalTaxPercent, stateTaxPercent, ssPercent, medicarePercent, payPerHour, hoursPerWeek, grossPay, netPay, deductions, federal, state, socialSecurity, medicare;
		federalTaxPercent = 10;
		stateTaxPercent = 4.5;
		ssPercent = 6.2;
		medicarePercent = 1.45;
		payPerHour = 7.25;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:\t\t");
		hoursPerWeek = keyboard.nextDouble();
		grossPay = hoursPerWeek * payPerHour;
		
		federal = (federalTaxPercent/100) * grossPay;
		state = (stateTaxPercent/100) * grossPay;
		socialSecurity = (ssPercent/100) * grossPay;
		medicare = (medicarePercent/100) *grossPay;
		
		deductions = federal + state + socialSecurity + medicare;
		
		netPay = grossPay - deductions;
		
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federal);
		System.out.println("State:\t\t\t" + state);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);
		
		keyboard.close();	

	}

}
