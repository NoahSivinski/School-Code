/* 
 * [NetPay].java 
 * Author: [Nathan Brown] 
 * Statement of Academic Honesty: 
 * 
 * The following code represents my own work. I have neither 
 * received nor given inappropriate assistance. I have not copied 
 * or modified code from anywhere other than the authorized 
 * sources. I recognize that any unauthorized sharing, assistance, 
 * or plagiarism will be handled in accordance with both the 
 * University of Georgia's Academic Honesty Policy and the 
 * policies of this course. I recognize that my work is based on 
 * an assignment created by the Department of Computer 
 * Science at the University of Georgia. Any publishing or posting 
 * of source code at any time for this project is prohibited. 
 */ 
import java.util.Scanner;
public class NetPay {
	// Constants
	final static double FEDERAL_TAX_PERCENT = 10.00;
	final static double STATE_TAX_PERCENT = 4.5;
	final static double SOCIAL_SECURITY_PERCENT = 6.2;
	final static double MEDICARE_PERCENT = 1.45;
	final static double PAY_PER_HOUR = 7.25;
	

	public static void main(String[] args) {
		// Code to get user input. Also declaring initial variables
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Hours per Week:\t\t");
		int hours = keyboard.nextInt();
		double grossPay;
		double netPay;
		double federal;
		double state;
		double socialsecurity;
		double medicare;
		
		// Math to determine gross pay, net pay, and all deductions
		grossPay = hours * PAY_PER_HOUR;
		federal = (grossPay * FEDERAL_TAX_PERCENT) / 100;
		state = (grossPay * STATE_TAX_PERCENT) / 100;
		socialsecurity = (grossPay * SOCIAL_SECURITY_PERCENT) / 100;
		medicare = (grossPay * MEDICARE_PERCENT) / 100;
		netPay = grossPay - (federal + state + socialsecurity + medicare);
		// The rest of the output
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + federal);
		System.out.println("State:\t\t\t" + state);
		System.out.println("Social Security:\t" + socialsecurity);
		System.out.println("Medicare:\t\t" + medicare);
		
		
	}

}
