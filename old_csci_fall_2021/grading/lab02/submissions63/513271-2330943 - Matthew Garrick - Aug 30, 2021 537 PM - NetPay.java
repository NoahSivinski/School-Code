

 //NetPay.java
 //Author:  Matthew "Ty" Garrick
 //Submission Date:  8/30/21

 //Purpose: This program calculates your gross and net pay based on the hours you worked
 // at $7.25 an hour. It also lists your tax deductions as well.

 //Statement of Academic Honesty:

 //The following code represents my own work. I have neither
 //received nor given inappropriate assistance. I have not copied
 //or modified code from any source other than the course webpage
 //or the course textbook. I recognize that any unauthorized
 //assistance or plagiarism will be handled in accordance with
 //the University of Georgia's Academic Honesty Policy and the
 //policies of this course. I recognize that my work is based
 //on an assignment created by the Department of Computer
 //Science at the University of Georgia. Any publishing 
 //or posting of source code for this assignment is strictly
 //prohibited unless you have written consent from the Department
 //of Computer Science at the University of Georgia.  

import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
			
			int hoursPerWeek;
			Scanner keyboard;
			keyboard = new Scanner(System.in);
			double grossPay, federal, state, netPay, socialSecurity, medicare; 
			
			//Constants
			
			double stateTaxPercent, socialSecurityPercent, payPerHour, federalTaxPercent, medicarePercent;
			
			payPerHour = 7.25;
			federalTaxPercent = 10.00;
			stateTaxPercent = 4.5;
			socialSecurityPercent = 6.2;
			medicarePercent = 1.45;
			
			System.out.println("Hours per Week: \t");
			hoursPerWeek = keyboard.nextInt();
			grossPay = hoursPerWeek * payPerHour;
			System.out.println("Gross Pay: \t \t" + grossPay);
			
			//Deductions
			
			federal = grossPay * (federalTaxPercent/100);
			state = grossPay * (stateTaxPercent/100);
			socialSecurity = grossPay * (socialSecurityPercent/100);
			medicare = grossPay * (medicarePercent/100);
			
			//Net Total
			
			netPay = grossPay - (federal + state + socialSecurity + medicare);
			
			System.out.println("Net Pay: \t \t" + netPay);
			System.out.println();
			System.out.println("Deductions");
			System.out.println("Federal: \t \t" + federal);
			System.out.println("State: \t \t \t" + state);
			System.out.println("Social Security: \t" + socialSecurity);
			System.out.println("Medicare: \t \t" + medicare);


	}

}
