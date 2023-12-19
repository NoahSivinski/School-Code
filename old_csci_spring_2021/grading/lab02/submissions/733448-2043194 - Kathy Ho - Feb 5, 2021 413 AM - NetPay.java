/*
 * [CSCI 1301 Section 27832].java
 * Author: [Kathy Ho] 
 * Submission Date: [2/5/2021]
 *
 * Purpose: The program allows the user to input the amount of hours they worked. Then, the program will compute
 * gross and net pay based on the mandatory deductions, such as, state taxes, federal taxes, social
 * security, and Medicare which are fixed rates. 
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
	
public static final double FEDERAL_TAX_PERCENT = 10.00;
public static final double STATE_TAX_PERCENT = 4.5;
public static final double SS_PERCENT = 6.2;
public static final double MEDICARE_PERCENT = 1.45;
public static final double PAY_PER_HOUR = 7.25;
	
	public static void main(String[] args) {
		
		System.out.print("Hours per Week: \t" );
		
		Scanner keyboard = new Scanner(System.in);
        int hoursPerWeek= keyboard.nextInt();
		
		double grossPay = hoursPerWeek * PAY_PER_HOUR;
		
		double federalDeduction = grossPay * FEDERAL_TAX_PERCENT/100; //declared assignment statements for deductions 
		double stateDeduction = grossPay * STATE_TAX_PERCENT/100;
		double ssDeduction = grossPay * SS_PERCENT/100;
		double medicareDeduction = grossPay * MEDICARE_PERCENT/100;
		
		double netPay = grossPay - (federalDeduction + stateDeduction + ssDeduction + medicareDeduction);
		//shows that the equation of netPay is grossPay minus all deductions combined
		System.out.println("Gross Pay: \t\t" + grossPay);
		System.out.printf("Net Pay: \t\t%.14f" + "\n\n",netPay); //Formatted to display 14 digits after the decimal point
		
		System.out.println("Deductions");
		System.out.println("Federal: \t\t" + federalDeduction);
		System.out.println("State: \t\t\t" + stateDeduction);
		System.out.println("Social Security: \t" + ssDeduction);
		System.out.println("Medicare: \t\t" + medicareDeduction);

	}

}
