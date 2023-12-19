/*
 * NetPay.java
 * Author:  Samuel Pollock
 * Submission Date:  [Submission date here]
 *
 * Purpose: To compute the amount of money you will get from a paycheck 
 * depending on your hours per week and the rate of deductions
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
import java.text.DecimalFormat;
// Using java.text.DecimalFormat to truncate decimals and make the output look more presentable

public class NetPay {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		double HoursPerWeek, GrossPay, NetPay, FederalDeduction, StateDeduction, SocialSecurityDeduction, MedicareDeduction; 
		// Declaring all needed variables that cannot be constants as doubles to account for decimals
		final double PayPerHour = 7.25; // Final double has made these values constant
		final double FederalTaxPercent = .90; // By multiplying the Gross Pay by .9, we are reducing the pay by 10 percent. This is equivalent to 10% federal tax
		final double StateTaxPercent = .955; // Using the same tactic as Federal Tax for every percent tax, I keep the computations easy to write, but accurate
		final double SocialSecurityPercent = .938; // All that is needed is to subtract 100 by the percent value, then shift the decimal to the left twice, and I get the total percent remaining
		final double MedicarePercent = .9855;
	
		DecimalFormat Money = new DecimalFormat("#.##");
		// Declared a new format called "Money" so that doubles get printed with only two decimal places
		
		System.out.println("Please enter the amount of hours you work per week:");
		HoursPerWeek = keyboard.nextDouble(); // Using double to prevent a crash if the user inputs a decimal
		keyboard.close();
		// Closing keyboard to prevent extra user input

		GrossPay = PayPerHour * HoursPerWeek;
		FederalDeduction = GrossPay - (GrossPay * FederalTaxPercent);
		StateDeduction = GrossPay - (GrossPay * StateTaxPercent);
		SocialSecurityDeduction = GrossPay - (GrossPay * SocialSecurityPercent);
		MedicareDeduction = GrossPay - (GrossPay * MedicarePercent);
		NetPay = GrossPay - FederalDeduction - StateDeduction - SocialSecurityDeduction - MedicareDeduction;
		// Setting up all the declared variables in equations to get the desired values


		System.out.println("Hours per Week: \t" + HoursPerWeek);
		System.out.println("Gross Pay: \t \t" + Money.format(GrossPay));// Calling back the Money format to prevent any repeating decimals
		System.out.println("Net Pay: \t \t" + Money.format(NetPay));
		System.out.println(""); //Blank print line here to create space and make the totals look more presentable	
		System.out.println("Deductions");
		System.out.println("Federal: \t \t" + Money.format(FederalDeduction));
		System.out.println("State: \t \t \t" + Money.format(StateDeduction));
		System.out.println("Social Security: \t" + Money.format(SocialSecurityDeduction));
		System.out.println("Medicare: \t \t" + Money.format(MedicareDeduction));
		// Using \t to make the indents in the output at the same level

	}

}
