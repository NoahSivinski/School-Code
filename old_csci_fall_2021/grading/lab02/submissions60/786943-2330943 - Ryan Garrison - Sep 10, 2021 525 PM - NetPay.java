//Statement of Academic Honesty:

//The following code represents my own work. I have neither
//received nor given inappropriate assistance. I have not copied
//or modified code from any source other than the course webpage
//or the course textbook. I recognize that any unauthorized
//assistance or plagiarism will be handled in accordance with
//the University of Georgia's Academic Honesty Policy and the
//policies of this course. I recognize that my work is based
//on an assignment created by the Department of Computer
//Science at the University of Georgia. Any publishing 
//or posting of source code for this assignment is strictly
//prohibited unless you have written consent from the Department
//of Computer Science at the University of Georgia.
 
import java.util.Scanner;

public class NetPay {
	
	static final double FTP = 10.00;
	static final double STP = 4.5;
	static final double SSP = 6.2;
	static final double MP = 1.45;
	static final double PPP = 7.25;
	
	public static void main(String[] args)
	{
		System.out.print("Hours per Week:" + "\t" + "\t");
		Scanner Keyboard = new Scanner(System.in);
		int HoursPerWeek;
		HoursPerWeek = Keyboard.nextInt();
		
			
			double GrossPay = HoursPerWeek * PPP;
			double Federal = GrossPay * (FTP/100);
			double State = GrossPay * (STP/100);
			double SS = GrossPay * (SSP/100);
			double Medicare = GrossPay * (MP/100);
			double Deductions = Federal + State + SS + Medicare; 
			
		System.out.println("Gross Pay:" + "\t" + "\t" + GrossPay);
		System.out.println("Net Pay:" + "\t" + "\t" + (GrossPay - Deductions));
		System.out.println();
		System.out.println("Deductions:");
		System.out.println("Federal:" + "\t" + "\t" + Federal);
		System.out.println("State:" + "\t" + "\t" + "\t" + State);
		System.out.println("Social Security:" + "\t" + SS);
		System.out.println("Medicare:" + "\t" + "\t" + Medicare);
	}
}
