/*
 * TemperatureConverter.java
 * Author: Jarvis Williams
 * Submission Date:  2/24/2021
 *
 * Purpose: The purpose of this program is to 
 * familiarize with java debugger for debugging programs.
 * * Statement of Academic Honesty:
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
 * File name: TemperatureConverter.java
 *
 *This program does the following:
 *Prompts the user to enter a temperature in Fahrenheit and a
 *temperature scale the user wants to convert it to. If both the temperature in Fahrenheit  and
 *the temperature scale are valid, the program converts the temperature in Fahrenheit to 
 *the specified temperature scale and displays the converted value.
 *
*/

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {

		// Declare named constants.

		final double MIN_FAHRENHEIT = -459.67;

		// Declare the variables.

		double fahrenheit;
		double convertedDegrees = 0;
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
		} else {
			System.out.print("Enter the temperature scales you want to convert to:\n" + "1. Kelvin \n" + "2. Rankine \n"
					+ "3. Reaumur \n" + "4. Celsius\n" + "Enter a temperature scale: ");
		}
		tempScale = keyboard.nextInt();

		if ((tempScale < 1) || (tempScale > 4)) {
			System.out.println("Unknown temperature scale  -" + "  cannot do calculation. Bye");
			System.exit(0);
		} else {
			if (tempScale == 1) {
				convertedDegrees = fahrenheit + MIN_FAHRENHEIT * 5 / 9;
				tempScaleStr = "Kelvin";

			} else if (tempScale == 2) {
				convertedDegrees = convertedDegrees - MIN_FAHRENHEIT + fahrenheit;
				tempScaleStr = "Rankine";

			} else if (tempScale == 3) {
				convertedDegrees = (fahrenheit - 32) / 2.25;
				tempScaleStr = "Reaumur";

			} else {
				convertedDegrees = (fahrenheit - 32) * 5 / 9;
				tempScaleStr = "Celsius";
			}

			System.out.println(
					fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees " + tempScaleStr + ".");

			keyboard.close();
		}
	}
}