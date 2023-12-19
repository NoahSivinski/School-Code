/*
 * NetPay.java
 * Author:  Raegan Girdley
 * Submission Date:  8/30/2021
 *
 * Purpose: Computes a person's gross and net pay based on their hourly wage, hours worked, and several withholdings.
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
		//variables
		double FEDERAL_TAX_PERCENT = 10.00, STATE_TAX_PERCENT = 4.5, SS_PERCENT = 6.2, MEDICARE_PERCENT = 1.45, PAY_PER_HOUR = 7.25;
		int hoursPerWeek;
		double grossPay, netPay, federal, state, socialSecurity, medicare;
		Scanner keyboard = new Scanner(System.in);
		
		//asks user about hours per week and computes everything
		System.out.print("Please input your hours worked per week: ");
		hoursPerWeek = keyboard.nextInt();
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federal = grossPay*(FEDERAL_TAX_PERCENT/100);
		state = grossPay*(STATE_TAX_PERCENT/100);
		socialSecurity = grossPay*(SS_PERCENT/100);
		medicare = grossPay*(MEDICARE_PERCENT/100);
		netPay = grossPay - federal - state - socialSecurity - medicare;
		
		//prints out everything
		System.out.println("Hours Per Week: \t" + hoursPerWeek);
		System.out.println("Gross Pay: \t \t" + grossPay);
		System.out.println("Net Pay: \t \t" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal: \t \t" + federal);
		System.out.println("State: \t \t \t" + state); 
		System.out.println("Social Security: \t" + socialSecurity);
		System.out.println("Medicare: \t \t" + medicare);
	}

}
