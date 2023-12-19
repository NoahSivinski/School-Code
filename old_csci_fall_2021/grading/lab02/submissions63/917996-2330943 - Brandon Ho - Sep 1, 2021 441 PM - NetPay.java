/* 
 * NetPay.java
 * Author:  Brandon Ho
 * Submission Date:  Sep 1 2021
 *
 * Purpose: Collect the hours worked per week from the user and calculate net pay, gross pay, and deductions
 * as well as list them out.
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

// importing the Java class "Scanner" to read keyboard input
import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {

		// Declaring and initializing constants of percentages used to calculate net pay and deductions
		double FEDERAL_TAX_PERCENT = 10.00; 
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;

		Scanner keyboard = new Scanner(System.in);

		// Allows user to enter Hours per week and holds value into workHours
		System.out.print("Hours per Week:\t\t");
		int workHours = keyboard.nextInt(); 

		// Declaring variables and calculating net pay, gross pay, and deductions
		double grossPay = PAY_PER_HOUR  * workHours;
		double federal = grossPay * (FEDERAL_TAX_PERCENT/100);
		double state = grossPay * (STATE_TAX_PERCENT/100);
		double socialSecurity = grossPay * (SS_PERCENT/100);
		double medicare = grossPay * (MEDICARE_PERCENT/100);
		double deductions = federal + state + socialSecurity + medicare;
		double netPay = grossPay - deductions;

		//Shows user of calculated gross pay and net pay
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay + "\n");

		//Shows user of list of deduction and their calculated values
		System.out.println("Deductions");
		System.out.println("Federal: \t\t" + federal);
		System.out.println("State:\t\t\t" + state);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);

		keyboard.close();

	}

}
