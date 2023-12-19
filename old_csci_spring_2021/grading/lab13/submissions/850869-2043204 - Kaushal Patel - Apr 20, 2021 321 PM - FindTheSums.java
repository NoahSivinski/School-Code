/*
 * FindTheSums.java
 * Author: Kaushalkumar A. Patel
 * Submission Date: 04-20-21
 *
 * Purpose: A brief paragraph description of the program. What does it do?
 * In this lab, we’ll find horizontal and vertical sums in a 2D input array 
 * of integers that equal some input integer value 
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
	
	
	// Will return a String that is a neat representation of the values in a. 
	// The values in each column of a have a single space between them and the 
	// rows have a single newline character between them.
	public static String arrayToString(int[][] a) {
		String line = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				line += a[i][j];
				if (j < a[0].length - 1)
					line += " ";
			}
			if (i < a.length - 1)
				line += "\n";
		}
		return line;
	}
	
	
	// This method will create a new output array called b that has the same dimensions as a.
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		
		// Creates the new output b array
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < b[0].length; j++)
				b[i][j] = 0;
		
		// Horizontal sumToFind array
		for (int i = 0; i < a.length; i++) { // rows from the data
			for (int j = 0; j < a[0].length; j++) { // columns from the data
				int sum = 0, finder = 0;
				for (int k = j; k < a[0].length; k++) { // The Find loop
					if (sum < sumToFind) {
						sum += a[i][k];
						finder++;
					}
				}
				if (sum == sumToFind) { // updates the data b array
					for (int k = 0; k < finder; k++)
						b[i][j + k] = a[i][j + k];
				}
			}
		}
		return b;
	}
	
	
	// This method will create a new output array called b that has the same dimensions as a. 
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		
		// Creates the new output b array
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < b[0].length; j++)
				b[i][j] = 0;
		
		// Vertical sumToFind array
		for (int i = 0; i < a[0].length; i++) { // columns from the data
			for (int j = 0; j < a.length; j++) { // rows from the data
				int sum = 0, finder = 0;
				for (int k = j; k < a.length; k++) { // The Find loop
					if (sum < sumToFind) {
						sum += a[k][i];
						finder++;
					}
				}
				if (sum == sumToFind) { // updates the data b array
					for (int k = 0; k < finder; k++)
						b[j+k][i] = a[j+k][i];
				}
			}
		}
		return b;
	}
}
