/*
 * NetPay.java
 * Author:  Alexis Leath
 * Submission Date:  September 3rd 2021
 *
 * Purpose: This program takes input from the user and calculates the gross pay,net pay and the deductions 
 * based on the number of hours worked (inputed by the user).
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
	public static final double FEDERAL_TAX_PERCENT=0.1;
	public static final double STATE_TAX_PERCENT=0.045;
	public static final double SS_PERCENT=0.062;
	public static final double MEDICARE_PERCENT=0.0145;
	public static final double PAY_PER_HOUR=7.25;



	public static void main(String[] args) {
		int hoursPerWeek;
		double netPay;
		double grossPay;
		double federal;
		double state;
		double socialSecurity;
		double medicare;
		double deductions;
		
		Scanner keyboard= new Scanner(System.in);

		System.out.print("Hours Per Week:\t\t ");
		hoursPerWeek = keyboard.nextInt();

		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federal = grossPay * FEDERAL_TAX_PERCENT;
		state = grossPay * STATE_TAX_PERCENT;
		socialSecurity = grossPay * SS_PERCENT;
		medicare = grossPay * MEDICARE_PERCENT;
		deductions = federal + state + socialSecurity + medicare;
		netPay = grossPay - deductions;
		

		System.out.print("Gross Pay:\t\t " + grossPay);
		System.out.println();
		System.out.print("Ney Pay:\t\t " + netPay);
		System.out.println();
		System.out.println();
		System.out.println("Deductions ");
		System.out.print("Federal:\t\t " + federal);
		System.out.println();
		System.out.print("State:\t\t\t " + state);
		System.out.println();
		System.out.print("Social Security:\t " + socialSecurity);
		System.out.println();
		System.out.print("Medicare:\t\t " + medicare);
		
		keyboard.close();
		
	} // main
} //NetPay
