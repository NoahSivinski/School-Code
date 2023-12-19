/*
 * NetPay.java
 * Author:  Vietmy Vo
 * Submission Date:  2/5/2021
 *
 * Purpose: The Purpose of this program is to take the given values from the lab such as federal tax 
 * percent and create a program where it calculates various things given the hours per week. For 
 * example gross pay turned out to be 725 after the number of hours per week was inputted as 100.
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
	
	public static final double FEDERAL_TAX_PERCENT=10.00;
	public static final double STATE_TAX_PERCENT=4.5;
	public static final double SS_PERCENT=6.2;
	public static final double MEDICARE_PERCENT=1.45;
	public static final double PAY_PER_HOUR=7.25;
	
	public static void main(String[] args) {
		
		int hoursPerWeek;
		double grossPay;
		double netPay;
		double federalAmount;
		double stateAmount;
		double ssAmount;
		double medicareAmount;
		double deductionsAmount;
	
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:\t\t");
		hoursPerWeek = keyboard.nextInt();
		
		grossPay=(double)(hoursPerWeek * PAY_PER_HOUR);
		federalAmount=(double)(grossPay * .01 * FEDERAL_TAX_PERCENT);
		stateAmount=(double)(grossPay * .01 * STATE_TAX_PERCENT);
		ssAmount=(double)(grossPay * .01 * SS_PERCENT);
		medicareAmount=(double)(grossPay * .01 * MEDICARE_PERCENT);
		deductionsAmount=(double)(federalAmount + stateAmount + ssAmount + medicareAmount);
		netPay=(double)(grossPay - deductionsAmount);
		
		System.out.println("Gross Pay:\t\t" +grossPay);
		System.out.println("Net Pay:\t\t" +netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" +federalAmount);
		System.out.println("State:\t\t\t" +stateAmount);
		System.out.println("Social Security:\t" +ssAmount);
		System.out.println("Medicare:\t\t" +medicareAmount);
		
		keyboard.close();

	}

}
