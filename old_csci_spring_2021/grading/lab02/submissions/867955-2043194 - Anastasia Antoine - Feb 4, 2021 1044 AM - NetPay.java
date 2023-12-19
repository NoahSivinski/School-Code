import java.util.Scanner;

/*
*  NetPay.java
 * Author:  Anastasia Antoine
 * Submission Date:  [2/4/2021]
 *
 * Purpose: The program is going to calculate our Gross Pay,  
 * Net Pay, Federal, State, Social Security, and Medicare Deductions
 * by inputing our hours per week.
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
public class NetPay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.print("Hours per Week:" + "\t" + "\t");
		int Hour_per_Week = scan.nextInt();
		
		double Federal_Tax_Percent = 10.00; 
		double State_Tax_Percent = 4.5; 
		double SS_Percent = 6.2;
		double Medicare_Percent = 1.45;
		double Pay_Per_Hour = 7.25; 
		
		double Gross_Pay = Hour_per_Week * Pay_Per_Hour; 
		double Federal_Tax = Gross_Pay * Federal_Tax_Percent/100; 
		double State_Tax = Gross_Pay * State_Tax_Percent/100;
		double SS = Gross_Pay * SS_Percent/100; 
		double Medicare = Gross_Pay * Medicare_Percent/100;
		double Deductions = Federal_Tax + State_Tax + SS + Medicare; 
		double Net_Pay = Gross_Pay - Deductions; 
		
		System.out.println("Gross Pay:" + "\t" + "\t" + Gross_Pay);
		System.out.println("Net Pay:" + "\t" + "\t" + Net_Pay);
		System.out.println(System.lineSeparator() + "Deductions");
		System.out.println("Federal:" + "\t" + "\t" + Federal_Tax);
		System.out.println("State:" + "\t" + "\t" + "\t" + State_Tax);
		System.out.println("Social Security:" + "\t" + SS);
		System.out.println("Medicare:" + "\t" + "\t" + Medicare);
		
		scan.close();

	}

}
