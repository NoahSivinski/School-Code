import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		
    int Hours_Per_Week;
	double Gross_Pay;
	double Net_Pay;
	double FEDERAL_TAX;
	double STATE_TAX;
	double SOCIAL_SECURITY;
	double MEDICARE;
	
	double FEDERAL_TAX_PERCENT = 10.00;
	double STATE_TAX_PERCENT = 4.5;
	double SOCIAL_SECURITY_PERCENT = 6.2;
	double MEDICARE_PERCENT = 1.45;
	double PAY_PER_HOUR = 7.25;
	

	
	
	System.out.print("Hours per Week:\t\t ");
	Scanner keyboard = new Scanner(System.in);
	Hours_Per_Week = keyboard.nextInt();
	Gross_Pay = Hours_Per_Week * PAY_PER_HOUR;
    FEDERAL_TAX = Gross_Pay * FEDERAL_TAX_PERCENT/100;
	STATE_TAX = Gross_Pay * STATE_TAX_PERCENT/100;
	SOCIAL_SECURITY = Gross_Pay * SOCIAL_SECURITY_PERCENT/100;
	MEDICARE = Gross_Pay * MEDICARE_PERCENT/100;
	Net_Pay = Gross_Pay - FEDERAL_TAX - STATE_TAX - SOCIAL_SECURITY - MEDICARE;
	
	System.out.println("Gross Pay: \t\t"+Gross_Pay);
	System.out.println("Net Pay: \t\t"+Net_Pay);
	System.out.println();
	System.out.println("Deductions");
	System.out.println("Federal: \t\t"+FEDERAL_TAX);
	System.out.println("State: \t\t\t"+STATE_TAX);
	System.out.println("Social Security:\t"+SOCIAL_SECURITY);
	System.out.println("Medicare: \t\t"+MEDICARE);

/* 
 * [NetPay].java 
 * Author: [Sam Watson] 
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


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	
		
		
		
	
		
		
		
		
		
		
		
		
	}
}
