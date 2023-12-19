/*
 * TemperatureConverter.java
 * Author:  Nancy Bishop
 * Submission Date:  Feb 26 2021
 *
 * Purpose: This program does the following:
 *Prompts the user to enter a temperature in Fahrenheit and a
 *temperature scale the user wants to convert it to. If both the temperature in Fahrenheit  and
 *the temperature scale are valid, the program converts the temperature in Fahrenheit to 
 *the specified temperature scale and displays the converted value.
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

   static final double MIN_FAHRENHEIT = -459.67;

   public static void main(String[] args) {
       double fahrenheit = 0;
       double convertedDegrees = 0;
       int tempScale = 0;
       String tempScaleStr = "";
      
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the temperature in Fahrenheit: ");
       fahrenheit = scanner.nextDouble(); // Set a breakpoint here

       // Verify the user's input
       if (fahrenheit < MIN_FAHRENHEIT) { // first if-statement: Set a breakpoint here
           System.out.print("The temperature must be greater than or equal to " + MIN_FAHRENHEIT);
       } else {
           System.out.print("Enter the temperature scales you want to convert to:\n" + "1. Kelvin \n" + "2. Rankine \n"
                   + "3. Reaumur \n" + "4. Celsius\n" + "Enter a temperature scale: ");
           tempScale = scanner.nextInt();
           switch (tempScale) {
           case 1:
               convertedDegrees = (fahrenheit - MIN_FAHRENHEIT) * 5 / 9; 
                                                                          
               tempScaleStr = "Kelvin";
               break;

           case 2:
               convertedDegrees = fahrenheit - MIN_FAHRENHEIT;
               tempScaleStr = "Rankine";
               break;
           case 3:
               convertedDegrees = (fahrenheit - 32) * 4 / 9;
               tempScaleStr = "Reaumur";
               break;
           case 4:
               convertedDegrees = (fahrenheit - 32) * 5 / 9; 
               tempScaleStr = "Celsius";
               break;
           default:
               System.out.println("Unknown temperature scale -" + " cannot do calculation. Bye");
           }
           System.out.println(
                   fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees " + tempScaleStr + ".");
       }
       scanner.close();
   }
}