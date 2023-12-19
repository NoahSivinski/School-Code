/*
 * TemperatureConverter.java
 * Author:  Alexis Leath
 * Submission Date:  10/01/2021
 *
 * Purpose: This program converts temperatures from fahrenheit to degrees on different scales.
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
	public static void main(String []args){
		   int tempScale;
		   //Initialize Minimum temperature for Farenheit
		   final double MIN_FARENHEIT=32;
		     
		   //Creating Scanner object
		   Scanner keyboard=new Scanner(System.in);
		     
		   double convertedDegrees=0;
		   String tempScaleStr="";
		     
		   System.out.print("Enter the temperature in Fahrenheit: ");
		   double farenheit=keyboard.nextDouble(); // Set a break point here
		     
		   // Verify the user's input
		   if(farenheit<MIN_FARENHEIT) { // first if statement: set a breakpoint here
		       System.out.print("The temperature must be greater than or equal to "+MIN_FARENHEIT);
		      System.exit(0);
		   }
		     
		   System.out.print("Enter the temperature scales you want to convert to:\n"+
		   "1. Kelvin \n"+
		   "2. Rankine \n"+
		   "3. Reamur \n"+
		   "4. Celsius \n"+
		   "Enter a temperature scale: ");
		     
		   tempScale=keyboard.nextInt();
		     
		   if(tempScale==1) { //Set a breakpoint here
		       convertedDegrees=(farenheit+459.67)*5/9;
		       tempScaleStr="Kelvin";
		   }if(tempScale==2) {   //Set a breakpoint here
		       convertedDegrees=(farenheit+459.67);
		       tempScaleStr="Rankine";
		   }if(tempScale==3) {   //Set a breakpoint here
		       convertedDegrees=(farenheit-32.0)*4/9;
		       tempScaleStr="Reaumur";
		   }if(tempScale==4) {   //Set a breakpoint here
		       convertedDegrees=(farenheit-32.0)*5/9;
		       tempScaleStr="Celsius";
		   }else {
			   System.out.println("Unknown temperature Scale..program exiting");
			   System.exit(0);
		   
		   }
		     
		   System.out.print(farenheit+" degrees Fahrenheit is "+convertedDegrees+" degrees "+tempScaleStr+".");
		   
		   keyboard.close();
		     
		}


}
