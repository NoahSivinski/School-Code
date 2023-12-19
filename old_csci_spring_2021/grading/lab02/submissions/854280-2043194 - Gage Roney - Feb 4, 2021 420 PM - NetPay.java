import java.util.Scanner;

/*
 * NetPay.java
 * Author:  Gage Roney 
 * Submission Date:  [2/4/2020]
 *
 * Purpose: This is a program designed to calculate and compute how much in 
 * taxes one would have to pay from a certain amount of hours worked in a week. This program
 * has been designed to work from any amount hours worked in a week that the user of the program 
 * wishes to input.
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
 * 
 */

/**
 * @author gagem
 *
 */
public class NetPay {

	/**
	 * @param args
	 */
		public static final double FEDERAL_TAX_PERCENT =  10.00;
		public static final double STATE_TAX_PERCENT = 4.5;
		public static final double SS_PERCENT = 6.2;
		public static final double MEDICARE_PERCENT = 1.45;
		public static final double PAY_PER_HOUR = 7.25;
		
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);	
			
			System.out.print("Hours per Week: \t "  );
			int hours;
			 hours= input.nextInt();
			 
			double gross;
			gross=hours * PAY_PER_HOUR;	
			double federal;
			federal=gross * 10/100;
			double state;
			state=gross * 4.5/100;
			double social;
			social=gross * 6.2/100;
			double medicare;
			medicare=gross * 1.45/100;
			double net;
			net=gross - federal - state - social - medicare;
			System.out.println("Gross Pay: \t   \t " + gross);			
			System.out.println("Net Pay: \t \t " + net );
			System.out.println( );			
			System.out.println("Deductions  ");
			System.out.println("Federal: \t \t " + federal );
			System.out.println("State:  \t \t " + state);
			System.out.println("Social Security:  \t " + social );
			System.out.println("Medicare: \t \t " + medicare );										
			input.close();
	}

}
