/*
* NetPay.java
* Author: Josh Vickers
* Statement of Academic Honesty: *
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from anywhere other than the authorized
* sources. I recognize that any unauthorized sharing, assistance,
* or plagiarism will be handled in accordance with both the
* University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based on
* an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing or posting
* of source code at any time for this project is prohibited. */

import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create constants needed for calculation of Net Pay
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SOCIAL_SECURITY_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		// Allow user to input hours per week
		System.out.print("Hours per Week: " + '\t');
		Scanner hoursInput = new Scanner(System.in);
		double hoursPerWeek = hoursInput.nextDouble();
		//double hoursPerWeek = 40;
		
		// Create variables to calculate deductions
		double grossPay = hoursPerWeek * PAY_PER_HOUR;
		double fedTaxDed = grossPay * FEDERAL_TAX_PERCENT * .01;
		double stateTaxDed = grossPay * STATE_TAX_PERCENT * .01;
		double socSecDed = grossPay * SOCIAL_SECURITY_PERCENT * .01;
		double medDed = grossPay * MEDICARE_PERCENT * .01;
		
		// Calculate total deductions and Net Pay
		double deductions = fedTaxDed + stateTaxDed + socSecDed + medDed;
		double netPay = grossPay - deductions;
		
		// Output information collected and calculated
		//System.out.println("Hours per week: " + '\t' + hoursPerWeek);
		System.out.println("Gross pay: " + '\t'  + '\t' + grossPay);
		System.out.println("Net Pay: " + '\t'  + '\t' + netPay);
		
		// Add space between Pay and Deductions
		System.out.print('\n');
		
		// Print deduction values
		System.out.println("Deductions");
		System.out.println("Federal: " + '\t' + '\t' + fedTaxDed);
		System.out.println("State: " + '\t' + '\t' + '\t' + stateTaxDed);
		System.out.println("Social Security: " + '\t' + socSecDed);
		System.out.println("Medicare: " + '\t' + '\t' + medDed);
		
		// Close the input so the program can be finished in an ideal way
		// This means the program will not accept any more inputs for hoursInput
		hoursInput.close();
		
	}

}
