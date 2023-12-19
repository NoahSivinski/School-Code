/*
 * [NetPay].java
 * Author:  [Chris Hernandez] 
 * Submission Date:  [2/4/2021]
 *
 * Purpose: This program calculates the net pay by receiving an input of hours worked per week.
 *			Using the standard values given you're able to calculate gross pay and deductions to
 *			calculate net pay. 
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
	   public static void main(String[]args) {
   
		   Scanner input = new Scanner(System.in);
		   // Input for hours per week
		   System.out.println("Enter hours per week: ");
		   int hpw = input.nextInt();
   
		   // Implementation values from assignment
		   double FEDERAL_TAX_PERCENT= 10.00;
		   double STATE_TAX_PERCENT= 4.5;
		   double SS_PERCENT= 6.2;
		   double MEDICARE_PERCENT= 1.45;
		   double PAY_PER_HOUR= 7.25;
   
		   // Gross Pay Value
		   double gp = hpw * PAY_PER_HOUR;
		   // Deductions Value
		   double deductions = (FEDERAL_TAX_PERCENT/100 * gp) + (STATE_TAX_PERCENT/100 * gp) + (SS_PERCENT/100 * gp) + (MEDICARE_PERCENT/100 * gp);
 
		   System.out.println("Hours per Week:\t\t " + hpw);
		   System.out.println("Gross Pay:\t\t " + gp);
		   System.out.println("Net Pay:\t\t " + (gp - deductions));
		   System.out.println("\nDeductions");
		   System.out.println("Federal:\t\t " + (FEDERAL_TAX_PERCENT/100 * gp));
		   System.out.println("State:\t\t\t " + (STATE_TAX_PERCENT/100 * gp));
		   System.out.println("Social Security:\t " + (SS_PERCENT/100 * gp));
		   System.out.println("Medicare:\t\t " + (MEDICARE_PERCENT/100 * gp));
	   }
}
   