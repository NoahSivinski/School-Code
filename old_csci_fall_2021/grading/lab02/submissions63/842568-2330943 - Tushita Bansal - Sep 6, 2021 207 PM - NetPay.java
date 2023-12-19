/*
 * CS 1301L.java
 * Author:  Tushita Bansal 
 * Submission Date:  6 September, 2021
 *
 * Purpose: This program is used to calculate someone's gross and net pay values as well as 
 * deductions based on their hourly wage and hours worked in a week. In this, I use function methods 
 * to compute these values under a public Scanner class.
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
		Scanner s = new Scanner(System.in); //int HPW;
		
		System.out.println("Hours per Week: ");
		int HPW = s.nextInt(); //HPW=Hours per Week
		double FEDERAL_TAX_PERCENT;
		double STATE_TAX_PERCENT;
		double SS_PERCENT;
		double MEDICARE_PERCENT;
		double PAY_PER_HOUR;
		
		FEDERAL_TAX_PERCENT = 10.00;
		STATE_TAX_PERCENT = 4.5;
		SS_PERCENT = 6.2;
		MEDICARE_PERCENT = 1.45;
		PAY_PER_HOUR = 7.25;
		
		//Grosspay is calculated by hours per work multiplied by pay per hour
		double grosspay=HPW*PAY_PER_HOUR;
		
		//Federal tax is calculated by FEDERAL TAX PERCENT by grosspay
		double federaltax=grosspay*(FEDERAL_TAX_PERCENT/100);
		
		//State tax is calculated by STATE TAX PERCENT by grosspay
		double statetax=grosspay*(STATE_TAX_PERCENT/100);
		
		//Social security contribution is calculated by SS PERCENT by grosspay
		double socialsecurity=grosspay*(SS_PERCENT/100);
		
		//Medicare is calculated by MEDICARE_PERCENT by grosspay
		double medicare=grosspay*(MEDICARE_PERCENT/100);
		
		//Net Pay is calculated by grosspay - deductions
		double netpay=grosspay-(federaltax+statetax+socialsecurity+medicare);
		
		//System.out.println("Hours per Week: " + HPW);
		
		System.out.println("Gross Pay: " + grosspay);
		
		System.out.println("Net Pay: " + netpay);
		
		System.out.println("");
	
		System.out.println("Deductions");
		
		System.out.println("Federal: " + federaltax);
		
		System.out.println("State: " + statetax);
		
		System.out.println("Social Security: " + socialsecurity);
		
		System.out.println("Medicare: " + medicare);
				
	}

}