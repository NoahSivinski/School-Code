/*
 * NetPay.java
 * Author:  Jarvis Williams
 * Submission Date:  2/4/2021
 *
 * Purpose: The purpose of this program is to calculate the amount of money (Net Pay),
 *  generated by a given user inputed hours worked per week.
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
		//initialize the scanner
		Scanner input = new Scanner(System.in);
		
		//User input hours per week
		System.out.print("Hours per Week: \t");
		double hoursPerWeek = input.nextDouble();
		
		//Calculation of deduction (In dollars)
		double grossPay = hoursPerWeek * 7.25;
		double Federal = ((grossPay * 10) / 100);
		double stateTax = ((grossPay * 4.5) / 100);
		double socialSecurity = ((grossPay * 6.2) / 100);
		double medicare = ((grossPay * 1.45) / 100);
		double deductions = (Federal + stateTax + socialSecurity + medicare );
		double netPay = (grossPay - deductions );
		
		//Text output for user display
		System.out.println("Gross Pay: \t\t" + grossPay);
		System.out.println("Net Pay: \t\t" + netPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal: \t\t" + Federal );
		System.out.println("State: \t\t\t" + stateTax);
		System.out.println("Social Security: \t" + socialSecurity);
		System.out.println("Medicare: \t\t" + medicare);
		
		input.close();
		

	}

}
