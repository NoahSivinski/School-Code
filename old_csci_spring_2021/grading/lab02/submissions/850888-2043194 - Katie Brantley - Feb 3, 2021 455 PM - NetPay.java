/*
 * [NetPay].java
 * Author:  [Katie Brantley] 
 * Submission Date:  [2/3/2021]
 *
 * Purpose: This program allows for the user to input any Hours Per Week value they desire and the program will
 *calculate the Goss Pay, Net Pay, Federal Tax, State Tax, Social Security, and Medicare for this value.
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


import java.util;
import java.util.Scanner;
public class NetPay {

	public static void main(String[] args) {
	final double FEDERAL_TAX_PERCENT = 10.00;
    final double STATE_TAX_PERCENT = 4.5;
    final double SS_PERCENT = 6.2;
    final double MEDICARE_PERCENT = 1.45;
    final double PAY_PER_HOUR = 7.25; 
    
       Scanner input = new Scanner(System.in);
	  System.out.println("Enter an integer for Hours Per Week: ");
       int hoursPerWork = input.nextInt();
	   
	   double grossPay = hoursPerWork*PAY_PER_HOUR; 
	   double federalTaxPay = grossPay*(FEDERAL_TAX_PERCENT/100);
	   double stateTax = grossPay*(STATE_TAX_PERCENT/100);
	   double socialSecurity = grossPay*(SS_PERCENT/100); 
	   double medicare = grossPay*(MEDICARE_PERCENT/100); 
	   double netpay = grossPay - (federalTaxPay + stateTax + socialSecurity + medicare); 
	    
	   
	   System.out.println("Hours Per Week:      \t" + hoursPerWork); 
	   System.out.println("Gross Pay:           \t" + grossPay); 
	   System.out.println("Net Pay:             \t" + netpay); 
	   System.out.println("Deductions");
	   
	   System.out.println("Federal:             \t" + federalTaxPay);
	   System.out.println("State:               \t" + stateTax); 
	   System.out.println("Social Security:\t" + socialSecurity); 
	   System.out.println("Medicare:            \t" + medicare); 
	
	    input.close(); 
	
	
	}

}
