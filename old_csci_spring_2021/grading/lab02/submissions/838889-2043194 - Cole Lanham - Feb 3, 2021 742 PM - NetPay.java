
import java.util.Scanner;


public class NetPay {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//Constants:
		
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		
		
		//Calculations for user input:
		
		System.out.print("Hours Per Week: \t");
		String hoursPerWeek = keyboard.next();
		
		double grossPay = Double.valueOf(hoursPerWeek) * PAY_PER_HOUR;
		double federalTaxDeduction = grossPay * (FEDERAL_TAX_PERCENT / 100);
		double stateTaxDeduction = grossPay * (STATE_TAX_PERCENT / 100);
		double socialSecurityDeduction = grossPay * (SS_PERCENT / 100);
		double medicareDeduction = grossPay * (MEDICARE_PERCENT /100);
		
		double netPay = grossPay - (federalTaxDeduction + stateTaxDeduction +
				socialSecurityDeduction + medicareDeduction);
		
		//Output:
		
		
		System.out.println("Gross Pay:\t \t" + grossPay);
		System.out.println("Net Pay:\t \t" + netPay);
		System.out.println(" ");
		System.out.println("Deductions:");
		System.out.println("Federal:\t \t" + federalTaxDeduction);
		System.out.println("State:\t \t \t" + stateTaxDeduction);
		System.out.println("Social Security:\t" +  socialSecurityDeduction);
		System.out.println("Medicare:\t \t" + medicareDeduction);
		
		keyboard.close();

	}

}
