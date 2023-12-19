
/*
 * TemperatureConverter.java
 * Author: Rayman Ng
 * Submission Date:  2/26/2021
 *
 * Purpose: It prompts the user for a temperature in Fahrenheit. It then asks the user what temperature scale they wish to convert to. 
 * If the Fahrenheit value and temperature scale value is valid, the program will convert the Fahrenheit temperature to whatever temperature scale the user picked.
 * It'll then display that value.  
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

public class TemperatureConverter {

	public static void main(String[] args) {

	// Declare named constants.

	final double MIN_FAHRENHEIT = -459.67;

	// Declare the variables.

	double fahrenheit;
	double convertedDegrees;
	int tempScale;
	String tempScaleStr = "";

	// Creating the Scanner object
	Scanner keyboard = new Scanner(System.in);

	System.out.print("Enter the temperature in Fahrenheit: ");
	fahrenheit = keyboard.nextDouble(); 

	// Verify the user's input
	if (fahrenheit < MIN_FAHRENHEIT) { 
		System.out.print("The temperature must be greater than or equal to " + MIN_FAHRENHEIT);
		System.exit(0);
	}

	System.out.print("Enter the temperature scales you want to convert to:\n" + 
	"1. Kelvin \n"  + 
	"2. Rankine \n" + 
	"3. Reaumur \n" + 
	"4. Celsius \n" + 
	"Enter a temperature scale: ");
	tempScale = keyboard.nextInt();

	if (tempScale < 1 || tempScale > 4) { 
		System.out.println("Unknown temperature scale  -" + "  cannot do calculation. Bye");
	} else {
		if (tempScale == 1) { 
			convertedDegrees = (fahrenheit + -MIN_FAHRENHEIT) * 5 / 9;
			tempScaleStr = "Kelvin";
		} else if (tempScale == 2) {
			convertedDegrees = fahrenheit + (-MIN_FAHRENHEIT);
			tempScaleStr = "Rankine";

		} else if (tempScale == 3) {
			convertedDegrees = (fahrenheit - 32) * 4 / 9;
			tempScaleStr = "Reaumur";

		} else {
			convertedDegrees = (fahrenheit - 32) * 5 / 9; 
			tempScaleStr = "Celsius";
		}

		System.out.println(fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees " + tempScaleStr + ".");
		keyboard.close();
		}
	}
}