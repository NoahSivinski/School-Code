
/* 
 * [NetPay].java 
 * Author: [Conner Archey] 
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
		// TODO Auto-generated method stub
		
      //Constants
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SOCIAL_TAX_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		
		
		//system input
		
		
		Scanner keyboard = new Scanner (System.in);
	    System.out.print("Hours per Week:\t\t");
	    
	   int HoursperWeek = keyboard.nextInt();
		
		keyboard.close();
		
		//GrossPay
		double GrossPay = (HoursperWeek * PAY_PER_HOUR);
		
		
		
		//Deduction Variable
		double Federal = (GrossPay * FEDERAL_TAX_PERCENT) /100 ;
		double State = (GrossPay * STATE_TAX_PERCENT) /100;
		double SocialSecurity = (GrossPay * SOCIAL_TAX_PERCENT) /100;
		double Medicare = (GrossPay * MEDICARE_PERCENT) /100;
		
		double NetPay = (GrossPay - Federal - State - SocialSecurity - Medicare);
	    
		//System.out.println ("Hours per Week:\t\t" + HoursperWeek);
		System.out.println ("GrossPay:\t\t" + GrossPay);
	    System.out.println ("NetPay:\t\t\t" + NetPay);
		
	    System.out.println ("\t");
	    System.out.println ("\t");
	    
	    System.out.println ("Deductions");
	    System.out.println ("Federal:\t\t" + Federal);
	    System.out.println ("State:\t\t\t" + State);
	    System.out.println ("SocialSecurity:\t\t" + SocialSecurity);
	    System.out.println ("Medicare:\t\t" + Medicare);
	    
	    
	   
	    
	    
	   
	    
	    
	    
	    
	    
	    
	    
	   
	    
	    
	    
	    	
	    
	    
	}


}
