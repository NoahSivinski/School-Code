/*
 * NetPay.java
 * Author: Aaron Brown
 * Submission Date:  02/02/2021
 *
 * Purpose:
 *  This program takes a user input of the amount of hours worked per
 *  week. It then multiplies the amount of hours worked by the pay rate,
 *  and uses this gross pay value to calculate four different tax values.
 *  These tax values are then subtracted from the gross pay to give us
 *  the net pay. Then the program prints out the hours worked, the 
 *  different pay amounts and then skips a line and prints the 
 *  corresponding deductions of each tax amount, similar to a pay stub.
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
		//The scanner variable is initialized here.
		Scanner Hours_input = new Scanner (System.in);
		// The following is the constant tax percentages.
		double FEDERAL_TAX_PERCENT = 0.1;
		double STATE_TAX_PERCENT = 0.045;
		double SS_PERCENT = 0.062;
		double MEDICARE_PERCENT = 0.0145;
		// The following sets up the pay rate, and hours worked and calculates gross pay.
		double PAY_PER_HOUR = 7.25;
		System.out.print("Hours per Week: \t");
		int Hours_Worked = Hours_input.nextInt();
		double Gross_Pay = (Hours_Worked * PAY_PER_HOUR);
		// The tax amounts are calculated here.
		double FEDERAL_TAX = (Gross_Pay * FEDERAL_TAX_PERCENT);
		double STATE_TAX = (Gross_Pay * STATE_TAX_PERCENT);
		double SS = (Gross_Pay * SS_PERCENT);
		double MEDICARE = (Gross_Pay * MEDICARE_PERCENT);
		// The program then deducts the taxes from gross pay to obtain net pay.
		double Net_Pay = Gross_Pay - (FEDERAL_TAX + STATE_TAX + SS + MEDICARE);
		// Program begins to print out the pay stub.
		System.out.println("Gross Pay: \t \t" + Gross_Pay);
		System.out.println("Net Pay: \t \t" + Net_Pay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal: \t \t" + FEDERAL_TAX);
		System.out.println("State: \t \t \t" + STATE_TAX);
		System.out.println("Social Security: \t" + SS);
		System.out.println("Medicare: \t \t" + MEDICARE);
		System.out.println(Math.ceil(MEDICARE));
		Hours_input.close();
	}

}
