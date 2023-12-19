/* 
 * NetPay.java 
 * Author: Michael Bayouk
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

	public static void main(String[] args) {
		//Initiate scanner variable 
		Scanner type = new Scanner (System.in);
		System.out.print("Hours Per Week: \t");
		int hours = type.nextInt();
		//creating variables for each required value
		double federalTaxPercent = 10.00;
		double stateTaxPercent = 4.5;
		double socialSecurityPercent = 6.2;
		double medicarePercent = 1.45;
		double payPerHour = 7.25; 
		//storing the reduction values into variables in order to keep code neater
		double grossPay = hours * payPerHour; 
		double fedRed = grossPay * federalTaxPercent/100;
		double stateRed = grossPay * stateTaxPercent/100;
		double socialRed = grossPay * socialSecurityPercent/100;
		double medRed = grossPay * medicarePercent/100;
		// calculating total netPay by subtracting grosspay by each reduction
		double netPay = grossPay - fedRed - stateRed - socialRed - medRed;
		// Printing out each final value 
		System.out.println("Gross Pay: \t\t" + grossPay );
		System.out.println("Net Pay: \t\t"+netPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal: \t\t" + fedRed);
		System.out.println("State: \t\t\t"+ stateRed);
		System.out.println("Social Security: \t"+ socialRed);
		System.out.println("Medicare: \t\t"+ medRed);
		
		type.close();

	}

}
