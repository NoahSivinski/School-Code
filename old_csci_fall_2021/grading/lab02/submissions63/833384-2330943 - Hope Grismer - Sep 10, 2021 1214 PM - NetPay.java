/*
 * [NetPay].java
 * Author:  [Hope Grismer] 
 * Submission Date:  [8/31/21]
 *
 * Purpose: This program has the ability to allow a user (assuming that the hourly wage is $7.25) to calculate their gross paycheck amount based on the user-entered hours per week that were worked. It also calculates the net pay which is the pay after (the subtraction of) the deductions of the following taxations: federal tax, state tax, social security deduction, and medicare deduction. Below the input of the hours per week worked, gross pay, and net pay-- the program indicates the itemized totals for each of these deductions. 
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
		Object keyboard = new Scanner(System.in); //insertion of scanner for user input.
		final double FEDERAL_TAX_PERCENT = 10.00; //provided variable data. lines 29-33.
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		
		System.out.print("Hours per Week:" + "\t" +"\t");		
		int HOURS = ((Scanner) keyboard).nextInt();
		double GROSS_PAY = (HOURS * PAY_PER_HOUR); // computational code. gross pay is total pay without deductions. hourly rate is multiplied by hours worked.
		double FEDERAL= (GROSS_PAY * (FEDERAL_TAX_PERCENT/100)); // more computational code. percentage of deductions in stored variables are converted to decimal and multiplied to gross pay for lines 39-42. 
		double STATE = (GROSS_PAY * (STATE_TAX_PERCENT/100));
		double SS = (GROSS_PAY * (SS_PERCENT/100));
		double MEDICARE = (GROSS_PAY * (MEDICARE_PERCENT/100)); 
		
	
		double DEDUCTIONS = (FEDERAL + SS + STATE + MEDICARE); // calculation of deductions first. could be consolidated to one line of code - attempt to maximize simplified and product of pseudocode program first on paper to understand logic flow.
		double NET_PAY = ((GROSS_PAY)-(DEDUCTIONS));

		
		System.out.println("Gross Pay:"+ "\t" + "\t" + + GROSS_PAY);
		System.out.println("Net Pay:" + "\t" +"\t" + NET_PAY);
		System.out.println(); //insertion of blank line. used for line breakage.
		System.out.println("Deductions");
		System.out.println("Federal:" + "\t" + "\t" + FEDERAL);
		System.out.println("State:"+ "\t" +"\t" +"\t" + STATE);
		System.out.println("Social Security:"+ "\t" + SS);
		System.out.println("Medicare:" + "\t" + "\t" + MEDICARE); 
		
		
		
				

	}

	

}
