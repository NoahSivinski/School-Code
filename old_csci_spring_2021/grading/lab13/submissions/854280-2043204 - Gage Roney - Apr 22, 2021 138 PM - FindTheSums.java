/*
 * FindTheSums.java
 * Author:  Gage Roney 
 * Submission Date:  4/22/2021
 *
 * Purpose: The purpose of this class is to work with 2 dimensional arrays to be able to find the sums 
 * horizontally and vertically form an input 2nd dimensional array. It should be able to take overlapping numbers
 * as well if there are multiple ways to calculate the sum desired. There are three static methods in this program
 * which include that of String, HorizontalSums, and that of VerticalSums. String method to display the array being manipulated,
 * HorizontalSums to go through the array and search for the values in the rows that add up to the sum desired, and VerticalSums
 * which does the same but instead of the rows it checks the columns instead.  
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
public class FindTheSums {
	public static String arrayToString(int[][] a) { // String method to display the contents in the 2 dimensional array
		String printString = ""; // Holds the value not of a space or void so the values won't be spaced apart
		for (int i = 0; i < a.length; i++) { // Nested for loop that searches the rows for the array being created 
			for (int j = 0; j < a[0].length; j++) { // Inner loop for the columns of the array to be created 
				printString += a[i][j]; // Stores the values of the 2 dimensional array that is being created into the String printString 
				if (j < a[0].length - 1) // Decision Statement that makes sure there is a spaces between the values of the array unless it is equal to the length of the array
					printString += " "; // - 1 so that it will end without a space printing at the end
			}
			if (i < a.length - 1) // Prints a new line after the values of the column have all been stored and then stores the rest on a new line and so forth
				printString += "\n";
		}
		return printString; // Returns all the values of the array that has been stored in the value of printString
	}
	
	public static int[][] horizontalSums(int[][] a, int sumToFind) { // Method that creates a new array the same dimensions as array a, called array b with the parameters of an in 2 dimensional array named a and sumToFind initialized to int
		int[][] b = new int[a.length][a[0].length]; // Creates an int array that has the same dimensions initialized as array a named b
		for (int i = 0; i < b.length; i++) // Nested for loop to create the new array with the same dimensions as that of array a
			for (int j = 0; j < b[0].length; j++) // And store the values for the columns and rows so that they are the same as array a 
				b[i][j] = 0; // Makes the new array equal to zero so it can be easily manipulated
		
		//Nested for loop to search the columns and rows for the values that will add up to the sum
		for (int i = 0; i < a.length; i++) { // Outer most loop checks through the rows of the 2 dimensional array
			for (int j = 0; j < a[0].length; j++) { // Inner loop for checking through the columns of the 2 dimensional array
				int sum = 0; // Initialized to 0 to put the values calculated into sum 
				int counter = 0; // Counter to ensure the loop does not iterate more than it needs to
				for (int k = j; k < a[0].length; k++) { // For loop that searches through the values that will ad up to the desired sum  
					if (sum < sumToFind) { // Puts the values into sum
						sum += a[i][k];
						counter++; // Counter to make sure the loop iterates the correct number of times
					}
				}
				if (sum == sumToFind) { // Decision statement to update the array of b
					for (int k = 0; k < counter; k++) // Puts the values into the copy array b
						b[i][j + k] = a[i][j + k];
				}
			}
		}
		return b; // Returns the values of b that are now held in the array b 
	}
	
	public static int[][] verticalSums(int[][] a, int sumToFind) { // Method that creates a new array the same dimensions as array a, called array b with the parameters of an in 2 dimensional array named a and sumToFind initialized to int
		
		int[][] b = new int[a.length][a[0].length];// Creates an int array that has the same dimensions initialized as array a named b
		for (int i = 0; i < b.length; i++)// Nested for loop to create the new array with the same dimensions as that of array a
			for (int j = 0; j < b[0].length; j++) // And store the values for the columns and rows so that they are the same as array a
				b[i][j] = 0;// Makes the new array equal to zero so it can be easily manipulated
		
		//Nested for loop to search the columns and rows for the values that will add up to the sum vertically very similar to the loop in horizontal
		for (int i = 0; i < a[0].length; i++) { // Outer most loop checks through the columns of the 2 dimensional array
			for (int j = 0; j < a.length; j++) { // Inner loop for checking through the rows of the 2 dimensional array
				int sum = 0; // Value named sum initialized to 0 so that it can put values into sum and add together when necessary 
				int counter = 0; // Counter to make sure the loop iterates correct number of times 
				for (int k = j; k < a.length; k++) { // For loop that searches through the values and adds them into the value of sum and adds to the counter each iteration
					if (sum < sumToFind) {
						sum += a[k][i];
						counter++;
					}
				}
				if (sum == sumToFind) { // Decision statement to update the array of b
					for (int k = 0; k < counter; k++) // Puts the values into the copy array b
						b[j+k][i] = a[j+k][i];
				}
			}
		}
		return b;// Returns the values of b that are now held in the array b 
	}
			
}

