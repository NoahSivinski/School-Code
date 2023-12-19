/*
 * NetPay.java
 * Author:  Jacob Tate 
 * Submission Date:  Thursday, September 2nd, 2021
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * The purpose of the program is to calculate various tax 
 * deductions given a fixed wage and a user inputting the 
 * number of hours he/she worked this week. The user can input their hours because of 
 * the scanner named keyboard.
 * The PAY_PER_HOUR variable was defined in the problem stimulus, as well as the following:
 * FEDERAL_TAX_PERCENT, STATE_TAX_PERCENT, SS_PERCENT, MEDICARE_PERCENT, 
 * and PAY_PER_HOUR. The other variables are defined by me. I decided to place 
 * the deductions in variables because it would help me track down errors quicker. 
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

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Initializes scanner for user input for the number of hours.
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week: " + '\t');
		int HOURS_PER_WEEK = keyboard.nextInt();
		
		//Initializes variables found in project stimulus.
		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;
		double GROSS_PAY = (HOURS_PER_WEEK * PAY_PER_HOUR);
		
		//Initializes variables to take care of tax deductions.
		double FEDERAL_DEDUCTION = (GROSS_PAY* (FEDERAL_TAX_PERCENT/100));
		double STATE_DEDUCTION = (GROSS_PAY*(STATE_TAX_PERCENT/100));
		double SS_DEDUCTION = (GROSS_PAY* (SS_PERCENT/100));
		double MEDICARE_DEDUCTION = (GROSS_PAY*(MEDICARE_PERCENT/100));
		
		/*Calculates net pay by taking the gross pay variable, then subtracting 
		the tax deduction variables from the gross pay variable.
		*/ 
		double NET_PAY = GROSS_PAY - FEDERAL_DEDUCTION - STATE_DEDUCTION - SS_DEDUCTION - MEDICARE_DEDUCTION;
				
		
		//Prints out hours per week, gross pay, net pay, and all the necessary tax deductions. 
		System.out.println("Gross Pay: " + '\t' + '\t' + GROSS_PAY);
		System.out.println("Net Pay: " + '\t' + '\t' + NET_PAY + '\n');
		System.out.println("Deductions");
		System.out.println("Federal: " + '\t' + '\t' + FEDERAL_DEDUCTION);
		System.out.println("State: "+ '\t' + '\t' + '\t' + STATE_DEDUCTION);
		System.out.println("Social Security: " + '\t'+SS_DEDUCTION);
		System.out.println("Medicare: " + '\t'+ '\t' + MEDICARE_DEDUCTION);
	}

}
