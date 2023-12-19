/*
 * [CSCI 1301].java
 * Author:  [Mamadou Ly] 
 * Submission Date:  [2/5/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 * It determines the your income.
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
		
		Scanner keyboard = new Scanner (System.in);
		int hoursPerWeek = keyboard.nextInt();
		
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		double grossPay = hoursPerWeek * PAY_PER_HOUR;
		double federal = grossPay * (FEDERAL_TAX_PERCENT/100);
		double state = grossPay * (STATE_TAX_PERCENT/100);
		double socialSecurity = grossPay * (SS_PERCENT/100) ;
		double medicare = grossPay * (MEDICARE_PERCENT/100);
		double netPay = ((((grossPay- federal) - state) - socialSecurity) - medicare);
		
		System.out.println("Hours per Week:     " + hoursPerWeek);
		System.out.println("Gross Pay:          " + grossPay);
		System.out.println("Net Pay:            " + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:            " + federal);
		System.out.println("State               " + state);
		System.out.println("Social Security     " + socialSecurity);
		System.out.println("Medicare            " + medicare);
		
		keyboard.close();
	}
}
