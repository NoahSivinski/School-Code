/* 
 * [Csci1301/Lab02].java 
 * Author: [Saim Karim] 
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

import java.text.DecimalFormat;
import java.util.Scanner;
public class NetPay {
private static final double FEDERAL_TAX= .1000;
private static final double STATE_TAX= .045;
private static final double SOCIAL_SECURITY= .062;
private static final double MEDICARE= .0145;
private static final double PAY_PER_HOUR= 7.25;
private static final DecimalFormat df = new DecimalFormat("0.0000");
private static final DecimalFormat tf = new DecimalFormat("0.000");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scnr = new Scanner(System.in);
System.out.println("Input Hours Per Week: \t");
int userHrPerWk = scnr.nextInt();
// int HoursPerWk = 40;
double GrossPay = userHrPerWk* PAY_PER_HOUR;
double Federal = GrossPay*FEDERAL_TAX;
double State = GrossPay*STATE_TAX;
double SocialSecurity = GrossPay*SOCIAL_SECURITY;
double Medicare = GrossPay*MEDICARE;
double NetPay = GrossPay-Federal-State-SocialSecurity-Medicare;
System.out.println("Hours per Week:\t\t" + userHrPerWk);
System.out.println("Gross Pay:\t\t" + GrossPay);
System.out.println("Net Pay:\t\t" + df.format(NetPay));
System.out.println();
System.out.println("Deductions");
System.out.println("Federal:\t\t" + Federal);
System.out.println("State:     \t\t" + tf.format(State));
System.out.println("Hours per Week:\t\t" + SocialSecurity);
System.out.println("Medicare\t\t" + df.format(Medicare));

	}
//figure out how to save things on the mac (why do I have so many folders)and what I lost points on
	
}
