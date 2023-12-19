
import java.util.Scanner;

/*
 * NetPay.java
 * Author:  Lindsey Lee 
 * Submission Date:  02/05/2021
 *
 * Purpose: The purpose of this program is to compute an 
 * individual's gross and net pay based on the number of hours 
 * worked, pay rate, and deductions (such as federal and state taxes). 
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

public class NetPay {

	public static final double FEDERAL_TAX_PERCENT = 0.1;
	public static final double STATE_TAX_PERCENT = 0.045;
	public static final double SS_PERCENT = 0.062;
	public static final double MEDICARE_PERCENT = 0.0145;
	public static final double PAY_PER_HOUR = 7.25;

	public static void main(String[] args) {

		int hoursPerWeek;
		double grossPay;
		double federalTax;
		double stateTax;
		double socialSecurity;
		double medicare;
		double netPay; 

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:\t\t");
		hoursPerWeek = keyboard.nextInt();
		keyboard.close();

		grossPay = hoursPerWeek * PAY_PER_HOUR; 
		federalTax = FEDERAL_TAX_PERCENT * grossPay;
		stateTax = STATE_TAX_PERCENT * grossPay;
		socialSecurity = SS_PERCENT * grossPay;
		medicare = MEDICARE_PERCENT * grossPay;
		netPay = grossPay - federalTax - stateTax - socialSecurity - medicare;

		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println("\nDeductions");
		System.out.println("Federal:\t\t" + federalTax);
		System.out.println("State:\t\t\t" + stateTax);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);

	}

}
