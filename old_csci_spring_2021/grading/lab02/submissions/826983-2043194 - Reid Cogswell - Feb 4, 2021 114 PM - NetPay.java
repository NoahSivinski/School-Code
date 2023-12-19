/*
 * NetPay.java
 * Author:  Reid Cogswell
 * Submission Date:  2-4-20201
 *  
 * Purpose: The purpose of this code is to calculate gross pay. net pay, and 
 * all of the deductions when the users inputs the number of hours that they 
 * work per week. This done by taking all of the constant variables given to
 * us in the lab document and then figuring out how to properly apply them 
 * to get the desired results after an input is given.
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
		
		int hoursWorked; 
		
		double FEDERAL_TAX_PERCENT = 10.00;
		
		double STATE_TAX_PERCENT = 4.5;
		
		double SS_PERCENT = 6.2;
		
		double MEDICARE_PERCENT = 1.45;
		
		double PAY_PER_HOUR = 7.25;
		
		double percentage = .01;
		
		System.out.print("Hours per Week: \t");
		
		Scanner keyboard = new Scanner(System.in);
		
		hoursWorked = keyboard.nextInt();
		
		double grossPay = hoursWorked*PAY_PER_HOUR;
		
		double federal = grossPay*FEDERAL_TAX_PERCENT*percentage;
		
		double state = grossPay*STATE_TAX_PERCENT*percentage;
		
		double social = grossPay*SS_PERCENT*percentage;
		
		double medicare = grossPay*MEDICARE_PERCENT*percentage;
		
		double netPay = grossPay-federal-state-social-medicare;
		
		System.out.println("Gross Pay:\t\t" + grossPay);
		
		System.out.println("Net Pay:\t\t" + netPay);
		
		System.out.println();
		
		System.out.println("Deductions");
		
		System.out.println("Federal:\t\t" + federal);
		
		System.out.println("State:\t\t\t" + state);
		
		System.out.println("Social Security:\t" + social);
		
		System.out.println("Medicare: \t\t" + medicare);
		
		keyboard.close();
					

	}

}
