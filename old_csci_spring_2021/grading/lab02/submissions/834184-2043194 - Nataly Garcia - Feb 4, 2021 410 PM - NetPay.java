/*
 * [Intro Computing and Program Spring 2021].java
 * Author:  [Nataly Garcia] 
 * Submission Date:  [February 4 2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? This program allows the user to calculate the Net Pay by an input of the amount of hours worked by 
 * including deductions in the system, such as federal, state, social security, and medicare. When the system is running, the 
 * prompt of "Hours per Week" appears. Once the program is set up, the user then types the amount of hours worked and proceeds 
 * to click "enter". Afterwards, the program uses percents and declared terms in the code to calculate the overall Net Pay; the hours
 * is multiplied by the pay per hour percentage, and then subtracted by the amounts from federal, state, social security, and 
 * medicare percentages.
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

	public static void main(String[] args) 
	{
		double FEDERAL_TAX_PERCENT, STATE_TAX_PERCENT, SS_PERCENT, MEDICARE_PERCENT, PAY_PER_HOUR, grossPay, netPay, federal, state, socialSecurity, medicare;
		int hoursPerWeek;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:\t\t");
		hoursPerWeek = keyboard.nextInt();
		keyboard.close();
		
		FEDERAL_TAX_PERCENT = 10.00;
		STATE_TAX_PERCENT = 4.5;
		SS_PERCENT = 6.2;
		MEDICARE_PERCENT = 1.45;
		PAY_PER_HOUR = 7.25;
		
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federal = grossPay * FEDERAL_TAX_PERCENT/100;
		state = grossPay * STATE_TAX_PERCENT/100;
		socialSecurity = grossPay * SS_PERCENT/100;
		medicare = grossPay * MEDICARE_PERCENT/100;
		netPay= grossPay - federal - state - socialSecurity - medicare;
		
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federal);
		System.out.println("State:\t\t\t" + state);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);
	}

}
