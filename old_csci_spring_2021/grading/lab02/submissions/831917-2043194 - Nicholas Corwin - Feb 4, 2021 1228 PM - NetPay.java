/*
 * [CSCI 1301].java
 * Author:  [Nicholas Corwin] 
 * Submission Date:  [2/5/21]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * This program was written in order to calculate a person's net pay and gross pay. These calculations are also written to include certain withholdings such as; federal and state tax, social security, and medicare. This program is able to calculate the outcome of your pay through whatever input of hours a person has worked for the week. 
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
public class NetPay{

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner s =new Scanner(System.in);
		
		//HPW = Hours Per Work, prompt user to enter number of HPW
		System.out.print("Hours per Week:\t\t ");
		int HPW=s.nextInt();
		
		//intialized variables
		double FEDERAL_TAX_PERCENT=10.00;
		double STATE_TAX_PERCENT=4.5;
		double SS_PERCENT=6.2;
		double MEDICARE_PERCENT=1.45;
		double PAY_PER_HOUR=7.25;
		
		//Grosspay is calculated by hours per work is multiplied by  each work payment
		double grosspay= HPW*PAY_PER_HOUR;
		
		//Federal tax is calculated by  FEDERAL TAX PERCENT by Grosspay
		double federaltax= grosspay*(FEDERAL_TAX_PERCENT/100);
		
		//State tax is calculated by STATE TAX PERCENT for Grosspay
		double statetax= grosspay*(STATE_TAX_PERCENT/100);
		
		//Social security contribution is calculated by  Social security contribution percentage for Grosspay
		double ss= grosspay*(SS_PERCENT/100);
		
		//Medicare is calculated by  Medicare  percentage for Grosspay
		double medicare= grosspay*(MEDICARE_PERCENT/100);
		
		//Netpay=grosspay-deductions
		double netpay= grosspay-(federaltax + statetax + ss + medicare);
		
		System.out.println("Gross Pay:\t\t "+ grosspay);
		System.out.println("Net Pay:\t\t "+ netpay );
		System.out.println("");
		System.out.println("Deductions" );
		System.out.println("Federal:\t\t "+ federaltax );
		System.out.println("State:\t\t\t "+ statetax);
		System.out.println("Social Security:\t "+ ss);
		System.out.println("Medicare:\t\t "+ medicare );
	}
}