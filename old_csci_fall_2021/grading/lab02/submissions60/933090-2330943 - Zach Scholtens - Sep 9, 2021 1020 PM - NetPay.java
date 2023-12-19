/*
 * NetPay.java
 * Author:  Robert Scholtens 
 * Submission Date:  09/09/21
 *
 * Purpose: The purpose of this program is to take a user's inputed hours and convert that to
 * their net pay while also showing their gross pay and deductions
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
		Scanner keyboard = new Scanner (System.in);
		
		int hoursPerWeek ;
		System.out.print ("Hours per Week:		") ;
		hoursPerWeek = keyboard.nextInt();
		double federalTaxPercent , stateTaxPercent , ssPercent , medicarePercent , payPerHour ;
		federalTaxPercent = 10.00;
		stateTaxPercent = 4.5;
		ssPercent = 6.2;
		medicarePercent = 1.45;
		payPerHour = 7.25;
		
		double grossPay , federalTotal , stateTotal , ssTotal, medicareTotal , netPayTotal ;
		grossPay = hoursPerWeek * payPerHour ; 
		federalTotal = grossPay * federalTaxPercent / 100 ; 
		stateTotal = grossPay * stateTaxPercent / 100 ; 
		ssTotal = grossPay * ssPercent / 100 ; 
		medicareTotal = grossPay * medicarePercent / 100;
		netPayTotal = grossPay - federalTotal - stateTotal - ssTotal - medicareTotal ; 
		
		System.out.println ("Gross Pay:		" + hoursPerWeek * payPerHour ) ; 
		System.out.println ("Net Pay:		" + netPayTotal);
		System.out.println();
		System.out.println("Deductions");
		System.out.println ("Federal:		" + federalTotal);
		System.out.println ("State:			" + stateTotal); 
		System.out.println ("Social Security:	" + ssTotal);
		System.out.println ("Medicare:		" + medicareTotal);
		
		
		
		
		
		
	}

}
