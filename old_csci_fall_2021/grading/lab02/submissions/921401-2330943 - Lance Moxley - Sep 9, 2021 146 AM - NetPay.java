
/*
 * NetPay.java
 * Author:  Lance Moxley
 * Submission Date:  [Submission date here]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *
 * This program intends to take a user input of the amount of
 * hours per week to calculate the user's pay and deductions. The 
 * amount of gross pay that is returned is a simple calculation of 
 * hours per week and the pay per hour, which is set at 7.25 per hour
 * as seen on line 64. From the gross pay, each of the deductions, 
 * which are all at set percentages, is multipled to the gross pay
 * and returned based on the percentage that each deduction takes 
 * out of the gross pay. For example, the federal tax deduction takes
 * out 10 percent of the user's gross pay. Within the outputs, each of 
 * the percent values are divided by 100, to make them into actual 
 * percents and so that the deductions are actually less than the 
 * gross pay and not greater, if they were just being multiplied 
 * with values given in the section of the program where the 
 * variables being declared. After all of the individual 
 * deductions are calculated, the total amount deducted 
 * from the gross pay is added up and then subtracted from 
 * the gross pay in order to get the net pay, which in the case 
 * of this program is a consistent 77.85 percent of the gross pay. 
 * The hours per week, gross pay, net pay, and each of the deductions 
 * are displayed in the console, after the user inputs the 
 * hours per week, when the program is run.
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
import java.util.*;

public class NetPay {

	public static void main(String[] args) {

		// Input Hours per Week
		Scanner KB = new Scanner(System.in);
		System.out.print("Hours per Week:\t\t ");
		int hoursPerWeek = KB.nextInt();

		/*
		 * Declaring variables: payPerHour, grossPay, netPay, federalTaxPercent,
		 * stateTaxPercent, ssPercent, and medicarePercent. Net pay is ((100 - 22.15) /
		 * 100). 22.15 percent is the result of adding all of the percent values
		 * together.
		 */
		double payPerHour = 7.25;
		double grossPay = hoursPerWeek * payPerHour;
		double federalTaxPercent = 10;
		double stateTaxPercent = 4.5;
		double ssPercent = 6.2;
		double medicarePercent = 1.45;
		double netPay = grossPay * ((100 - (federalTaxPercent + stateTaxPercent + ssPercent + medicarePercent)) / 100);

		/*
		 * Outputs from the number of hours per week that then returns the gross pay,
		 * net pay, and the individual deductions. Each of the percents are divided by
		 * 100 to give percents, so that the deductions aren't bigger than the gross
		 * pay.
		 */
		System.out.println("Gross Pay:\t\t " + grossPay);
		System.out.println("Net Pay:\t\t " + netPay);
		System.out.println("\nDeductions");
		System.out.println("Federal:\t\t " + grossPay * (federalTaxPercent / 100));
		System.out.println("State:\t\t\t " + grossPay * (stateTaxPercent / 100));
		System.out.println("Social Security:\t " + grossPay * (ssPercent / 100));
		System.out.println("Medicare:\t\t " + grossPay * (medicarePercent / 100));

		KB.close();
	}

}
