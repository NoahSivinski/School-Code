

/*
 * [NetPay].java
 * Author:  [Hriddhiman Dey] 
 * Submission Date:  [02/05/2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 * 
 *The program is designed to show how much a person earns in total after deductions. The program takes the amount of hours worked to determine the net pay by subtracting Federal Tax, State Tax, Social Securities, and Medicare from the grosspay. The program is designed to determine exactly how much federal, state, social security, and medicare takes from the grosspay, in order to determine the net pay. 
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

/**
 * 
 */

/**
 * @author Hriddhiman Dey
 *
 */
public class NetPay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	{
		int HPW; //HPW=Hours per Week
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hours per Week:\t\t");
		HPW = keyboard.nextInt();
		keyboard.close();
		
			
			
			double FEDERAL_TAX_PERCENT=10.00;
			double STATE_TAX_PERCENT=4.5;
			double SS_PERCENT=6.2;
			double MEDICARE_PERCENT=1.45;
			double PAY_PER_HOUR=7.25;
			
			

			double grosspay=HPW*PAY_PER_HOUR;
			//grosspay is found by hours per week multiplied by pay per hour
			double federaltax = grosspay*(FEDERAL_TAX_PERCENT/100);
			//federal tax is found by multiplying gross pay by (federal tax percent divided by 100)
			double statetax=grosspay*(STATE_TAX_PERCENT/100);
			//statetax is found by multiplying gross pay by (state tax percent divided by 100)
			double socialsecurity=grosspay*(SS_PERCENT/100);
			//socialsecurity is found by multiplying grosspay by (ss_percent divided by 100)
			double medicare=grosspay*(MEDICARE_PERCENT/100);
			//medicare is found by multiplying grosspay by (medicare percent divided by 100)
			double netpay=grosspay-(federaltax+statetax+socialsecurity+medicare);
			//netpay is found by subtracting (federaltax+statetax+socialsecurity+medicare) from grosspay
			//netpay can also found by subtracting the deductions from grosspay


			System.out.println("Gross Pay:\t\t"+grosspay);
			System.out.println("Net Pay:\t\t"+netpay);
			System.out.println(""); //This is here to create a space after net pay
			System.out.println("Deductions");
			System.out.println("Federal:\t\t"+federaltax);
			System.out.println("State:\t\t\t"+statetax);
			System.out.println("Social Security:\t"+socialsecurity);
			System.out.println("Medicare:\t\t"+medicare);
			
			
		}
	}



}
