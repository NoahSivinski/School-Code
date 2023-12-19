
/* 
* NetPay.java
* Author: Mohamed Ahmed 
* Date: September 10, 2021
* 
* 
* Statement of academic Honesty 
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
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
* 
* 
*/
import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {

		// declaring variables
		double FEDERAL_TAX_PERCENT = 10.0;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;

		// user input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hours per Week:");

		// declaring variables

		int HoursPerWeek = keyboard.nextInt();
		double grossPay;
		double netPay;
		double federalTax;
		double stateTax;
		double ssContribution;
		double medicare;

		// calculation
		grossPay = PAY_PER_HOUR * HoursPerWeek;
		federalTax = FEDERAL_TAX_PERCENT * grossPay * 0.01;
		stateTax = STATE_TAX_PERCENT * grossPay * 0.01;
		ssContribution = SS_PERCENT * grossPay * 0.01;
		medicare = MEDICARE_PERCENT * grossPay * 0.01;
		netPay = grossPay - (federalTax + ssContribution + stateTax + medicare);
		
		// print
		System.out.println("Hours per week:\t \t" + HoursPerWeek);
		System.out.println("Gross Pay:\t \t" + grossPay);
		System.out.printf("Net Pay:\t\t" + netPay);
		System.out.println("\n\nDeductions");
		System.out.println("federal:\t \t" + federalTax);
		System.out.printf("State:\t \t \t" + stateTax);
		System.out.println("\nSocial Security:\t" + ssContribution);
		System.out.println("medicare:\t \t" + medicare);

	}

}
