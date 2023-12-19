/*
 * NetPay.java
 * Author:  Anh Ho
 * Submission Date: 8/31/2021
 *
 * Purpose: Program accepts user's input of hour worked and using that to calculate the gross pay, net pay, and deductions such as social security, medicare, federal and state taxes.
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
		
		//declare constant
		final double FED_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;

		//getting input
		Scanner keyboard = new Scanner(System.in);						//create a scanner object
		System.out.print("Hours per Week:\t\t\t");						//request user input
		int workHour = keyboard.nextInt();								//read user input

		//calculation
		double grossPay = PAY_PER_HOUR*workHour;						//calculate gross pay
		double fedTax = grossPay*FED_TAX_PERCENT/100;					//calculate fed tax
		double stateTax = grossPay*STATE_TAX_PERCENT/100;				//calculate state tax
		double ss = grossPay*SS_PERCENT/100;							//caclulate social security
		double medicare = grossPay*MEDICARE_PERCENT/100;				//calculate medicare
		double deduction = fedTax + stateTax + ss + medicare;			//calculate total deduction
		double netPay = grossPay - deduction;							//calculate net pay

		//output			
		System.out.println("Gross Pay:\t\t\t" + grossPay);	
		System.out.println("Net Pay:\t\t\t" + netPay);	
		System.out.println("\nDeductions");	
		System.out.println("Federal:\t\t\t" + fedTax);	
		System.out.println("State:\t\t\t\t" + stateTax);	
		System.out.println("Social Security:\t\t" + ss);
		System.out.println("Medicare:\t\t\t" + medicare);
	}

}
