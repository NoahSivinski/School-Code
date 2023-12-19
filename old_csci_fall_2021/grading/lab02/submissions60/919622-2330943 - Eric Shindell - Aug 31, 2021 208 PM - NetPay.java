/*
 * NetPay.java
 * Author:  Eric Shindell 
 * Submission Date:  8/31/21
 *
 * Purpose: This program takes someone's hours per week, for example,
 * 40 hours per week, and then calculates the near exact Gross Pay by
 * multiplying the Hours Per Week by the constant, PAY_PER_HOUR. It then
 * calculates each of the deductions based on the percentage tax of that
 * Gross Pay, finally getting the Net Pay by subtracting the total deductions
 * from the Gross Pay. 
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

		//constants; Given within the assignment
		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;

		//Scanner; Takes the input of the user for hours per week, something that will be used for all calculations
		int Hours_Per_Week;
		System.out.print("Hours per Week: \t");
		Scanner input = new Scanner(System.in);
		Hours_Per_Week = input.nextInt();

		//Gross Pay Calculation using input and constant
		double Gross_Pay = Hours_Per_Week * PAY_PER_HOUR;

		//Deductions; Calculating each of the taxes based on Gross_Pay and constants
		double Federal = Gross_Pay*(FEDERAL_TAX_PERCENT/100);
		double State = Gross_Pay*(STATE_TAX_PERCENT/100);
		double Social_Security = Gross_Pay*(SS_PERCENT/100);
		double Medicare = Gross_Pay*(MEDICARE_PERCENT/100);

		//Adding up all the Deductions
		double Total_Deductions = Medicare + Social_Security + State + Federal;

		//Net Pay; Subtracting deductions from gross pay to get the exact net pay.
		double Net_Pay = Gross_Pay - Total_Deductions;

		//output; Showing the results of the calculations to the user.
		System.out.println("Gross Pay: \t \t" + Gross_Pay);
		System.out.println("Net Pay: \t \t" + Net_Pay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal: \t \t" + Federal);
		System.out.println("State: \t \t \t" + State);
		System.out.println("Social Security: \t" + Social_Security);
		System.out.println("Medicare: \t \t" + Medicare);
	}
}
