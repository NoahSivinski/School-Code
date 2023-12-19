/*
 * netPay.java
 * Author:  Trent Jones
 * Submission Date:  9 September 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
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

		System.out.print("Hours per Week: \t");
		Scanner hours = new Scanner(System.in);
		int hoursPerWeek = hours.nextInt();
		
		double grossPay = hoursPerWeek * 7.25;
		
		double fedTax = grossPay * .10;
		double stateTax = grossPay * .045;
		double socialSecurity = grossPay * .062;
		double medicareTax = grossPay * .0145;
		double netPay = grossPay - fedTax - stateTax - socialSecurity - medicareTax;
		
		System.out.println("Gross Pay:      \t" + grossPay); 
		System.out.println("Net Pay:        \t" + netPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal:        \t" + fedTax);
		System.out.println("State:          \t" + stateTax);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:       \t" + medicareTax);
		
	}

}