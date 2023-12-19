/* 
 * CSCI1301.java 
 * Author: Yeji Lee
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
	
Scanner keyboard = new Scanner(System.in);
// Declare user outputs for Hours Per Week, Gross Pay, and Net PaSystem.out.print("Hours Per Week:\t\t\t");
System.out.print("Hours Per Week:\t\t\t");
int hoursPerWeek = keyboard.nextInt();

double grossPay = hoursPerWeek * 7.25;
System.out.println("Gross Pay:\t\t\t" + grossPay); 

// Define federalTaxPercent, stateTax, socialSecurity, Medicare values
double federalTaxPercent = grossPay * .10;
double stateTax = grossPay * .045;
double socialSecurity = grossPay * .062;
double medicare = grossPay * .0145;
double netPay = grossPay - federalTaxPercent - stateTax - socialSecurity - medicare;

// Return Results
System.out.println("Net Pay:\t\t\t" + netPay);
System.out.println();

System.out.println("Deductions");
System.out.println("Federal:\t\t\t" + federalTaxPercent);       
System.out.println("State:\t\t\t\t" + stateTax);        
System.out.println("Social Security:\t\t" + socialSecurity); 
System.out.println("Medicare:\t\t\t" + medicare);
	
	}

}
