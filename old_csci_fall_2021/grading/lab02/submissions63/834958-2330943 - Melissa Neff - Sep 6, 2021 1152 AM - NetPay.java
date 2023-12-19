/* 
 * NetPay.java
 * Author:  Melissa Neff 
 * Submission Date:  9/6/21
 *
 * Purpose: The purpose of this program is to compute a person's net pay and gross pay
 * given their hourly wage, hours worked per week, and the percents of income
 * withheld for federal tax, state tax, social security, and Medicare.
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
		double grossPay, netPay;
		int hoursWorked;
		double federal_tax_percent = 10.00;
		double state_tax_percent = 4.5;
		double ss_percent = 6.2;
		double medicare_percent = 1.45;
		double pay_per_hour = 7.25;
		
		Scanner scan = new Scanner(System.in);
		//The following prints a string to the console:
		System.out.println("Enter Hours per Week:");
		//The variable hoursWorked will be the next integer inputted by the user
		hoursWorked = scan.nextInt();
		scan.close();
		//Gross Pay is calculated using the following equation:
		grossPay = hoursWorked * pay_per_hour;
		/*The following equations are used to calculate the amounts (in dollars)
		 * deducted for Federal Tax, State Tax, Social Security, and Medicare, respectively:
		 */
		double federalTax = grossPay * federal_tax_percent * .01;
		double stateTax = grossPay * state_tax_percent * .01;
		double ss = grossPay * ss_percent * .01;
		double medicare = grossPay * medicare_percent * .01;
		//The following statements each print a string to the console:
		System.out.println("Hours per Week:     "+hoursWorked); 
		System.out.println("Gross Pay:          " +grossPay);
		//Net Pay is calculated using the following equation:
		netPay = grossPay - federalTax - stateTax - ss - medicare;
		//The following statements each print a string to the console:
		System.out.println("Net Pay:            " +netPay);
		System.out.println("          ");
		System.out.println("Deductions");
		System.out.println("Federal:            " +federalTax);
		System.out.println("State:              " +stateTax);
		System.out.println("Social Security:    " +ss);
		System.out.println("Medicare:           " +medicare);
		

	}

}
