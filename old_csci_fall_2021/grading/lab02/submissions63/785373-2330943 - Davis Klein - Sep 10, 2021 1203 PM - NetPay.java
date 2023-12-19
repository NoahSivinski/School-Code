/*
 * [NetPay].java
 * Author:  [Davis Klein] 
 * Submission Date:  [9/10/2021]
 *
 * Purpose: This program calculates the net pay of a user based on a user input of number of hours worked. 
 * The net pay is calculated by subtracting tax deductions (federal & state income, medicare, and social security)
 * from the gross pay. The output displayed to the screen shows all information aforementioned. 
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
		
		//declaring and initializing given variables
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		//declaring all necessary variables
		double grossPay, netPay, federalD, stateD, socialSecurity, medicare, totalDeductions;
		
		//create scanner object and read an int input from the user
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:\t\t");
		int hoursPerWeek = keyboard.nextInt();
		
		//calculations, first for gross pay then deductions, then net pay
		grossPay = PAY_PER_HOUR * hoursPerWeek;
		federalD = grossPay * (FEDERAL_TAX_PERCENT * .01);
		stateD = grossPay * (STATE_TAX_PERCENT * .01);
		socialSecurity = grossPay * (SS_PERCENT * .01);
		medicare = grossPay * (MEDICARE_PERCENT * .01);
		totalDeductions = federalD + stateD + socialSecurity + medicare;
		netPay = grossPay - totalDeductions;
		
		//printing necessary results to the screen
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federalD);
		System.out.println("State:\t\t\t" + stateD);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);
		
		//close the scanner
		keyboard.close();
	}

}
