/* 
 * [1301-lab02/NetPay].java 
 * Author: [Prem Patel] 
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
	//declared variables 
	String fullname;
	final double FEDERAL_TAX_PERCENT= 10.00;
    final double STATE_TAX_PERCENT= 4.50;
    final double SOCIAL_SECURITY_PERCENT= 6.2;
    final double MEDICARE_PERCENT =1.45;
    final double PAY_PER_HOUR = 7.25;
    Double NetPay;
    Double HoursWorked;
    //name
	System.out.print("What is Your Name? ");
    fullname = keyboard.nextLine();
    System.out.print("Hi,");
    System.out.print(fullname);
    //Get Gross
    System.out.print(" How Many Hours Did You Work?");
    HoursWorked = keyboard.nextDouble ();
    Double GrossPay= HoursWorked*PAY_PER_HOUR;
    System.out.print("Your Gross Pay is ");
    System.out.print (GrossPay);
    keyboard.close();
  //Deduction
    Double Federal= GrossPay*(FEDERAL_TAX_PERCENT/100);
    Double State= GrossPay*(STATE_TAX_PERCENT/100);
    Double SocialSecurity= GrossPay*(SOCIAL_SECURITY_PERCENT/100);
    Double Medicare= GrossPay*(MEDICARE_PERCENT/100);
   
    //Get NetPay
    NetPay= GrossPay-Federal-State-SocialSecurity-Medicare;
    System.out.printf("\nYour NetPay is %.4f", NetPay);
    //deductions output
    System.out.print("\nDeductions");
    System.out.print("\nFederal: ");
    System.out.print(Federal);
    System.out.print("\nState: ");
    System.out.print(State);
    System.out.print("\nSocialSecurity: ");
    System.out.print(SocialSecurity);
    System.out.print("\nMedicare: ");
    System.out.print(Medicare);
   
    
    	
    	
    
    
    
    
	

			 
	
	}
}
