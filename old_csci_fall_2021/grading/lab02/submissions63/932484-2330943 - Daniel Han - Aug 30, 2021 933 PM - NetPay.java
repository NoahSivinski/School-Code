 /*
 * [NetPay].java
 * Author:  [Daniel Han] 
 * Submission Date:  [8/30/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program is meant to receive in the input int (or double) of how many hours someone worked. Then it will compute various double values such as grosspay or deductions using the several final values given.
 * The program will calculate the values of gross pay, net pay, federal tax, state tax, social security tax, and medicare tax. Then the program
 * will output those values as a series of print statements and will 
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


import java.util.*;
public class NetPay {
	public static void main(String[] args) {
		// this is the created scanner object named keyboard
		Scanner keyboard = new Scanner(System.in);

		//these are the series of final double variables we were given to help calculate federalTax, stateTax, socialSecurity, grossPay, and medicare
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;

		//this is where I initialized all the variables like the # of hours worked, the grosspay, netpay, federal tax, state tax, social securit tax, and the medicare tax
		int hours; double grossPay; double netPay; double federalTax; double stateTax; double socialSecurity; double medicare;

		//this code is meant to ask the user for the int number of hours the employee has worked on
		System.out.print("Hours per Week:\t\t");
		hours = keyboard.nextInt();

		 /*using the number of hours received, we can start to compute all the other double variables
		 * I calculated grossPay by multiplying hours * pay per hour and found all the deductions
		 * by by dividing grossPay
		 */
		grossPay = hours * PAY_PER_HOUR;
		federalTax = grossPay * (FEDERAL_TAX_PERCENT / 100);
		stateTax = grossPay * (STATE_TAX_PERCENT / 100);
		socialSecurity = grossPay * (SS_PERCENT / 100);
		medicare = grossPay * (MEDICARE_PERCENT / 100);

		//we can finally compute the net pay after we have all of our deductions calculated by subtracting all the deductions from the grossPay
		netPay = grossPay - federalTax - stateTax - socialSecurity - medicare;


		//this is the line of print statements and the output line
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federalTax);
		System.out.println("State: \t\t\t" + stateTax);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);


		/* I got an error about my keyboard not being closed. I searched on the 
		 * Java 11 Scanner Object API and found the keyboard.close() method that closed the 
		 * keyboard scanner object and removed the error.
		 */
		keyboard.close();
	}
}
