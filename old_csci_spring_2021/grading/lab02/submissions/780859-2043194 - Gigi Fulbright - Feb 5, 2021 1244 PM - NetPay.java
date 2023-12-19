/**
 * NetPay.java
 * Author:  Jordyn Fulbright
 * Submission Date:  February 5th
 *
 * Purpose:This program determines your net pay based on the number
 * of hours worked and how much you get payed per hour. The program
 * takes into account federal and state tax as well as social security
 * and Medicare deductions.
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

/**
 * @author jordynfulbright
 *
 */

import java.util.Scanner;

public class NetPay {
	
	public static void main(String[] args) {
		
		java.util.Scanner keyboard = new Scanner(System.in);
		
		double hrs;
		double gross;
		double net;
		double fed;
		double state;
		double ss;
		double med;
		double payPerHour;
		double stateTaxPercent;
		double ssPercent;
		double medicarePercent;
		double federalTaxPercent;
		
		System.out.print("Hours per Week:" + "\t" + "\t");
		hrs = keyboard.nextInt();
		
		federalTaxPercent = 10.00;
		stateTaxPercent = 4.5;
		ssPercent = 6.2;
		medicarePercent = 1.45;
		payPerHour = 7.25;
		
		gross = payPerHour * hrs;
		fed = (federalTaxPercent/100) * gross;
		state = (stateTaxPercent/100) * gross;
		ss = (ssPercent/100) * gross;
		med = (medicarePercent/100) * gross;
		net = gross - (fed + state + ss + med);
		
		System.out.println("Gross Pay:"+ "\t" + "\t" + gross);
		System.out.println("Net Pay:"+ "\t" + "\t" + net + "\n");
		System.out.println("Deductions");
		System.out.println("Federal:"+ "\t" + "\t" + fed);
		System.out.println("State:"+ "\t" + "\t" + "\t" + state);
		System.out.println("Social Security:" + "\t" + ss);
		System.out.println("Medicare:"+ "\t" + "\t" + med);
		
		keyboard.close();
		
		
	}

}
