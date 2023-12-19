/*
 * NetPay.java
 * Author:  Asia Grant 
 * Submission Date: September 7th, 2021
 *
 * Purpose: This program was created to calculate the users net and gross pay based off of several factors including deductions 
 * such as federal taxes and social security. After completing exercise 2, The user will be able to input whatever hours per 
 * week they choose and the program will then be able to calculate the Federal taxes, State taxes, Social Security, and Medicare
 * funds that will be deducted from their specified gross pay.
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
	public static final double FEDERAL_TAX_PERCENT= 10.00;
	public static final double STATE_TAX_PERCENT= 4.5;
	public static final double SS_PERCENT= 6.2;
	public static final double MEDICARE_PERCENT= 1.45;
	public static final double PAY_PER_HOUR= 7.25;
	//These lines of code declare the constants used in this program
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		double hoursPerWeek;
		
		System.out.print("Hours per Week:\t\t");
		hoursPerWeek= keyboard.nextDouble();
		// these lines of code will allow the user to input how many hours they worked in a week
		double grossPay = hoursPerWeek *PAY_PER_HOUR;
		double federal = (grossPay*FEDERAL_TAX_PERCENT)/100;
		double state = (grossPay*STATE_TAX_PERCENT)/100;
		double socialSecurity= (grossPay*SS_PERCENT)/100;
		double medicare=(grossPay* MEDICARE_PERCENT)/100;
		double netPay= grossPay-(federal+ state+ socialSecurity+ medicare);
		// these lines of code assign the variables used in this program to their specific values
		System.out.println("Gross Pay:\t\t"+ grossPay);
		System.out.println("Net Pay:\t\t"+ netPay );
		
		System.out.println(" ");
		System.out.println("Deductions");
		System.out.println("Federal:\t\t"+ federal);
		System.out.println("State:\t\t\t"+ state);
		System.out.println("Social Security:\t"+ socialSecurity);
		System.out.println("Medicare:\t\t"+ medicare);
		//These lines of code print out the variables and their associated names on different lines
		//after the reader inputs the amount of hours they worked during the week
		keyboard.close();
	}
}

	
