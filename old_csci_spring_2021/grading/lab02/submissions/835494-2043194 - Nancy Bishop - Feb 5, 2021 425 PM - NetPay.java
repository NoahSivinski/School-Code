/*
 * NetPay.java
 * Author:  Nancy Bishop 
 * Submission Date:  01/05/2021
 *
 * Purpose: It is able to calculate a persons gross and net pay based on a series of variables such as federal taxes, medicare, social security, etc. 
 *
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
Scanner input = new Scanner(System.in);
double Pay_per_week;
double grossPay;
double netPay;
double Federal_tax_percent;
double State_tax_percent; 
double ss_percent;
double medicare_percent;
double deduction;
System.out.print("Hours per Week:\t\t");
double hoursWorked = input.nextDouble();
Pay_per_week = .725;
Federal_tax_percent = 1;
State_tax_percent = .45;
ss_percent = .62;
medicare_percent = .145; 
grossPay = Pay_per_week * hoursWorked;
deduction = (Federal_tax_percent / grossPay) + (State_tax_percent / grossPay) + (ss_percent / grossPay) + (medicare_percent / grossPay);
netPay = grossPay - deduction;
System.out.print("Gross Pay:\t\t");
System.out.println(grossPay);
System.out.print("Net Pay:\t\t");
System.out.println(netPay);
System.out.println("\nDeductions");
System.out.print("Federal:\t\t");
System.out.println(Federal_tax_percent * grossPay); 
System.out.print("State:\t\t\t");
System.out.println(State_tax_percent * grossPay);
System.out.print("Social Security:\t");
System.out.println(ss_percent * grossPay);
System.out.print("Medicare:\t\t");
System.out.println(medicare_percent * grossPay);
input.close(); 
} 
}