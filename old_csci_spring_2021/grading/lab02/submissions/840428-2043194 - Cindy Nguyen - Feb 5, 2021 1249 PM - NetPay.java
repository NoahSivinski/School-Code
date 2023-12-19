/*
 * [NetPay].java
 * Author:  [Cindy Nguyen] 
 * Submission Date:  02/05/2021
 *
 * Purpose: The purpose of this lab is to compute an individual's gross and
 * net pay based on the hourly wage, hours worked, and withholdings.
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
 * 
 *  Agree C.N.
 */
import java.util.Scanner;
public class NetPay {

	
	public static void main(String[] args) {
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		int hoursPerWeek;
		double grossPay;
		double netPay;
		double federalDeducts;
		double stateDeducts;
		double socialDeducts;
		double medDeducts;
		

		Scanner input = new Scanner(System.in);
		System.out.print("Hours per Week:        ");
		hoursPerWeek = input.nextInt();
		input.nextLine();

		grossPay = hoursPerWeek * PAY_PER_HOUR;
		System.out.println("Gross Pay:             " + grossPay);
		
		//Equations
		federalDeducts = grossPay / FEDERAL_TAX_PERCENT;
		stateDeducts = (STATE_TAX_PERCENT / 100) * grossPay;
		socialDeducts = (SS_PERCENT / 100) * grossPay;
		medDeducts = (MEDICARE_PERCENT / 100) * grossPay;

		netPay = (grossPay - (federalDeducts + stateDeducts + socialDeducts + medDeducts));
		System.out.println("Net Pay:               " + netPay + "\n");
		
		System.out.println("Deductions");
		System.out.println("Federal:               " + federalDeducts);
		System.out.println("State:                 " + stateDeducts);
		System.out.println("Social Security:       " + socialDeducts);
		System.out.println("Medicare:              " + medDeducts);

		input.close();

	}

}
