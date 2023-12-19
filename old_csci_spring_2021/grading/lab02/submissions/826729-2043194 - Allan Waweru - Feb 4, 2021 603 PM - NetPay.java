/*
 * NetPay.java
 * Author:  Allan Waweru
 * Submission Date:  [01/04/2021]
 *
 * Purpose: This program will compute a person’s gross and net pay 
 * based on their hourly wage, hours worked, as well as any deductions 
 * included. Hours per week(HPW) is the input to the program and the 
 * output is basically everything else.
 *
 * Statement of Academic Honesty: The following code represents my own work. I have neither
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
		int HPW;
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Hours Per Week: \t");
		HPW = keyboard.nextInt(); //This is what the user inputs
		
		//These values are fixed as of now and we'll be used to find actual deduction amount
		double FEDERAL_TAX_PERCENT = 10;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;

		//calculate grosspay
		double grosspay = HPW*PAY_PER_HOUR;
		//I'm assigning each variable a value by multiplying the grosspay by each 'deductions' percent.
		double fedtax = grosspay*(FEDERAL_TAX_PERCENT/100);
		double statetax = grosspay*(STATE_TAX_PERCENT/100);
		double socialsecurity = grosspay*(SS_PERCENT/100);
		double medicare = grosspay*(MEDICARE_PERCENT/100);
		//calculate netpay
		double netpay = grosspay - (fedtax+statetax+socialsecurity+medicare);


		System.out.println("Gross Pay: \t\t"+grosspay );
		System.out.println("Net Pay: \t\t"+netpay );
		System.out.println("\nDeductions" );
		System.out.println("Federal: \t\t" +fedtax );
		System.out.println("State: \t\t\t"+statetax );
		System.out.println("Social Security: \t" +socialsecurity );
		System.out.println("Medicare: \t\t"+medicare );


		keyboard.close();
	}




}


