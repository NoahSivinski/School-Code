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
	Scanner scan = new Scanner(System.in);
	//decared varribles 
	String fullname;
	double FEDERAL_TAX_PERCENT= 10.00;
    double STATE_TAX_PERCENTAGE= 4.50;
    double SOCIAL_SECURITY_PERCENT= 6.2;
    double MEDICARE_PERCENT =1.45;
    double PAY_PER_HOUR = 7.25;
    Double NetPay;
    Double HoursWorked;
    Boolean Why;
	//Deduction
    Double Federal= 72.0;
    Double State= 32.625;
    Double SocialSecurity= 44.95;
    Double Medicare= 10.5125;
    //name
	System.out.print("What is Your Name? ");
    fullname = scan.nextLine();
    System.out.print("Hi,");
    System.out.print(fullname);
    //Get Gross
   
    System.out.print(" How Many Hours Did You Work?");
    	HoursWorked = scan.nextDouble ();
    Double GrossPay= HoursWorked*PAY_PER_HOUR;
    System.out.print ("Your Gross Pay is ");
    System.out.print (GrossPay);
   
    //Get Net Pay
    NetPay= GrossPay-Federal-State-SocialSecurity-Medicare;
    System.out.print(" ,and Your NetPay is ");
    System.out.print(NetPay);
    	
    
    
    
	

			 
	
	}
}
