/*
 * [NetPay].java
 * Author:  Natalia Gonzalez
 * Submission Date:  Feburary 4 2021
 *
 * Purpose: My program computes your gross pay based on how many hours you worked per week. It then 
 * tells how much of federal, state, social security, and Medicare taxes 
 * will be deducted from your total income, individually and total, which is netPay. 
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
	
	public static final double FEDERAL_TAX = 10.00;
	public static final double STATE_TAX = 4.5;
	public static final double SS_TAX = 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25;



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Hours per Week: \t");
		double hoursPerWeek = keyboard.nextDouble();
		
		double grossPay = hoursPerWeek * PAY_PER_HOUR;	
		System.out.println("Gross pay: \t " + grossPay);
		
		
		double federal = (grossPay * FEDERAL_TAX) / 100;
		double state = (grossPay * STATE_TAX) / 100 ;
		double ss = (grossPay * SS_TAX) / 100 ;
		double medicare = (grossPay * MEDICARE_PERCENT) / 100 ;
				
		double netPay = grossPay - (federal + state + ss + medicare);
		System.out.println("Net Pay: \t" + netPay);
		
		System.out.println("\nDeductions");
		System.out.println("Federal: \t" +federal );
		System.out.println("State: \t\t" + state);
		System.out.println("Social Security: " + ss);
		System.out.println("Medicare: \t" + medicare);
		

		
	}

}
